package com.project2.main.Model;

public class StatewiseCase {

	private String state;
	private int confirmed;
	private int recovered;
	private int deaths;
	private int active;
	private int delta_confirmed;
	private int delta_recovered;
	private int delta_deaths;
	private String note;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "StatewiseCase [state=" + state + "]\n";
	}
	
	
}
