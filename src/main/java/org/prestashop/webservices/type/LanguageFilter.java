/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.prestashop.webservices.type;

import javax.ws.rs.QueryParam;


public class LanguageFilter {
    
    private String id;
    private String name;
    private String isoCode;
    private String languageCode;
    private String active;
    private String isRtl;
    private String dateFormatLite;
    private String dateFormatFull;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[iso_code]")
    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String filter) {
        this.isoCode = filter;
    }
    
    @QueryParam(value="filter[language_code]")
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String filter) {
        this.languageCode = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
    }
    
    @QueryParam(value="filter[is_rtl]")
    public String getIsRtl() {
        return isRtl;
    }

    public void setIsRtl(String filter) {
        this.isRtl = filter;
    }
    
    @QueryParam(value="filter[date_format_lite]")
    public String getDateFormatLite() {
        return dateFormatLite;
    }

    public void setDateFormatLite(String filter) {
        this.dateFormatLite = filter;
    }
    
    @QueryParam(value="filter[date_format_full]")
    public String getDateFormatFull() {
        return dateFormatFull;
    }

    public void setDateFormatFull(String filter) {
        this.dateFormatFull = filter;
    }
    
}
