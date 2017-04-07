public class Gajah extends Hewan{
	String nama, belalai;
	public void setBelalai(String Belalaii){
	belalai = Belalaii;
		}
 	public String getBelalai(){
            return belalai="Panjang";
        }
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Gajah");
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
		Gajah gajah = new Gajah();
		gajah.Hewan();
		gajah.getBelalai();
		System.out.println("Belalai Gajah : " +gajah.belalai);
		Hewan hewan1 = new Hewan();
        hewan1.setKaki(4);
        hewan1.setJenis("Mamalia");        
        System.out.println("Banyak Kaki Gajah  = "+hewan1.getKaki());
        System.out.println("Gajah Hewan Jenis  = "+hewan1.getJenis());
        System.out.println("***************************");
	}
}