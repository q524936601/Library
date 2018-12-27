package com.example.stu.library;

public class Infor {
    private  int _id;
    private  Long number;
    private  String name;
    private  String zuozhe;
    private  String chubanshe;

    public String getZuozhe() {
        return zuozhe;
    }

    public String getChubanshe() {
        return chubanshe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe;
    }

    public void setChubanshe(String chubanshe) {
        this.chubanshe = chubanshe;
    }

    public Infor() { }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public int get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public Long getNumber() {
        return number;
    }
}
