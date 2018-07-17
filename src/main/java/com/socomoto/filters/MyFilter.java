package com.socomoto.filters;

import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import com.socomoto.entities.Player;
import com.socomoto.repositories.PlayerRepository;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author mahdchek.
 */


@Component
@Slf4j
public class MyFilter extends GenericFilterBean {



    @Autowired
    PlayerRepository repo;

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
      throws IOException, ServletException {

      chain.doFilter(request, response);

    }
}
