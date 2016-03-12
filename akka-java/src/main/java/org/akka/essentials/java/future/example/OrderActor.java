package org.akka.essentials.java.future.example;

import akka.actor.ActorRef;
import org.akka.essentials.java.future.example.messages.Order;

import akka.actor.UntypedActor;

public class OrderActor extends UntypedActor {

	@Override
	public void onReceive(Object message) throws Exception {
		if (message instanceof Integer) {
			Integer userId = (Integer) message;
			// ideally we will get list of orders for given user id
			Order order = new Order(123, Float.valueOf(345), 5);
			getSender().tell(order, ActorRef.noSender());
		}
	}
}
