package net.be_geek.spring_boot_sample_todo.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import net.be_geek.spring_boot_sample_todo.App;
import net.be_geek.spring_boot_sample_todo.entity.TestEntity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class TestRepositoryTest {

	@Autowired
	private TestRepository testRepo;

	@Test
	public void test1() {
		TestEntity entity = new TestEntity();
		testRepo.save(entity);

		List<TestEntity> savedTestList = testRepo.findAll();
		assertThat(savedTestList.size(), is(1));
	}

}
