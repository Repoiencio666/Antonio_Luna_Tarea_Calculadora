package ipn.cecyt9.holamundoacc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    double number1;

    public void onClickButtonOne (View miView){
        TextView Screen = findViewById(R.id.Screen);
        String Value = Screen.getText().toString();
        Screen.setText(Value + "1");
    }

    public void onClickButtonTwo (View miView){
        TextView Screen = findViewById(R.id.Screen);
        String Value = Screen.getText().toString();
        Screen.setText(Value + "2");
    }

    public void onClickButtonThree (View miView){
        TextView Screen = findViewById(R.id.Screen);
        String Value = Screen.getText().toString();
        Screen.setText(Value + "3");
    }


    public void onClickButtonFour (View miView){
        TextView Screen = findViewById(R.id.Screen);
        String Value = Screen.getText().toString();
        Screen.setText(Value + "4");
    }

    public void onClickButtonFive (View miView){
        TextView Screen = findViewById(R.id.Screen);
        String Value = Screen.getText().toString();
        Screen.setText(Value + "5");
    }


    public void onClickButtonSix (View miView){
        TextView Screen = findViewById(R.id.Screen);
        String Value = Screen.getText().toString();
        Screen.setText(Value + "6");
    }

    public void onClickButtonSeven (View miView){
        TextView Screen = findViewById(R.id.Screen);
        String Value = Screen.getText().toString();
        Screen.setText(Value + "7");
    }

    public void onClickButtonEight (View miView){
        TextView Screen = findViewById(R.id.Screen);
        String Value = Screen.getText().toString();
        Screen.setText(Value + "8");
    }

    public void onClickButtonNine (View miView){
        TextView Screen = findViewById(R.id.Screen);
        String Value = Screen.getText().toString();
        Screen.setText(Value + "9");
    }

    public void onClickButtonZero (View miView){
        TextView Screen = findViewById(R.id.Screen);
        String Value = Screen.getText().toString();
        Screen.setText(Value + "0");
    }

}