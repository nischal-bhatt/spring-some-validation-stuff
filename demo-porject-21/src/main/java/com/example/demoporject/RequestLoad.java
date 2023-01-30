package com.example.demoporject;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RequestLoad implements Serializable{

	
	private static final long serialVersionUID = 1932759112888105301L;

	@JsonProperty(value="jimmy")
	@NotNull
	@NotEmpty
	private List<@Size(min = 9, max = 9,message="screw")String> nrics;

	public List<String> getNrics() {
		return nrics;
	}

	public void setNrics(List<String> nrics) {
		this.nrics = nrics;
	}
	
	
}
