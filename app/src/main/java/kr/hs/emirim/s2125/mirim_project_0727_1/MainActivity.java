package kr.hs.emirim.s2125.mirim_project_0727_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCheck;
    String[] itemsArr = {"Italy", "France", "Spain"};
    boolean[] checkArr={true, false, true}; //처음 실행될 때 초기상태 설정
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCheck = findViewById(R.id.btn_check);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("체크목록대화상자");
                dlg.setIcon(R.drawable.icon);
                dlg.setMultiChoiceItems(itemsArr, checkArr, null);
                dlg.setNegativeButton("닫기",null);
                dlg.show();
            }
        });
    }
}