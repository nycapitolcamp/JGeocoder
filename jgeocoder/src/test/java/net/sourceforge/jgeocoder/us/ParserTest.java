package net.sourceforge.jgeocoder.us;

import static org.junit.Assert.assertFalse;

import java.util.Map;

import net.sourceforge.jgeocoder.AddressComponent;

public class ParserTest {
    @org.junit.Test
    public void testAliasResolver() {
        String[] addresses = new String[] {
            "Google Inc, 1600 Amphitheatre Parkway, Mountain View, CA 94043",
            "Google Ann Arbor, 112 S. Main St., 2nd Floor, Ann Arbor, MI 48104",
            "Millennium at Midtown, 10 10th Street NE, Suite 600, Atlanta, GA 30309",
            "Plaza 7000, 7000 North MoPac Expressway, 2nd Floor, Austin, TX 78731",
            "Google Boulder, 2590 Pearl Street, Suite 100, Boulder, CO 80302",
            "Google Cambridge, 5 Cambridge Center, Floors 3-6, Cambridge, MA 02142",
            "Google Chicago, 20 West Kinzie St., Chicago, IL 60610",
            "Google Coppell, 701 Canyon Drive, Suite 120, Coppell, TX 75019",
            "The Centrum, 3102 Oak Lawn, Suite 200, Dallas, TX 75219",
            "Google Denver, 4600 S. Syracuse St., 8th Floor, Denver, CO 80237",
            "Google Detroit, 114 Willits Street, Birmingham, MI 48009",
            "Google Irvine, 19540 Jamboree Road, 2nd Floor, Irvine, CA 92612",
            "Central Way Plaza, 720 4th Avenue, Ste 400, Kirkland, WA 98033",
            "Google New York, 76 Ninth Avenue, 4th Floor, New York, NY 10011,",
            "Google Phoenix, 1551 S. Rural Road, 2nd floor, Tempe, AZ 85281",
            "Collaborative Innovation Center, 4720 Forbes Avenue, Lower Level, Pittsburgh, PA 15213",
            "Google San Francisco, 345 Spear Street, 4th Floor, San Francisco, CA 94105",
            "Google Santa Monica, 604 Arizona Avenue, Santa Monica, CA 90401",
            "Evanston Building, 501 N. 34th Street, Suite 300, Seattle, WA 98103",
            "Google Seattle, 651 N. 34th St., Seattle, WA 98103",
            "Google Washington DC, 1101 New York Avenue N.W., Second Floor, Washington, DC 20005"
        };

        for (String address : addresses) {
            Map<AddressComponent, String> parts = AddressParser.parseAddress(address);
            assertFalse(AddressParser.parseAddress(address) == null);
        }
    }
}
