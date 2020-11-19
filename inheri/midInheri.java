public class midInheri{
public static void main (String[] args) {
	Parent supObj = new Parent();
	Child subObj = new Child();

	supObj.tampil();
	subObj.tampill();
	System.out.println();
	System.out.println("Nama = " +supObj.nama); 
	System.out.println("Total harga = " +subObj.total);
	System.out.println("Bayar = " +subObj.bayar); 
	System.out.println("Kembalian = " +subObj.kembalian);
	
}
}