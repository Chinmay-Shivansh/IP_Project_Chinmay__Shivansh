## IP_Project_Chinmay__Shivansh

None of your business, this is a school project. Keep out

# Internal
Adding ImageIcons to components:  

1)Open properties of componenet (right-click).  

2)Click the three dots near icon and select custom code.  

3)Enter this in custom code:  

    new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/<image-name-with-extension>")) 
    
 For example 
 
    new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/Billing_background.jpg"))  
    
   
:D
