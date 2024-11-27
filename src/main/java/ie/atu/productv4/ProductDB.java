package ie.atu.productv4;

public class ProductDB {

    public static Product getProduct(String productCode) {


        Product myItem = null;
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myItem = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myItem = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myItem = mySoftware;
        } else if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myItem = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myItem = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myItem = myBook;
        } else if (productCode.equalsIgnoreCase("Rap")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("FOEJOFJO");
            myMusic.setPrice(40.99);
            myMusic.setArtist("john");
            myMusic.setLabel("joe");
            myItem = myMusic;
        }else if (productCode.equalsIgnoreCase("Country")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("fbjfhh");
            myMusic.setPrice(101.56);
            myMusic.setArtist("Christopher");
            myMusic.setLabel("label land");
            myItem = myMusic;
        }else if (productCode.equalsIgnoreCase("Oled")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("cfhjgiu");
            myTV.setPrice(999.99);
            myTV.setScreensize("1000inch");
            myTV.setManufacture("samsung");
            myItem = myTV;
        }else if (productCode.equalsIgnoreCase("led")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("idvjio");
            myTV.setPrice(400.00);
            myTV.setScreensize("500inch");
            myTV.setManufacture("philips");
            myItem = myTV;
        }

        return myItem;
    }
}



