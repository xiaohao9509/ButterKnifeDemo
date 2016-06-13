# ButterKnifeDemo
##这是我的一个ButterKnifeDemo简易Demo
###1.导入ButterKnife
直接点击项目按F4,搜索新的Library dependency,在里面搜索ButterKnife,选择最新版,然后就像导入Design包一样,导入了ButterKnife包
###2.使用ButterKnife

最新的ButterKnife只需要bind不需要unbind,所以在setContentView下ButterKnife.bind()即可.

这上面有更多的ButterKnife的用法:

[ButterKnife](http://jakewharton.github.io/butterknife) 
###3.快捷使用bindView,Onclick

在setContentView下右键选择Generate ,再选择Generate Butterknife Injections ,

快捷键是Ctrl+Shift+B,让你选择当前布局下可以BindView的所有控件,和可以Bind点击事件的所有控件
###4.贴代码
```javasscript
    //bind布局文件中的控件
    @BindViews({R.id.title, R.id.subject})
    TextView mTitle, mSubject;
    @BindViews({R.id.btn1, R.id.btn2})
    Button mBtn1, mBtn2;
    @BindView(R.id.img)
    ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bind绑定到当前的Activity
        ButterKnife.bind(this);

    }

    //绑定控件的监听方法
    @OnClick({R.id.btn1, R.id.btn2})
    public void click(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn1:
                Toast.makeText(MainActivity.this, "按钮1被点击", Toast.LENGTH_SHORT).show();
                mTitle.setText("按钮一影响了我");
                break;
            case R.id.btn2:
                Toast.makeText(MainActivity.this, "按钮2被点击", Toast.LENGTH_SHORT).show();
                mSubject.setText("按钮二改变了我");
                break;
        }
    }
```    
##总结
ButterKnife是一个非常方便的第三方框架,可以减少在项目开发中的findById出现在次数,简化了代码的书写,
不过Android最新的技术Data Binding的出现,比ButterKnife更加方便,可以直接在布局中中与Module中的属性绑定,
不需要像以前在代码中将值setXXX显示,然后才能显示控件中,它可以在对象数据更新的时候直接更新在绑定的控件上.
同时在Module中可以有点击事件的方法,在对应的控件的onclick属性中写上即可.
[Data Bding相关参考](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0603/2992.html)
