import java.util.Scanner;

public class Test {
    private final String[] test ;

    public Test(String[] test) {
        this.test = test;
    }
    public void test() {

            try {
                String a = "a";
                String b = "b";
                String c = "c";
                int point = 0;
                    System.out.println("Peaksoft kaisy jyly negizdelgen?: \na)2017  b)2018  c)2019");
                    String option = new Scanner(System.in).nextLine();
                    if (c.equals(option)) {
                        point += 20;
                    } else if (option.equals(a)) {
                    } else if (option.equals(b)) {

                    } else {
                        throw new Exception("Myndai variant jok");

                    }
                System.out.println("Kyrgyz Respublikasynyn gerbi kachan kabyl alyngan?\na)1992-03-14    b)1994-01-14    c)1991-05-03");
                String option1 = new Scanner(System.in).nextLine();
                    if (a.equals(option1)){

                    } else if (b.equals(option1)) {
                        point+=20;
                    } else if (c.equals(option1)) {

                    }else {
                        throw new Exception("Myndai variant jok");
                    }
                System.out.println("Kyrgyz Respublikasynyn jelegi kachan kabyl alyngan? \na)1991-01-12      b)1993-03-15        c)1992-03-03");
                String option2 = new Scanner(System.in).nextLine();
                    if (a.equals(option2)){

                    } else if (b.equals(option2)) {

                    } else if (c.equals(option2)) {
                        point+=20;
                    }else {
                        throw new Exception("Mynday variant jok");
                    }
                System.out.println("Kyrgyz Respublikasynyn gimni kachan kabyl alyngan? \na)1992-12-18       b)1991-01-18        c)1993-03-15");
                String option3 = new Scanner(System.in).nextLine();
                    if (a.equals(option3)){

                    } else if (b.equals(option3)) {
                        point+=20;
                    } else if (c.equals(option3)) {

                    }else {
                        throw new Exception("Myndai variant jok");
                    }
                System.out.println("Bishkek shaary kachan negidelgen?\na)1825-j       b)1889-j      c)1925-j");
                String option4 = new Scanner(System.in).nextLine();
                if (a.equals(option4)){
                    point+=20;
                } else if (b.equals(option4)) {

                } else if (c.equals(option4)) {

                }else {
                    throw new Exception("Myndai variant jok");
                }
                System.out.println("You got "+point+" from 100.");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

    }
}
