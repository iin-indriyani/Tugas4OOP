public class Hewan {
    int kaki;
    String jenis;
    
    //konstruktor
    public Hewan(){
        this.kaki=0;
        this.jenis="Jenis Hewan ";
    }
    public Hewan(int k, String j){
        this.kaki = k;
        this.jenis = j;
    }    
    public void setKaki(int k){
        this.kaki=k;
    }
    public void setJenis(String j){
        this.jenis = j;        
    }
    public int getKaki(){
        return this.kaki;
    }
    public String getJenis(){
        return this.jenis;
    }    
    public void berjalan(){
        System.out.println("Sepeda Berjalan");        
    }
    public void makan(){
        System.out.println("Hewan Makan");        
    }     
	public void tampilkan(){
	System.out.println("ini Kelas Hewan");
	}
}