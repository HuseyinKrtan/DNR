package kitapci;

public class Runner {
    public static void main(String[] args) {

       BookMehots bookMehots=new BookMehots();
       bookMehots.addBook();
        start();
    }

    public static void start() {
        BookMehots bookMehots =new BookMehots();

        System.out.println(Depo.Yellow+"==================================");
        System.out.println(Depo.Blue+"============ WELCOME DNR =============");
        System.out.println(Depo.Yellow+"==================================");
        System.out.println(Depo.Green+"1==> Kitap Ekleme");
        System.out.println(Depo.Green+"2==> Kitap Codu ile Kitap Goruntuleme ");
        System.out.println(Depo.Green+"3==> Bilg ile kitap Goruntuleme ");
        System.out.println(Depo.Green+"4==> Kitap No ile Kitap Silme");
        System.out.println(Depo.Green+"5==> Tum kitapları listeleme");
        System.out.println(Depo.Red+"0==> CIKIS");
        System.out.println("Seciminiz...");
        int secenekler=Depo.input.nextInt();


        switch (secenekler){
            case 1:
                bookMehots.addNewBook();
                break;
            case 2:
                bookMehots.bookCodeWithShowBook();
                break;
            case 3:
                bookMehots.dataWithShowBook();
                break;
            case 4:
                bookMehots.deleteOnBookCode();
                break;
            case 5:
                bookMehots.showBook();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Yanlış secim...");
                start();
        }


    }
}
