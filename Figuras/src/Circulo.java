public class Circulo implements IFigura{
    private double radio;

    public Circulo(double p_dblradio){
        setRadio(p_dblradio);
    }

    private void setRadio(double p_dblradio){
        radio = p_dblradio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public double getPerimetro(){
        return Math.round(2*Math.PI*radio*100)/100;
    }

    @Override
    public double getArea(){
        return Math.round(Math.PI*radio*radio*100)/100;
    }

    @Override
    public String toString(){
        return "Perimetro "+getPerimetro()+" Area "+getArea();
    }
}