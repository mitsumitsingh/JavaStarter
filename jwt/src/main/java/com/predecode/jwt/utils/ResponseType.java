package com.predecode.jwt.utils;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResponseType<T> implements Serializable{

	private static final long serialVersionUID = -599286126790091163L;
	
	private String returnMessage;
    private int returnCode;
    private long timeTook;
    private T data;
    private String server;
    
}