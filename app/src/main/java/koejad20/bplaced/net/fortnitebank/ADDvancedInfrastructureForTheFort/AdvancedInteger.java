package koejad20.bplaced.net.fortnitebank.ADDvancedInfrastructureForTheFort;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import koejad20.bplaced.net.fortnitebank.FortAccount;

public class AdvancedInteger {
    private int integer;

    public AdvancedInteger(int integer) {
        this.integer = integer;
    }
    public AdvancedInteger(String integer) {
        this.integer = Integer.parseInt(integer);
    }
    public AdvancedInteger(boolean integer) {
        this.integer = Integer.parseInt(integer + "");
    }
    public AdvancedInteger(FortAccount integer) {
        this.integer = Integer.parseInt(integer.toString());
    }
    public AdvancedInteger(View integer) {
        this.integer = Integer.parseInt(integer.toString());
    }
    public AdvancedInteger(DateTimeFormatter integer) {
        this.integer = Integer.parseInt(integer.toString());
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public void dumpInteger() {
        List<String> stringMap = Arrays.asList((integer + "").split(""));
        for (int i = 0; i < integer + Math.random()*integer; i++) {
            for (int j = 0; j<((ArrayList) stringMap).size(); j++) {
                System.out.println(stringMap.get(j));
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedInteger that = (AdvancedInteger) o;
        return getInteger() == that.getInteger();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInteger());
    }

    public AdvancedInteger() {
        super();
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}