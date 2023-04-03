package com.new.services;

import com.new.Dao.AtmDAO;
import com.new.Dao.AtmDAOImpl;
import com.new.model.Atm;

public interface AtmServices {
	AtmDAO dao = new AtmDAOImpl();
	
	boolean DepositeMoney();
	boolean Withdraw();
	boolean OpenAccount();
	boolean MiniStatement();
	boolean BalanceEnquery();
	public void menu();
}
