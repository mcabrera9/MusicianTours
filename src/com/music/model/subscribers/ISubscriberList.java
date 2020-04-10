package com.music.model.subscribers;
import java.util.ArrayList;
import java.util.List;

public interface ISubscriberList {
	void register(Subscriber obj);
	void unregister(Subscriber obj);
	void notifyObservers();
}

