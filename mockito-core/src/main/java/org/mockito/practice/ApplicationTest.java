package org.mockito.practice;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {

	   @InjectMocks
	    RecordService recordService;
	     
	    @Mock
	    DatabaseDAO databaseMock;
	     
	    @Mock
	    NetworkDAO networkMock;
	     
	    @Test
	    public void saveTest()
	    {
	        boolean saved = recordService.save("temp.txt");
	        assertEquals(true, saved);
	         
	        verify(databaseMock, times(1)).save("temp.txt");
	        verify(networkMock, times(1)).save("temp.txt");
	    }
}
