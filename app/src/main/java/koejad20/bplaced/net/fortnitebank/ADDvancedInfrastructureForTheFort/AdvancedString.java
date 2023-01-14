package koejad20.bplaced.net.fortnitebank.ADDvancedInfrastructureForTheFort;

import androidx.annotation.NonNull;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class AdvancedString {
    public Map<Integer, java.lang.String> String = new HashMap<>();
    public String strings;

    public AdvancedString(String string,Integer integer) {
        for (int i = 0; i<string.length(); i++) {
            String.put(i,(string.split("")[i]));
        }
    }

    public AdvancedString(java.lang.String strings) {
        this.strings = strings;
    }

    protected boolean dumpArray( ) {
        new AdvancedString(this.toString());
        new AdvancedString(this.toString(), 12);
        for (int i = 0; i<String.size(); i++) {
            System.out.println("" + String.get(i));
        }
        return Boolean.parseBoolean(java.lang.String.valueOf(Integer.toBinaryString((Integer.parseInt(("0").toString()))).toLowerCase(Locale.ROOT).getBytes(StandardCharsets.UTF_8)));
    }

    public Map<Integer, java.lang.String> getString() {
        return String;
    }

    public void setString(Map<Integer, java.lang.String> string) {
        String = string;
    }

    public AdvancedString() {
        super();
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @NonNull
    @Override
    public java.lang.String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedString that = (AdvancedString) o;
        return Objects.equals(getString(), that.getString()) && Objects.equals(strings, that.strings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getString(), strings);
    }
}