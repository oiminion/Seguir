package seguir;

/**
 *
 * @author arthu
 */

import java.util.ArrayList;

public class teste{
    private int a;
    
    private ArrayList<teste> seguindo;
    private ArrayList<teste> seguidores;
    
    teste(int number)
    {
        a = number;
        seguindo = new ArrayList<teste>();
        seguidores = new ArrayList<teste>();
    }
    
    public void addSeguidores(teste Seguidor)
    {
        this.seguidores.add(Seguidor);
    }
    
    public void addSeguindo(teste Seguindo)
    {
        this.seguindo.add(Seguindo);
    }
    
    public void seguir(teste pessoa_seguida)
    {
        pessoa_seguida.addSeguidores(this);
        this.addSeguindo(pessoa_seguida);
    }
    
    public int getValue()
    {
        return this.a;
    }
    
    public void Exibir()
    {
        System.out.println("Valor");
        System.out.println(a);
        
        System.out.println("Seguidores");
        System.out.print("Size: ");
        System.out.println(this.seguidores.size());
        for( int i = 0; i < this.seguidores.size(); i++ ){
            System.out.println(this.seguidores.get(i).getValue());
        }
        
        System.out.println("Seguindo");
        System.out.print("Size: ");
        System.out.println(this.seguindo.size());
        for( int i = 0; i < this.seguindo.size(); i++ ){
            System.out.println(this.seguindo.get(i).getValue());
        }
        
    }
}
