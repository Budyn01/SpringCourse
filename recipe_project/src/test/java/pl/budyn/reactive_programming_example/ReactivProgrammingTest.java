package pl.budyn.reactive_programming_example;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.test.web.client.ExpectedCount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * Created by Budyn on 31.03.2018.
 */
@Slf4j
public class ReactivProgrammingTest {
    Person michael = new Person("Michael", "Weston");
    Person fiona = new Person("Fiona", "Glaneman");
    Person sam = new Person("Sam", "Gamdzi");
    Person jesse = new Person("Jesse", "Porter");

    @Test
    public void monoTests() throws Exception {
//      Creating new person mono
        Mono<Person> personMono = Mono.just(michael);

//      Get peron object from mono publisher
        Person person = personMono.block();

//      Log it
        log.info(person.sayMyName());
    }

    @Test
    public void monoTransformTest() throws Exception {
        Mono<Person> personMono = Mono.just(fiona);

        PersonCommand personCommand = personMono.map(PersonCommand::new).block();

        log.info(personCommand.sayMyName());
    }

    @Test(expected = NullPointerException.class)
    public void monoFilterTest() throws Exception {
        Mono<Person> personMono = Mono.just(sam);
        Person sam = personMono.filter(person -> person.getFirstName().equalsIgnoreCase("foo")).block();
        log.info(sam.sayMyName());
    }

    @Test
    public void fluxTest() throws Exception {
        Flux<Person> people = Flux.just(michael, fiona, sam, jesse);
        people.subscribe(person -> log.info(person.sayMyName()));
    }

    @Test
    public void fluxFilterTest() throws Exception {
        Flux<Person> people = Flux.just(michael, fiona, sam, jesse);
        people.filter(person -> person.getFirstName().equalsIgnoreCase(fiona.getFirstName())).subscribe(person -> log.info(person.sayMyName()));
    }

    @Test
    public void fluxDelayNoOutputTest() throws Exception {
        Flux<Person> people = Flux.just(michael, fiona, sam, jesse);
        people.delayElements(Duration.ofSeconds(1)).subscribe(person -> log.info(person.sayMyName()));
    }

    @Test
    public void fluxDelayTest() throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Flux<Person> people = Flux.just(michael, fiona, sam, jesse);
        people.delayElements(Duration.ofSeconds(1))
                .doOnComplete(countDownLatch::countDown)
                .subscribe(person -> log.info(person.sayMyName()));
        countDownLatch.await();
    }

    @Test
    public void fluxDelayFilterTest() throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Flux<Person> people = Flux.just(michael, fiona, sam, jesse);

        people.delayElements(Duration.ofSeconds(1))
                .filter(person -> person.getFirstName().contains("i"))
                .doOnComplete(countDownLatch::countDown)
                .subscribe(person -> log.info(person.sayMyName()));
        countDownLatch.await();
    }




}