package com.example.demo.common;

import lombok.Getter;

import java.io.Serializable;

/***
 @author:WM
 @date:2018-01-25
 @desc://todo
 */
@Getter
public class Render implements Serializable {
    private static final long serialVersionUID = -2842061383738959817L;
    private Integer status;
    private String message;
    private Object data;

    private Render() {
        status= 200;
        message= "success";
    }

    public static Render error() {
        Render render = new Render();
        render.status= 500;
        render.message= "error";
        return render;
    }

    public static Render error(String message) {
        Render render = new Render();
        render.status=500;
        render.message=String.format("error ",message);
        return render;
    }

    public static Render error(Exception e) {
        Render render = new Render();
        render.status=500;
        render.message=String.format("error",e.getMessage());
        return render;
    }

    public static Render success(Object data) {
        Render r = new Render();
        r.data=data;
        return r;
    }




    public static Render success() {
        return new Render();
    }


}
