package usp.mac321.extra;

public class BufferTimeComparation {
	/* 
		Basicamente, STRINGS são IMUTÁVEIS (ou seja, não podem ser alteradas), então durante a concatenação na STRING o 
		computador recria toda a STRING adicionando o CARACTER no final da antiga STRING formando a nova STRING.
		
		Já o STRINGBUFFER é completamente MUTÁVEL, então, não é recriada uma nova 
		string durante o uso da função append(). Tornando mais rápido esse processamento.
		
		Vamos usar o System.currentTimeMillis() para contabilizar o tempo.
	*/
	
	public static void main(String[] args) {
		int n = 99999;
		String s = "";
		StringBuffer sb = new StringBuffer();

		// String
		long startTime = System.currentTimeMillis();
	    for (int i = 0; i < n; i++) {
	        s += "a";
	    }
	    long endTime = System.currentTimeMillis();
	    System.out.println("[TIME] String: " + (endTime - startTime) + " milissegundos");

	    // StringBuffer
	    startTime = System.currentTimeMillis();
	    for (int i2 = 0; i2 < n; i2++) {
	    	sb.append("a");
	    }
	    endTime = System.currentTimeMillis();
	    
	    System.out.println("[TIME] StringBuffer: " + (endTime - startTime) + " milissegundos");
	}	
}
