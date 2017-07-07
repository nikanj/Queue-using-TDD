import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

public class QueueTest {

	@Test
	public void createQueueClass() {
		assertNotNull(new QueueClass());
	}

	@Test
	public void assertSizeOfQueueIsZero() throws Exception {
		assertThat(new QueueClass().getQueueSize(), is(0));
	}
}
