using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Workshop.Views;
using Xamarin.Forms;

namespace Workshop
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();

            TabbedPage tabbedPage = new TabbedPage();
            NavigationPage navigationPage = new NavigationPage(new MainPage());
            tabbedPage.Children.Add(navigationPage);
            tabbedPage.Children.Add(new PowerView());
            tabbedPage.Children.Add(new DeviceView());

            MainPage = tabbedPage;
        }

        protected override void OnStart()
        {
            // Handle when your app starts
        }

        protected override void OnSleep()
        {
            // Handle when your app sleeps
        }

        protected override void OnResume()
        {
            // Handle when your app resumes
        }
    }
}
