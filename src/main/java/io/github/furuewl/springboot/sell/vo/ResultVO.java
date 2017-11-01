package io.github.furuewl.springboot.sell.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 *
 * @param <T>
 * @author weilai
 * 2017-10-14 14:31
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;

}
