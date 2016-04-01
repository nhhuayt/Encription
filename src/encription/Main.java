package encription;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Even even = new Even();
		even.ReadEvenFile("data/even");
		even.WriteEvenFile("data/even-encripted");
		
		SoNguyenTo soNguyenTo = new SoNguyenTo();
		soNguyenTo.ReadSoNguyenToFile("data/so_nguyen_to");
		soNguyenTo.WriteSoNguyenToFile("data/so-nguyen-to-encripted");
	}

}
