using System;

namespace Postpony.Api.Sdk.Common
{
    public class EnumDescriptionAttribute : Attribute
    {

        public string _description;


        public EnumDescriptionAttribute(string description)
        {
            _description = description;
        }

        public string Description
        {
            get { return _description; }
        }
    }
}
