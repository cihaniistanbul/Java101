package mustafahoca;

public class Urun {

    //variablelar olusturduk private ile
    private int id;
    private String urunIsmi;
    private String uretici;
    private int miktar;
    private String birim;
    private int raf;


        //---------------------------------------------------------------------------------------
        //cons olusturalim

    //bos cons
    public Urun(){}

    //dolu cons
    public Urun(int id, String urunIsmi, String uretici, int miktar, String birim, int raf) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf =raf;
    }


        //_------------------------------------------------------------------------------------------------------
        // Getter ve setter metotları     encapsulation icin lazim olacak


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }

        //,--------------------------------------------------------------------------------------
        //yazdirma icin to sitring


    @Override
    public String toString() {              //d (int icin)   s(string icin)
        return
                String.format("%-10d %-10s %-10s %-10d %-10s %-10s %n",
                        id, urunIsmi, uretici, miktar, birim, raf);

        // %-10s: Bu formatlama kodu, solaya hizalı (-), en fazla 10 karakterlik bir alan (10) ve
        // metin (s) değerini yerleştirmek için kullanılır.
        // %d int degerler icin
        //Bu ifade printf() yöntemini kullanarak formatlı bir çıktı oluşturur. Şablonun yerine geçecek olan
        // metinler, printf() yönteminin ikinci parametresi olan ardışık parametreler olarak sağlanır.

    }

}
