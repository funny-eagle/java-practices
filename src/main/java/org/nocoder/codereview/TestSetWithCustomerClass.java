package org.nocoder.codereview;

import java.util.HashSet;
import java.util.Set;

/**
 * 使用Set中的元素是自定义对象时，必须重写自定义对象的equals和hashcode方法
 * 因为Set是无重复元素的集合，如果不重写equals，可能会导致出现重复数据
 *
 * @author yangjinlong
 * created on 2018/5/31
 */
public class TestSetWithCustomerClass {

    public static void main(String[] args) {
        Province province = new Province();
        Set<City> citySet = province.getCitySet();
        citySet.add(new City(1, "成都"));
        citySet.add(new City(1, "成都"));
        citySet.add(new City(2, "北京"));
        citySet.add(new City(2, "北京"));
        System.out.println(province.getCitySet());
    }
}


class Province {
    private final Set<City> citySet = new HashSet<City>();

    public Set<City> getCitySet() {
        return citySet;
    }
}

class City {
    private final int id;
    private final String name;

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof City) {
            return this.getId() == ((City) obj).getId();
        }
        return false;

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + id;
        return result;
    }
}