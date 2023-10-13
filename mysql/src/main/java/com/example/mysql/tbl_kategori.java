package com.example.mysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "tbl_kategori")
public class tbl_kategori {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kd_kategori")
    private String kd_kategori;
    @Column(name = "nm_kategori")
    private String nm_kategori;
    @Column(name = "dupd")
    private String dupd;

    // public tbl_kategori(String kd_kategori, String nm_kategori, String dupd) {
    // this.kd_kategori = kd_kategori;
    // this.nm_kategori = nm_kategori;
    // this.dupd = dupd;
    // }

    public String getKd_kategori() {
        return kd_kategori;
    }

    public void setKd_kategori(String kd_kategori) {
        this.kd_kategori = kd_kategori;
    }

    public String getNm_kategori() {
        return nm_kategori;
    }

    public void setNm_kategori(String nm_kategori) {
        this.nm_kategori = nm_kategori;
    }

    public String getDupd() {
        return dupd;
    }

    public void setDupd(String dupd) {
        this.dupd = dupd;
    }

}