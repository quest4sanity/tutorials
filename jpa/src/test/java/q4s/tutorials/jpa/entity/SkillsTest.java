/*
 * (C) Copyright 2018 - Vladimir Bogdanov | Data Form Builder
 *
 * https://github.com/quest4sanity/dafobi
 *
 * Licensed under the LGPL, Version 3 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License in LGPL.txt file in 
 * the root directory or at https://www.gnu.org/licenses/lgpl.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Vladimir Bogdanov - quest4sanity@gmail.com
 */
package q4s.tutorials.jpa.entity;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Q4S
 *
 */
public class SkillsTest {

	private static EntityManagerFactory emFactory;
	private static EntityManager entityManager;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		emFactory = Persistence.createEntityManagerFactory("Example_JPA");
		entityManager = emFactory.createEntityManager();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		entityManager.getTransaction().begin();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		entityManager.getTransaction().rollback();
	}

	@Test
	public void testSkill() {
		Skill skill = entityManager.find(Skill.class, 2L);
		
		assertEquals("JUN", skill.getCode());
		assertEquals("Junior", skill.getTitle());
	}

	/**
	 * Тестирование выхода с "Квалификации" на "Сотрудников".
	 */
	@Test
	public void testSkillEmployees() {
		Skill skill = entityManager.find(Skill.class, 2L);
		List<Employee> emps = skill.getEmployees();
		
		assertEquals(1, emps.size());
		assertEquals("ppp", emps.get(0).getNickname());
	}

	
}
