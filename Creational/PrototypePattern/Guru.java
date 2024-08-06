public class Guru implements Cloneable {
    private String nama;
    private String nip;

    public Guru(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public Guru clone() {
        try {
            return (Guru) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Guru{" +
                "nama='" + nama + '\'' +
                ", nip='" + nip + '\'' +
                '}';
    }
}

