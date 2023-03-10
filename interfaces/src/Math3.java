public final class Math3 implements iExtremos{

    public static double min(double a, double b){
        return a;
    }

    @Override
    public int min(int[] a){
        return a[0];
    }

    @Override
    public int max(int[] a){
        return a[a.length-1];
    }

    @Override
    public double min(double[] a){
        return a[0];
    }

    @Override
    public double max(double[] a){
        return a[a.length-1];
    }
}
