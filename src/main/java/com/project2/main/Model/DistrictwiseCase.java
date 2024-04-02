package com.project2.main.Model;

public class DistrictwiseCase {

	private String state;
	private String district;
	private int confirmed;
	private int recovered;
	private int deaths;
	private int active;
	private int delta_confirmed;
	private int delta_recovered;
	private int delta_deaths;
	private int delta_active;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getDelta_confirmed() {
		return delta_confirmed;
	}
	public void setDelta_confirmed(int delta_confirmed) {
		this.delta_confirmed = delta_confirmed;
	}
	public int getDelta_recovered() {
		return delta_recovered;
	}
	public void setDelta_recovered(int delta_recovered) {
		this.delta_recovered = delta_recovered;
	}
	public int getDelta_deaths() {
		return delta_deaths;
	}
	public void setDelta_deaths(int delta_deaths) {
		this.delta_deaths = delta_deaths;
	}
	public int getDelta_active() {
		return delta_active;
	}
	public void setDelta_active(int delta_active) {
		this.delta_active = delta_active;
	}
	@Override
	public String toString() {
		return "DistrictwiseCase [district=" + district + ", confirmed=" + confirmed + "]\n";
	}
	
	
	
}
