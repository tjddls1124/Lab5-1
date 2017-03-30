package com.example.lab5_1;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    EditText et = (EditText)findViewById(R.id.editText3);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

//    public void onMyClick(View v) {
//        if(v.getId()==R.id.button3) {
//            View view = getLayoutInflater().inflate(R.layout.mytoast, null);
//            TextView msg = (TextView)view.findViewById(R.id.button);
//            msg.setText("레이아웃으로 만든 토스트 창입니다.");
//
//        }
//    }
////    Toast toastView = new Toast(this);
////    toastView.setDuration(Toast.LENGTH_SHORT);
////    toastView.setGravitiy(Gravity.CENTER.0,100);
////    toastView.setView(view);
//
//    public void Onclick(View v){
//        Snackbar.make(v,"Message", 1000).setAction("확인", new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        }).show();
//    }
//    public void MyOnClick(View v){
//        Toast.makeText(getApplicationContext(),"기본 토스트입니다",Toast.LENGTH_SHORT).show();
//
//    }

    public void onClick(View v){
        if(v.getId()==R.id.button_normal){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);

            dlg.setTitle("제목")
                    .setIcon(R.mipmap.ic_launcher)
                    .setMessage("내용")
                    .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(),"확인을 눌렀습니다.",Toast.LENGTH_SHORT).show();
                        }
                    });


        }
        else if(v.getId()==R.id.button_radio){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            String data[] = {"치킨","피자"};
            dlg.setTitle("먹고싶은메뉴는?")
                    .setIcon(R.mipmap.ic_launcher)
                    .setSingleChoiceItems(data,1,null)
                    .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(),"확인을 눌렀습니다.",Toast.LENGTH_SHORT).show();
                        }
                    });
        }
        else if(v.getId()==R.id.button_checkbox){

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            final String data[] = {"치킨","피자","짜장"};
            final boolean checked[] = {true,false,true,false};
            dlg.setTitle("먹고싶은메뉴는?")
                    .setIcon(R.mipmap.ic_launcher)
                    .setMultiChoiceItems(data, checked, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                            checked[which] = isChecked;


                        }
                    }).setNegativeButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(),"확인을 눌렀습니다.",Toast.LENGTH_SHORT).show();
                }
            });
        }

        else if (v.getId()==R.id.button_user){
            View dlgview = View.inflate(this,R.layout.example, null);
           final EditText et = (EditText)dlgview.findViewById(R.id.editText3);

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("먹고싶은 메뉴는?")
                    .setIcon(R.mipmap.ic_launcher);
        }

    }

}
