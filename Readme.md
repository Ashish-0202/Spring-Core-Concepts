This is a Spring Core Demo Project showing dependency injection and inversion of Control using several Annotations.

Some of the useful annotations used in the project:

@Component :We can use @Component across the application to mark the beans as Spring’s managed components

@Configuration :@Configuration is a class-level annotation indicating that an object is a source of bean definitions. @Configuration classes declare beans through @Bean -annotated methods.

@Bean :@Bean annotation which is applied on a method to specify that it returns a bean to be managed by Spring context

@Autowired :This annotation will tell to inject a dependency

@Qualifier :@Qualifier annotation, we can eliminate the issue of which bean needs to be injected if we have multiple beans.

@Primary :This annotation in Spring is used to indicate the primary bean when multiple beans of the same type are present for auto wiring

@Lazy : This will be used if we don't need to create an object of the beans which are not needed in the current execution

@Scope : The scope of a bean defines the life cycle and visibility of that bean in the contexts we use it.
