package proses;

public class Pelanggan {
    private String nama;
    private int customerID;

    public Pelanggan() {
        nama = "default";
        customerID = 0;
    }
    
    public Pelanggan(String nama, int customerID){
        this.nama = nama;
        this.customerID = customerID;
    }

    public String getNama() {
        return this.nama;
    }

    public int getcustomerID() {
        return this.customerID;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setcustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setNomor(int nomor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
