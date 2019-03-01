package com.zafkotlinproject.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 1 mensetting supaya javascript dari websitenya dapat digunakan di aplikasi kita
        layoutWebView.settings.javaScriptEnabled

        //TODO 2
        layoutWebView.loadUrl("https://www.idn.sch.id/")
    }
    // TODO 3 tambah metod untuk

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu)

        //TODO 4 memenampilkan menu bar pada layar
        menuInflater.inflate(R.menu.menu_web_view, menu)
        //untuk hilang kan
        return true

        }
        //TODO 5 buat perkondisian pake metod
        //ketika item di klik maka masuk ke web

    override fun onOptionsItemSelected(item: MenuItem?): Boolean = when(item?.itemId){
        R.id.web1->{
            layoutWebView.loadUrl("https://idn.sch.id/profil/")
            true

        }
        R.id.web2->{
            layoutWebView.loadUrl("https://idn.sch.id/daftar/")
            true
        }
        R.id.web3->{
            layoutWebView.loadUrl("https://idn.sch.id/program/")
            true
        }else->{
            super.onOptionsItemSelected(item)
        }

    }
    }
