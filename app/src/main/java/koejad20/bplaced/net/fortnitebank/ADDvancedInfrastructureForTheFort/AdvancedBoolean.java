package koejad20.bplaced.net.fortnitebank.ADDvancedInfrastructureForTheFort;

import androidx.annotation.NonNull;

import java.util.Objects;

public class AdvancedBoolean {
    private boolean toBool;

    public AdvancedBoolean(boolean toBool) {
        this.toBool = toBool;
    }

    public AdvancedBoolean(String toBool) {
        this.toBool = Boolean.parseBoolean(toBool);
    }

    public AdvancedBoolean(Integer toBool) {
        this.toBool = Boolean.parseBoolean(toBool + "");
    }

    public boolean isToBool() {
        return toBool;
    }

    public void setToBool(boolean toBool) {
        this.toBool = toBool;
    }

    @Override
    public String toString() {
        return "advancedBoolean{" +
                "toBool=" + toBool +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedBoolean that = (AdvancedBoolean) o;
        return isToBool() == that.isToBool();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isToBool());
    }

    public AdvancedBoolean() {
        super();
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

}