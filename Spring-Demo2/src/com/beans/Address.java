package com.beans;

public class Address {
	String buildingName;
	String areaName;
	String cityName;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String buildingName, String areaName, String cityName) {
		super();
		this.buildingName = buildingName;
		this.areaName = areaName;
		this.cityName = cityName;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", areaName=" + areaName + ", cityName=" + cityName + "]";
	}
	
	
}
