package day01variables;

public class urun {



    public class urunTanimlama {
        private String urunIsmi;
        private String uretici;
        private String birim;
        private int urunMiktar;
        private String raf;

        public urunTanimlama() {

        }

        public urunTanimlama(String urunIsmi, String uretici, String birim, int urunMiktar, String raf) {
            this.urunIsmi=urunIsmi;
            this.uretici=uretici;
            this.birim=birim;
            this.urunMiktar=urunMiktar;
            this.raf=raf;
        }


        public String getUrunIsmi() {
            return urunIsmi.toLowerCase();
        }

        public void setUrunIsmi(String urunIsmi) {
            this.urunIsmi = urunIsmi;
        }

        public String getUretici() {

            return uretici.toLowerCase();
        }

        public void setUretici(String uretici) {
            this.uretici = uretici;
        }

        public String getBirim() {
            return birim.toLowerCase();
        }

        public void setBirim(String birim) {
            this.birim = birim;
        }

        public int getUrunMiktar() {

            return urunMiktar;
        }

        public int setUrunMiktar(int urunMiktar) {
            this.urunMiktar = urunMiktar;
            return urunMiktar;
        }

        public String getRaf() {
            return raf;
        }

        public void setRaf(String raf) {
            this.raf = raf;
        }

        @Override
        public String toString() {  //obje değerlerini düzenli yazmak için
            return "urunleriniz" +
                    ", urunIsmi='" + urunIsmi + '\'' +
                    ", uretici='" + uretici + '\'' +
                    ", birim='" + birim + '\'' +
                    ", Miktar=" + urunMiktar + '\'' +
                    ", raf=" + raf+ '\'' + '\n' ;
        }

    }


}

