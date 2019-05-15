package com.bank.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import vig.library.AbstractObject.AbstractObject;

@JsonIgnoreProperties({"attributes","values"})
public class Base extends AbstractObject{

	public String cid;//多租户id

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}
	
}
