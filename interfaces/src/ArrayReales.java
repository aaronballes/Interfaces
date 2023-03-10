public class ArrayReales implements iEstadisticas{
    private double dblData[];

    public ArrayReales(){
        dblData = new double[5];
    }

    @Override
    public double sumatorio(){
        double dblDataValue = 0;

        for(int i = 0; i < dblData.length; i++){
            dblDataValue += dblData[i];
        }
        return dblDataValue;
    }

    @Override
    public double minimo(){
        double dblDataValue = Double.MAX_VALUE;

        for(int i = 0; i < dblData.length; i++){
            if(dblData[i] < dblDataValue){
                dblDataValue = dblData[i];
            }
        }
        return dblDataValue;
    }

    @Override
    public double maximo(){
        double dblDataValue = Double.MIN_VALUE;

        for(int i = 0; i < dblData.length; i++){
            if(dblData[i] > dblDataValue){
                dblDataValue = dblData[i];
            }
        }
        return dblDataValue;
    }

}
