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

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
public class WeightRange implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_carrier", required = true)
    protected Integer idCarrier;
    
    @XmlElement(name = "delimiter1", required = true)
    protected BigDecimal delimiter1;
    
    @XmlElement(name = "delimiter2", required = true)
    protected BigDecimal delimiter2;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getIdCarrier() {
        return idCarrier;
    }
    
    public void setIdCarrier(Integer idCarrier) {
        this.idCarrier = idCarrier;
    }
    
    public BigDecimal getDelimiter1() {
        return delimiter1;
    }
    
    public void setDelimiter1(BigDecimal delimiter1) {
        this.delimiter1 = delimiter1;
    }
    
    public BigDecimal getDelimiter2() {
        return delimiter2;
    }
    
    public void setDelimiter2(BigDecimal delimiter2) {
        this.delimiter2 = delimiter2;
    }
    
}
