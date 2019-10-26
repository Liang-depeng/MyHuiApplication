package com.bh.ldp.lib_base.http;

/**
 * created by Da Peng at 2019/10/12
 */
public class HttpUrl {
    // 火车
    public final static  String TRAIN_QUERY = "https://api.jisuapi.com/train/station2s?appkey=3e4e0c080d3f1aa5"; // &start=杭州&end=北京&ishigh=0&date=2019/10/22
    // 天气
    public final static String WEATHER_QUERY = "https://api.jisuapi.com/weather/query?appkey=3e4e0c080d3f1aa5"; //&city=安顺
    // 默认
    public final static String CAI_URL = "https://api.jisuapi.com/recipe/search?&appkey=3e4e0c080d3f1aa5"; // &num=10&keyword=白菜
    // 查询分类
    public final static String CAI_SORT_LIST = "https://api.jisuapi.com/recipe/class?appkey=3e4e0c080d3f1aa5";
    // 按照分类查询
    public final static String CAI_SORT_DETAILS_QUERY = "https://api.jisuapi.com/recipe/byclass?&appkey=3e4e0c080d3f1aa5"; // classid=2&start=0&num=10
    // 详情
    public final static String CAI_DETAILS_QUERY = "https://api.jisuapi.com/recipe/detail?&appkey=3e4e0c080d3f1aa5"; // id=5
}
