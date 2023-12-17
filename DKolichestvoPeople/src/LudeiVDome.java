
public class LudeiVDome {
	private int Paradnux;
	private int Kvartir;
	private int Ludey;

	LudeiVDome(int Paradnux, int Kvartir, int Ludey){
		this.Paradnux = Paradnux;
		this.Kvartir = Kvartir;
		this.Ludey = Ludey;
		
	}
	
	int getParadnux(){
		
		return Paradnux;
	}
	void setParadnux(int paradnux){
		//boolean Paradnux = true;
		//if(paradnux <= 0){
	//		this.Paradnux = paradnux;
	//	} 
		//boolean Paradnux = false;
		this.Paradnux = paradnux;
	}
	int getKvartir() {
		return Kvartir;
	}
	void setKvartir(int kvartir) {
		this.Kvartir = kvartir;
	}
	int getLudey() {
		return Ludey;
	}
	void setLudey(int ludey) {
		this.Ludey = ludey;
	}

	
	
}
