package com.hkn.gwentsoundboard;

import android.app.Dialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ScrollingActivity extends AppCompatActivity {

    MediaPlayer ohoh;
    MediaPlayer legendary;
    MediaPlayer humaninshop;
    MediaPlayer cheapBar;
    MediaPlayer cracky;
    MediaPlayer customerAlwaysRight;
    MediaPlayer goodest;
    MediaPlayer gwenty;
    MediaPlayer mashBash;
    MediaPlayer warmStill;
    MediaPlayer pretty;
    MediaPlayer prices;
    MediaPlayer burny;
    MediaPlayer bigheart;
    MediaPlayer doall;
    MediaPlayer comeback;
    MediaPlayer humanlike;
    MediaPlayer wackbang;
    MediaPlayer yupyup;
    MediaPlayer ahwelcome;
    MediaPlayer dumdumda;
    MediaPlayer goodie;
    MediaPlayer goodiewow;
    MediaPlayer hahahaboom;
    MediaPlayer makesmash;
    MediaPlayer more;
    MediaPlayer moregwenty;
    MediaPlayer norush;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3940256099942544~3347511713");

        ohoh = MediaPlayer.create(this, R.raw.ohoh);
        legendary = MediaPlayer.create(this, R.raw.legendary);
        humaninshop = MediaPlayer.create(this, R.raw.humaninshop);
        cheapBar = MediaPlayer.create(this, R.raw.cheapestly_barr);
        cracky = MediaPlayer.create(this, R.raw.cracky_crack);
        customerAlwaysRight = MediaPlayer.create(this, R.raw.customer_right_allways);
        goodest = MediaPlayer.create(this, R.raw.goodest_cards_you_get_human_deserve_it);
        gwenty = MediaPlayer.create(this, R.raw.gwenty_cards_lots_all_kinds);
        mashBash = MediaPlayer.create(this, R.raw.mash_bash_me_barrel_fresh);

        warmStill = MediaPlayer.create(this, R.raw.ooooohhh_warm_still);
        pretty = MediaPlayer.create(this, R.raw.oooooohh_pretty_gwenty_cards);
        prices = MediaPlayer.create(this, R.raw.prices_for_humans_of_all_wox);
        burny = MediaPlayer.create(this, R.raw.shoop_leave_portal_burny_rocks_maybe);
        bigheart = MediaPlayer.create(this, R.raw.shoop_put_big_heart_into_create);
        doall = MediaPlayer.create(this, R.raw.shoop_to_all_for_human_who_come_in_shoop);
        comeback = MediaPlayer.create(this, R.raw.shoop_want_human_come_back_glitter_rocks_bring);
        humanlike = MediaPlayer.create(this, R.raw.so_human_likey);
        wackbang = MediaPlayer.create(this, R.raw.whack_bang_wow_let_me_know_how);
        yupyup = MediaPlayer.create(this, R.raw.yup_yup_yup_must_smash_smash_shoop_show);

        ahwelcome = MediaPlayer.create(this, R.raw.ahwelcome);
        dumdumda = MediaPlayer.create(this, R.raw.dumdumda);
        goodie = MediaPlayer.create(this, R.raw.goodie);
        goodiewow = MediaPlayer.create(this, R.raw.goodiewow);
        hahahaboom = MediaPlayer.create(this, R.raw.hahahaboom);
        makesmash = MediaPlayer.create(this, R.raw.makesmash);
        more = MediaPlayer.create(this, R.raw.more);
        moregwenty = MediaPlayer.create(this, R.raw.moregwenty);
        norush = MediaPlayer.create(this, R.raw.norush);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

       ahwelcome.start();


    }

    public void stopPlayers() {
        if (legendary.isPlaying()) legendary.stop();
        if (ohoh.isPlaying()) ohoh.stop();
        if (humaninshop.isPlaying()) humaninshop.stop();
    }

    public void playTroll1(View view) {
        legendary.start();
    }

    public void ohohh(View view) {
        ohoh.start();
    }

    public void human(View view) {
        humaninshop.start();
    }

    public Context getActivity() {
        return ScrollingActivity.this;
    }

    public void playCheap(View view) {
        cheapBar.start();
    }

    public void playCracky(View view) {
        cracky.start();
    }

    public void playCustomer(View view) {
        customerAlwaysRight.start();
    }

    public void playGoodest(View view) {
        goodest.start();
    }

    public void playGwenty(View view) {
        gwenty.start();
    }

    public void playMashBash(View view) {
        mashBash.start();
    }

    public void playWarmStill(View view) {
        warmStill.start();
    }

    public void playPretty(View view) {
        pretty.start();
    }

    public void playPrices(View view) {
        prices.start();
    }

    public void playBurny(View view) {
        burny.start();
    }

    public void playBigheart(View view) {
        bigheart.start();
    }


    public void playDoAll(View view) {
        doall.start();
    }

    public void playComeBack(View view) {
        comeback.start();
    }

    public void playHumanlike(View view) {
        humanlike.start();
    }

    public void playWackBang(View view) {
        wackbang.start();
    }


    public void playYupYup(View view) {
        yupyup.start();
    }

    public void playDumdumda(View view) {
        dumdumda.start();
    }

    public void playGoodie(View view) {
        goodie.start();
    }

    public void playHahaboom(View view) {
        hahahaboom.start();
    }

    public void playMakesmash(View view) {
        if(moregwenty.isPlaying()) {

        }
        makesmash.start();
    }

    public void playMore(View view) {
        more.start();
    }

    public void playMoreGwent(View view) {
        moregwenty.start();
    }

    public void playNoRush(View view) {
        norush.start();
    }
}

