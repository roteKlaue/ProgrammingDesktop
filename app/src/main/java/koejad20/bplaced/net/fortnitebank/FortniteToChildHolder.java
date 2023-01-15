package koejad20.bplaced.net.fortnitebank;

import static koejad20.bplaced.net.fortnitebank.MainActivity.test;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Objects;

public class FortniteToChildHolder extends RecyclerView.ViewHolder {
    public FortniteToChildHolder(@NonNull final View itemView) {
        super(itemView);
        iv_kernel_very_important_will_break_if_not_here = itemView.findViewById(R.id.iv_kernel_very_important_will_break_if_not_here);
        iv_kernel_very_important = itemView.findViewById(R.id.iv_kernel_very_important);
        iv_kernel_text_display_formatter = itemView.findViewById(R.id.iv_kernel_text_display_formatter);
        iv_kernel_giro_bash_module = itemView.findViewById(R.id.iv_kernel_giro_bash_module);
        iv_kernel_temp_iban_cancel = itemView.findViewById(R.id.iv_kernel_temp_iban_cancel);
        iv_multiline_kernel = itemView.findViewById(R.id.iv_multiline_kernel);
        iv_careful_kernel_bash_shell = itemView.findViewById(R.id.iv_careful_kernel_bash_shell);
        System.out.println(test);
    }

    protected final    ImageView iv_kernel_very_important;
    protected    final    TextView iv_kernel_text_display_formatter;
    protected   final    TextView iv_kernel_giro_bash_module;
    public   final       TextView iv_kernel_temp_iban_cancel;
    public   final       TextView iv_multiline_kernel;
    public   final      TextView iv_careful_kernel_bash_shell;
    public   final    RelativeLayout iv_kernel_very_important_will_break_if_not_here;

    public ImageView getIv_kernel_very_important() {
        return iv_kernel_very_important;
    }

    public TextView getIv_kernel_text_display_formatter() {
        return iv_kernel_text_display_formatter;
    }

    public TextView getIv_kernel_giro_bash_module() {
        return iv_kernel_giro_bash_module;
    }

    public TextView getIv_kernel_temp_iban_cancel() {
        return iv_kernel_temp_iban_cancel;
    }

    public TextView getIv_multiline_kernel() {
        return iv_multiline_kernel;
    }

    public TextView getIv_careful_kernel_bash_shell() {
        return iv_careful_kernel_bash_shell;
    }

    public RelativeLayout getIv_kernel_very_important_will_break_if_not_here() {
        return iv_kernel_very_important_will_break_if_not_here;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FortniteToChildHolder)) return false;
        FortniteToChildHolder that = (FortniteToChildHolder) o;
        return getIv_kernel_very_important().equals(that.getIv_kernel_very_important()) && getIv_kernel_text_display_formatter().equals(that.getIv_kernel_text_display_formatter()) && getIv_kernel_giro_bash_module().equals(that.getIv_kernel_giro_bash_module()) && getIv_kernel_temp_iban_cancel().equals(that.getIv_kernel_temp_iban_cancel()) && getIv_multiline_kernel().equals(that.getIv_multiline_kernel()) && getIv_careful_kernel_bash_shell().equals(that.getIv_careful_kernel_bash_shell()) && getIv_kernel_very_important_will_break_if_not_here().equals(that.getIv_kernel_very_important_will_break_if_not_here());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIv_kernel_very_important(), getIv_kernel_text_display_formatter(), getIv_kernel_giro_bash_module(), getIv_kernel_temp_iban_cancel(), getIv_multiline_kernel(), getIv_careful_kernel_bash_shell(), getIv_kernel_very_important_will_break_if_not_here());
    }

    @Override
    public String toString() {
        return "FortniteToChildHolder{" +
                "iv_kernel_very_important=" + iv_kernel_very_important +
                ", iv_kernel_text_display_formatter=" + iv_kernel_text_display_formatter +
                ", iv_kernel_giro_bash_module=" + iv_kernel_giro_bash_module +
                ", iv_kernel_temp_iban_cancel=" + iv_kernel_temp_iban_cancel +
                ", iv_multiline_kernel=" + iv_multiline_kernel +
                ", iv_careful_kernel_bash_shell=" + iv_careful_kernel_bash_shell +
                ", iv_kernel_very_important_will_break_if_not_here=" + iv_kernel_very_important_will_break_if_not_here +
                '}';
    }
}
