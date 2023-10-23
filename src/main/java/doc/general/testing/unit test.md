# unit test in java ee
## definition
Unit testing is a software testing method by which individual units of source code, sets of one or more computer program modules together with associated control data, usage procedures, and operating procedures, are tested to determine whether they are fit for use.
## unit test framework
### junit
#### junit 4
##### junit 4 annotation
| Annotation   | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
|--------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| @Test        | The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case. To run the method, JUnit first constructs a fresh instance of the class then invokes the annotated method. Any exceptions thrown by the test will be reported by JUnit as a failure. If no exceptions are thrown, the test is assumed to have succeeded. The Test annotation supports two optional parameters. The first, expected, declares that a test method should throw an exception. If it doesn't throw an exception or if it throws a different exception than the one declared, the test fails. For example, the following test succeeds: @Test(expected=IndexOutOfBoundsException.class) public void outOfBounds() { new ArrayList<Object>().get(1); } The second optional parameter, timeout, causes a test to fail if it takes longer than a specified amount of clock time (measured in milliseconds). The following test fails: @Test(timeout=100) public void infinity() { while(true); } |
| @Before      | When writing tests, it is common to find that several tests need similar objects created before they can run. Annotating a public void method with @Before causes that method to be run before the Test method. The @Before methods of superclasses will be run before those of the current class, unless they are overridden in the current class. No other ordering is defined.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| @After       | If you allocate external resources in a Before method you need to release them after the test runs. Annotating a public void method with @After causes that method to be run after the Test method. All @After methods are guaranteed to run even if a Before or Test method throws an exception. The @After methods declared in superclasses will be run after those of the current class, unless they are overridden in the current class. No other ordering is defined.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| @BeforeClass | Sometimes several tests need to share computationally expensive setup (like logging into a database). While this can compromise the independence of tests, sometimes it is a necessary optimization. Annotating a public static void no-arg method with @BeforeClass causes it to be run once before any of the test methods in the class. The @BeforeClass methods of superclasses will be run before those the current class.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |

##### junit 4 assert
| Method                                                     | Description                                                     |
|------------------------------------------------------------|-----------------------------------------------------------------|
| assertEquals(boolean expected, boolean actual)             | Tests if two boolean values are the same.                       |
| assertEquals(byte expected, byte actual)                   | Tests if two byte values are the same.                          |
| assertEquals(char expected, char actual)                   | Tests if two char values are the same.                          |
| assertEquals(double expected, double actual, double delta) | Tests if two double values are the same.                        |
| assertEquals(float expected, float actual, float delta)    | Tests if two float values are the same.                         |
| assertEquals(int expected, int actual)                     | Tests if two int values are the same.                           |
| assertEquals(long expected, long actual)                   | Tests if two long values are the same.                          |
| assertEquals(Object expected, Object actual)               | Tests if two objects are the same.                              |
| assertEquals(String expected, String actual)               | Tests if two Strings are the same.                              |
| assertNotNull(Object object)                               | Tests if an object isn't null.                                  |
| assertNull(Object object)                                  | Tests if an object is null.                                     |
| assertSame(Object expected, Object actual)                 | Tests if two object references point to the same object.        |
| assertNotSame(Object expected, Object actual)              | Tests if two object references do not point to the same object. |
| assertTrue(boolean condition)                              | Checks that a condition is true.                                |
| assertFalse(boolean condition)                             | Checks that a condition is false.                               |
| fail()                                                     | Fails a test with no message.                                   |
| fail(String message)                                       | Fails a test with the given message.                            |


## mock

### definition
In object-oriented programming, mock objects are simulated objects that mimic the behavior of real objects in controlled ways, most often as part of a software testing initiative.
### mockito
#### mockito annotation
| Annotation                                | Description                                                                                                      |
|-------------------------------------------|------------------------------------------------------------------------------------------------------------------|
| @Mock                                     | Creates mock instance                                                                                            |
| @Spy                                      | Creates spy instance                                                                                             |
| @InjectMocks                              | Creates mock instance and injects mocks/spies created with the @Mock or @Spy annotation into it.                 |
| @Captor                                   | Creates argument captor instance                                                                                 |
| @Rule                                     | Creates test rule instance                                                                                       |
| @Captor                                   | Creates argument captor instance                                                                                 |
| @RunWith                                  | Runs the test with specified runner                                                                              |
| @Test                                     | Marks a method as a test method                                                                                  |
| @Before                                   | Runs before each test method in the class                                                                        |
| @After                                    | Runs after each test method in the class                                                                         |
| @BeforeClass                              | Runs before any test method in the class                                                                         |
| @AfterClass                               | Runs after any test method in the class                                                                          |
| @Ignore                                   | Marks that the test should be ignored                                                                            |
| @Test(expected)                           | Fails if the method does not throw the named exception                                                           |
| @Test(timeout)                            | Fails if the method takes longer than the specified number of milliseconds                                       |
| @Test(expected, timeout)                  | Fails if the method takes longer than the specified number of milliseconds or does not throw the named exception |
| @Test public void test() throws Exception | Tests that the method throws the named exception                                                                 |
| @Test public void test() throws Throwable | Tests that the method throws the named exception                                                                 |

#### mockito method
| Method                                                                                     | Description                                                                                 |
|--------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|
| mock(Class classToMock)                                                                    | Creates mock instance of given class                                                        |
| mock(Class classToMock, String name)                                                       | Creates mock instance of given class with given name                                        |
| mock(Class classToMock, Answer defaultAnswer)                                              | Creates mock instance of given class with given answer                                      |
| mock(Class classToMock, String name, Answer defaultAnswer)                                 | Creates mock instance of given class with given name and answer                             |
| mock(Class classToMock, MockSettings mockSettings)                                         | Creates mock instance of given class with given mock settings                               |
| mock(Class classToMock, InvocationHandler handler)                                         | Creates mock instance of given class with given invocation handler                          |
| mock(Class classToMock, MockSettings mockSettings, InvocationHandler handler)              | Creates mock instance of given class with given mock settings and invocation handler        |
| mockStatic(Class classToMock)                                                              | Creates static mock instance of given class                                                 |
| mockStatic(Class classToMock, String name)                                                 | Creates static mock instance of given class with given name                                 |
| mockStatic(Class classToMock, Answer defaultAnswer)                                        | Creates static mock instance of given class with given answer                               |
| mockStatic(Class classToMock, String name, Answer defaultAnswer)                           | Creates static mock instance of given class with given name and answer                      |
| mockStatic(Class classToMock, MockSettings mockSettings)                                   | Creates static mock instance of given class with given mock settings                        |
| mockStatic(Class classToMock, InvocationHandler handler)                                   | Creates static mock instance of given class with given invocation handler                   |
| mockStatic(Class classToMock, MockSettings mockSettings, InvocationHandler handler)        | Creates static mock instance of given class with given mock settings and invocation handler |
| spy(Class classToSpy)                                                                      | Creates spy instance of given class                                                         |
| spy(Object objectToSpy)                                                                    | Creates spy instance of given object                                                        |
| spy(Class classToSpy, String name)                                                         | Creates spy instance of given class with given name                                         |
| spy(Object objectToSpy, String name)                                                       | Creates spy instance of given object with given name                                        |
| spy(Class classToSpy, Answer defaultAnswer)                                                | Creates spy instance of given class with given answer                                       |
| spy(Object objectToSpy, Answer defaultAnswer)                                              | Creates spy instance of given object with given answer                                      |
| spy(Class classToSpy, String name, Answer defaultAnswer)                                   | Creates spy instance of given class with given name and answer                              |
| spy(Object objectToSpy, String name, Answer defaultAnswer)                                 | Creates spy instance of given object with given name and answer                             |
| spy(Class classToSpy, MockSettings mockSettings)                                           | Creates spy instance of given class with given mock settings                                |
| spy(Object objectToSpy, MockSettings mockSettings)                                         | Creates spy instance of given object with given mock settings                               |
| spy(Class classToSpy, InvocationHandler handler)                                           | Creates spy instance of given class with given invocation handler                           |
| spy(Object objectToSpy, InvocationHandler handler)                                         | Creates spy instance of given object with given invocation handler                          |
| spy(Class classToSpy, MockSettings mockSettings, InvocationHandler handler)                | Creates spy instance of given class with given mock settings and invocation handler         |
| spy(Object objectToSpy, MockSettings mockSettings, InvocationHandler handler)              | Creates spy instance of given object with given mock settings and invocation handler        |
| spy(Class classToSpy, String name, MockSettings mockSettings)                              | Creates spy instance of given class with given name and mock settings                       |
| spy(Object objectToSpy, String name, MockSettings mockSettings)                            | Creates spy instance of given object with given name and mock settings                      |
| spy(Class classToSpy, String name, InvocationHandler handler)                              | Creates spy instance of given class with given name and invocation handler                  |
| spy(Object objectToSpy, String name, InvocationHandler handler)                            | Creates spy instance of given object with given name and invocation handler                 |
| spy(Class classToSpy, String name, MockSettings mockSettings, InvocationHandler handler)   | Creates spy instance of given class with given name, mock settings and invocation handler   |
| spy(Object objectToSpy, String name, MockSettings mockSettings, InvocationHandler handler) | Creates spy instance of given object with given name, mock settings and invocation handler  |
| verify(mock)                                                                               | Verifies certain behavior happened once                                                     |
| verify(mock, times(n))                                                                     | Verifies certain behavior happened n times                                                  |
| verify(mock, atLeastOnce())                                                                | Verifies certain behavior happened at least once                                            |
| verify(mock, atLeast(n))                                                                   | Verifies certain behavior happened at least n times                                         |
| verify(mock, atMost(n))                                                                    | Verifies certain behavior happened at most n times                                          |
| verify(mock, never())                                                                      | Verifies certain behavior never happened                                                    |
| verify(mock, only())                                                                       | Verifies certain behavior happened only once                                                |
| verifyNoMoreInteractions(mock)                                                             | Verifies that no interactions happened on given mock                                        |
| verifyZeroInteractions(mock)                                                               | Verifies that zero interactions happened on given mock                                      |
| verify(mock, description)                                                                  | Verifies certain behavior happened once                                                     |
| verify(mock, times(n), description)                                                        | Verifies certain behavior happened n times                                                  |
| verify(mock, atLeastOnce(), description)                                                   | Verifies certain behavior happened at least once                                            |
| verify(mock, atLeast(n), description)                                                      | Verifies certain behavior happened at least n times                                         |
| verify(mock, atMost(n), description)                                                       | Verifies certain behavior happened at most n times                                          |
| verify(mock, never(), description)                                                         | Verifies certain behavior never happened                                                    |
| verify(mock, only(), description)                                                          | Verifies certain behavior happened only once                                                |
| verifyNoMoreInteractions(mock, description)                                                | Verifies that no interactions happened on given mock                                        |
| verifyZeroInteractions(mock, description)                                                  | Verifies that zero interactions happened on given mock                                      |
| verify(mock, timeout(millis).times(n))                                                     | Verifies certain behavior happened n times within given time span                           |
| verify(mock, timeout(millis).atLeastOnce())                                                | Verifies certain behavior happened at least once within given time span                     |
| verify(mock, timeout(millis).atLeast(n))                                                   | Verifies certain behavior happened at least n times within given time span                  |
| verify(mock, timeout(millis).atMost(n))                                                    | Verifies certain behavior happened at most n times within given time span                   |
| verify(mock, timeout(millis).never())                                                      | Verifies certain behavior did not happen within given time span                             |
| verify(mock, timeout(millis).only())                                                       | Verifies certain behavior happened exactly once within given time span                      |
| verifyNoMoreInteractions(mock, timeout(millis))                                            | Verifies that no interactions happened on given mock within given time span                 |
| verifyZeroInteractions(mock, timeout(millis))                                              | Verifies that zero interactions happened on given mock within given time span               |
| verify(mock, timeout(millis).description)                                                  | Verifies certain behavior happened once within given time span                              |
| verify(mock, timeout(millis).times(n), description)                                        | Verifies certain behavior happened n times within given time span                           |
| verify(mock, timeout(millis).atLeastOnce(), description)                                   | Verifies certain behavior happened at least once within given time span                     |
| verify(mock, timeout(millis).atLeast(n), description)                                      | Verifies certain behavior happened at least n times within given time span                  |
| verify(mock, timeout(millis).atMost(n), description)                                       | Verifies certain behavior happened at most n times within given time span                   |
| verify(mock, timeout(millis).never(), description)                                         | Verifies certain behavior did not happen within given time span                             |
| verify(mock, timeout(millis).only(), description)                                          | Verifies certain behavior happened exactly once within given time span                      |
| verifyNoMoreInteractions(mock, timeout(millis), description)                               | Verifies that no interactions happened on given mock within given time span                 |
| verifyZeroInteractions(mock, timeout(millis), description)                                 | Verifies that zero interactions happened on given mock within given time span               |
| when(methodCall)                                                                           | Defines return value for given method call                                                  |
| when(methodCall).thenAnswer(answer)                                                        | Defines answer to be returned for given method call                                         |
| when(methodCall).thenCallRealMethod()                                                      | Defines real method to be called for given method call                                      |

#### mockito argument matcher
| Method                                   | Description                                 |
|------------------------------------------|---------------------------------------------|
| any(Class classToMatch)                  | Matches any object of given class           |
| any()                                    | Matches any object                          |
| anyBoolean()                             | Matches any boolean                         |
| anyByte()                                | Matches any byte                            |
| anyChar()                                | Matches any char                            |
| anyDouble()                              | Matches any double                          |
| anyFloat()                               | Matches any float                           |
| anyInt()                                 | Matches any int                             |
| anyLong()                                | Matches any long                            |
| anyShort()                               | Matches any short                           |
| anyString()                              | Matches any string                          |
| anyCollection()                          | Matches any collection                      |
| anyList()                                | Matches any list                            |
| anyMap()                                 | Matches any map                             |
| anySet()                                 | Matches any set                             |
| anyVararg()                              | Matches any vararg                          |
| anyIterable()                            | Matches any iterable                        |
| anyIterator()                            | Matches any iterator                        |
| anyEnumeration()                         | Matches any enumeration                     |
| anyObject()                              | Matches any object                          |
| anyObject(Class type)                    | Matches any object of given type            |
| anyListOf(Class type)                    | Matches any list of given type              |
| anyMapOf(Class keyType, Class valueType) | Matches any map of given key and value type |
| anySetOf(Class elementType)              | Matches any set of given element type       |

