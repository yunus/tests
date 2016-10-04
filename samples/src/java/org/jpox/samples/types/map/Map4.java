/**********************************************************************
Copyright (c) 2004 Andy Jefferson and others. All rights reserved.
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
package org.jpox.samples.types.map;

import java.io.Serializable;
import java.util.Collection;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

import org.jpox.samples.types.container.AppIdUtilities;
import org.jpox.samples.types.container.ContainerItem;
import org.jpox.samples.types.container.MapHolder;

/**
 * Container object for join Map tests.
 */
public class Map4 implements MapHolder<ContainerItem, ContainerItem>
{
	private static Random r = new Random(0);
	
    private int identifierA;
    private String identifierB;

    java.util.Map<ContainerItem, ContainerItem> items = new java.util.HashMap<>();

    public Map4()
    {
        r.setSeed(AppIdUtilities.getSeed());
        identifierA = r.nextInt();
        identifierB = String.valueOf(r.nextInt());
    }

    public java.util.Map<ContainerItem, ContainerItem> getItems()
    {
        return items;
    }

    public int getNoOfItems()
    {
        return items.size();
    }

    public ContainerItem getItem(ContainerItem key)
    {
        return items.get(key);
    }

    public Set<Entry<ContainerItem, ContainerItem>> getEntrySet()
    {
        return items.entrySet();
    }

    public Set<ContainerItem> getKeySet()
    {
        return items.keySet();
    }    

    public Collection<ContainerItem> getValues()
    {
        return items.values();
    }

    public void putItem(ContainerItem key,ContainerItem item)
    {
        items.put(key,item);
    }

    public void putItems(java.util.Map<ContainerItem, ContainerItem> m)
    {
        items.putAll(m);
    }

    public void removeItem(ContainerItem key)
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

    public void setItems(java.util.Map<ContainerItem, ContainerItem> items)
    {
        this.items = items;
    }

    public boolean containsKey(ContainerItem key)
    {
        return items.containsKey(key);
    }

    public boolean containsValue(ContainerItem value)
    {
        return items.containsValue(value);
    }

    public String toString()
    {
        return getClass().getName() + " : [" + items.size() + " items]";
    }

    public static class Oid implements Serializable
    {
        private static final long serialVersionUID = -7237825413360333774L;
        public int identifierA;
        public String identifierB;

        public Oid()
        {
        }

        public Oid(String s)
        {
            java.util.StringTokenizer token = new java.util.StringTokenizer (s, "::");
            //ignore first token
            s = token.nextToken ();
            s = token.nextToken ();
            this.identifierA = Integer.valueOf(s).intValue();
            s = token.nextToken ();
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
}