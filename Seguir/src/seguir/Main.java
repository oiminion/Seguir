/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seguir;

/**
 *
 * @author arthu
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        teste pessoa_seguindo = new teste(1);
        teste pessoa_seguida = new teste(2);
        
        pessoa_seguindo.seguir(pessoa_seguida);
        
        pessoa_seguindo.Exibir();
        
        System.out.println("\n\n");
        
        pessoa_seguida.Exibir();
    }
    
}
