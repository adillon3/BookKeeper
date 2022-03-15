=========================================================
______             _    _   __
| ___ \           | |  | | / /                          
| |_/ / ___   ___ | | _| |/ /  ___  ___ _ __   ___ _ __ 
| ___ \/ _ \ / _ \| |/ /    \ / _ \/ _ \ '_ \ / _ \ '__|
| |_/ / (_) | (_) |   <| |\  \  __/  __/ |_) |  __/ |   
\____/ \___/ \___/|_|\_\_| \_/\___|\___| .__/ \___|_|   
                                       | |              
                                       |_|
=========================================================

BookKeeper is a program that allows novel writers and dungeon masters to keep track of the world's and stories they
create.

=========================================================
3-14 NOTES
=========================================================
Users can input the data for one of their characters using the UI.  Certain fields have two options for input methods.
For example, hair color by default is chosen from a list of options.  If the user is not satisfied with any of these
options, they can select "Other, Please Specify".  This will bring up a text entry box for them to enter a new hair
color.  If they go back and select another option, the text box will disappear and be cleared.  This is the case for
gender, sexuality, race-species, race-skin color, hair color, and eye color.

Bugs and unimplemented features
- The database is not yet set up.  Rather than saving data to the database, the data is currently output to the console.
- When users "save" the info to the database, the data also persists in the UI.  In future versions this page will
disappear and return users to different page (a viewing page, rather than an edit page).  Users can "add" multiple
characters by pressing the "save" button multiple times.  Users can edit the page in between adding characters.
- Screen always opens very small, make it full screen.
- Scroll bar moves rather slowly.
- Age is not required to be an integer value, allowing characters to have "Unknown" or ranges, if the author hasn't decided yet.
- Character name doesn't currently need to be specified, in the future, it will as the name will be the primary key for
the database’s