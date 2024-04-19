/*
 * nama    : Salti Dilfani
   nim     : 2301093007
   kelas   : 1C MI
   matkul  : PBO
 * 
 */
package Salti;

/**
 *
 * @author Salti
 */
public class pegawai {
    private String nip;
    private String nama;
    private int jenisKelamin;
    private int golongan;
    private int tunjangan;
    private int total;

    

    public String getNama (){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public int getJenisKelamin(){
        return jenisKelamin;
    }

    public void setJenisKelamin(int jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }


    public int getGolongan(){
        int gajiPokok=0;

        switch (golongan) {
            case 1:
                gajiPokok = 1000000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Golongan tidak valid");
        }
        return gajiPokok;
    }

    public int getTunjuangan(){
        tunjangan = (5 * getGolongan()) / 100;
        return tunjangan;
    }

    public int getTotal(){
        total = getGolongan() + getTunjuangan();
        return total;
    }

    public pegawai(String nama, String nip, int jenisKelamin, int golongan) {
        this.nama = nama;
        this.nip = nip;
        this.jenisKelamin = jenisKelamin;
        this.golongan = golongan;
    }
}
