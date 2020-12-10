package abstractandinterface;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HdfcBnk hb = new HdfcBnk();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		bank bk = new HdfcBnk();
		bk.credit();
		bk.loan();
		bk.debit();

	}

}
