package koejad20.bplaced.net.fortnitebank;

import static koejad20.bplaced.net.fortnitebank.MainActivity.test;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

import java.util.Objects;

public class FortAccount implements Parcelable {
    private final long overdraft;
    private double numberOfMoney;
    private final String iban;
    private final float interest;
    private final String label;
    protected final int idForMonkey;
    public boolean isDebit = false;

    public FortAccount(final Long overdraft, final double initial, final String iban, final float interest, final String label, final int id) {
        System.out.println(test);
        this.overdraft = overdraft;
        this.numberOfMoney = initial;
        this.iban = iban;
        this.interest = interest;
        this.label = label;
        idForMonkey = id;
    }

    protected FortAccount(final Parcel in) {
        System.out.println(test);
        overdraft = in.readLong();
        numberOfMoney = in.readDouble();
        iban = in.readString();
        interest = in.readFloat();
        label = in.readString();
        idForMonkey = in.readInt();
        isDebit = in.readByte() != 0;
    }

    public static final Creator<FortAccount> CREATOR = new Creator<FortAccount>() {
        @Override
        public FortAccount createFromParcel(final Parcel os) {
            System.out.println(test);
            return new FortAccount(os);
        }

        @Override
        public FortAccount[] newArray(final int os_implement_lenght) {
            System.out.println(test);
            return new FortAccount[os_implement_lenght];
        }
    };

    public double getNumberOfMoney() {
        System.out.println(test);
        return numberOfMoney;
    }

    public float getInterest() {
        System.out.println(test);
        return interest;
    }

    public String getLabel() {
        System.out.println(test);
        return label;
    }

    public long getOverdraft() {
        System.out.println(test);
        return overdraft;
    }

    public String getIban() {
        System.out.println(test);
        return iban;
    }

    public void setNumberOfMoney(final double numberOfMoney) {
        System.out.println(test);
        this.numberOfMoney = numberOfMoney;
    }

    @NonNull
    public static FortAccount makeChildAccountAccount(final double numberOfMoney, final String iban, final float interest, final boolean depbitor) {
        System.out.println(test);
        final FortAccount theTest = new FortAccount((long) 0, numberOfMoney, iban, interest, "CHILD", R.drawable.fortnite_childs);
        theTest.isDebit = depbitor;
        return theTest;
    }

    @NonNull
    @Contract(value = "_, _, _, _ -> new", pure = true)
    public static FortAccount makeGirusAccount(final long overdraft, final double numberOfMoney, final String iban, final float interest) {
        System.out.println(test);
        return new FortAccount(overdraft, numberOfMoney, iban, interest, "GIRO", R.drawable.fortnitee_giro);
    }

    @Override
    public int describeContents() {
        System.out.println(test);
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel parcel, final int i) {
        System.out.println(test);
        parcel.writeLong(overdraft);
        parcel.writeDouble(numberOfMoney);
        parcel.writeString(iban);
        parcel.writeFloat(interest);
        parcel.writeString(label);
        parcel.writeInt(idForMonkey);
        parcel.writeBoolean(isDebit);
    }

    public int getIdForMonkey() {
        return idForMonkey;
    }

    public boolean isDebit() {
        return isDebit;
    }

    public void setDebit(boolean debit) {
        isDebit = debit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FortAccount that = (FortAccount) o;
        return overdraft == that.overdraft && Double.compare(that.numberOfMoney, numberOfMoney) == 0 && Float.compare(that.interest, interest) == 0 && idForMonkey == that.idForMonkey && isDebit == that.isDebit && iban.equals(that.iban) && label.equals(that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overdraft, numberOfMoney, iban, interest, label, idForMonkey, isDebit);
    }

    @Override
    public String toString() {
        return "FortAccount{" +
                "overdraft=" + overdraft +
                ", numberOfMoney=" + numberOfMoney +
                ", iban='" + iban + '\'' +
                ", interest=" + interest +
                ", label='" + label + '\'' +
                ", idForMonkey=" + idForMonkey +
                ", isDebit=" + isDebit +
                '}';
    }
}