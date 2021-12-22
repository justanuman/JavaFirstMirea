package ru.mirea.task27;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*

        return map;//напишите тут ваш код
Нам повторы не нужны

*/

public class Names {
        public static HashMap<String, String> createMap()
        {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("Solid","Snake");
            map.put("Venom","Snake");
            map.put("Liquid","Ocelot");
            map.put("Punished","Snake");
            map.put("Punished","Snake");
            map.put("Punished","Snake");
            map.put("Punished","Snake");
            map.put("Punished","Snake");
            map.put("Punished","Snake");
            return map;
        }

        public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
        {
            //напишите тут ваш код
            HashMap<String, String> copy = new HashMap<String, String>(map);
            for (Map.Entry<String, String> s : copy.entrySet())
            {
                for (Map.Entry<String, String> s2 : copy.entrySet())
                {
                    if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) removeItemFromMapByValue(map,s.getValue());
                }
            }
        }

        public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
        {
            HashMap<String, String> copy = new HashMap<String, String>(map);
            for (Map.Entry<String, String> pair: copy.entrySet())
            {
                if (pair.getValue().equals(value))
                    map.remove(pair.getKey());
            }
        }

        public static void main(String[] args) {
            HashMap<String, String> map = createMap();
            System.out.println(map);
            removeTheFirstNameDuplicates(map);
            System.out.println(map);
        }




}

