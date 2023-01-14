package koejad20.bplaced.net.fortnitebank;

import static koejad20.bplaced.net.fortnitebank.MainActivity.test;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
}
