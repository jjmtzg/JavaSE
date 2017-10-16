
public class ManejoEstructuraControl 

{
	private boolean b,c;
	public ManejoEstructuraControl() 
	{
		b=true;
		c=false;
		System.out.println(b||c);
		if(b==c)
			System.out.println("chana");
		else
			System.out.println("Juana");
	}
	public void ManejoElseIf()
	{
		b=true;
		c=false;
		if(b==c)
			System.out.println("chana");
		else if(b==c)
			System.out.println("Juana");
		else if(b==c)
				System.out.println("Melon");
		else if(!b==!c)
			System.out.println("Sandia");
		else if(!(b==!c))
			System.out.println("La vieja del otro dia");
		else
			System.out.println("Ni Modo");
	}

}
