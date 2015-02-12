package kadai;

import java.sql.SQLException;

public class KadaiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KadaiController controller = new KadaiController();
		KadaiView frame = new KadaiView(controller);
		frame.setBounds(5,5,655,455);
		frame.setVisible(true);
		
	}

}
