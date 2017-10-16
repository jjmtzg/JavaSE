

/*
 * Mostrar en enero julio noviembre diciembre y lunes viernes martes
 */
public class ManejoArray {

	public ManejoArray() {
		String[] meses={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String[] sem={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		System.out.println(meses[0]+" "+meses[6]+" "+meses[10]+" "+meses[11]+" "+meses[2]+" "
		+sem[0]+" "+sem[4]+" "+sem[1]);
			//fallo provocado
		//System.out.println((meses[12]));
	}

}
