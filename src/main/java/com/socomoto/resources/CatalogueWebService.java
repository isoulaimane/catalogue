package com.socomoto.resources;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.socomoto.dto.SearchDto;

/**
 * @Author mahdchek.
 */



@RestController
public class CatalogueWebService {




    @RequestMapping("/catalogue")
    public String catalogue(){
        return "catalogue";
    }

    @RequestMapping("/search")
    public List<Article> search(SearchDto searchcriteriaDto){

        // recherche

        return null;
    }

}
