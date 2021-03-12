package borrar;
import java.util.Scanner;
public class errores{
    private double valorR, valorAP;
    double errorabsoluto,errorRelativo, errorPorcentual;
    public errores (double a, double b){
        valorR=a;
        valorAP=b;
    }
    public double errorA (){
        errorabsoluto=valorR-valorAP;
        return errorabsoluto;
    }
    public double errorR (){
        errorRelativo=errorA ()/valorR;
        return errorRelativo;
    }
    public double errorPO (){
        errorPorcentual=errorR ()*100;
        return errorPorcentual;
    }
    public static void main(String[] args) {
        Scanner Lr = new Scanner(System.in);
        System.out.println("ingrese el valor real");
        double a=Lr.nextDouble();
        System.out.println("ingrese el valor aproximado");
        double b=Lr.nextDouble();
        errores obj=new errores(a,b);
        System.out.println(""+obj.errorA());
        System.out.println(""+obj.errorR());
        System.out.println(obj.errorPO()+"%");
    }
    
}
