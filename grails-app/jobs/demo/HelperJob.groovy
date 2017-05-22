package demo

class HelperJob {
    static triggers = {
      simple repeatInterval: 5000l
    }

    SomeBean someBean

    def execute() {
        someBean.doit()
    }
}
