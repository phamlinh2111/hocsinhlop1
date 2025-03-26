package com.example.bt_buoi3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentActivity extends AppCompatActivity {
    EditText edtBaiViet;
    Button btnNopBai;
    TextView textBaiDaSua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        edtBaiViet = findViewById(R.id.edtBaiViet);
        btnNopBai = findViewById(R.id.btnNopBai);
        textBaiDaSua = findViewById(R.id.textBaiDaSua);

        btnNopBai.setOnClickListener(view -> {
            String baiViet = edtBaiViet.getText().toString();
            Intent intent = new Intent(StudentActivity.this, TeacherActivity.class);
            intent.putExtra("baiViet", baiViet);
            startActivityForResult(intent, 19);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 19 && resultCode == 66) {
            String resultBaiViet = data.getStringExtra("baiVietDaSua");
            textBaiDaSua.setText(resultBaiViet);
        }
    }
}
