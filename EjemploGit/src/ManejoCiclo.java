import static fechas.MesesYDias.MESES;
public class ManejoCiclo {

	public ManejoCiclo() {
	}
	void For()
	{
		
	}
	void While()
	{
		int i=0;
		while(i<MESES.length)
		{
			System.out.println("Mes: "+(i+1)+" es "+MESES[i]);
			i++;
		}
	}
	void cuentaLetras(int numeroDeLetras)
	{
		for(int i=0;i<MESES.length;i++)
		{
			if(MESES[i].length()==numeroDeLetras)
			{
				System.err.println(MESES[i]+" : "+numeroDeLetras);
				break;
			}
		}
		for(int i=0;i<MESES.length;i++)
		{
			if(MESES[i].length()==numeroDeLetras)
				System.out.println(MESES[i]+" : "+numeroDeLetras);
		}
	}
}
