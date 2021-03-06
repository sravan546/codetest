<h1> Longest word in a sentence </h1>

For this project I used java and Maven .<b>Please install jdk 1.5 or above and maven 3.0 or above </b>

<ol type="1">
<li><h3>To Run Tests</h3>
<ol type="a">
  <li>Open terminal or dos  window</li>
  <li> Go into project root directory. Which is "codetest" directory</li>
  <li> Execute below command <pre>mvn test</pre></li>
  <li> You should see output as below <br>
    <pre> 
          -------------------------------------------------------
          T E S T S
          -------------------------------------------------------
          Running com.mastercard.EnglishSentenceServiceTest
          Tests run: 19, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.124 sec
          Running com.mastercard.EnglishSentenceConciseServiceTest
          Tests run: 19, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 sec<br>
          Results :
          Tests run: 38, Failures: 0, Errors: 0, Skipped: 0</pre></li>
  </ol></li>
  
   <li>
 
  <h3>Assumptions</h3>
  <ol type="a">
<li>When null or empty I assumed output to be empty string  and length will be 0.</li>
    <li>When input is other than English language it simply processes it as English sentence .</li>
    <li>When sentence has more than one longest word then findLongestWord() only returns first longest word in  a  sentence. </li>
   <li>However I have created bonus method called findAllLongestWord() where it will give all the longest words. I kept it as separate method because space complexity varies for both methods.</li>
<li>I have also created bonus concise versions of above exercises called findLongestWordConcise() and findAllLongestWordsConcise(). These methods are concise but space complexity increased.</li>
   </ol>
</li>
  
  <li>
 
  <h3>Classes</h3>
  <ol type="a">

   <li> Test class : This is where you can find all tests <pre> com.mastercard.EnglishSentenceServiceTest </pre> </li>
   <li> Test class for concise methods : This is where you can find all tests for concise version<pre> com.mastercard.EnglishSentenceConciseServiceTest </pre> </li>
   <li> Test suite: This is test suite for above two test classes <pre>com.mastercard.EnglishSentenceServiceSuite</pre></li>
   <li> Service class : This is where code exercise is implemented <pre> com.mastercard.service.EnglishSentenceService </pre> </li>
   <li> Service Interface : Above service class implements this interface<pre> com.mastercard.service.SentenceService </pre> </li>
   <li> Result POJO : This is POJO which is returned by service methods<pre> com.mastercard.service.LongestWordResult </pre> </li>
</ol>
</li>

 

<li>
  <h3>Time and space complexity</h3>
  <ol type="a">
    <pre>
    <li> findLongestWord()  :  Time complexity  O(N) and space complexity O(1) 
                        where N is total length of sentence</li>
    <li> findAllLongestWords() :  Time complexity O(N)  
                                                  
                                 Space complexity O(K)     K is number of words in sentence
   </li>
Concise versions
   <li> findLongestWordConcise()  : Time complexity  O(N) and space complexity O(N) </li>
  <li> findAllLongestWordsConcise()  : Time complexity  O(N) and space complexity O(N) </li>

   </pre>
  </ol>
</li>
  
  
 <li>         
<h3>For your convenience I have also included Main class which you can run to provide your own input </h3>
 <ol type="a">
   <li> Open terminal or dos prompt </li>
  <li> Go into project root directory .Which is "codetest" directory</li>
  <li> Execute below command  <pre>mvn test -Prun</pre></li>
  <li> Program will prompt you as below  <pre>Please enter the sentence:</pre></li>
  <li> Enter sentence you want to test </li>
  <li> You should see two output lines as below
  <pre>The largest word in your sentence is<br>The largest word's length is </pre>
  
  </li>
 </li>
 </ol>

</ol>



