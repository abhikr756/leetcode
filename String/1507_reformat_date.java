class Solution {
    public String reformatDate(String date) {
        String[] dataArray = date.split(" ");
        String year = dataArray[2];
        String month = dataArray[1];
        String day = dataArray[0];
        
        String newMonth = getNewMonth(month);
        
        String newDay = null;
        if(day.length() == 3) {
            newDay = "0" + day.substring(0, 1);
        } else {
            newDay = day.substring(0, 2);
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(year).append(newMonth).append(newDay);
        
        return sb.toString();
    }
    
    
    private String getNewMonth(String month) {
        switch(month) {
            case "Jan":
                return "-01-";
            case "Feb":
                return "-02-";
            case "Mar":
                return "-03-";
            case "Apr":
                return "-04-";
            case "May":
                return "-05-";
            case "Jun":
                return "-06-";
            case "Jul":
                return "-07-";
            case "Aug":
                return "-08-";
            case "Sep":
                return "-09-";
            case "Oct":
                return "-10-";
            case "Nov":
                return "-11-";
            case "Dec":
                return "-12-";                
        }
        
        return null;

    }
}