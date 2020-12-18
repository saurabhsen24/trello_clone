# Trello Clone

This app is created in Kotlin and its a project management tool we can create new boards and assign members to it and each member will be assigned work to complete a particular feature by creating card inside board. Once the feature is completed we can delete that card. We can also show the due date so that we can finish the feature on time.

I have used Firebase for login and signup and all the data will be stored in Cloud Firestore (https://console.firebase.google.com/)

# Project Structure

    📦src
    ┣ 📂androidTest
    ┃ ┗ 📂java
    ┃ ┃ ┗ 📂com
    ┃ ┃ ┃ ┗ 📂saurabhsen
    ┃ ┃ ┃ ┃ ┗ 📂projectmanagementapp
    ┃ ┃ ┃ ┃ ┃ ┗ 📜ExampleInstrumentedTest.kt
    ┣ 📂main
    ┃ ┣ 📂assets
    ┃ ┃ ┣ 📜carbon_bl.ttf
    ┃ ┃ ┗ 📜trello.png
    ┃ ┣ 📂java
    ┃ ┃ ┗ 📂com
    ┃ ┃ ┃ ┗ 📂saurabhsen
    ┃ ┃ ┃ ┃ ┗ 📂projectmanagementapp
    ┃ ┃ ┃ ┃ ┃ ┣ 📂adapters
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardItemsAdapter.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CardMemberListItemsAdapter.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CardsListItemAdapter.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LabelColorListItemsAdapter.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberListItemsAdapter.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TaskListItemAdapter.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂api
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NotificationAPI.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RetrofitInstance.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂fcm
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MyFirebaseMessagingService.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂firebase
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜FirestoreClass.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂models
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Board.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Card.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NotificationData.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PushNotification.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SelectedMembers.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Task.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜User.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜NotificationRepository.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂ui
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂activities
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CardDetailsActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CreateBoardActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜IntroActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MembersActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MyProfileActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SigninActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SignupActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SplashActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TaskListActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂dialogs
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LabelColorListDialog.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MembersListDialog.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂utils
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Constants.kt
    ┃ ┃ ┃ ┃ ┃ ┗ 📂viewmodel
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NotificationViewModel.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜NotificationViewModelProviderFactory.kt
    ┃ ┣ 📂res
    ┃ ┃ ┣ 📂drawable
    ┃ ┃ ┃ ┣ 📜ic_action_navigation_menu.png
    ┃ ┃ ┃ ┣ 📜ic_add_member.png
    ┃ ┃ ┃ ┣ 📜ic_background.png
    ┃ ┃ ┃ ┣ 📜ic_black_color_back_24dp.xml
    ┃ ┃ ┃ ┣ 📜ic_board_place_holder.png
    ┃ ┃ ┃ ┣ 📜ic_cancel.png
    ┃ ┃ ┃ ┣ 📜ic_delete.png
    ┃ ┃ ┃ ┣ 📜ic_done.png
    ┃ ┃ ┃ ┣ 📜ic_edit.png
    ┃ ┃ ┃ ┣ 📜ic_launcher_background.xml
    ┃ ┃ ┃ ┣ 📜ic_nav_sign_out.png
    ┃ ┃ ┃ ┣ 📜ic_nav_user.png
    ┃ ┃ ┃ ┣ 📜ic_splash_background.png
    ┃ ┃ ┃ ┣ 📜ic_stat_ic_notification.xml
    ┃ ┃ ┃ ┣ 📜ic_task_image.png
    ┃ ┃ ┃ ┣ 📜ic_user_place_holder.png
    ┃ ┃ ┃ ┣ 📜ic_vector_add_24dp.xml
    ┃ ┃ ┃ ┣ 📜ic_vector_color_accent_done_24dp.xml
    ┃ ┃ ┃ ┣ 📜ic_vector_delete_24dp.xml
    ┃ ┃ ┃ ┣ 📜ic_vector_white_done_24dp.xml
    ┃ ┃ ┃ ┣ 📜ic_white_color_back_24dp.xml
    ┃ ┃ ┃ ┣ 📜intro_background.png
    ┃ ┃ ┃ ┣ 📜nav_header_main_background.xml
    ┃ ┃ ┃ ┣ 📜shape_button_rounded.xml
    ┃ ┃ ┃ ┣ 📜shape_dialog_rounded.xml
    ┃ ┃ ┃ ┗ 📜white_border_shape_button_rounded.xml
    ┃ ┃ ┣ 📂drawable-v24
    ┃ ┃ ┃ ┗ 📜ic_launcher_foreground.xml
    ┃ ┃ ┣ 📂layout
    ┃ ┃ ┃ ┣ 📜activity_base.xml
    ┃ ┃ ┃ ┣ 📜activity_card_details.xml
    ┃ ┃ ┃ ┣ 📜activity_create_board.xml
    ┃ ┃ ┃ ┣ 📜activity_intro.xml
    ┃ ┃ ┃ ┣ 📜activity_main.xml
    ┃ ┃ ┃ ┣ 📜activity_members.xml
    ┃ ┃ ┃ ┣ 📜activity_my_profile.xml
    ┃ ┃ ┃ ┣ 📜activity_signin.xml
    ┃ ┃ ┃ ┣ 📜activity_signup.xml
    ┃ ┃ ┃ ┣ 📜activity_splash.xml
    ┃ ┃ ┃ ┣ 📜activity_task_list.xml
    ┃ ┃ ┃ ┣ 📜app_bar_main.xml
    ┃ ┃ ┃ ┣ 📜content_main.xml
    ┃ ┃ ┃ ┣ 📜dialog_list.xml
    ┃ ┃ ┃ ┣ 📜dialog_progress.xml
    ┃ ┃ ┃ ┣ 📜dialog_search_member.xml
    ┃ ┃ ┃ ┣ 📜item_board.xml
    ┃ ┃ ┃ ┣ 📜item_card.xml
    ┃ ┃ ┃ ┣ 📜item_card_selected_member.xml
    ┃ ┃ ┃ ┣ 📜item_label_color.xml
    ┃ ┃ ┃ ┣ 📜item_member.xml
    ┃ ┃ ┃ ┣ 📜item_task.xml
    ┃ ┃ ┃ ┗ 📜nav_header_main.xml
    ┃ ┃ ┣ 📂menu
    ┃ ┃ ┃ ┣ 📜activity_main_drawer.xml
    ┃ ┃ ┃ ┣ 📜menu_add_member.xml
    ┃ ┃ ┃ ┣ 📜menu_delete_card.xml
    ┃ ┃ ┃ ┗ 📜menu_members.xml
    ┃ ┃ ┣ 📂mipmap-anydpi-v26
    ┃ ┃ ┃ ┣ 📜ic_launcher.xml
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.xml
    ┃ ┃ ┣ 📂mipmap-hdpi
    ┃ ┃ ┃ ┣ 📜ic_launcher.png
    ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.png
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.png
    ┃ ┃ ┣ 📂mipmap-mdpi
    ┃ ┃ ┃ ┣ 📜ic_launcher.png
    ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.png
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.png
    ┃ ┃ ┣ 📂mipmap-xhdpi
    ┃ ┃ ┃ ┣ 📜ic_launcher.png
    ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.png
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.png
    ┃ ┃ ┣ 📂mipmap-xxhdpi
    ┃ ┃ ┃ ┣ 📜ic_launcher.png
    ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.png
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.png
    ┃ ┃ ┣ 📂mipmap-xxxhdpi
    ┃ ┃ ┃ ┣ 📜ic_launcher.png
    ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.png
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.png
    ┃ ┃ ┣ 📂values
    ┃ ┃ ┃ ┣ 📜colors.xml
    ┃ ┃ ┃ ┣ 📜dimen.xml
    ┃ ┃ ┃ ┣ 📜ic_launcher_background.xml
    ┃ ┃ ┃ ┣ 📜strings.xml
    ┃ ┃ ┃ ┗ 📜themes.xml
    ┃ ┃ ┗ 📂values-night
    ┃ ┃ ┃ ┗ 📜themes.xml
    ┃ ┣ 📜AndroidManifest.xml
    ┃ ┗ 📜ic_launcher-playstore.png
    ┗ 📂test
    ┃ ┗ 📂java
    ┃ ┃ ┗ 📂com
    ┃ ┃ ┃ ┗ 📂saurabhsen
    ┃ ┃ ┃ ┃ ┗ 📂projectmanagementapp
    ┃ ┃ ┃ ┃ ┃ ┗ 📜ExampleUnitTest.kt


# Features

* This app contains sign in and sign up feature.

* We can create boards as main project

* We can create list of cards which contains various features 
 which needs to be completed on time.

* Each card represents the feature needs to be completed and we can add members to each card.

* We can set the due date for each feature.

*  We will get notification once we are added to board by our project manager.


# App Images 

<table>
    <tr>
        <td><img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello13.jpg?raw=true" width="300" height="500" class = "img-responsive"></td>
        <td><img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello12.jpg?raw=true" width="300" height="500" class = "img-responsive"></td>
        <td>
            <img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello11.jpg?raw=true" width="300" height="500" class = "img-responsive">
        </td>
    </tr>
</table>

<table>
    <tr>
        <td><img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello10.jpg?raw=true" width="300" height="500" class = "img-responsive"></td>
        <td><img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello9.jpg?raw=true" width="300" height="500" class = "img-responsive"></td>
        <td>
            <img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello8.jpg?raw=true" width="300" height="500" class = "img-responsive">
        </td>
    </tr>
</table>

<table>
    <tr>
        <td><img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello7.jpg?raw=true" width="300" height="500" class = "img-responsive"></td>
        <td><img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello6.jpg?raw=true" width="300" height="500" class = "img-responsive"></td>
        <td>
            <img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello5.jpg?raw=true" width="300" height="500" class = "img-responsive">
        </td>
    </tr>
</table>

<table>
    <tr>
        <td><img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello3.jpg?raw=true" width="300" height="500" class = "img-responsive"></td>
        <td><img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello2.jpg?raw=true" width="300" height="500" class = "img-responsive"></td>
        <td>
            <img src = "https://github.com/saurabhsen24/trello_clone/blob/master/AppImages/Trello1.jpg?raw=true" width="300" height="500" class = "img-responsive">
        </td>
    </tr>
</table>





