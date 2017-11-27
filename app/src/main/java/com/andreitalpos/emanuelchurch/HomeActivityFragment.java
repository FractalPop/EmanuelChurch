package com.andreitalpos.emanuelchurch;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class HomeActivityFragment extends Fragment {
//    TextView verseText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //verseText = (TextView) view.findViewById(R.id.verseTextView);

        //new votd().execute();

        return view;

    }

    //Scrapes the verse of the day from website
//    public class votd extends AsyncTask<Void, Void, Void> {
//        String pp;
//        String desc;
//
//        @Override
//        protected Void doInBackground(Void... params) {
//            try {
//                //Connects to website
//                Document doc = Jsoup.connect("http://verse-a-day.com/#").timeout(6000).get();
//                Element element = doc.select("#divVerseTranslations p#NIV").first();
//                pp = element.text();
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (NullPointerException ex) {
//                System.out.println(ex);
//            }
//
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Void aVoid) {
//            super.onPostExecute(aVoid);
//            verseText.setText(pp);
//        }
//
//    }
}
