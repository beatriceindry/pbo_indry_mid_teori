import java.util.Scanner;
class Tipe32 extends Parent {
	void tampil32() {
		biayabebabn=125000;
		System.out.println("Biaya Beban = Rp.125.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jumlah = input.nextInt();
		total = jumlah * biayabeban;
		System.out.println("Total harga = " +total);
		System.out.print("Masukkan Bayaran = ");
		bayar = input.nextInt();
		kembalian = bayar-total;
	}
}