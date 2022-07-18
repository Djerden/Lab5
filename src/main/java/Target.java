import java.util.Objects;

public class Target {
    private int konexhnosti;
    private String kind;

    public Target(int konexhnosti, String kind) {
        this.konexhnosti = konexhnosti;
        this.kind = kind;
    }

    public int getKonexhnosti() {
        return konexhnosti;
    }

    public void setKonexhnosti(int konexhnosti) {
        this.konexhnosti = konexhnosti;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Target target = (Target) o;
        return konexhnosti == target.konexhnosti && Objects.equals(kind, target.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(konexhnosti, kind);
    }

    @Override
    public String toString() {
        return "Target{" +
                "konexhnosti=" + konexhnosti +
                ", kind='" + kind + '\'' +
                '}';
    }
}
