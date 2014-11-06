import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class Extra {

	public static void main(String[] args) {
		
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader("C:\\ibge.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Municipio> municipios = new ArrayList<Municipio>();
		
		System.out.println(bf);
		String line = null;
		int total = 0;
		try {
			while ((line = bf.readLine()) != null) {
				StringTokenizer partes = new StringTokenizer(line, "*");
				//String[] partes = line.split("\\*");z
			    //System.out.println(line);
			    //municipios.add(new Municipio(partes[0], partes[1], partes[2], partes[3], partes[4].replace(".", "")));

				String item1 = (String) partes.nextElement();
				String item2 = (String) partes.nextElement();
				String item3 = (String) partes.nextElement();
				String item4 = (String) partes.nextElement();
				String item5 = (String) partes.nextElement();
				
				//municipios.add(new Municipio(partes[0], partes[1], partes[2], partes[3], partes[4].replace(".", "")));
				municipios.add(new Municipio(item1, item2, item3, item4, item5));
				if(item5.equals("")) {
			    	
			    } else {
			    	total = total + Integer.parseInt(item5.replace(".", ""));
			    }
			    
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//System.out.println(municipios);
		System.out.println("Ordenado por nome: \n");
		Collections.sort(municipios, new MunicipioComparator());
		System.out.println(municipios);
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		System.out.println("\nTotal de Habitantes: " + formatter.format(total));
		//municipios
	}

}
