package com.example.noteapp.di

import android.app.Application
import com.example.noteapp.activities.AddNoteActivity
import com.example.noteapp.activities.MainActivity
import com.example.noteapp.activities.UpdateNoteActivity
import com.example.noteapp.viewmodel.NoteViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class]
)
interface AppComponent {
//    fun getNoteViewModel(): NoteViewModel
//    fun inject(activity: MainActivity)
//    fun inject(activity: AddNoteActivity)
//    fun inject(activity: UpdateNoteActivity)
//    fun getAuthComponentFactory(): AuthComponent.Factory
//    @Component.Builder
//    interface Builder{
//        @BindsInstance
//        fun application( application: Application): Builder
//        // do application không thể khởi tạo mà có sẵn nên ta sẽ đưa nó vào graph
//        // k thể provider vì nó là android khởi tạo, k phải chúng ta định nghĩa
//        fun build (): AppComponent
//    }

//    @Component.Factory
//    interface Factory{
//        fun create(@BindsInstance application: Application): AppComponent
//    }

    //Factory dùng khi ta sử dụng tất cả @BindsInstance
    //Builder dùng khi ta định nghĩa các hàm @BindsInstance
// và không phải lúc nào cũng gọi tát cả( có class chỉ cần gọi 1 số)
}