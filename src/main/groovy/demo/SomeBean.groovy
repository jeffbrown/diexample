package demo

class SomeBean {

    protected MessageHelper messageHelper
    protected int someNumber

    SomeBean(MessageHelper helper, int someNumber) {
        messageHelper = helper
        this.someNumber = someNumber
    }

    void doit() {
        messageHelper.logMessage "Magic Number: $someNumber"
    }
}
