using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;


namespace Workshop.ViewModels
{
    public class PowerViewModel : INotifyPropertyChanged
    {
        private string statusText = "OFF";

      
        public string Status
        {
            get { return statusText; }
            set
            {
                statusText = value;
                OnPropertyChanged();
            }
        }
        public Command DisplayStatus
        {
            get
            {
                return new Command(() =>
                {
                    Status = "On";
                });
            }
        }
        public event PropertyChangedEventHandler PropertyChanged;

        protected void OnPropertyChanged([CallerMemberName] string caller = "")
        {
            if (PropertyChanged != null)
            {
                PropertyChanged(this, new PropertyChangedEventArgs(caller));
            }
        }
    }
}
