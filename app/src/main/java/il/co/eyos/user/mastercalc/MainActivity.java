package il.co.eyos.user.mastercalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView decimalTxtBox, decimalSelectTxtView;
    TextView hexaTextBox, HexaSelectTextView;
    Button  aBtn;
    Button  bBtn;
    Button  cBtn;
    Button  dBtn;
    Button  eBtn;
    Button  fBtn;

    CharSequence currentDecialTxtBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decimalSelectTxtView = findViewById(R.id.decimalSelectTxtView);
        HexaSelectTextView = findViewById(R.id.HexaSelectTextView);
        decimalTxtBox = findViewById(R.id.DecimalTxtbox);
        hexaTextBox = findViewById(R.id.hexaTextBox);

        aBtn = findViewById(R.id.aBtn);
        bBtn = findViewById(R.id.bBtn);
        cBtn = findViewById(R.id.cBtn);
        dBtn = findViewById(R.id.dBtn);
        eBtn = findViewById(R.id.eBtn);
        fBtn = findViewById(R.id.fBtn);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.aBtn:
                currentDecialTxtBox = hexaTextBox.getText();
                hexaTextBox.setText(currentDecialTxtBox + "A");
                //convert to all other
                break;
            case R.id.bBtn:
                currentDecialTxtBox = hexaTextBox.getText();
                hexaTextBox.setText(currentDecialTxtBox + "B");
                //convert to all other
                break;
            case R.id.cBtn:
                currentDecialTxtBox = hexaTextBox.getText();
                hexaTextBox.setText(currentDecialTxtBox + "C");
                //convert to all other
                break;
            case R.id.dBtn:
                currentDecialTxtBox = hexaTextBox.getText();
                hexaTextBox.setText(currentDecialTxtBox + "D");
                //convert to all other
                break;
            case R.id.eBtn:
                currentDecialTxtBox = hexaTextBox.getText();
                hexaTextBox.setText(currentDecialTxtBox + "E");
                //convert to all other
                break;
            case R.id.fBtn:
                currentDecialTxtBox = hexaTextBox.getText();
                hexaTextBox.setText(currentDecialTxtBox + "F");
                //convert to all other
                break;
        }
    }
}
