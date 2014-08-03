using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel.Description;

namespace EssentialWCF
{
    [ServiceContract]
    public interface IStockService {
        [OperationContract]
        double GetPrice(string ticker);
    }

    public class StockService : IStockService
    {
        public double GetPrice(string ticker) {
            return 94.43;
        }
    }

        
    public class Program
    {
        public static void Main(string[] args)
        {
            ServiceHost serviceHost = 
                new ServiceHost(typeof(StockService),new Uri("http://localhost:8000/EssentialWCF"));
            serviceHost.AddServiceEndpoint(typeof(IStockService),new BasicHttpBinding(),"");

            //增加mex 。matedata exchange,没有mex没法通过添加服务引用生成代理。
            ServiceMetadataBehavior behavior = new ServiceMetadataBehavior();
            behavior.HttpGetEnabled = true;
            serviceHost.Description.Behaviors.Add(behavior);
            serviceHost.AddServiceEndpoint(typeof(IMetadataExchange),
                MetadataExchangeBindings.CreateMexHttpBinding(),
                "mex");
            
            serviceHost.Open();
            Console.WriteLine("Press <ENTER> to terminate. \n \n");
            Console.ReadLine();
            serviceHost.Close();
        }
    }
}
