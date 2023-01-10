package com.adam.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView synopsis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        synopsis = findViewById(R.id.synopsis);
        synopsis.setText("Isabel Aretas, widow of cartel kingpin Benito, escapes from a Mexican prison with the aid of her son Armando. Isabel sends Armando to Miami, tasking him with recovering a substantial stash of money his father Benito had hidden, as well as assassinating the people responsible for his father's arrest and eventual death in prison. Isabel demands that Armando kill Miami detective Mike Lowrey last.\n" +
                "\n" +
                "In Miami, Mike accompanies his partner Marcus Burnett to the birth of his first grandson. Desiring to spend more time with his family, the aging Marcus tells Mike he intends to retire, to Mike's chagrin. During a party celebrating Marcus' grandson, Mike is shot by Armando and left in a coma for months. Chastised by Isabel for targeting Mike first, Armando continues to assassinate other targets on his list during Mike's convalescence.\n" +
                "\n" +
                "Following Mike's recovery, he is determined to seek revenge and unsuccessfully attempts to recruit the now-retired Marcus, causing a fall out between them. Mike violently obtains the identity of arms dealer Booker Grassie from an informant. Realizing that Mike will not heed orders to stay away from the investigation, Captain Howard reluctantly allows him to work with the tech-driven team in charge, the Advanced Miami Metro Operations (AMMO), led by Mike's ex-girlfriend Rita. While the team surveils Grassie at an arms deal, Mike determines that the buyers intend to kill Grassie and intervenes, but fails to save him. Later, Marcus is called by Carver Remy, an old informant who believes the assassin is after him. Marcus contacts Mike and the pair travel to Carver, but are too late to save him. Armando escapes after a fistfight with Mike.\n" +
                "\n" +
                "Captain Howard later reveals his intentions to retire as well, offering advice to Mike that he needs to find a path forward in life. He is abruptly assassinated by Armando moments later. The captain's death pulls Marcus out of retirement, but he intends to work as a team with AMMO. They track down Grassie's accountant, who leads them to Lorenzo \"Zway-Lo\" Rodriguez. They infiltrate Zway-Lo's birthday party leading to a destructive car chase. Armando arrives in a helicopter to rescue Zway-Lo but kills him when he blocks Armando's ability to shoot the pursuing Mike. As he lines up a shot, Armando tells Mike \"Hasta el fuego\". Gunfire from Marcus creates cover for Mike, who falls into the water below.\n" +
                "\n" +
                "AMMO is shut down because of the failed operation. In private, Mike reveals to Marcus that Armando may be his son. Before partnering with Marcus, Mike worked as an undercover officer in the Aretas cartel where he met Isabel. They fell in love and intended to run away together, using \"Hasta el fuego\" as a made-up secret catchphrase. Mike ultimately remained loyal to the police, realizing how dangerous Isabel had become. Despite Mike's opposition, Marcus and AMMO join him in Mexico City to confront her.\n" +
                "\n" +
                "At the Hidalgo Palace, Mike meets Isabel and scolds her for concealing the truth from him. A shootout quickly ensues between AMMO and Isabel's men. Marcus shoots the pilot of Isabel's support helicopter, causing it to crash into the central lobby and starting a fire. Marcus confronts Isabel, while Mike tries to explain the truth to Armando. Armando begins to beat up Mike, but he refuses to retaliate. Demanding the truth from his mother, Isabel confirms to Armando that Mike is his father. Realizing the task he spent a lifetime training for was a lie, Armando tries to protect his father, leading to Isabel inadvertently shooting Armando in the chest while aiming for Mike. Enraged, she attempts to finish Mike, but Rita intervenes and shoots Isabel, sending her falling to her death into the flames below.\n" +
                "\n" +
                "Sometime later, Rita has been promoted to police Captain, while Mike and Marcus are placed in charge of AMMO. Mike visits a remorseful Armando in prison, offering him a chance to earn some redemption, which he accepts.\n" +
                "\n");
    }
}