package io.github.furuewl.springboot.sell.utils;


import io.github.furuewl.springboot.sell.vo.ResultVo;

/**
 * 结果集工具类
 *
 * @author weilai
 */
public class ResultVoUtil {

    public static ResultVo success(Object object) {
        ResultVo resultVo = new ResultVo();
        resultVo.setData(object);
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }

    public static ResultVo success() {
        return success(null);
    }

    public static ResultVo error(Integer code, String msg) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }

}
