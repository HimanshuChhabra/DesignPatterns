package com.himanshu.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {
		XMLDaoFactory xmlfactory = (XMLDaoFactory) DaoFactoryProducer.produce("xml");
		DBDaoFactory dbFactory = (DBDaoFactory) DaoFactoryProducer.produce("db");
		xmlfactory.createDao("emp").save();
		dbFactory.createDao("dept").save();
	}

}
