package com.jfservice.common.json;

import java.util.List;

public class WeatherBean {
	
	private List<Results> results;
	
	public List<Results> getResults() {
		return results;
	}
	public void setResults(List<Results> results) {
		this.results = results;
	}
	public static class Location{
		private String id;
		private String name;
		private String country;
		private String path;
		private String timezone_offset;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getTimezone_offset() {
			return timezone_offset;
		}
		public void setTimezone_offset(String timezone_offset) {
			this.timezone_offset = timezone_offset;
		}
	}
	public static class Now{
		private String text;
		private String code;
		private String temperature;
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getTemperature() {
			return temperature;
		}
		public void setTemperature(String temperature) {
			this.temperature = temperature;
		}
	}
	public static class Results{
		private Location location;
		private Now now;
		private String last_update;
		
		public Location getLocation() {
			return location;
		}
		public void setLocation(Location location) {
			this.location = location;
		}
		public Now getNow() {
			return now;
		}
		public void setNow(Now now) {
			this.now = now;
		}
		public String getLast_update() {
			return last_update;
		}
		public void setLast_update(String last_update) {
			this.last_update = last_update;
		}
	}
}