public class Ayam extends Hewan{
	String nama, makanan;
	public void setMakanan(String Makanann){
	makanan = Makanann;
		}
 	public String getMakanan(){
            return makanan="Dedak";
        }
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Ayam");
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
		Ayam ayam = new Ayam();
		ayam.Hewan();
		ayam.getMakanan();
		System.out.println("Makanan Ayam :" +ayam.makanan);
		Hewan hewan1 = new Hewan();
        hewan1.setKaki(2);
        hewan1.setJenis("Unggas");       
        System.out.println("Banyak Kaki Ayam  = "+hewan1.getKaki());
        System.out.println("Ayam Jenis Hewan = "+hewan1.getJenis());
        System.out.println("***************************");
	}
}