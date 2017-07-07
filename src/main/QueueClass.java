public class QueueClass {

	private int queueSize = 0;

	public int getQueueSize() {
		return queueSize;
	}

	public void push(final int i) {
		queueSize++;
	}
}
