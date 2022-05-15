package sg.edu.np.edu.mad.s10205175_week2practical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView imageButton = findViewById(R.id.imageView3);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = alert();
                dialog.show();
            }
        });
    }



    public AlertDialog alert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setCancelable(true);
        builder.setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Random rand = new Random();
                Integer ranINT = Math.abs(rand.nextInt());
                Intent thisactivity = new Intent(ListActivity.this, MainActivity.class);
                thisactivity.putExtra("ranINT", ranINT);
                startActivity(thisactivity);
            }

        });

        AlertDialog alert = builder.create();
        return alert;
    }
    RecyclerView recyclerView = findViewById(R.id.recyclerView);
    Bran mAdapter =
            new BrandsAdapter(brandList);

    LinearLayoutManager mLayoutManager =
            new LinearLayoutManager(this);

recyclerView.setLayoutManager(mLayoutManager);
recyclerView.setItemAnimator(new DefaultItemAnimator());
recyclerView.setAdapter(mAdapter);

    ;
}
