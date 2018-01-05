package com.andreitalpos.emanuelchurch;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class HomeActivityFragment extends Fragment {
    TextView verseText;
    TextView eventText;
    TextView verseRefText;
    TextView verseADay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        verseText = (TextView) view.findViewById(R.id.votdVerseView);
        eventText = (TextView) view.findViewById(R.id.eventText);
        verseRefText = (TextView) view.findViewById(R.id.votdVerseReferenceText);
        verseADay = (TextView) view.findViewById(R.id.verseADayTextLink);


        new votd().execute();

        verseADay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verseADayIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://verse-a-day.com/"));
                startActivity(verseADayIntent);
            }
        });

        return view;

    }

    //Scrapes the verse of the day from website
    public class votd extends AsyncTask<Void, Void, Void> {
        String p;
        String e;
        String r;

        @Override
        protected Void doInBackground(Void... params) {
            try {
                //Connects to website
                Document votd = Jsoup.connect("http://verse-a-day.com/#").timeout(3000).get();
                Element element = votd.select("#divVerseTranslations p#NIV").first();
                p = element.text();
                Elements verseRef = votd.select("h2");
                r = verseRef.text();

                Document eman = Jsoup.connect("https://emanuelchurch.com/").timeout(3000).get();
                //Elements div = eman.select("div.index-col2");
                Elements ul = eman.select("div.index-col2 > ul");
                ul.select("br").append("<pre>\n</pre>");
                Elements li = ul.select("li");
                e = li.text();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (NullPointerException ex) {
                System.out.println(ex);
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            verseText.setText(p);
            eventText.setText(e);
            verseRefText.setText(r);
            verseADay.setText("verse-a-day.com");
        }

    }
}
