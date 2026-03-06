package pkg3nd_pontosdimensionais;

public class DoisPontos {
    private float coordX;
    private float coordY;
    
public DoisPontos(float x, float y){
    setCoordX(x);
    setCoordY(y);
}
    public void setCoordX(float coordX) {
        this.coordX = coordX; 
    }
    
    public void setCoordY(float y){
        coordY = y;
    }
    
    public float getCoordX(){
        return coordX;
    }
    public float getCoordY(){
        return coordY;
    }
    public String toString(){
        return "Eu sou um ponto Bidimensional \n"+
                "Meu ponto X : " + coordX + "\n" +
                "Meu ponto Y :" + getCoordY();
    
    }
    
    
    
}
