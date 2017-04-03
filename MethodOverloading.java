public class MethodOverloading {	
	public static void main(String[] args){
		MethodOverloading method = new MethodOverloading();
		method.methodTampilkan("Belajar java Yuks");
		method.kembalikanNilai("Belajar java Yuks", "Hingga Mengerti");
	}

	private void methodTampilkan(String nama) {
		System.out.println (nama);
	}

	private String kembalikanNilai(String x, String y) {
		System.out.printf (x, y);
	}
	// private String kembalikanNilai(String nama1, String nama2) {
	// 	System.out.println (nama1, nama2);
	// }
}