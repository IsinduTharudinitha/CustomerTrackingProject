
public class Counter {
  
	int count ;
	
	public Counter(int initialCount) {
		this.setCount(initialCount);
	}
	
	
	public void increment() {
		this.count++;
	}
	
	
	public int getCount() {
		return this.count;
	}
	
	public void setCount(int count) {
		this.count= count;
	}
	
}
