import java.util.Scanner;
class Tipe35 extends Parent {
	void tampil35() {
		biayabeban=500000;
		System.out.println("Biaya Beban = Rp.500.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jumlah = input.nextInt();
		total = jumlah * biayabeban;
		System.out.println("Total harga = " +total);
		System.out.print("Masukkan Bayaran = ");
		bayar = input.nextInt();
		kembalian = bayar-total;
	}
}