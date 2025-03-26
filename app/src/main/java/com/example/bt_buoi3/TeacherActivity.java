package com.example.bt_buoi3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class TeacherActivity extends AppCompatActivity {
    EditText edtBaiChinhSua;
    Button btnGuiKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        edtBaiChinhSua = findViewById(R.id.edtBaiChinhSua);
        btnGuiKetQua = findViewById(R.id.btnGuiKetQua);

        Intent intent = getIntent();
        String baiViet = intent.getStringExtra("baiViet");
        edtBaiChinhSua.setText(baiViet);

        btnGuiKetQua.setOnClickListener(view -> {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("baiVietDaSua", edtBaiChinhSua.getText().toString());
            setResult(66, resultIntent);
            finish();
        });
    }
}

