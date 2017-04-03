public class PenggunaanThis {
	String nama;
	private void namaMahasiswa(String nama){
		this.nama = nama;
		System.out.println(this.nama);
	}

	public static void main (String[] args){
		PenggunaanThis thiss = new PenggunaanThis();
		thiss.namaMahasiswa ("frencius");
	}
}