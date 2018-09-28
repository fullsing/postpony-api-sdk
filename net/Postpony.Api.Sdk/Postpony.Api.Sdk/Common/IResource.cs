using System.Collections.Generic;

namespace Postpony.Api.Sdk.Common
{
    public interface IResource
    {
        void Merge(object source);
        Dictionary<string, object> AsDictionary();
    }
}
