package com.example.JpApp.magicitem;

public class MagicItem {
    private int String;
    private String name;
    private String rarity;
    private String desc;
    private String url;

    public MagicItem(int string, java.lang.String name, java.lang.String rarity, java.lang.String desc, java.lang.String url) {
        String = string;
        this.name = name;
        this.rarity = rarity;
        this.desc = desc;
        this.url = url;
    }
    public MagicItem(String name, String rarity, String desc, String url) {
        this.name = name;
        this.rarity = rarity;
        this.desc = desc;
        this.url = url;
    }

    public int getString() {
        return String;
    }

    public void setString(int string) {
        String = string;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getRarity() {
        return rarity;
    }

    public void setRarity(java.lang.String rarity) {
        this.rarity = rarity;
    }

    public java.lang.String getDesc() {
        return desc;
    }

    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }

    public java.lang.String getUrl() {
        return url;
    }

    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    @Override
    public java.lang.String toString() {
        return "MagicItem{" +
                "String=" + String +
                ", name='" + name + '\'' +
                ", rarity='" + rarity + '\'' +
                ", desc='" + desc + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
