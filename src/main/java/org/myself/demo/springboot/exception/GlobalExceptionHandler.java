package org.myself.demo.springboot.exception;

import javax.servlet.http.HttpServletRequest;

import org.myself.demo.springboot.dto.RespInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = ViewException.class)
    public ModelAndView viewErrorHandler(HttpServletRequest req, ViewException e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }

    @ExceptionHandler(value = JsonException.class)
    @ResponseBody
    public RespInfo<String> jsonErrorHandler(HttpServletRequest req, JsonException e) throws Exception {
        RespInfo<String> resp = new RespInfo<String>();
       
        resp.setErrorCode(e.getCode());
        resp.setErrorMsg(e.getMessage());
        resp.setData("Some Data");
        
        return resp;
    }
    
}