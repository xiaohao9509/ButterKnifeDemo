# ButterKnifeDemo
##这是我的一个ButterKnifeDemo简易Demo
###1.导入ButterKnife
直接点击项目按F4,搜索新的Library dependency,在里面搜索ButterKnife,选择最新版,
然后就像导入Design包一样,导入了ButterKnife包
###2.使用ButterKnife
最新的ButterKnife只需要bind不需要unbind,所以在setContentView下ButterKnife.bind()即可.
这上面有更多的ButterKnife的用法:
[ButterKnife](http://jakewharton.github.io/butterknife) 
###3.快捷使用bindView,Onclick
在setContentView下右键选择Generate ,再选择Generate Butterknife Injections ,
快捷键是Ctrl+Shift+B,让你选择当前布局下可以BindView的所有控件,和可以Bind点击事件的所有控件
###4.贴代码
```javasscript
    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.btn1)
    Button mBtn1;
    @BindView(R.id.subject)
    TextView mSubject;
    @BindView(R.id.btn2)
    Button mBtn2;
    @BindView(R.id.img)
    ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

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
