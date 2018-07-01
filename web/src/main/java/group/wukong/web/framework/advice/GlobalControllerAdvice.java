package group.wukong.web.framework.advice;

import group.wukong.web.framework.exception.CustomException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalControllerAdvice {
    public static final String DEFAULT_ERROR_VIEW = "error";
    /**
     * 全局异常捕捉处理
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ModelAndView errorHandler(Exception ex) {
        //LogHelper.writeException(this.getClass().getName(), new Exception(ex.getMessage()), null);
        System.out.println(ex.getMessage());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(DEFAULT_ERROR_VIEW);
        modelAndView.addObject("code", 100);
        modelAndView.addObject("msg", "&#x7CFB;&#x7EDF;&#x5F02;&#x5E38;");
        return modelAndView;
    }

    /**
     * 拦截捕捉自定义异常 CustomException.class
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = CustomException.class)
    public ModelAndView customErrorHandler(CustomException ex) {
//        LogHelper.writeException(this.getClass().getName(), new Exception(ex.getMsg()), ex.getBaseInfo());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(DEFAULT_ERROR_VIEW);
        modelAndView.addObject("code", ex.getCode());
        modelAndView.addObject("msg", ex.getMsg());
        return modelAndView;
    }
}