import java.util.Comparator;


public class MunicipioComparator implements Comparator<Municipio> {

	@Override
	public int compare(Municipio mu0, Municipio mu1) {
		
		int nComp = mu0.getNome_municipio().compareTo(mu1.getNome_municipio());
		if(nComp != 0) return nComp;
		
		return 0;
	}

}
