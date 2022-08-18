package polimorfismo;

public class peixe extends animais {
  private String corEscama;
  
  
  
@Override
public void locomover() {
  System.out.println("Nadando");	
}

@Override
public void alimentar() {
	 System.out.println("Comendo Substancias");
}

@Override
public void emitirSom() {
	 System.out.println("Soltou uma bolha");
}
 
public void soltarBolha() {
System.out.println("Soltando bolha");
  
  
}

public String getCorEscama() {
	return corEscama;
}

public void setCorEscama(String corEscama) {
	this.corEscama = corEscama;
}



}
