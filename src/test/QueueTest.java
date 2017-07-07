import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

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

	@Test(expected = QueueClass.QueueException.class)
	public void popFromEmptyQueue_thenReturnException() throws Exception {
		queueClass.pop();
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

	@Test
	public void pushToQueue_thenPopFromQueue_SizeIsZero() throws Exception {
		queueClass.push(1);
		queueClass.pop();

		assertThat(queueClass.getQueueSize(), is(0));
	}

	@Test(expected = QueueClass.QueueException.class)
	public void pushMoreThanQueueSize_thenReturnException() throws Exception {
		pushElementsInQueue(15);
	}

	private void pushElementsInQueue(final int numberOfElements) {
		for (int i = 0; i < numberOfElements; i++)
			queueClass.push(i);
	}

	@Test
	public void pushXToQueue_PopFromQueue_andTheElementIsTheSame() throws Exception {
		queueClass.push(99);

		assertThat(queueClass.pop(), is(99));
	}

	@Test
	public void pushXThenYToQueue_PopXThenY() throws Exception {
		queueClass.push(99);
		queueClass.push(100);

		assertThat(queueClass.pop(), is(99));
		assertThat(queueClass.pop(), is(100));
	}

	@Test
	public void push5Elements_thenPop2Elements_andPush6More() throws Exception {
		pushElementsInQueue(5);
		queueClass.pop();
		queueClass.pop();

		pushElementsInQueue(6);

		assertThat(queueClass.getQueueSize(), is(9));
	}

	@Test
	public void pushFullQueue_thenPopFullQueue_thenHeadAndTailPointersAreAtTheBeginning() throws Exception {
		pushElementsInQueue(10);
		for (int i = 0; i < 10 ; i++)
			queueClass.pop();

		assertThat(queueClass.getHeadPointer(), is(0));
		assertThat(queueClass.getTailPointer(), is(0));
	}
}
