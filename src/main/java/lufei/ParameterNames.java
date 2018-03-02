package lufei;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterNames {
    //很长一段时间里，Java程序员一直在发明不同的方式使得方法参数的名字能保留在Java字节码中，并且能够在运行时获取它们（比如，Paranamer类库）。最终，在Java 8中把这个强烈要求的功能添加到语言层面（通过反射API与Parameter.getName()方法）与字节码文件（通过新版的javac的–parameters选项）中。
    //如果使用–parameters参数来编译这个类，程序的结构会有所不同（参数的真实名字将会显示出来）：
    public static void main(String[] args){
        try {
            Method method = ParameterNames.class.getMethod("main", String[].class);
            for(final Parameter parameter : method.getParameters()){
                System.out.println(parameter.getName());
            }
        }catch (Exception ex){};

    }
}
