package com.anchil.collectionTest;
import java.util.*;
import java.text.SimpleDateFormat;

public class CarRental {
    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        
        int count=0;
        boolean isCarRentalAllowed=true;
        
        List<RentalTime> rent=(List<RentalTime>)rentalTimes;
        Iterator it=rent.iterator();
        for(int i=0;i<rent.size();i++)
        {
        	for(int j=i+1;j<rent.size();j++) {
        		
        		RentalTime rt=rent.get(i);
        		RentalTime rt1=rent.get(j);

        		if((rt1.getStart().after(rt.getStart()) && rt1.getStart().before(rt.getEnd())) ||(rt1.getEnd().after(rt.getStart()) && rt1.getEnd().before(rt.getEnd())))
        		{
        			count++;
        		}
        		

        	}
        }
        if(count>1){
        	isCarRentalAllowed=false;
        }
        else {
        	isCarRentalAllowed=true;
        }
        
        return isCarRentalAllowed;
        
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:10"), sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

        System.out.println(CarRental.canScheduleAll(rentalTimes));
    }
}

class RentalTime {
    private Date start, end;
    
    public RentalTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
    
    public Date getStart() {
        return this.start;
    }
    
    public Date getEnd() {
        return this.end;
    } 
}