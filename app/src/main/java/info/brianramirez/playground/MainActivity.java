package info.brianramirez.playground;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Text View

    @Override
    protected void onCreate(Bundle savedInstanceState) {//viewDidLoad()
        //Creating toolbar
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Gets rid of tool bar title
        super.getSupportActionBar().setTitle("Inspire Me");


        final TextView playgroundTxt = (TextView) findViewById(R.id.playgroundTextView);
        final Button touchMeBtn = (Button) findViewById(R.id.touchMebtn);
        final String[] quotes = {"Stay Hungry, Stay Foolish.", "All wonders you seek are within yourself.", "Service to others is the rent you pay for your room here on Earth.", "Faith is taking the first step even when you don't see the whole staircase.", "If your ship doesn't come in, swim out to it.", "Relentless optimism is what moves the world forward.", "Your time is limited so don't waste it living someone else's life.", "Our lives begin to end the day we become silent about things that matter.", "If your dreams don't scare you, they are not big enough.", "If you are not willing to risk the unusual, you will have to settle for the ordinary.", "I act despite of my mood!", "You decided to pursue your dreams. That's confidence!", "When you knock on the door of opportunities, it is work who answers!",  "Be kind whenever possible. It is always possible!", "Try not to become a man of succses but rather to become a man of value.", "Don't cry because it's over, smile because it happened", "Be yourself; everyone else is already taken", "Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind", "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.", "A room without books is like a body without a soul", "So many books, so little time.", "You only live once, but if you do it right, once is enough.", "Be the change that you wish to see in the world.", "If you tell the truth, you don't have to remember anything", "A friend is someone who knows all about you and still loves you", "Always forgive your enemies; nothing annoys them so much", "To live is the rarest thing in the world. Most people exist, that is all.", "No one can make you feel inferior without your consent", "Live as if you were to die tomorrow. Learn as if you were to live forever.", "The successful warrior is the average man, with laser-like focus.","Start by doing what's necessary then do what's possible; and suddenly you are doing the impossible", "If opportunity doesn't knock, build a door", "Perfection is not attainable, but if we chase perfection we can catch excellence", "The most beautiful thing in the world is, of course, the world itself" , "Nothing is impossible, the word itself says 'I'm possible'!", "Try to be a rainbow in someone's cloud.", "It is during our darkest moments that we must focus to see the light", "Believe you can and you're halfway there", "We can't help everyone, but everyone can help someone", "The measure of who we are is what we do with what we have", "Every story I create, creates me. I write to create myself.", "There are two ways of spreading light: to be the candle or the mirror that reflects it", "Tears of joy are like the summer rain drops pierced by sunbeams", "The best preparation for tomorrow is doing your best today", "Out of difficulties grow miracles", "Happiness resides not in possessions, and not in gold, happiness dwells in the soul", "It is in your moments of decision that your destiny is shaped", "Give light, and the darkness will disappear of itself", "Thought is the wind, knowledge the sail, and mankind the vessel", "What we need is more people who specialize in the impossible", "What we need is more people who specialize in the impossible.", "It is better to be hated for what you are than to be loved for what you are not.", "Life is what happens to you while you're busy making other plans.", "Good friends, good books, and a sleepy conscience: this is the ideal life.", "A woman is like a tea bag; you never know how strong it is until it's in hot water.", "It does not do to dwell on dreams and forget to live.", "If you don't stand for something you will fall for anything.", "We are all in the gutter, but some of us are looking at the stars.","I have not failed. I've just found 10,000 ways that won't work.", "It is not a lack of love, but a lack of friendship that makes unhappy marriages.", "A day without sunshine is like, you know, night.", "I like nonsense, it wakes up the brain cells. Fantasy is a necessary ingredient in living.", "Never put off till tomorrow what may be done day after tomorrow just as well.", "That which does not kill us makes us stronger.", "If you judge people, you have no time to love them.", "For every minute you are angry you lose sixty seconds of happiness.", "It is never too late to be what you might have been.", "Sometimes the questions are complicated and the answers are simple.", "All you need is love. But a little chocolate now and then doesn't hurt.", "Today you are You, that is truer than true. There is no one alive who is Youer than You.", "Everything you can imagine is real.", "One good thing about music, when it hits you, you feel no pain.", "Logic will get you from A to Z; imagination will get you everywhere.", "The difference between genius and stupidity is: genius has its limits.", "For most of history, Anonymous was a woman.", "Love is like the wind, you can't see it but you can feel it.", "Do what you can, with what you have, where you are.", "If you can make a woman laugh, you can make her do anything.", "If one cannot enjoy reading a book over and over again, there is no use in reading it at all.", "You don't love someone because they're perfect, you love them in spite of the fact that they're not.", "Life isn't about finding yourself. Life is about creating yourself.", "Life is like riding a bicycle. To keep your balance, you must keep moving.", "Do one thing every day that scares you.", "Some infinities are bigger than other infinities.", "There is no friend as loyal as a book.", "Success is not final, failure is not fatal: it is the courage to continue that counts.", "Things change. And friends leave. Life doesn't stop for anybody.", "The question isn't who is going to let me; it's who is going to stop me.", "The marks humans leave are too often scars.", "It takes courage to grow up and become who you really are.", "Anyone who has never made a mistake has never tried anything new.", "Be nice to nerds. You may end up working for them. We all could.", "But better to get hurt by the truth than comforted with a lie.", "Choose a job you love, and you will never have to work a day in your life.", "Not all those who wander are lost.", "Tis better to have loved and lost than never to have loved at all.", "A lie can travel half way around the world while the truth is putting on its shoes.", "Never tell the truth to people who are not worthy of it.", "A day without laughter is a day wasted.", "Some day you will be old enough to start reading fairy tales again.", "It's the possibility of having a dream come true that makes life interesting.", "Fantasy is hardly an escape from reality. It's a way of understanding it", "Never let your sense of morals prevent you from doing what is right.", "Only in the darkness can you see the stars.", "All the darkness in the world cannot extinguish the light of a single candle.", "You never fail until you stop trying", "Try a little harder to be a little better.", "A ship is safe in harbor, but that's not what ships are for.", "What's the good of living if you don't try a few things?", "People say nothing is impossible, but I do nothing every day.", "You were born with wings, why prefer to crawl through life?", "Happiness [is] only real when shared", "The past has no power over the present moment.", "When people don't express themselves, they die one piece at a time.", "What do we live for, if it is not to make life less difficult for each other?"};

        //random # generator
        final Random rand = new Random();
        int random = rand.nextInt(115);
        playgroundTxt.setText(quotes[random]);
//        Playing around with button
        touchMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = rand.nextInt(115);
                playgroundTxt.setText(quotes[random]);

            }
        }
    );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
