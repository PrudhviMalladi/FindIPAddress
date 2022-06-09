package com.IpAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.omg.CORBA.portable.UnknownException;

public class IPAddress {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip;
		String hostname;
		try {
			ip = InetAddress.getLocalHost();
			hostname = ip.getHostName();
			System.out.println("Your current IP Address: "+ip);
			System.out.println("Your Host Name: "+hostname);
			
			
		}catch(UnknownException e){
			e.printStackTrace();
		}
		

	}

}
