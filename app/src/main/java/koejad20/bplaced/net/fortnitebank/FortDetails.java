package koejad20.bplaced.net.fortnitebank;

import static koejad20.bplaced.net.fortnitebank.MainActivity.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class FortDetails extends AppCompatActivity implements View.OnClickListener {
    private ImageView img;
    private TextView max_moneys;
    private TextView current_moneys;
    private TextView iban;
    private TextView type;
    private TextView overdraft;
    private Button back_to_bones;
    private Button s1;
    private Vorschlag iHateGerman;
    private AutoCompleteTextView stepOnMyCatAndYouDie;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortdetails);
        System.out.println(test);
        img = findViewById(R.id.type_conversion);
        overdraft = findViewById(R.id.overdraft);
        max_moneys = findViewById(R.id.max_moneys);
        current_moneys = findViewById(R.id.current_moneys);
        iban = findViewById(R.id.iban);
        type = findViewById(R.id.type);
        back_to_bones = findViewById(R.id.back);
        stepOnMyCatAndYouDie = findViewById(R.id.set_my_paining);
        final Intent fortIntent = getIntent();
        final FortAccount fart = fortIntent.getParcelableExtra("glizzygobler");
        img.setImageResource(fart.idForMonkey);
        type.setText(fart.getLabel());
        overdraft.setText(String.format(Locale.ENGLISH, "%.02f", (float) fart.getOverdraft()));
        current_moneys.setText(String.format(Locale.ENGLISH, "%.02f", (float) fart.getNumberOfMoney()));
        max_moneys.setText(String.format(Locale.ENGLISH, "%.02f", (float) fart.getNumberOfMoney() + fart.getOverdraft()));
        iban.setText(fart.getIban());
        this.setOnClickListener();
        iHateGerman = new Vorschlag(MainActivity.accounts);
        stepOnMyCatAndYouDie.setThreshold(1);
        stepOnMyCatAndYouDie.setAdapter(new ArrayAdapter<>
                (this,android.R.layout.select_dialog_item, iHateGerman.bekommeErgebis("AT")));

    }

    public View.OnClickListener getOnClickListener() {
        return this;
    }

    protected void setOnClickListener() {
        this.back_to_bones.setOnClickListener(this.getOnClickListener());
    }

    @Override
    public void onClick(View view) {
        this.finish();
    }

    public void clicki2punktNull(View view) {

    }
}