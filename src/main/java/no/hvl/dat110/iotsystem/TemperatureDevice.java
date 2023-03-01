package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) throws InterruptedException {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();
		
		// create a client object and connect to the broker - user "sensor" as the user name
		Client client = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);
		client.connect();
		
		// - publish the temperature(s)
		for (int i=1; i<=COUNT; i++) {
			client.publish("temperature", sn.read()+"");
			Thread.sleep(1000);
		}
		
		// - disconnect from the broker
		client.disconnect();

		System.out.println("Temperature device stopping ... ");
	}
}
