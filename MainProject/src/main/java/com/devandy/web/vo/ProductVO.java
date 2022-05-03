package com.devandy.web.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductVO{
	@JsonProperty(value = "idx")
	private int idx;
	@JsonProperty(value = "itemname")
	private String itemname;
	@JsonProperty(value = "cost")
	private int cost ;
	@JsonProperty(value = "regi_date")
	private Date regi_date;
	@JsonProperty(value = "regi_company")
	private String regi_company;
}
