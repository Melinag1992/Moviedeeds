package com.example.melg.moviedbapp.model;

import java.util.List;

public class Movie {
    private int page;
    List<Results> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }




}
