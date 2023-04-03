package com.new.Dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.new.db.config.DBConfig;
import com.new.db.config1.DBConfig1;
import com.new.model.Atm;

public interface AtmDAO {
	List<Atm> atms = new ArrayList<Atm>();
	DBConfig db = new DBConfig();
	Connection con = db.getConnection();
	DBConfig1 db1 = new DBConfig1();
	Connection con1 = db1.getConnection();
	
	boolean Deposite();
	boolean Withdraw();
	boolean MiniStatement();
	boolean OpenAccount();
	boolean BalanceEnquery();
	
}
