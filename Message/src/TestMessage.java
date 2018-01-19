
public class TestMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m1 = new Message(1,2,"Test message");
		Message m2 = new Message(3,45,"Test message 2");
		Message m3 = new Message();
		Message m4 = new Message();
		m3.setSource(44);
		m3.setDestination(66);
		m3.setContent("Teste 2");
		
		m1.sendMessage();
		m2.sendMessage();
		m3.sendMessage();
		m4.sendMessage();
	}

}
