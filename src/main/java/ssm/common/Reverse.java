package ssm.common;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



public class Reverse {
    public void generator() throws Exception {

        List<String> warnings = new ArrayList<String>();
        File inputFile = new File("src\\main\\resources\\common-reverse\\reverseConfig.xml");
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(inputFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator generator = new MyBatisGenerator(config, callback, warnings);
        generator.generate(null);
    }

    public static void main(String[] args) {
        try {
            Reverse r = new Reverse();
            r.generator();
            System.out.println("完成");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

