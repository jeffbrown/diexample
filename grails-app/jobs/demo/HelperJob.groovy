package demo

import org.springframework.beans.factory.annotation.Autowired

class HelperJob {
    static triggers = {
      simple repeatInterval: 5000l
    }

    @Autowired
    SomeBean someBean

    def execute() {
        someBean.doit()
    }
}
