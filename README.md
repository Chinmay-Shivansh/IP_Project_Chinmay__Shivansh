## IP Project

 This is a school project.

# Internal
Adding <u><b>ImageIcons</b></u> to components:  

  * Add image to <b>Resources</b> package.  

  * Open <b>properties</b> of component (right-click).  

  * Click the <b>three dots</b> near icon and select <b>custom code</b>.  

  * Enter this in custom code:  

        new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/<image-name-with-extension>")) 
    
     For example 
 
        new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Resources/Billing_background.jpg"))  
    
   
  * Right click on project and click <b>Build</b>
