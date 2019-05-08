package batalha;

abstract public class Event {
	private long evtTime;
	/*private double priority;
	
	public void setPriority(double priority) {
		this.priority = priority;
	}
	*/
	public Event(long eventTime) {
		evtTime = eventTime;
	}
	public boolean ready() {
		return System.currentTimeMillis() >= evtTime;
	}
	abstract public void action();
	abstract public String description();
} 
	


