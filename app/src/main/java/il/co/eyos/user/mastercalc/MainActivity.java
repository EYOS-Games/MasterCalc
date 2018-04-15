package il.co.eyos.user.mastercalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView decimalTxtBox, decimalSelectTxtView;
    Button  aBtn;

    CharSequence currentDecialTxtBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decimalSelectTxtView = findViewById(R.id.decimalSelectTxtView);
        decimalTxtBox = findViewById(R.id.DecimalTxtbox);

        aBtn = findViewById(R.id.aBtn);



    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.aBtn:
                currentDecialTxtBox = decimalTxtBox.getText();
                decimalTxtBox.setText(currentDecialTxtBox + "a");
                //convert to all other
                break;
        }
    }
}
