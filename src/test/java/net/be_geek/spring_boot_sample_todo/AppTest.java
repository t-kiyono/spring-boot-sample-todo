package net.be_geek.spring_boot_sample_todo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.OutputCapture;

public class AppTest {

	@Rule
	public OutputCapture outputCapture = new OutputCapture();

	@Test
	public void testCommandLineOverrides() throws Exception {
		App.main(new String[]{});
		String output = this.outputCapture.toString();

		assertThat(output.contains("Started App"), is(Boolean.TRUE));
		assertThat(output.contains("Exception"), is(Boolean.FALSE));
	}
}
