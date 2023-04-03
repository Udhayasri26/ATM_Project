package com.new.app;

import com.new.services.AtmServices;
import com.new.services.AtmServicesImpl;

public class AtmApp {
	public static void main(String[] args) {
		AtmServices service = new AtmServicesImpl();
		service.menu();
	}
}
