import java.util.Scanner;
public class DersIstatistik {

    int notAA;
    int notBA;
    int notBB;
    int notCB;
    int notCC;
    int notDC;
    int notDD;
    static int toplamOgrenciSayisi;

    DersIstatistik(int notAA, int notBA, int notBB, int notCB, int notCC, int notDC, int notDD, int toplamOgrenciSayisi) {
        this.notAA = notAA;
        this.notBA = notBA;
        this.notBB = notBB;
        this.notCB = notCB;
        this.notCC = notCC;
        this.notDC = notDC;
        this.notDD = notDD;
        toplamOgrenciSayisi = notAA + notBA + notBB + notCB + notCC + notDC + notDD;
    }

    public DersIstatistik(int notAA, int notBA, int notBB, int notCB, int notCC, int notDC, int notDD) {
    }

    public void setNotAA(int notAA) {
        this.notAA = notAA;
    }

    public int getNotAA() {
        return notAA;
    }

    public void setNotBA(int notBA) {
        this.notBA = notBA;
    }

    public int getNotBA() {
        return notBA;
    }

    public void setNotBB(int notBB) {
        this.notBB = notBB;
    }

    public int getNotBB() {
        return notBB;
    }

    public void setNotCB(int notCB) {
        this.notCB = notCB;
    }

    public int getNotCB() {
        return notCB;
    }

    public void setNotCC(int notCC) {
        this.notCC = notCC;
    }

    public int getNotCC() {
        return notCC;
    }

    public void setNotDC(int notDC) {
        this.notDC = notDC;
    }

    public int getNotDC() {
        return notDC;
    }

    public void setNotDD(int notDD) {
        this.notDD = notDD;
    }

    public int getNotDD() {
        return notDD;
    }

    public static void setToplamOgrenciSayisi(int toplamOgrenciSayisi) {
        DersIstatistik.toplamOgrenciSayisi = toplamOgrenciSayisi;
    }

    public void setToplamOgrenciSayisi(DersIstatistik ders) {
        this.toplamOgrenciSayisi = toplamOgrenciSayisi;
    }

    static int getToplamOgrenciSayisi() {
        return toplamOgrenciSayisi;
    }


    static void baslikYazdir() {
        System.out.println("**************************************\n" +
                "*****DERS NOTLARI İSTATİSİK PROGRAMI*****\n" +
                "******************************************\n");
    }

    static void menuYazdir() {
        System.out.println(
                "\nMENÜ:\n" +
                        "(1) Her bir harfli başarı notu için öğrenci sayısı gir\n" +
                        "(2) Metinsel istatistik yazdır\n" +
                        "(3) Grafiksel istatistik yazdır\n" +
                        "(4) Tüm verileri sıfırla\n" +
                        "(5) Programı sonlandır\n");
    }

    static void notSayisiGir() {
        Scanner key = new Scanner(System.in);

        int notAA, notBA, notBB, notCB, notCC, notDC, notDD;

        System.out.print("AA alan öğrenci sayısını giriniz: ");
        notAA = key.nextInt();
        System.out.print("BA alan öğrenci sayısını giriniz: ");
        notBA = key.nextInt();
        System.out.print("BB alan öğrenci sayısını giriniz: ");
        notBB = key.nextInt();
        System.out.print("CB alan öğrenci sayısını giriniz: ");
        notCB = key.nextInt();
        System.out.print("CC alan öğrenci sayısını giriniz: ");
        notCC = key.nextInt();
        System.out.print("DC alan öğrenci sayısını giriniz: ");
        notDC = key.nextInt();
        System.out.print("DD alan öğrenci sayısını giriniz: ");
        notDD = key.nextInt();

        DersIstatistik sayi = new DersIstatistik(notAA, notBA, notBB, notCB, notCC, notDC, notDD);
        sayi.setToplamOgrenciSayisi(notAA + notBA + notBB + notCB + notCC + notDC + notDD);
        System.out.println("Toplam Öğrenci Sayısı: " + sayi.getToplamOgrenciSayisi());

    }

    public void metinselIstatistikYazdir() {
        float sonuc = (float) 100 / (float) toplamOgrenciSayisi;
        System.out.print("AA: %");
        System.out.printf("%.2f", (sonuc * notAA));
        System.out.println(" ");

        System.out.print("BA: %");
        System.out.printf("%.2f", (sonuc * notBA));
        System.out.println(" ");

        System.out.print("BB: %");
        System.out.printf("%.2f", (sonuc * notBB));
        System.out.println(" ");

        System.out.print("CB: %");
        System.out.printf("%.2f", (sonuc * notCB));
        System.out.println(" ");

        System.out.print("CC: %");
        System.out.printf("%.2f", (sonuc * notCC));
        System.out.println(" ");

        System.out.print("DC: %");
        System.out.printf("%.2f", (sonuc * notDC));
        System.out.println(" ");

        System.out.print("DD: %");
        System.out.printf("%.2f", (sonuc * notDD));
        System.out.println(" ");

    }

    public  void grafikselIstatistikYazdir() {
        float sonuc = (float) 100 / (float) toplamOgrenciSayisi;
        System.out.println("    0    10   20   30   40   50   60    70   80   90   100\n" +
                            "   |    |    |    |    |    |    |     |    |    |    | \n " +
                             "  ****************************************************\n");

        System.out.print("AA : ");
        for (int x = 1; x <= (Math.round(sonuc * notAA / 2)); x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("BA :");
        for (int x = 1; x <= (Math.round(sonuc * notBA / 2)); x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("BB :");
        for (int x = 1; x <= (Math.round(sonuc * notBB / 2)); x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("CB :");
        for (int x = 1; x <= (Math.round(sonuc * notCB / 2)); x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("CC :");
        for (int x = 1; x <= (Math.round(sonuc * notCC / 2)); x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("DC :");
        for (int x = 1; x <= (Math.round(sonuc * notDC / 2)); x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("DD :");
        for (int x = 1; x <= (Math.round(x * notDD / 2)); x++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public void veriSifirla() {
        int e = getToplamOgrenciSayisi();
        e = 0;
        setToplamOgrenciSayisi(e);

    }
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        DersIstatistik a1 = new DersIstatistik(10,10,5,5,5,9,7);
        a1.baslikYazdir();


        while (true) {
            a1.menuYazdir();
            System.out.print("Lütfen İşlem Seçiniz: ");
            int select = key.nextInt();
            System.out.println("----------------");

            if (select == 5) {
                System.out.print("Program Sonlandırıldı!");
                break;
            } else if (select == 1) {
                a1.notSayisiGir();

            } else if (select == 2) {
                if (a1.toplamOgrenciSayisi == 0) {
                    System.out.print("UYARI:Harfli başarı notları için henüz sayısal veriler girilmemiştir!!");
                    System.out.print("Menüye dönmek için 9'a basınız!!!");
                    int sayi = key.nextInt();
                    if (sayi == 9) {
                        continue;
                    } else {
                        System.out.print("Üzgünüz!!! 9'dan farklı değer girdiğiniz için program sonlandırıldı.");
                        break;
                    }
                }
                a1.metinselIstatistikYazdir();
                continue;


                } else if (select == 3) {
                    if (a1.toplamOgrenciSayisi == 0) {
                        System.out.print("UYARI:Harfli başarı notları için henüz sayısal veriler girilmemiştir!!");
                        System.out.print("Menüye dönmek için 9'a basınız!!!");
                        int sayi = key.nextInt();
                        if (sayi == 9) {
                            continue;
                        } else {
                            System.out.print("Üzgünüz!!! 9'dan farklı değer girdiğiniz için program sonlandırıldı.");
                            break;
                        }
                    }
                    a1.grafikselIstatistikYazdir();
                    continue;

                    } else if (select == 4) {
                        a1.veriSifirla();
                        System.out.println("Veriler sıfırlandı..");
                        continue;
                    } else {
                        System.out.println("Lütfen 1-5 arasında bir sayı seçiniz");
                        continue;
                    }


                }


            }

        }




