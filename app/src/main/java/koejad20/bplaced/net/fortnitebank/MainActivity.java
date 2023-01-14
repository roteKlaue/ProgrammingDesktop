package koejad20.bplaced.net.fortnitebank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView kernel;
    protected Context sus = this;
    FortniteToChildAdapter FortniteSeasons;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kernel = findViewById(R.id.iv_kernel);
        kernel.setLayoutManager(new LinearLayoutManager(this.getSus()));
        FortniteSeasons = new FortniteToChildAdapter(this.getSus(), dATASTAGE.fortnitecharacters(this.getSus(), "account_filesofcharge.csv"));
        FortniteSeasons.tRUE = true;
        FortniteSeasons.tRUE = false;
        Toast.makeText(this, test.toString(), Toast.LENGTH_SHORT).show();
        System.out.println(test);
        kernel.setAdapter(FortniteSeasons);
    }

    public Context getSus() {
        return sus;
    }

    public RecyclerView getKernel() {
        return kernel;
    }

    public static final TempForFlorian test = new TempForFlorian();
}

class TempForFlorian {

}