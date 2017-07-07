public class QueueClass {

	private int queueSize = 0;
	private static int FULL_QUEUE_SIZE = 10;
	private int elements [] = new int[FULL_QUEUE_SIZE];
	private int headPointer = 0;
	private int tailPointer = 0;

	public void push(final int element) {

		if (queueSize > FULL_QUEUE_SIZE) {
			throw new QueueException();
		}

		elements[headPointer] = element;
		headPointer++;
		queueSize++;
	}

	public int pop() {

		if (queueSize == 0) {
			throw new QueueException();
		}

		queueSize--;

		return elements[tailPointer++];
	}

	public int getQueueSize() {
		return queueSize;
	}

	public static class QueueException extends RuntimeException {
	}
}
