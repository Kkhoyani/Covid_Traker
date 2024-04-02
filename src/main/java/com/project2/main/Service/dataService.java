package com.project2.main.Service;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.project2.main.Model.DistrictwiseCase;
import com.project2.main.Model.StatewiseCase;

@Service
public class dataService {

	private static String url = "https://api.covid19india.org/csv/latest/state_wise.csv";
	List<StatewiseCase> infoList = new ArrayList<>();
	public List<StatewiseCase> getInfoList() {
		return infoList;
	}
	public void setInfoList(List<StatewiseCase> infoList) {
		this.infoList = infoList;
	}
	@PostConstruct
	@Scheduled(cron = "* * 1 * * *")
	public void getStateData() throws IOException, InterruptedException
	{
		List<StatewiseCase> newinfoList = new ArrayList<>(); 
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        StringReader csvBodyReader = new StringReader(httpResponse.body());
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);
        for (CSVRecord record : records) {
           StatewiseCase swc = new StatewiseCase();
           swc.setState(record.get("State"));
           swc.setConfirmed(Integer.parseInt(record.get("Confirmed")));
           swc.setRecovered(Integer.parseInt(record.get("Recovered")));
           swc.setDeaths(Integer.parseInt(record.get("Deaths")));
           swc.setActive(Integer.parseInt(record.get("Active")));
           swc.setDelta_confirmed(Integer.parseInt(record.get("Delta_Confirmed")));
           swc.setDelta_recovered(Integer.parseInt(record.get("Delta_Recovered")));
           swc.setDelta_deaths(Integer.parseInt(record.get("Delta_Deaths")));
           swc.setNote(record.get("State_Notes"));
           newinfoList.add(swc);
        }
        this.setInfoList(newinfoList);
	}
}
