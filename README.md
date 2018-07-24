## IP Project

This is a school project.

# Internal
Adding ImageIcons to components:  

  * Add image to Resources package.  

  * Open properties of component (right-click).  

  * Click the three dots near icon and select custom code.  

  * Enter this in custom code:  

    new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/<image-name-with-extension>")) 
    
 For example 
 
    new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/Billing_background.jpg"))  
    
   
  * Right click on project and click <b>Build</b>
