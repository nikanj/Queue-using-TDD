public class QueueClass {

	private int queueSize = 0;
	private static int FULL_QUEUE_SIZE = 10;

	public int getQueueSize() {
		return queueSize;
	}

	public void push(final int i) {

		if (queueSize > FULL_QUEUE_SIZE) {
			throw new QueueException();
		}

		queueSize++;
	}

	public void pop() {
		if (queueSize == 0) {
			throw new QueueException();
		}

		queueSize--;
	}

	public static class QueueException extends RuntimeException {
	}
}
