package com.javase.ejemplo;
import static com.javase.valores.fechas.MesesYDias.MESES_ABREVIADOS;
import static com.javase.valores.fechas.MesesYDias.SEM_ABREVIADOS;
/*
 * Mostrar en enero julio noviembre diciembre y lunes viernes martes
 */
public class ManejoArray {

	public ManejoArray() {
		String[] meses=MESES_ABREVIADOS;
		String[] sem=SEM_ABREVIADOS;
		System.out.println(meses[0]+" "+meses[6]+" "+meses[10]+" "+meses[11]+" "+meses[2]+" "
		+sem[0]+" "+sem[4]+" "+sem[1]);
			//fallo provocado
		//System.out.println((meses[12]));
	}

}
