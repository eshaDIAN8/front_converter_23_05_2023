package com.citi.testdriven.frontservice.daoImpl;

import org.springframework.stereotype.Component;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;

@Component
public class TtdFrontDaoImplStatic  implements TtdFrontDao{

	//@Override
	public String getFormula(String convertedUnit) {
		
		
		return "*1000";
	}

}
