package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import com.supp.News;

public class NewsDemo {

	public static void main(String[] args) {

		List<News> listNews=Arrays.asList(
				new News(101, "Deva", "Jagadish", "Why the budget of share market is decreasing rapidly??"),
				new News(101, "Deva", "Koushik", "Due to lots of investment"),
				new News(101, "Deva", "Vaibhavi", "I havealready invested 1000000 rs"),
				new News(101, "Deva", "Sonali", "I invested 5000 but the budget is getting decrease so I'm so worried!! "),
				new News(101, "Deva", "Jagadish", "Can Anyone will reply me please??"),
				new News(101, "Deva", "Vinod", "Relax everyone..It is share market it will increase or it will decrease we cant give specific eason for thet!!!"),
				new News(101, "Deva", "Koushik", "We have to wait till budget get upto the mark..."),
				
				new News(102, "Jagadish", "Deva", "Finally they get married!!"),
				new News(102, "Jagadish", "Koushik", "I like that couple.."),
				new News(102, "Jagadish", "Vaibhavi", "Where they are going to arrange there receiption party??"),
				new News(102, "Jagadish", "Vinit", "Bangalore"),
				
				new News(103, "Vaibhavi", "Jagadish", "Abfsuvg"),
				new News(103, "Vaibhavi", "Deva", "budget kigf"),
				new News(103, "Vaibhavi", "Koushik", "jghiuj "),
				new News(103, "Vaibhavi", "Vinit", "hbifuymb"),
				
				new News(104, "Koushik", "Jagadish", "jhbfjb budget chvfuigb"),
				new News(104, "Koushik", "Koushik", "gfngn"),
				new News(104, "Koushik", "vaibhavi", "nfgmghm"),
				new News(104, "Koushik", "Sonali", "fmmgvn budget dfhugigf ghtrh")
							
				);
		
			
				Map<Object, Long> question4 = listNews.stream()
						.collect(Collectors.groupingBy(o -> o.getNewsId(),Collectors.counting()));
				System.out.println(question4);
				long max=0;
				int key=0;
				for(Entry<Object, Long> entry:question4.entrySet())
				{
					if(entry.getValue()>max)
					{
						max=entry.getValue();
						key= (int) entry.getKey();
					}
				}
				System.out.println("NewsId And Total Comments:\n"+question4); 			
				System.out.println("NewsId "+key+" got max comments that is : "+max);
				System.out.println("------------------------------------------------------------------------------");
					

				
				
				Long question5=listNews.stream()
						.filter(e->e.getCommentByUser().contains("budget")).count();
				System.out.println("Occurence of Word Budget is :"+question5);
				System.out.println("------------------------------------------------------------------------------");
				
				
				

				Map<Object, Long> question6 = listNews.stream()
						.collect(Collectors.groupingBy(e -> e.getCommentByUser(),Collectors.counting()));
						System.out.println("Comment by user and no. of comments:\n"+question6);
						long maxNumber=0;
						Object keyValue=0;
						for(Entry<Object, Long> entry:question6.entrySet())
						{							
							if(entry.getValue()>maxNumber)
							{
								maxNumber=entry.getValue();
								keyValue= entry.getKey();
							}
						}
						System.out.println("User "+keyValue+" got max number of comments that is : "+maxNumber);
						System.out.println("------------------------------------------------------------------------------");
							
				Map<Object, Long> question7 = listNews.stream()
						.collect(Collectors.groupingBy(e -> e.getCommentByUser(),Collectors.counting()));
					System.out.println("Comment by user and no. of comments:\n"+question7);
					System.out.println("------------------------------------------------------------------------------");	
				

		
		
	}
}
