package com.edu;

public interface SIM  {
	public String sendSMS(String msg,long mobilenumber);
    public String dialCall(long mobilenumber);
}
