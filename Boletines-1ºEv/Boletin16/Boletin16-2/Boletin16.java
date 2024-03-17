
package boletin16;


public class Boletin16 {


    public static void main(String[] args) {
        

        Libros objL=new Libros(null,"654645","Las mil y una noches","24/11/2023");
        Revistas objR=new Revistas(54,"234","Marca","4/05/2020");
        Biblioteca objB=new Biblioteca(objL,objR);
        System.out.println(objB);
        
    }
    
}
