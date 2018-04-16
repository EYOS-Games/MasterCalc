package il.co.eyos.user.mastercalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView decimalTxtBox, decimalSelectTxtView;
    TextView hexaTextBox, HexaSelectTextView;
    Button  aBtn , bBtn , cBtn , dBtn, eBtn, fBtn;


    CharSequence currentDecialTxtBox;

    enum buttonClick{decimal, binary , ocatal ,hexa};
    buttonClick buttonClciked = buttonClick.decimal;//defualt ->TODO:decimal

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

            case  R.id.decimalSelectTxtView:
                buttonClciked = buttonClick.decimal;
                break;
            case  R.id.HexaSelectTextView:
                buttonClciked = buttonClick.hexa;
                break;
            case  R.id.OctalSelectTextView:
                buttonClciked = buttonClick.ocatal;
                break;
            case  R.id.binarySelectTextView:
                buttonClciked = buttonClick.binary;
                break;

                default:
                    TextView viewBox = findViewById(v.getId());
                    String btnText = viewBox.getText().toString();
                    setTextOnScreen(buttonClciked, btnText );
                    break;


           /* case R.id.aBtn:
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
                break;*/
        }
    }

    private  void setTextOnScreen(buttonClick buttonClciked, String text)
    {
        if (buttonClciked.equals(buttonClick.decimal))
        {
            hexaTextBox.append((text));
        }
    }
}
