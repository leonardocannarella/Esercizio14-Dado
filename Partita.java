import java.util.Random;
 
public class Partita{
	private int dado;
	Random random=new Random() ; 
	public Partita()
	{
	    setDado(0);
	}
	public int getDado(){
		return this.dado;
	}
	public void setDado(int n){
		this.dado=n;
	}
	public void generaNumero()
	{
		this.setDado(random.nextInt(6)+1);
	}
	public String toString(){
		String s;
		s="Valore del dado: "+getDado();
		return s;
	}	
}
