package sg.edu.rp.c346.id22038532.l08_ps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText Title,Singers,Years,Stars;
    Button Insert,ShowList;
    TextView List;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Title = findViewById(R.id.editTextTextSongTitle);
        Singers = findViewById(R.id.editTextTextSingers);
        Years = findViewById(R.id.editTextTextYear);
        Stars = findViewById(R.id.editTextTextStars);
        Insert = findViewById(R.id.buttonInsert);
        ShowList = findViewById(R.id.buttonShowList);
        List = findViewById(R.id.textViewList);

        Insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper db = new DBHelper(MainActivity.this);

                db.insertSong(Title.getText().toString(), Singers.getText().toString(),Years.getText().toString(), Stars.getText().toString());
            }
        });

        ShowList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper db = new DBHelper(MainActivity.this);
                ArrayList<String> data = db.getSongContent();
                db.close();

                String txt = "";
                for(int i = 0; i < data.size(); i++)
                {
                    Log.d("Database Content", i + ". " + data.get(i));
                    txt +=  data.get(i) + "\n";
                }
                List.setText(txt);
            }
        });
    }
}