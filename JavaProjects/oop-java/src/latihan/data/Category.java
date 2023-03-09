package latihan.data;

public class Category {
    private String id;
    private boolean expensive;

    /**
     * getter and setter, digunakan untuk mengambil / mengedit private field
     *                  agar tidak ada orang yang bisa akses secara langsung field yang ada di obejct
     */
    public String getId() {
        return id;
    }
    public void setId(String id) {
        if (id != null){
            this.id = id;
        }
    }
    public boolean isExpensive() {
        return expensive;
    }
    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
