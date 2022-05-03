package com.devandy.web.vo;



import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CompanyVO{
	@JsonProperty(value = "idx")
	private int idx;
	@JsonProperty(value = "regi_company")
	private String regi_company;
	@JsonProperty(value = "ceo_name")
	private String ceo_name ;
	@JsonProperty(value = "com_number")
	private int com_number;
	
}
