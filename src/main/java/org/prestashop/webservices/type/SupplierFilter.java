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


public class SupplierFilter {
    
    private String id;
    private String linkRewrite;
    private String name;
    private String active;
    private String dateAdd;
    private String dateUpd;
    private String description;
    private String metaTitle;
    private String metaDescription;
    private String metaKeywords;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[link_rewrite]")
    public String getLinkRewrite() {
        return linkRewrite;
    }

    public void setLinkRewrite(String filter) {
        this.linkRewrite = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
    }
    
    @QueryParam(value="filter[date_add]")
    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String filter) {
        this.dateAdd = filter;
    }
    
    @QueryParam(value="filter[date_upd]")
    public String getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(String filter) {
        this.dateUpd = filter;
    }
    
    @QueryParam(value="filter[description]")
    public String getDescription() {
        return description;
    }

    public void setDescription(String filter) {
        this.description = filter;
    }
    
    @QueryParam(value="filter[meta_title]")
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String filter) {
        this.metaTitle = filter;
    }
    
    @QueryParam(value="filter[meta_description]")
    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String filter) {
        this.metaDescription = filter;
    }
    
    @QueryParam(value="filter[meta_keywords]")
    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String filter) {
        this.metaKeywords = filter;
    }
    
}
