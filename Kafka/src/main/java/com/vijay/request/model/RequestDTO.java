package com.vijay.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestDTO {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("value")
	private String value;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RequestDTO [name=" + name + ", id=" + id + ", value=" + value + ", getName()=" + getName()
				+ ", getId()=" + getId() + ", getValue()=" + getValue() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
