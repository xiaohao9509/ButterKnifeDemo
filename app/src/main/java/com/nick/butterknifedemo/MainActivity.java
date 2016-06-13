package com.nick.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.btn1)
    Button mBtn1;
    @BindView(R.id.subject)
    TextView mSubject;
    @BindView(R.id.btn2)
    Button mBtn2;
    @BindView(R.id.img)
    ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn1, R.id.btn2})
    public void click(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn1:
                Toast.makeText(MainActivity.this, "按钮1被点击", Toast.LENGTH_SHORT).show();
                mTitle.setText("按钮一影响了我");
                break;
            case R.id.btn2:
                Toast.makeText(MainActivity.this, "按钮2被点击", Toast.LENGTH_SHORT).show();
                mSubject.setText("按钮二改变了我");
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
