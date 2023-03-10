public class Rectangulo implements IFigura{
    private double base;
    private double altura;

    public Rectangulo(double p_dblBase, double p_dblAltura){
        setBase(p_dblBase);
        setAltura(p_dblAltura);
    }

    private void setBase(double p_dblBase){
        base = p_dblBase;
    }

    private void setAltura(double p_dblAltura){
        altura =  p_dblAltura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }


    @Override
    public double getPerimetro(){
        return Math.round((2*base)+(2*altura)*100)/100;
    }

    @Override
    public double getArea(){
        return Math.round(base*altura*100)/100;
    }

    @Override
    public String toString(){
        return "Perimetro "+getPerimetro()+" Area "+getArea();
    }
}
