/**********************************************************************
Copyright (c) 2010 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
   ...
**********************************************************************/
package org.datanucleus.samples.annotations.many_one.unidir;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Representation of a car being rented by various people.
 * Knows nothing about the people renting it (during its lifetime).
 */
@Entity
@Table(name="JPA_HIRECAR")
public class HireCar
{
    @Id
    long registrationId;
    
    String make;

    String model;
    
    public HireCar(long id, String make, String model)
    {
        this.registrationId = id;
        this.make = make;
        this.model = model;
    }

    public long getRegistrationId()
    {
        return registrationId;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String toString()
    {
        return "HireCar : [" + registrationId + "]";
    }
}