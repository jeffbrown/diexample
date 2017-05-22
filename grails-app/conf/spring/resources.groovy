import demo.MessageHelper
import demo.SomeBean

beans = {
    messageHelper MessageHelper
    someBean(SomeBean, ref('messageHelper'), application.config.getProperty('demo.magic.number', Integer, 0)) { bean ->
        bean.autowire = 'byName'
    }
}
