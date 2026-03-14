package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		Client client = new Client("sensor",Common.BROKERHOST,Common.BROKERPORT);
		boolean connected = client.connect();

		for (int i = 0; i<COUNT; i++) {

			double temperature = sn.read();

			client.publish(Common.TEMPTOPIC,Double.toString(temperature));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		client.disconnect();

		System.out.println("Temperature device stopping ... ");


	}
}
