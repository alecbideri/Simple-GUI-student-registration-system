package DAO;
import java.sql.* ;
import MODEL.MODEL_REG;
import java.util.*;
public class DAO_REG {
    String url = "jdbc:mysql://localhost:3306/registration";
    String username = "root";
    String password = "Alecb200@.";
    
    public String insert(MODEL_REG obj){
        
        try{
            Connection con = DriverManager.getConnection(url , username , password);
            String insert = "insert into registration(department,module,registration,names, sex)values(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(insert);
            
            st.setString(1, obj.getDepartment());
            st.setString(2, obj.getModule());
            st.setString(3, obj.getRegistration());
            st.setString(4, obj.getName());
            st.setString(5, obj.getSex());
            
            int check = st.executeUpdate();
            
            if (check!=0){
                return "data recorded successfully";
            }else {
                return "data not recorded";
            }
            
        }catch (Exception e){
            e.printStackTrace();
            return "server error";
        }
    }
    
    public List<MODEL_REG> display_all(){
        List <MODEL_REG> regs  = new ArrayList<>();
        try {
            
            Connection con = DriverManager.getConnection(url , username , password);
            String select_all = "select * from registration";
            PreparedStatement st = con.prepareStatement(select_all);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                MODEL_REG reg = new MODEL_REG();
                reg.setId(rs.getInt("id"));
                reg.setDepartment(rs.getString("department"));
                reg.setModule(rs.getString("module"));
                reg.setRegistration(rs.getString("registration"));
                reg.setName(rs.getString("names"));
                reg.setSex(rs.getString("sex"));
                
                regs.add(reg);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
        return regs;
    }
    
}
