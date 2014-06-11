/**********************************************************************
Copyright (c) 2005 Andy Jefferson and others. All rights reserved.
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
package org.datanucleus.samples.serialised;

import java.io.Serializable;

/**
 * Sample PC class that is stored as serialised inside another object.
 * 
 * @version $Revision: 1.1 $
 */
public class SerialisedObject implements Serializable
{
    private static final long serialVersionUID = -6713574270418211774L;
    private String description;

    public SerialisedObject(String desc)
    {
        this.description = desc;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String desc)
    {
        this.description = desc;
    }
}