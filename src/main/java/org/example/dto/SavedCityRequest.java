package org.example.dto;

public class SavedCityRequest {
    private String cityName;
    private String nickname;

    public SavedCityRequest(String cityName, String nickname) {
        this.cityName = cityName;
        this.nickname = nickname;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getNickName() {
        return nickname;
    }

    public void setNickName(String nickname) {
        this.nickname = nickname;
    }

}
