package com.avs.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

/*    private final ChuckNorrisQuotes quotes;

    public JokesServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
           @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
    }*/


    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
