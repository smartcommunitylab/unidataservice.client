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

package eu.trentorise.smartcampus.unidataservice.model;

import java.util.ArrayList;
import java.util.List;

public class CanteenOpening {

	private String id;
	private String canteen;
	private List<CanteenOpeningTimes> times;
	
	public CanteenOpening() {
		times = new ArrayList<CanteenOpeningTimes>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCanteen() {
		return canteen;
	}

	public void setCanteen(String canteen) {
		this.canteen = canteen;
	}

	public List<CanteenOpeningTimes> getTimes() {
		return times;
	}

	public void setTimes(List<CanteenOpeningTimes> times) {
		this.times = times;
	}



	
}
