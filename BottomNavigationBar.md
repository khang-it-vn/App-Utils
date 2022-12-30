# Cách thiết kế Bottom Navigation Bar
> Sử dụng thiết kế từ MaterialDesign https://m2.material.io/

## Thực Hiện Thiết Kế 
![image](https://user-images.githubusercontent.com/84958646/210090684-97db25ee-6b5d-4cfa-b543-182d7905769f.png)

## 1. implementation
> implementation 'com.google.android.material:material:1.7.0'

## 2. Tạo resource file

> res > New > Directory > name: 'menu'   || Hoàn tất
>  menu > New > Menu Resource File > name: 'tùy ý, <menu_bottom_navigation>' || Hoàn tất
> Nội dung trong file menu_bottom_navigation như sau:

    <item android:id="@+id/home"
        android:title="@string/action_home"
        android:icon="@drawable/home"/>
    <item android:id="@+id/history"
        android:title="@string/action_history"
        android:icon="@drawable/history"/>
    <item android:icon="@drawable/profile"
        android:title="@string/action_profile"
        android:id="@+id/profile"/>

