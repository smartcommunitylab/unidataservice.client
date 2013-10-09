/*******************************************************************************
 * Copyright 2012-2013 Trento RISE
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/
package eu.trentorise.smartcampuse.unidataservice;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import eu.trentorise.smartcampus.unidataservice.StudentInfoService;
import eu.trentorise.smartcampus.unidataservice.model.OperaStudent;
import eu.trentorise.smartcampus.unidataservice.model.StudentInfoData;
import eu.trentorise.smartcampus.unidataservice.model.StudentInfoExams;

public class TestUnidataClient {

	private StudentInfoService connector;

	@Before
	public void init() {
		connector = new StudentInfoService(Constants.PROFILE_SRV_URL);
	}

	@Test
	public void test() throws Exception {
		Object result1, result2;
		
		result1 = connector.getStudentData(Constants.USER_AUTH_TOKEN);
		Assert.assertNotNull(result1);
		System.out.println(((StudentInfoData)result1).getFiscalCode());
		
		result2 = connector.getStudentData(Constants.CLIENT_AUTH_TOKEN, "1");
		Assert.assertNotNull(result2);
		System.out.println(((StudentInfoData)result2).getFiscalCode());		
		
		Assert.assertEquals(((StudentInfoData)result1).getFiscalCode(), ((StudentInfoData)result2).getFiscalCode());
		
		result1 = connector.getStudentExams(Constants.USER_AUTH_TOKEN);
		Assert.assertNotNull(result1);
		System.out.println(((StudentInfoExams)result1).getExams().get(0).getName());		
		
		result2 = connector.getStudentExams(Constants.CLIENT_AUTH_TOKEN, "1");
		Assert.assertNotNull(result2);
		System.out.println(((StudentInfoExams)result2).getExams().get(0).getName());				
		
		Assert.assertEquals(((StudentInfoExams)result1).getExams().get(0).getName(),((StudentInfoExams)result2).getExams().get(0).getName());			
		
		result1 = connector.getOperaCard(Constants.USER_AUTH_TOKEN);
		Assert.assertNotNull(result1);
		System.out.println(((OperaStudent)result1).getName());			
		
		result2 = connector.getOperaCard(Constants.CLIENT_AUTH_TOKEN, "1");
		Assert.assertNotNull(result2);
		System.out.println(((OperaStudent)result2).getName());					
		
		Assert.assertEquals(((OperaStudent)result1).getName(), ((OperaStudent)result2).getName());			
		
	}

}
