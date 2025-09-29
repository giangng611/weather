package org.example.entity;

import jakarta.persistence.*;

@Entity
public class SavedCity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cityName;
    private String nickName;

    public long getId () {
        return id;
    }

    public String getCityName () {
        return cityName;
    }

    public String getNickName () {
        return nickName;
    }

    public void setId () {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}
