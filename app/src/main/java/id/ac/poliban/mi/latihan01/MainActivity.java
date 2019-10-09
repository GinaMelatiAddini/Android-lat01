package id.ac.poliban.mi.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memasang event listener dan menangani event handler
        initComponents();
    }

    private void initComponents() {
        //pasang event listener
        Button btAjax= findViewById(R.id.btAjax);
        Button btBarcelona= findViewById(R.id.btBarcelona);
        Button btRealMadrid= findViewById(R.id.btRealMadrid);
        Button btRoma= findViewById(R.id.btRoma);
        Button btFlorentina= findViewById(R.id.btFlorentina);
        Button btBocaJunior= findViewById(R.id.btBocaJunior);

        //tangani kejadian(event handler)
        //menggunakan object yang dibuat dari kelas anonim
        //yang mengimplementasikan interface onClickListener

        btAjax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "I'm Ajax in The Amsterdam", Toast.LENGTH_SHORT).show();
            }
        });
        btBarcelona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sorry Madrid, i'm fans Barca!", Toast.LENGTH_SHORT).show();
            }
        });
        btRoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Roma : 1927", Toast.LENGTH_SHORT).show();
            }
        });
        btFlorentina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Florentina : 1926", Toast.LENGTH_SHORT).show();
            }
        });
        btBocaJunior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Boca Junior : 1905", Toast.LENGTH_SHORT).show();
            }
        });
        btRealMadrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Real Madrid : 1902", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
