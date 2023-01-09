package pres.ocean.jmx.demo.Mbean;

/**
 * @Description
 * @Author ocean_wll
 * @Date 2023/1/9 10:36
 */
public interface HelloMBean {
    
    String getName();

    void setName(String name);

    String getAge();

    void setAge(String age);

    void helloWorld();

    void helloWorld(String str);

    void getTelephone();
}
