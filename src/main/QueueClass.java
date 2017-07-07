public class QueueClass {

	private int queueSize = 0;
	private static int FULL_QUEUE_SIZE = 10;
	private int elements [] = new int[FULL_QUEUE_SIZE];
	private int headPointer = 0;
	private int tailPointer = 0;

	public void push(final int element) {

		if (queueIsFull()) {
			throw new QueueException();
		}

		elements[headPointer] = element;
		headPointer++;
		queueSize++;
	}

	private boolean queueIsFull() {
		return queueSize == FULL_QUEUE_SIZE;
	}

	public int pop() {

		if (queueIsEmpty()) {
			throw new QueueException();
		}

		queueSize--;

		return elements[tailPointer++];
	}

	private boolean queueIsEmpty() {
		return queueSize == 0;
	}

	public int getQueueSize() {
		return queueSize;
	}

	public static class QueueException extends RuntimeException {
	}
}
