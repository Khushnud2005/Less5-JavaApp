package uz.exemple.less5_javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
    }
    void initViews(){
        Button btn_3task = findViewById(R.id.btn_toThirdTask);
        btn_3task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdTask();
            }
        });
    }
    void openThirdTask(){
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }
}