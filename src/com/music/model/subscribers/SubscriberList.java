package com.music.model.subscribers;
import java.util.ArrayList;
import java.util.List;

public class SubscriberList implements ISubscriberList {
	
	private List<Subscriber> subscribers;
	private String status;
	
	public SubscriberList() {
		this.subscribers = new ArrayList<>();
	}
	
	@Override
	public void register(Subscriber obj) {
		subscribers.add(obj);
		
	}

	@Override
	public void unregister(Subscriber obj) {
		subscribers.remove(obj);
		
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	@Override
	public void notifyObservers() {
		for(Subscriber obj : subscribers) {
			obj.update(status);
		}
	}
	
	public void statusChanged() {
		this.status = getStatus();
		notifyObservers();
	}

	
}
