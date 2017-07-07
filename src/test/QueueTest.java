import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

public class QueueTest {

	private QueueClass queueClass;

	@Before
	public void setUp() throws Exception {
		queueClass = new QueueClass();

	}

	@Test
	public void createQueueClass() {
		assertNotNull(queueClass);
	}

	@Test
	public void assertSizeOfQueueIsZero() throws Exception {
		assertThat(queueClass.getQueueSize(), is(0));
	}

	@Test
	public void pushToQueue_andCheckSizeOfQueueIsOne() throws Exception {
		queueClass.push(1);

		assertThat(queueClass.getQueueSize(), is(1));
	}
}
