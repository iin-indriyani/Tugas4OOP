public class Labalaba extends Hewan{
	String nama, ukuran;
	public void setUkuran(String Ukurann){
	ukuran = Ukurann;
		}
 	public String getUkuran(){
            return ukuran="Kecil";
        }
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Laba Laba");
	}
	
	public void Hewan(){
		
		super.tampilkan();
		tampilkan();
		System.out.println("***************************");
		super.makan();
		super.berjalan();
		System.out.println("***************************");
	}
	public static void main (String[] args){
		Labalaba laba = new Labalaba();
		laba.Hewan();
		laba.getUkuran();
		System.out.println("Ukuran Laba laba : "+laba.ukuran);
		Hewan hewan1 = new Hewan();
        hewan1.setKaki(8);
        hewan1.setJenis("Serangga");       
        System.out.println("Banyak Kaki Laba Laba  = "+hewan1.getKaki());
        System.out.println("Laba laba Jenis Hewan = "+hewan1.getJenis());
        System.out.println("***************************");
	}
}