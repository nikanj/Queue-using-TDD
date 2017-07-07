public class QueueClass {

	private int queueSize = 0;

	public int getQueueSize() {
		return queueSize;
	}

	public void push(final int i) {
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
