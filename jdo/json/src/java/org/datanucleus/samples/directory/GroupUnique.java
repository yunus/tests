/**********************************************************************
Copyright (c) 2008 Erik Bengtson and others. All rights reserved.
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
package org.datanucleus.samples.directory;

import java.io.Serializable;

/**
 * Group of Users.
 */
public class GroupUnique implements Serializable
{
    private static final long serialVersionUID = 763626666101321390L;
    String name;
    protected Person member;

    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public Person getMember()
    {
        return member;
    }
    
    public void setMember(Person member)
    {
        this.member = member;
    }
}