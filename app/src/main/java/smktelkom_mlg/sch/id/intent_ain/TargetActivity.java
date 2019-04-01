package smktelkom_mlg.sch.id.intent_ain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult = findViewById(R.id.textView);

        //getdata
        if (getIntent().getExtras() != null) {
            String data = getIntent().getExtras().getString(MainActivity.EXTRA_DATA);
            txtResult.setText(data);
        }
    }
}
