# ActiveViam_Problem_1

# Assumptions
Historical values is a set series of stock values. Stated I did not need to retrieve, compute or calculate these values <br/>
User input would be the confidence level, this was the configurable parameter mentioned.

# Solution 
Steps I thought of and executed for calculating the Value at Risk for the historical values 

<ol>
 <li>Calculate the daily periodic return of how much the stock changed from the previous day</li>
      <ol>
          <li>Done by taking the natural log of the ratio of the current historical price and historical price of day before</li>
          <li>Goal of this is to get the percentage change of yesterdays stock price and todays stock price across all values</li>
          <li>These values are stored in an Arraylist</li>
      </ol>
 <li>Get the percentile of the calculated periodic return based off the confidence value</li>
 <ol>
    <li>Percentile was calculated with the nearest rank formula and method </li>
    <img src = "https://i.stack.imgur.com/empSB.jpg"/>
 </ol>
</ol>
