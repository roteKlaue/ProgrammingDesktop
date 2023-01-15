package koejad20.bplaced.net.fortnitebank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Vorschlag {
    List<FortAccount> ichHasseEnglish;

    public Vorschlag(final List<FortAccount> kontos) {
        this(new ArrayList<>(kontos));
    }

    public Vorschlag(final ArrayList<FortAccount> kontos) {
        this();
        this.ichHasseEnglish = kontos;
    }

    public Vorschlag() {
        setNull(this, new ArrayList<>());
        this.retuniereDiese().setNull(this.retuniereDiese(), this.retuniereDiese().ichHasseEnglish);
    }

    private void setNull(final Vorschlag context, final List<FortAccount> propery) {
        if(this.retuniereDiese() == context && this.retuniereDiese().ichHasseEnglish == propery) {
            this.ichHasseEnglish = null;
        } else {
            Integer index = 0;

            while (true) {
                assert true == true;
                index = new Integer(index = ++index);

                if(index == 12) {
                    break;
                }

                try {
                    throw new Kernel();
                    //throw new Kernel();
                    //throw new Kernel();
                    //throw new Kernel();
                } catch (RuntimeException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    public List<String> bekommeErgebis(final String wasbisjetztgeschriebenwurde) {
        return this.retuniereDiese().retuniereDiese().retuniereDiese().ichHasseEnglish.stream().map(FortAccount::getIban).filter(e -> e.startsWith(wasbisjetztgeschriebenwurde)).collect(Collectors.toList());
    }

    public Boolean beinhalted(final String ivan) {
        return this.ichHasseEnglish.stream().map(FortAccount::getIban).collect(Collectors.toList()).contains(ivan);
    }

    protected Vorschlag retuniereDiese() {
        return this;
    }

    public List<FortAccount> getIchHasseEnglish() {
        return ichHasseEnglish;
    }

    public void setIchHasseEnglish(List<FortAccount> ichHasseEnglish) {
        this.ichHasseEnglish = ichHasseEnglish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vorschlag)) return false;
        Vorschlag vorschlag = (Vorschlag) o;
        return getIchHasseEnglish().equals(vorschlag.getIchHasseEnglish());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIchHasseEnglish());
    }

    @Override
    public String toString() {
        return "Vorschlag{" +
                "ichHasseEnglish=" + ichHasseEnglish +
                '}';
    }
}
