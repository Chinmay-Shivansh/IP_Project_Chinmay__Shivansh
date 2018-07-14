## IP_Project_Chinmay__Shivansh

None of your business, this is a school project. Keep out

# Internal
Adding ImageIcons to components:  

> Add image to Resources package.  

> Open properties of component (right-click).  

> Click the three dots near icon and select custom code.  

> Enter this in custom code:  

    new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/<image-name-with-extension>")) 
    
 For example 
 
    new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/Billing_background.jpg"))  
    
   
:D
