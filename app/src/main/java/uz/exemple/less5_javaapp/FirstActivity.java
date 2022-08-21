package uz.exemple.less5_javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        initViews();
    }
    void initViews(){
        Button btn_2task = findViewById(R.id.btn_toSecondTask);
        btn_2task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondTask();
            }
        });
    }
    void openSecondTask(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}