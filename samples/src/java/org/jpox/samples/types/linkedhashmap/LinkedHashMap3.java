/**********************************************************************
Copyright (c) 2005 Andy Jefferson and others.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.



Contributions
    ...
***********************************************************************/
package org.jpox.samples.types.linkedhashmap;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.jpox.samples.types.container.MapHolder;

/**
 * Container object for LinkedHashMap tests.
 **/
public class LinkedHashMap3 implements MapHolder<String, String>
{
	private static Random r = new Random(0);
	
    private int identifierA;
    private String identifierB;

    java.util.LinkedHashMap<String, String> items=new java.util.LinkedHashMap<>();

    public LinkedHashMap3()
    {
        identifierA = r.nextInt();
        identifierB = String.valueOf(r.nextInt());
    }

    public java.util.Map<String, String> getItems()
    {
        return items;
    }

    public int getNoOfItems()
    {
        return items.size();
    }

    public String getItem(String key)
    {
        return items.get(key);
    }

    public void putItem(String key,String value)
    {
        items.put(key,value);
    }

    public void putItems(java.util.Map<String, String> m)
    {
        items.putAll(m);
    }

    public void removeItem(String key)
    {
        items.remove(key);
    }

    public void clear()
    {
        items.clear();
    }

    public boolean isEmpty()
    {
        return items.isEmpty();
    }

    public int getIdentifierA()
    {
        return identifierA;
    }

    public void setIdentifierA(int identifierA)
    {
        this.identifierA = identifierA;
    }

    public String getIdentifierB()
    {
        return identifierB;
    }

    public void setIdentifierB(String identifierB)
    {
        this.identifierB = identifierB;
    }

    public void setItems(java.util.Map<String, String> items)
    {
        this.items.clear();
        this.items.putAll(items);
    }

    public String toString()
    {
        return getClass().getName() + " : [" + items.size() + " items]";
    }

    public static class Oid implements Serializable
    {
        private static final long serialVersionUID = 1590620779422950456L;
        public int identifierA;
        public String identifierB;

        public Oid()
        {
        }

        public Oid(String s)
        {
            java.util.StringTokenizer toke = new java.util.StringTokenizer (s, "::");
            //ignore first token
            s = toke.nextToken ();
            s = toke.nextToken ();
            this.identifierA = Integer.valueOf(s).intValue();
            s = toke.nextToken ();
            this.identifierB = s;
        }

        public String toString()
        {
            return this.getClass().getName() + "::"  + identifierA + "::" + identifierB;
        }

        public int hashCode()
        {
            if (identifierB != null)
            {
                return identifierA ^ identifierB.hashCode();
            }
            else
            {
                return identifierA;
            }
        }

        public boolean equals(Object other)
        {
            if (other != null && (other instanceof Oid))
            {
                Oid k = (Oid)other;
                return k.identifierA == this.identifierA && k.identifierB.equals(this.identifierB);
            }
            return false;
        }
    }

    public Set<Entry<String, String>> getEntrySet()
    {
        return items.entrySet();
    }

    public Set<String> getKeySet()
    {
        return items.keySet();
    }

    public Collection<String> getValues()
    {
        return items.values();
    }   
    
    public boolean containsKey(String key)
    {
        return items.containsKey(key);
    }

    public boolean containsValue(String value)
    {
        return items.containsValue(value);
    }    
}