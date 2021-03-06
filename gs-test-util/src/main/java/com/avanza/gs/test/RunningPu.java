/*
 * Copyright 2015 Avanza Bank AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.avanza.gs.test;

import org.junit.rules.TestRule;
import org.openspaces.core.GigaSpace;
import org.springframework.beans.factory.BeanFactory;

public interface RunningPu extends TestRule, AutoCloseable  {
	
	// TODO: Rename to ManagedPu

	String getLookupGroupName();

	GigaSpace getClusteredGigaSpace();

	void start() throws Exception;
	
	void stop() throws Exception;

	BeanFactory getPrimaryInstanceApplicationContext(int partition);
	
}
