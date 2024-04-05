package MODEL;
public class MODEL_REG {
    
    int id ;
    String department ;
    String module;
    String registration ;
    String name ;
    String sex ;

    public MODEL_REG() {
    }

    public MODEL_REG(int id, String department, String module, String registration, String name, String sex) {
        this.id = id;
        this.department = department;
        this.module = module;
        this.registration = registration;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    
    
}
