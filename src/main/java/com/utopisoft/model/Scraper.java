package com.utopisoft.model;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * User: Erman PAYASLI
 * Date: 6.04.2019
 * Time: 02:21
 */
public class Scraper
{
    public static final String URL_TEMP = "https://eksisozluk.com/basliklar/istatistik/#/son-entryleri";

    @Getter
    @Setter
    private String suser;

    @Getter
    @Setter
    private String url;

    @Getter
    @Setter
    private Document document;

    public Scraper(String suser) throws IOException
    {
        this.suser = suser;
        this.url = URL_TEMP.replace("#",suser);
        this.document = Jsoup.connect(url).get();
    }


}
