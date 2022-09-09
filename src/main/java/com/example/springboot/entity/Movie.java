package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author pluto
 * @since 2022-06-04
 */
@TableName("t_movie")
@ApiModel(value = "Movie对象", description = "")
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("电影id")
    private Integer mid;

    @ApiModelProperty("平均评分")
    private Double score;

    @ApiModelProperty("电影名称")
    private String name;

    @ApiModelProperty("上映年份")
    private String year;

    @ApiModelProperty("导演")
    private String director;

    @ApiModelProperty("演员")
    private String actor;

    @ApiModelProperty("电影类型")
    private String genre;

    @ApiModelProperty("电影描述")
    private String description;

    @ApiModelProperty("电影封面")
    private String img;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Movie{" +
        "id=" + id +
        ", mid=" + mid +
        ", score=" + score +
        ", name=" + name +
        ", year=" + year +
        ", director=" + director +
        ", actor=" + actor +
        ", genre=" + genre +
        ", description=" + description +
        ", img=" + img +
        "}";
    }
}
