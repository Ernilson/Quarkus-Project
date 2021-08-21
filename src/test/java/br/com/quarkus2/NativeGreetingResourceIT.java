package br.com.quarkus2;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeGreetingResourceIT extends GreetingResource {

    // Execute the same tests but in native mode.
}