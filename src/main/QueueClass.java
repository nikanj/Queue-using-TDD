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

		if (ifHeadPointerHasReachedEndOfQueue()) {
			headPointer = 0;
		}

		queueSize++;
	}

	private boolean queueIsFull() {
		return queueSize == FULL_QUEUE_SIZE;
	}

	private boolean ifHeadPointerHasReachedEndOfQueue() {
		return headPointer == FULL_QUEUE_SIZE;
	}

	public int pop() {

		if (queueIsEmpty()) {
			throw new QueueException();
		}

		queueSize--;

		if (ifTailPointerHasReachedEndOfQueue()) {
			tailPointer = 0;
			return elements[FULL_QUEUE_SIZE - 1];
		}

		return elements[tailPointer++];
	}

	private boolean queueIsEmpty() {
		return queueSize == 0;
	}

	private boolean ifTailPointerHasReachedEndOfQueue() {
		return tailPointer == FULL_QUEUE_SIZE - 1;
	}

	public int getQueueSize() {
		return queueSize;
	}

	public int getHeadPointer() {
		return headPointer;
	}

	public int getTailPointer() {
		return tailPointer;
	}

	public static class QueueException extends RuntimeException {
	}
}
