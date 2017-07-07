public class QueueClass {

	private int queueSize = 0;
	private static int FULL_QUEUE_SIZE = 10;
	private int elements [] = new int[FULL_QUEUE_SIZE];

	public int getQueueSize() {
		return queueSize;
	}

	public void push(final int i) {

		if (queueSize > FULL_QUEUE_SIZE) {
			throw new QueueException();
		}

		elements[0] = i;

		queueSize++;
	}

	public int pop() {

		if (queueSize == 0) {
			throw new QueueException();
		}

		queueSize--;

		return elements[0];
	}

	public static class QueueException extends RuntimeException {
	}
}
