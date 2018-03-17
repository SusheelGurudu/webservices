/**
 * 
 */
package com.perskbox.currencyconvert;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.util.UrlPathHelper;

/**
 * 
 * File: WebConfig.java
 * 
 * Description: This is Config Class for Web.
 * 
 * 
 * 
 * Developers:
 * 
 * @author susheel.reddy
 * 
 * 
 *         Last Modified By: @author $Author:$
 * 
 * 
 * @version $Revision:$
 * 
 *          Copyright (c) 2017 Advance Stores, Inc. All Rights Reserved
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter
{
    /*
     * (non-Javadoc)
     * 
     * @see
     * org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configurePathMatch(org.springframework.
     * web.servlet.config.annotation.PathMatchConfigurer)
     */
    @Override
    public void configurePathMatch(final PathMatchConfigurer configurer)
    {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }

}
