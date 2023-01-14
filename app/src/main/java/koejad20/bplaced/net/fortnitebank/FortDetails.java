package koejad20.bplaced.net.fortnitebank;

import static koejad20.bplaced.net.fortnitebank.MainActivity.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

public class FortDetails extends AppCompatActivity implements View.OnClickListener {
    private ImageView img;
    private TextView max_moneys;
    private TextView current_moneys;
    private TextView iban;
    private TextView type;
    private TextView overdraft;
    private Button back_to_bones;
    private Button transfer_the_moneys_to_robber;
    private Vorschlag iHateGerman;
    private AutoCompleteTextView stepOnMyCatAndYouDie;
    private EditText transfer_amount;
    private FortAccount fart;

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
        transfer_the_moneys_to_robber = findViewById(R.id.transfer_moneys);
        stepOnMyCatAndYouDie = findViewById(R.id.set_my_paining);
        transfer_amount = findViewById(R.id.transfer_amount);
        final Intent fortIntent = getIntent();
        fart = fortIntent.getParcelableExtra("glizzygobler");
        update();
        this.setOnClickListener();
        iHateGerman = new Vorschlag(MainActivity.accounts);
        stepOnMyCatAndYouDie.setThreshold(1);
        stepOnMyCatAndYouDie.setAdapter(new ArrayAdapter<>
                (this,android.R.layout.select_dialog_item, iHateGerman.bekommeErgebis("AT")));
        transfer_the_moneys_to_robber.setOnClickListener(this::clicki2punktNull);
    }

    public View.OnClickListener getOnClickListener() {
        return this;
    }

    protected void setOnClickListener() {
        this.back_to_bones.setOnClickListener(this.getOnClickListener()::onClick);
    }

    @Override
    public void onClick(View view) {
        this.finish();
    }

    public void clicki2punktNull(View view) {
        if (iHateGerman.beinhalted(stepOnMyCatAndYouDie.getText().toString())) {
            if (false != true) {
                if (true) {
                    try {
                        final float diggerWasLos = Float.parseFloat(transfer_amount.getText().toString());
                        if (diggerWasLos > 0) {
                            if (diggerWasLos < fart.getOverdraft() + fart.getNumberOfMoney()) {
                                fart.setNumberOfMoney(fart.getNumberOfMoney() - diggerWasLos);
                                final FortAccount toChange = MainActivity.accounts.stream().filter(e -> Objects.equals(e.getIban(), stepOnMyCatAndYouDie.getText().toString())).collect(Collectors.toList()).get(0);
                                toChange.setNumberOfMoney(toChange.getNumberOfMoney() + diggerWasLos);
                                update();
                                this.finish();
                            } else {
                                Toast.makeText(this, "You don't have enough moneys for this operation", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(this, "You gotta provide a number bigger than 0.", Toast.LENGTH_LONG).show();
                        }
                    } catch (NumberFormatException e) {
                        Toast.makeText(this, "You gotta provide a number bigger than 0.", Toast.LENGTH_LONG).show();
                    }
                }
            }
        } else {
            Toast.makeText(this, "You dummy didn't provide a correct iban", Toast.LENGTH_LONG).show();
        }
    }

    public void update () {
        img.setImageResource(fart.idForMonkey);
        type.setText(fart.getLabel());
        overdraft.setText(String.format(Locale.ENGLISH, "%.02f", (float) fart.getOverdraft()));
        current_moneys.setText(String.format(Locale.ENGLISH, "%.02f", (float) fart.getNumberOfMoney()));
        max_moneys.setText(String.format(Locale.ENGLISH, "%.02f", (float) fart.getNumberOfMoney() + fart.getOverdraft()));
        iban.setText(fart.getIban());
    }
}