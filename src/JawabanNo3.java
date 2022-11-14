import java.util.Scanner;

public class JawabanNo3 {
    public class main<Cek> {
        int JumlahBusPariwisata = 4; //topLevel,MiddleLevel,RegularStaff,Staff
        static int jumlahBusPariwisata = 4; //diubah sesuai soal
        public static String[] toplevel = new String[01];
        public static String[] middlevel = new String[02];
        public static String[] RegularStaff = new String[03];
        public static String[] Staff = new String[04];

        public main(Object args) {
            this.args = args;
        }

        public static void PrintInfoBusPariwisata() {
            int totaltoplevel = 0;
            int totalBusPariwisata = 0;
            for (int index = 0; index < toplevel.length; index++) {
                if (toplevel[index] != null) {
                    totalBusPariwisata++;
                }
            }
            int totalMiddlevel = 0;
            for (int index = 0; index < middlevel.length; index++) {
                if (middlevel[index] != null) {
                    totalBusPariwisata++;
                }
            }
            int totalRegularStaff = 0;
            for (int index = 0; index < RegularStaff.length; index++) {
                if (RegularStaff[index] != null) {
                    totalBusPariwisata++;
                }
            }
            int totalStaff = 0;
            for (int index = 0; index < Staff.length; index++) {
                if (Staff[index] != null) {
                    totalBusPariwisata++;
                }
            }
            totalBusPariwisata = totalBusPariwisata + totaltoplevel + totalMiddlevel + totalRegularStaff + totalStaff;
            System.out.println("peumpangtoplevel : " + totaltoplevel + " | penumpangmiddlelevel: " + totalMiddlevel + " | penumpangRegulerStaff: " + totalRegularStaff + " | penumpangStaff: " + totalStaff);
            System.out.println("Jumlah BusPariwisata: " + totalBusPariwisata);
            System.out.println();


        }

        static int cekNIKKaryawan;
        String nik;

        private Object args;

        {
            if (nik.length() <= 10) {

                boolean success;
                if (nik.contains("C01")) {
                    success = true;
                    int jmlTopLevel = 0;
                    jmlTopLevel++;
                } else if (nik.contains("J02")) {
                    success = true;
                    int jmlMiddleLevel = 0;
                    jmlMiddleLevel++;
                } else if (nik.contains("N03")) {
                    success = true;
                    int jmlRegStaff = 0;
                    jmlRegStaff++;
                } else if (nik.contains("P04")) {
                    success = true;
                    int jmlStaff = 0;
                    jmlStaff++;
                } else {
                }
            }

            Scanner inputRegistJrasi = new Scanner(System.in);
            System.out.println("Masukkan NIK untuk registrasi");


            // String jumlahtoplevel = null;
            System.out.println("Jumlah peserta di bus 01-TopLevel = " + toplevel);
            System.out.println("Jumlah peserta di bus 02-MiddleLevel = " + middlevel);
            System.out.println("Jumlah peserta di bus 03-RegulerStaff = " + RegularStaff);
            System.out.println("Jumlah peserta di bus 04-Staff = " + Staff);
            System.out.println();


            Object main;
            public static main;
            {

            Object String = null;
            Object string = String;
            {
                while (true) {
                    Object Cek = null;
                    Cek nik;

                }
            }
        }
        }
    }
}
