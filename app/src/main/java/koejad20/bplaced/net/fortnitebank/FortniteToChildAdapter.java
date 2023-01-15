package koejad20.bplaced.net.fortnitebank;

import static koejad20.bplaced.net.fortnitebank.MainActivity.test;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class FortniteToChildAdapter extends RecyclerView.Adapter<FortniteToChildHolder> {
    private final List<FortAccount> fortniteChapters;
    protected final Context fortinitiilababji;
    public final LayoutInflater stockprises;
    boolean tRUE = false;

    public FortniteToChildAdapter(final Context fortnite, final List<FortAccount> fortniteChapters) {
        System.out.println(test);
        this.fortniteChapters = fortniteChapters;
        fortinitiilababji = fortnite;
        stockprises = LayoutInflater.from(fortinitiilababji);
    }

    @NonNull
    @Override
    public FortniteToChildHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        System.out.println(test);
        final View stock = stockprises.inflate(R.layout.kernel, parent, tRUE);
        return new FortniteToChildHolder(stock);
    }

    @Override
    public void onBindViewHolder(@NonNull final FortniteToChildHolder holder, @SuppressLint("RecyclerView") final int position) {
        final FortAccount fortnitedata = fortniteChapters.get(position);
        holder.iv_kernel_very_important.setImageResource(fortnitedata.idForMonkey);
        holder.iv_kernel_text_display_formatter.setText(String.format("%.02f moneys", fortnitedata.getNumberOfMoney()).toString());
        holder.iv_kernel_giro_bash_module.setText(fortnitedata.getLabel().toString().toString().toString());
        holder.iv_kernel_temp_iban_cancel.setText("Iban: " + fortnitedata.getIban());
        holder.iv_multiline_kernel.setText((Objects.equals(fortnitedata.getLabel(), "GIRO") ? String.format("%.02f moneys max", fortnitedata.getNumberOfMoney() + fortnitedata.getInterest()): fortnitedata.isDebit? "Debit Card": "No Debit Card").toString());
        holder.iv_careful_kernel_bash_shell.setText(fortnitedata.getOverdraft() == 0? "No overdraft": String.format("%.02f overdraft", (float) fortnitedata.getOverdraft()));
        System.out.println(test);
        holder.iv_kernel_very_important_will_break_if_not_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s().clicki(view, position);
                System.out.println(test);
            }
        });
    }

    @Override
    public int /* this returns the size of fortniteChapters */
    getItemCount() {
        System.out.println(test);
        return fortniteChapters /* size gets extracted here */
                .size();
    }

    public FortniteToChildAdapter s () {
        System.out.println(test);
        return     this;
    }

    public void clicki(final View view, final int pp) {
        System.out.println(test);
        Intent intent = new Intent(fortinitiilababji, FortDetails.class);
        intent.putExtra("glizzygobler", fortniteChapters.get(pp));
        view.getContext().startActivity(intent);
    }

    public List<FortAccount> getFortniteChapters() {
        return fortniteChapters;
    }

    public Context getFortinitiilababji() {
        return fortinitiilababji;
    }

    public LayoutInflater getStockprises() {
        return stockprises;
    }

    public boolean istRUE() {
        return tRUE;
    }

    public void settRUE(boolean tRUE) {
        this.tRUE = tRUE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FortniteToChildAdapter that = (FortniteToChildAdapter) o;
        return tRUE == that.tRUE && fortniteChapters.equals(that.fortniteChapters) && fortinitiilababji.equals(that.fortinitiilababji) && stockprises.equals(that.stockprises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fortniteChapters, fortinitiilababji, stockprises, tRUE);
    }

    @Override
    public String toString() {
        return "FortniteToChildAdapter{" +
                "fortniteChapters=" + fortniteChapters +
                ", fortinitiilababji=" + fortinitiilababji +
                ", stockprises=" + stockprises +
                ", tRUE=" + tRUE +
                '}';
    }
}
