
package pkg3nd_item;


public class Main {

    public static void main(String[] args) {
        Item leite = new Item("BUH-010102","Leite em pó 1KG",10, (float) 22.50);
        Item pao = new Item("PA-1111","pão de forma pcote",2,10);
        // aplicar cupon
        leite.set_desconto((float) 0.10);
        // Obter o preço com desconto
        float preco_leite = leite.getTotalAjustado();
        System.out.println("Itens:");
        System.out.println(leite.getDescricao() +
                "\t R$" + preco_leite);
        System.out.println(pao.getDescricao()+
                "\t R$"+ pao.getTotalAjustado() );
        
        
        
        
    }
    
    
    
}
