package com.yonsai.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

// @JsonProperty
//  - JSON 데이터를 자바 객체로 바꿀때 필요한 도구!
//  - 스프링부트 안에 자동으로 들어있다.
//  - json에서 데이터 key 가 자바 dto 변수명이랑 같으면
//    생략 가능하다!

public class ExchangeDto {

  @JsonProperty("cur_nm")
  private String curNm;

  private String ttb;
  private String tts;

  public String getCurNm() {
    return curNm;
  }

  public void setCurNm(String curNm) {
    this.curNm = curNm;
  }

  public String getTtb() {
    return ttb;
  }

  public void setTtb(String ttb) {
    this.ttb = ttb;
  }

  public String getTts() {
    return tts;
  }

  public void setTts(String tts) {
    this.tts = tts;
  }

  @Override
  public String toString() {
    return "ExchangeDto [curNm=" + curNm + ", ttb=" + ttb + ", tts=" + tts + "]";
  }

}