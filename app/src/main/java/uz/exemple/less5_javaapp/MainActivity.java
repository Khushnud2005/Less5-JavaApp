package uz.exemple.less5_javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        Button btn_tasks = findViewById(R.id.btn_toTasks);
        btn_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstTask();
            }
        });
    }
    void openFirstTask(){
        Intent  intent = new Intent(this,FirstActivity.class);
        startActivity(intent);
    }
}