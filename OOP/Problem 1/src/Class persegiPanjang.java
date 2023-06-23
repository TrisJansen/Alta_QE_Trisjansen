class persegiPanjang {
        int panjang;
        int lebar;

        public persegiPanjang(int panjang, int lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }
    public void hitungLuas() {
        int luas = panjang * lebar;
        System.out.println("Luasnya adalah :" +  luas );
    }

    public void hitungKeliling(){
            int keliling = (panjang+lebar)*2;
            System.out.println("Kelilingnya adalah :"+ keliling);

        }
    }








