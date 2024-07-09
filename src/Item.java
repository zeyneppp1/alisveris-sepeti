
public class Item {
    private String ürünadı;
    private String tedarikçiadı;
    private double alışfiyatı;
    private double satışfiyatı;
    private double kar=0;
    private double  satışzammiktarı=0;
     
     
     
     public Item(String ürünadı,String tedarikçiadı,double alışfiyatı,double satışfiyatı)
     {
  	 this.ürünadı=ürünadı;
  	 this.tedarikçiadı=tedarikçiadı;
     this.alışfiyatı=alışfiyatı;
     this.satışfiyatı=satışfiyatı;
     
     }
    

     public String getÜrünadı() {
		return ürünadı;
	}
	public void setÜrünadı(String ürünadı) {
		this.ürünadı = ürünadı;
	}
	public String getTedarikçiadı() {
		return tedarikçiadı;
	}
	public void setTedarikçiadı(String tedarikçiadı) {
		this.tedarikçiadı = tedarikçiadı;
	}
	public double getAlışfiyatı() {
		return alışfiyatı;
	}
	public void setAlışfiyatı(double alışfiyatı) {
		this.alışfiyatı = alışfiyatı;
	}
	public double getSatışfiyatı() {
		return satışfiyatı;
	}
	public void setSatışfiyatı(double satışfiyatı) {
		this.satışfiyatı = satışfiyatı;
	}
	 
	public void karHesapla() {
		
		kar=satışfiyatı-alışfiyatı;
		System.out.println("kar miktarı"+kar);
	
	}
	public void satışarttırma() {
		
		this.satışfiyatı=this.satışfiyatı*0.2+this.satışfiyatı;
		System.out.println("satışzamlımiktarı"+this.satışfiyatı);
	    
	}
	
	
}
