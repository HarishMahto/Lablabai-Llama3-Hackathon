package harish.project.llama3talecraft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    CardView yourStoriesCard;
    CardView writeStoriesCard;
    CardView imageCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        yourStoriesCard = findViewById(R.id.your_storiesCard);
        writeStoriesCard = findViewById(R.id.write_storiesCard);
        imageCard = findViewById(R.id.imageCard);

        yourStoriesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Your_Stories.class);
                startActivity(intent);
            }
        });

        writeStoriesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Llama3.class);
                startActivity(intent);
            }
        });

        imageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}