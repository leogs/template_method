package template_method;

public class Cafe extends BebidaCafeinada{

	public void mistura(){

        System.out.println( "Moendo caf�" );
    }

    public void addCondimentos(){

        System.out.println( "Adicionando a��car e leite" );
    }
    
    public Cafe() {
    	
    }
}
