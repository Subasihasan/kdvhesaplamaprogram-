import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double para,kdvekli,kdvorani,kdvtutar,toplam;
        System.out.println("Para miktarını girin :");
        Scanner input = new Scanner(System.in);
        para= input.nextInt();
        System.out.println("Kdvsiz tutar :"+para);
        System.out.print("Kdv oarnı : ");
        System.out.println((para>1000)?(kdvorani=0.08):(kdvorani=0.18));
        kdvtutar=para*kdvorani;
        System.out.println(kdvtutar);
        toplam=para+kdvtutar;
        System.out.println(toplam);
    }
}