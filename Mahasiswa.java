public class Mahasiswa{
    private String name;
    private String npm;

    public Mahasiswa() {
        this.name = "Nurul Aisyah";
        this.npm = "1606889660";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getName() {
        return this.name;
    }

    public String getNpm() {
        return this.npm;
    }
}