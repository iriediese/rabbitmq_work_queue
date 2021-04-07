import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

public class Send {
	private final static String QUEUE_NAME = "hello";
	public static void main(String[] argv) throws Exception {
		String message = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
			channel.queueDeclare(QUEUE_NAME, false, false, false, null);
			while((message=reader.readLine()) != null){
				channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
			}
			// System.out.println(" [x] Sent '" + message + "'");
			reader.close();
		}
	}
}
