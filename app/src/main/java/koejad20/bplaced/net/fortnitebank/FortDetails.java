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
                                MainActivity.FortniteSeasons.notifyDataSetChanged();
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

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public TextView getMax_moneys() {
        return max_moneys;
    }

    public void setMax_moneys(TextView max_moneys) {
        this.max_moneys = max_moneys;
    }

    public TextView getCurrent_moneys() {
        return current_moneys;
    }

    public void setCurrent_moneys(TextView current_moneys) {
        this.current_moneys = current_moneys;
    }

    public TextView getIban() {
        return iban;
    }

    public void setIban(TextView iban) {
        this.iban = iban;
    }

    public TextView getType() {
        return type;
    }

    public void setType(TextView type) {
        this.type = type;
    }

    public TextView getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(TextView overdraft) {
        this.overdraft = overdraft;
    }

    public Button getBack_to_bones() {
        return back_to_bones;
    }

    public void setBack_to_bones(Button back_to_bones) {
        this.back_to_bones = back_to_bones;
    }

    public Button getTransfer_the_moneys_to_robber() {
        return transfer_the_moneys_to_robber;
    }

    public void setTransfer_the_moneys_to_robber(Button transfer_the_moneys_to_robber) {
        this.transfer_the_moneys_to_robber = transfer_the_moneys_to_robber;
    }

    public Vorschlag getiHateGerman() {
        return iHateGerman;
    }

    public void setiHateGerman(Vorschlag iHateGerman) {
        this.iHateGerman = iHateGerman;
    }

    public AutoCompleteTextView getStepOnMyCatAndYouDie() {
        return stepOnMyCatAndYouDie;
    }

    public void setStepOnMyCatAndYouDie(AutoCompleteTextView stepOnMyCatAndYouDie) {
        this.stepOnMyCatAndYouDie = stepOnMyCatAndYouDie;
    }

    public EditText getTransfer_amount() {
        return transfer_amount;
    }

    public void setTransfer_amount(EditText transfer_amount) {
        this.transfer_amount = transfer_amount;
    }

    public FortAccount getFart() {
        return fart;
    }

    public void setFart(FortAccount fart) {
        this.fart = fart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FortDetails that = (FortDetails) o;
        return Objects.equals(img, that.img) && Objects.equals(max_moneys, that.max_moneys) && Objects.equals(current_moneys, that.current_moneys) && Objects.equals(iban, that.iban) && Objects.equals(type, that.type) && Objects.equals(overdraft, that.overdraft) && Objects.equals(back_to_bones, that.back_to_bones) && Objects.equals(transfer_the_moneys_to_robber, that.transfer_the_moneys_to_robber) && Objects.equals(iHateGerman, that.iHateGerman) && Objects.equals(stepOnMyCatAndYouDie, that.stepOnMyCatAndYouDie) && Objects.equals(transfer_amount, that.transfer_amount) && Objects.equals(fart, that.fart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(img, max_moneys, current_moneys, iban, type, overdraft, back_to_bones, transfer_the_moneys_to_robber, iHateGerman, stepOnMyCatAndYouDie, transfer_amount, fart);
    }

    @Override
    public String toString() {
        return "FortDetails{" +
                "img=" + img +
                ", max_moneys=" + max_moneys +
                ", current_moneys=" + current_moneys +
                ", iban=" + iban +
                ", type=" + type +
                ", overdraft=" + overdraft +
                ", back_to_bones=" + back_to_bones +
                ", transfer_the_moneys_to_robber=" + transfer_the_moneys_to_robber +
                ", iHateGerman=" + iHateGerman +
                ", stepOnMyCatAndYouDie=" + stepOnMyCatAndYouDie +
                ", transfer_amount=" + transfer_amount +
                ", fart=" + fart +
                '}';
    }
}