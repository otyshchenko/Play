package spring

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.{Bean, Configuration}

@Configuration
object SpringConfig {

  @Bean
  @Qualifier
  def getCat:TestBean =  {
    val testBean = new TestBean("Alex", "Kiev")
    testBean
  }
}
