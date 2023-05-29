package kitapci;

import java.util.ArrayList;
import java.util.List;

public class BookMehots {

    public static List<Books> booksList = new ArrayList<>();
    Books sessiz = new Books(1000, "Sessiz", "Ali Fuat", 250);
    Books yanlis = new Books(1001, "Yanlis", "Mehmet Ali", 350);
    Books yakin = new Books(1002, "Yakin", "Matin Obafemi", 175);
    Books love = new Books(1003, "Love", "Depay FK", 180);
    Books gomu = new Books(1004, "Gömü", "Ali Fuat", 325);
    Books harryPotter = new Books(1005, "Harry Potter", "J. K. Rowling", 430);

    public void addBook() {
        booksList.add(sessiz);
        booksList.add(yanlis);
        booksList.add(yakin);
        booksList.add(love);
        booksList.add(gomu);
        booksList.add(harryPotter);
        Depo.count = harryPotter.getBookCode() + 1;

    }

    public void addNewBook() {

        System.out.println("Eklemek istediginiz Kitabın adını gırınız");
        Depo.input.nextLine();
        String kitapAdi = Depo.input.nextLine();
        System.out.println("Kitap yazarını giriniz");
        String kitapYazari = Depo.input.nextLine();
        System.out.println("Kitap fiyatını giriniz");
        int kitapFiyati = Depo.input.nextInt();
        Books newBook = new Books(Depo.count, kitapAdi, kitapYazari, kitapFiyati);
        booksList.add(newBook);
        Depo.count++;
        showBook();
    }

    public void showBook() {
        System.out.printf("%-10s %-15s %-15s %-20s", "Book Code", "Book Name", "Book Author", "Book Price");
        System.out.println();
        for (Books each : booksList) {
            System.out.printf(Depo.Blue + "%-10d %-15s %-15s %-20d", each.getBookCode(), each.getBookName(),
                    each.getBookAuthor(), each.getBookPrice());
            System.out.println();
        }
        Runner.start();
    }


    public void bookCodeWithShowBook() {
        int count=0;
        System.out.println("Bilgilerini goruntulemek ıstedıgınız kitabın adını giriniz..");
        int bookCode= Depo.input.nextInt();
        for (Books each : booksList) {
            if (each.getBookCode()==bookCode) {
                System.out.printf("%-10s %-15s %-15s %-20s", "Book Code", "Book Name", "Book Author", "Book Price");
                System.out.println();
                System.out.printf(Depo.Blue + "%-10d %-15s %-15s %-20d", each.getBookCode(), each.getBookName(),
                        each.getBookAuthor(), each.getBookPrice());
                System.out.println();
                count++;
            }
           if(count==0){
                System.out.println("Boyle bir code ile uyumlu kitap ismi bulunmamaktadır...");
            }
        }
        Runner.start();
    }


    public void dataWithShowBook() {
        System.out.println("Hangi bilgi ile kitap goruntulemek istersiniz..");
        System.out.println("1==> Kitap adi");
        System.out.println("2==> Kitap yazari");
        System.out.println("0==> Menüye geri dön..");
        int secenek=Depo.input.nextInt();
        switch (secenek){
            case 1:
                int count=0;
                System.out.println("Bilgilerini goruntulemek ıstedıgınız kitabın adını giriniz..");
                Depo.input.nextLine();
                String bookName = Depo.input.nextLine();
                for (Books each : booksList) {
                    if (each.getBookName().equals(bookName)) {
                        System.out.printf("%-10s %-15s %-15s %-20s", "Book Code", "Book Name", "Book Author", "Book Price");
                        System.out.println();
                        System.out.printf(Depo.Blue + "%-10d %-15s %-15s %-20d", each.getBookCode(), each.getBookName(),
                                each.getBookAuthor(), each.getBookPrice());
                        System.out.println();
                        count++;
                    }
                }
                if(count==0) {
                    System.out.println(Depo.Red + "Boyle bir kitap ismi iligili bir kitabımız bulunmamaktadır...");
                }
                dataWithShowBook();
                break;
            case 2:
                int count2=0;
                System.out.println("Bilgilerini goruntulemek ıstedıgınız kitabın yazrını giriniz giriniz..");
                Depo.input.nextLine();
                String bookAuthor = Depo.input.nextLine();
                for (Books each : booksList) {
                    if (each.getBookAuthor().equals(bookAuthor)) {
                        System.out.printf("%-10s %-15s %-15s %-20s", "Book Code", "Book Name", "Book Author", "Book Price");
                        System.out.println();
                        System.out.printf(Depo.Blue + "%-10d %-15s %-15s %-20d", each.getBookCode(), each.getBookName(),
                                each.getBookAuthor(), each.getBookPrice());
                        System.out.println();
                        count2++;
                    }
                }
                if(count2==0){
                    System.out.println(Depo.Red+"Boyle bir kitap yazarı ile ilgili kitap bulunmamaktadır...");
                }
                dataWithShowBook();
                break;
            case 0:
                Runner.start();
                break;


        }
    }
}






































































