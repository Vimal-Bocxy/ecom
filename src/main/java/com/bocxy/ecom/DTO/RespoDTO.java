package com.bocxy.ecom.DTO;

import lombok.Data;

@Data
public class RespoDTO {


private String otp;

public RespoDTO(String otp) {
	super();
	this.otp = otp;
}
	
}
