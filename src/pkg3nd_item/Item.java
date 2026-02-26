
package pkg3nd_item;


public class Item {
    private float precoUnitario;
    private int quantidade;
    private String descricao;
    private String id;
    private float desconto;
    
    public Item(String id, String descricao, int quantidade, float precoUnitario){
        this.id = id;
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
        
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }else{
        this.quantidade = 0;
        }
    }
        
        public float getTotalAjustado(){
            float total = getPrecoUnitario() * getQuantidade();
            float total_desconto = total * desconto;
            float total_ajustado = total - total_desconto;
            return total_ajustado;
        
        }
        
        public void set_desconto(float desconto){
            if(desconto <= 1.0){
            this.desconto = desconto;
            
            }else{
            this.desconto = 0;
            
            }
        }
            
            public float get_desconto(){
                return desconto;
            
            }

    /**
     * @return the precoUnitario
     */
    public float getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * @param precoUnitario the precoUnitario to set
     */
    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
            
        }
        
        
        
        
        
        
        
        
        
    
    
    

