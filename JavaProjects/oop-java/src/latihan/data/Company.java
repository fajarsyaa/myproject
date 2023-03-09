package latihan.data;

public class Company {

    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Inner class, class di dalam class. digunakan jika membutuhkan beberapa class yang saling berhubungan,
     *              dimana sebuah class tidak bisa dibuat tanpa class lain
     *
     *              keuntungan : kemampuan untuk mengakses semua data outer classnya
     *
     *   untuk mengakses object outer classnya, kita bisa menggunakan nama classs outernya diikuti dengan kata
     *   kunci this misal, Company.this
     *
     *   untuk mengakses super classnya outer classnya, kita bisa menggunakan nama classs outernya diikuti dengan
     *   kata kunci super misal, Company.super
     */

    public class Employee{
        private String nama;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getCompany(){
            return  Company.this.getNama();
        }
    }


}

