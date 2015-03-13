/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.glassfish.movieplex7.client;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Development
 */

@Named
@SessionScoped
public class MovieBackingBean implements Serializable {
    
    int movieId;
    String movieName;
    String actors;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getActors() {
        return actors;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getMovieId() {
        return movieId;
    }
    
}
