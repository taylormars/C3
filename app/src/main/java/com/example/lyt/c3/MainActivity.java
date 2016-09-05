package com.example.lyt.c3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView =(TextView)findViewById(R.id.textView);

        Button button =(Button)findViewById(R.id.button);


        RadioButton RB1=(RadioButton)findViewById(R.id.RB1);
        RadioButton RB2=(RadioButton)findViewById(R.id.RB2);
        RadioButton RB3=(RadioButton)findViewById(R.id.RB3);
        CheckBox CB1=(CheckBox)findViewById(R.id.CB1);
        CheckBox CB2=(CheckBox)findViewById(R.id.CB2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText =(EditText)findViewById(R.id.editText);
                editText.setText("改变");
            }
        });


    }
    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        TextView TV1=(TextView)findViewById(R.id.TV1);

        switch(view.getId()) {
            case R.id.RB1:
                if (checked)
                    TV1.setText("您的性别为男");
                break;
            case R.id.RB2:
                if (checked)
                    TV1.setText("您的性别为女");
                break;
            case R.id.RB3:
                if (checked)
                    TV1.setText("您的性别为其他");
                break;

        }
    }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        TextView TV2=(TextView)findViewById(R.id.TV2);

        switch(view.getId()) {
            case R.id.CB1:
                if(checked){
                    Toast.makeText(this,"我选1",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择1",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.CB2:
                if(checked){
                    Toast.makeText(this,"我选2",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择2",Toast.LENGTH_LONG).show();
                }
        }
    }
}
