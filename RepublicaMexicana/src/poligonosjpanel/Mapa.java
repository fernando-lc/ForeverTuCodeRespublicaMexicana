/*
 *
 *Fernando lucena calixto
 * 
 *
 */
//package poligonosjpanel;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.*;

public class Mapa extends JPanel implements MouseListener,MouseMotionListener
{
    private JLabel info, info1,yo,el,habitantes;
    private Image img;
    private Point pos;
    private boolean pintar,rola;
    private JButton  boton,botonMusica;
    private AudioStream audio; 
    private Polygon 
           AguasCalientes,
                BajaCalifornia,
                    BajaCaliforniaSur,
                        Campeche,
                            Coahuila,
                                Colima,
                                    Chiapas,
                                         Chihuahua,
                                             DF,
                                                Durango,
                                                     Guanajuato,
                                                          Guerrero,
                                                             Hidalgo,
                                                                 Jalisco,
                                                                 EstadoDeMexico,
                                                             Michoacan,
                                                          Morelos,
                                                      Nayarit,
                                                  NuevoLeon,
                                               Oaxaca,
                                            Puebla,
                                         Queretaro,
                                      Quintanaroo,
                                   SanLuisPotosi,
                                Sinaloa,
                             Sonora,
                        Tabasco,
                    Tamaulipas,
                  Tlaxcala,
               Veracruz,
             Yucatan,
          Zacatecas,
        Zacatecas1;
        
    
    public Mapa ()
    {
        setLayout(null);
        boton = new JButton("COLOR");
        boton.setBounds(900, 400, 100, 40);
        botonMusica = new JButton("musica");
        botonMusica.setBounds(900, 450, 100, 40);
       this.setBackground(new Color(150,150,100));
        info = new JLabel("");
        info.setBounds(800,90,500,70);
        info1 = new JLabel("ISNTITUTO TECNOLOGICO DE CHILPANCINGO");
        info1.setBounds(800,20,500,70);
        yo = new JLabel("Alumno");
        yo.setBounds(800,40,500,70);
        el = new JLabel ("Fernando Lucena Calixto");
        el.setBounds(800,60,500,70);
        habitantes = new JLabel("");
        habitantes.setBounds(800,110,500,70);
         String sonido = "C:/Users/beateful/Documents/NetBeansProjects/RepublicaMexicana/src/poligonosjpanel/mapa.wav";
       try{
         InputStream in = new FileInputStream(sonido);
         audio = new AudioStream(in);
       }
       catch(Exception e){}
        try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("republica.png"));
            img = aux.getImage();  
        } catch (Exception e) {
            e.printStackTrace();
        }
        pos = new Point(30, 450); 
        pintar = true;
        rola = true;
       add(info1);
        add(yo);
        add(info);
        add(el);
        add(habitantes);
        add(boton);
        add(botonMusica);
        botonMusica.addMouseListener(this);
        boton.addMouseListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
// dibuja polígonos y polilíneas
    
    
public void paintComponent( Graphics g ) {
super.paintComponent( g ); // llama al método paintComponent de la superclas

 // Baja California Sur
g.setColor (Color.GREEN);
int CaliforniaSX[] = { 26,42,60,79,113,112,106,101,100,100,101,101,101,100,98,99,104,106,109,114,124,131,135,136,143,148,153,156,152,143,135,124,105,110,110,105,101,98,95,92,87,82,76,70,62,57,59,59,59,56,52,48,47,48,47,43,40,37,34,34,32,30,30,28, };
int CaliforniaSY[] = { 49,50,47,47,48,58,58,71,80,87,99,109,118,127,133,139,145,151,156,162,177,183,190,195,202,212,218,226,231,230,229,229,228,215,208,204,199,196,190,186,180,176,170,165,158,155,150,146,139,130,124,124,114,104,96,91,88,83,76,71,67,63,59,56 };
BajaCaliforniaSur = new Polygon (CaliforniaSX, CaliforniaSY, CaliforniaSX.length );

if (pintar)
    g.fillPolygon(BajaCaliforniaSur);
else
    g.drawPolygon(BajaCaliforniaSur);

 // Baja California
g.setColor (Color.PINK);
int CaliforniaX[] = { 107,158,163,166,170,173,179,183,185,188,191,191,191,193,198,200,201,201,203,204,207,210,212,215,220,222,219,222,224,228,233,237,236,236,239,241,245,247,251,255,259,259,261,264,267,268,263,260,253,248,242,238,238,238,235,233,229,226,218,214,206,203,184,181,175,171,167,167,170,170,168,162,155,147,143,143,140,137,129,126,120,118,113,110,104,99,91,89,83,78,74,74,83,89,94,100,105, };
int CaliforniaY[] = { 227,230,242,248,254,260,268,274,283,291,291,285,280,285,289,296,303,309,317,323,331,336,344,352,358,364,368,378,382,386,391,391,387,382,382,383,388,391,393,390,396,403,407,408,413,422,429,429,433,434,434,426,418,418,416,411,408,404,401,396,390,384,372,370,367,360,348,336,329,322,305,301,298,294,290,286,285,278,278,274,274,284,275,271,266,263,256,252,245,240,235,230,230,234,234,234,236 };
BajaCalifornia = new Polygon (CaliforniaX, CaliforniaY, CaliforniaX.length );

if (pintar)
    g.fillPolygon(BajaCalifornia);
else
    g.drawPolygon(BajaCalifornia);

//Sonora
 g.setColor (Color.WHITE);
int SonoraX[] = {107,253,327,328,331,328,324,325,315,307,308,310,311,314,316,318,318,320,320,314,307,301,296,291,287,286,282,276,270,267,266,261,255,248,245,243,242,238,232,225,219,213,207,202,196,194,191,188,179,176,174,170,166,166,164,159,149,142,135,131,122,112,107,102,98, };
int SonoraY[] = {58,119,121,147,149,191,198,234,236,238,242,246,248,257,259,264,273,280,287,296,299,303,306,307,306,300,296,296,292,284,275,276,276,270,263,252,247,246,246,240,233,228,224,219,202,194,186,178,166,161,152,141,127,119,114,111,108,101,94,94,91,85,82,79,77 };
Sonora = new Polygon(SonoraX, SonoraY, SonoraX.length);

if (pintar)
    g.fillPolygon(Sonora);
else
    g.drawPolygon(Sonora);

//Chihuahua
 g.setColor (Color.CYAN);
int ChihuahuaX[] = { 327,349,349,412,416,422,426,431,436,440,446,450,459,467,473,476,480,486,488,499,512,526,534,502,515,512,507,499,491,486,475,469,463,454,445,437,428,420,415,406,397,396,394,386,374,369,364,360,353,348,345,341,335,327,320,317,317,317,317,312,310,310,312,321,321,321,324,324,326,326,326,328,329,327,325,325, };
int ChihuahuaY[] = { 122,123,108,110,112,117,120,125,126,128,135,140,148,155,160,166,178,189,196,203,210,217,219,261,308,304,303,303,303,308,314,314,314,314,313,310,307,301,302,310,319,326,330,334,336,334,325,320,319,315,305,297,291,287,283,280,273,264,257,251,246,241,236,232,227,215,203,197,191,187,175,164,145,145,143,129 };
Chihuahua = new Polygon(ChihuahuaX, ChihuahuaY, ChihuahuaX.length );
if (pintar)
    g.fillPolygon(Chihuahua);
else
    g.drawPolygon(Chihuahua);

//Coahuila
g.setColor (Color.BLUE);
int CoahuilaX[] = {663,660,654,650,643,636,630,631,635,636,637,622,617,613,620,627,630,634,645,649,650,635,631,629,628,620,613,606,596,586,574,566,555,545,539,532,529,526,520,517,517,517,523,523,517,502,531,541,546,551,564,582,590,597,603,623,623,638,642,646 };
int CoahuilaY[] = {263,270,270,270,277,279,287,291,294,297,307,313,316,319,326,340,347,351,359,359,362,364,366,376,389,389,389,385,381,373,364,364,367,375,377,378,374,369,363,356,348,336,326,316,307,262,221,212,206,198,192,189,189,189,188,201,203,227,237,255 };
Coahuila = new Polygon (CoahuilaX, CoahuilaY, CoahuilaX.length );
if (pintar)
    g.fillPolygon(Coahuila);
else
 g.drawPolygon(Coahuila);


//Nuevo Leon                                                
g.setColor (Color.GRAY);                          
int NuevoLeonX[] = {661,661,657,652,647,642,639,636,634,626,626,630,632,630,618,614,612,619,622,627,635,644,633,623,623,625,633,637,641,653,660,670,678,681,678,676,676,676,680,689,694,710,718,718,718,713,704,694,689,682,677,671,667,668,665 };
int NuevoLeonY[] = {263,264,265,264,264,267,271,274,280,282,288,295,301,307,307,313,321,330,341,350,358,361,363,373,385,393,409,426,435,438,429,422,416,411,409,403,398,390,384,379,369,358,355,344,338,331,330,327,321,313,306,284,274,269,264 };
NuevoLeon = new Polygon (NuevoLeonX, NuevoLeonY, NuevoLeonX.length);
if (pintar)
    g.fillPolygon(NuevoLeon);
else
 g.drawPolygon(NuevoLeon);

//Tamaulipa                                                
g.setColor (Color.MAGENTA);                          
int TamaulipaX[] = { 668,666,667,671,673,676,680,687,692,699,706,711,716,716,712,704,701,695,690,687,680,677,673,672,676,677,670,663,660,652,652,656,662,667,680,687,692,704,715,722,729,735,747,752,752,752,753,752,751,751,751,751,756,759,759,764,766,769,771,770,760,750,737,718,709,700,693,689,683,681,676 };
int TamaulipaY[] = {266,274,283,292,300,311,318,324,329,331,334,337,345,352,356,362,363,366,369,378,384,385,392,402,410,414,415,418,427,434,442,449,452,456,458,461,466,469,469,469,467,467,470,474,463,449,434,416,409,393,374,359,349,356,367,361,354,347,335,333,333,333,326,321,317,313,307,299,283,276,272 };
Tamaulipas = new Polygon(TamaulipaX, TamaulipaY, TamaulipaX.length);
if (pintar)
    g.fillPolygon(Tamaulipas);
else
 g.drawPolygon(Tamaulipas);

//VeraCruz                                               
g.setColor (Color.ORANGE);                          
int VeraCruzX[] = { 753,731,726,724,723,718,719,724,731,735,733,723,723,729,734,744,752,758,758,756,761,769,773,771,770,774,781,783,783,776,773,783,788,797,802,806,809,818,823,829,833,835,838,847,852,861,863,870,878,887,894,903,909,916,922,930,938,937,930,922,916,914,907,895,886,880,871,861,846,841,837,831,824,816,813,812,807,796,783,779,770,768,768,761,756 };
int VeraCruzY[] = { 474,461,465,469,479,494,500,507,507,513,521,533,537,538,529,524,524,532,541,549,550,550,559,569,580,581,582,586,594,600,607,610,612,613,614,619,621,624,625,625,627,633,643,649,645,642,651,655,658,661,663,664,664,663,663,662,652,645,642,640,630,624,623,623,618,613,610,608,607,606,602,598,593,586,572,564,559,548,541,537,529,513,504,493,486};
Veracruz = new Polygon (VeraCruzX, VeraCruzY, VeraCruzX.length);
if (pintar)
    g.fillPolygon(Veracruz);
else
 g.drawPolygon(Veracruz);

//Tabasco                                               
g.setColor (Color.lightGray);                          
int TabascoX[] = {912,916,922,927,931,936,942,945,949,955,959,961,965,967,971,978,981,987,996,1004,1013,1019,1024,1032,1037,1043,1048,1056,1057,1055,1055,1049,1044,1034,1027,1021,1013,1003,999,992,990,986,979,971,964,956,944,934,922,916 };
int TabascoY[] = { 625,634,641,643,647,651,651,646,641,636,635,639,645,649,652,652,646,641,635,633,633,638,642,648,651,656,654,654,648,639,631,623,623,623,623,625,625,619,615,609,604,601,602,608,610,611,611,614,615,620};
Tabasco = new Polygon (TabascoX, TabascoY, TabascoX.length);
if (pintar)
    g.fillPolygon(Tabasco);
else
 g.drawPolygon(Tabasco );
 
//Chiapas
g.setColor (Color.MAGENTA);
int ChiapasX[] = {939,945,949,953,957,963,968,976,982,985,991,998,1004,1011,1020,1023,1029,1034,1042,1051,1058,1068,1078,1085,1085,1075,1060,1024,1019,1015,1011,1016,1014,1007,1000,988,980,971,958,945,930,922,916,919,919,919,924,928,933,935};
int ChiapasY[] = {649,648,640,634,631,637,647,652,648,642,639,634,632,631,631,635,641,646,652,658,660,666,673,685,692,698,698,699,707,719,729,738,750,757,757,750,744,737,728,717,706,704,698,689,682,671,666,659,654,649};
Chiapas = new Polygon(ChiapasX, ChiapasY, ChiapasX.length );
if (pintar)
    g.fillPolygon(Chiapas);
else
 g.drawPolygon (Chiapas);

 //Oaxaca
 g.setColor (Color.cyan);
int OaxacaX[] = {919,919,922,927,918,913,904,895,889,879,869,867,861,855,845,840,839,838,832,821,812,807,801,795,792,785,779,772,768,762,754,749,743,727,727,727,734,736,741,741,734,728,723,718,726,734,741,750,760,772,785,797,807,823,836,845,857,867,877,882,878,884,892,900,899,912 };
int OaxacaY[] = {703,675,665,662,660,659,655,656,657,657,652,645,641,639,641,636,632,625,620,617,617,611,609,611,617,621,626,629,631,629,629,633,635,637,647,654,662,666,673,681,683,686,694,697,702,705,707,712,712,714,718,721,722,721,715,711,706,704,702,702,698,695,697,698,704,702 };
Oaxaca = new Polygon (OaxacaX, OaxacaY, OaxacaX.length );
if (pintar)
    g.fillPolygon(Oaxaca);
else
 g.drawPolygon(Oaxaca);

//Guerrero
g.setColor (Color.RED);
int GuerreroX[] = { 721,728,736,742,746,743,735,731,731,731,728,722,719,713,707,704,697,690,681,674,667,659,654,648,645,640,635,631,631,626,618,614,610,597,592,585,578,571,568,566,561,563,569,580,589,604,622,641,654,666,687,695,704,709 };
int GuerreroY[] = { 698,694,689,684,673,666,660,651,645,639,634,631,633,633,628,623,619,615,611,607,606,609,613,615,615,609,607,611,615,615,614,613,612,612,616,612,609,608,616,622,626,631,639,647,654,661,664,675,679,681,687,688,690,693 };
Guerrero = new Polygon(GuerreroX, GuerreroY, GuerreroX.length);
if (pintar)
    g.fillPolygon(Guerrero);
else
 g.drawPolygon(Guerrero);

//Michoacan                                               
g.setColor (Color.GRAY);                         
int MichoacanX[] = { 566,565,566,571,571,574,584,589,597,603,611,618,626,632,633,635,635,638,642,645,647,650,651,655,651,641,639,632,619,614,607,598,590,585,578,571,563,553,546,539,530,523,523,529,537,539,540,540,539,542,547,543,536,526,515,505,498,498,503,512,523,534,547,556 };
int MichoacanY[] = {636,631,625,621,617,612,614,618,617,615,615,616,617,617,614,610,605,600,595,587,581,573,566,559,556,555,557,559,556,552,552,551,548,548,550,544,543,544,549,549,549,552,555,558,559,561,566,571,572,574,580,584,587,590,594,599,601,612,618,625,628,629,633,634  };
Michoacan = new Polygon (MichoacanX, MichoacanY, MichoacanX.length);
if (pintar)
    g.fillPolygon(Michoacan);
else
 g.drawPolygon(Michoacan);

//Jalisco
g.setColor (Color.green);                                                                                     //gunajuato
int JaliscoX[] = {592,593,589,584,577,571,569,569,566,558,553,549,545,542,536,528,523,522,527,536,542,542,542,545,546,539,529,520,510,505,502,500,501,498,491,487,478,470,460,453,446,437,429,423,414,410,418,430,441,453,467,471,476,481,484,486,487,483,478,485,489,494,500,495,495,500,501,505,507,511,514,519,521,521,509,503,498,495,495,500,514,524,535,538,540,547,555,564,572,578,587 };
int JaliscoY[] = {487,496,507,515,522,533,540,544,544,543,544,546,546,549,549,552,554,557,560,562,565,567,572,578,582,587,591,593,597,598,599,594,583,578,572,571,573,576,579,581,582,575,566,557,548,536,533,528,521,516,527,524,520,515,507,494,482,473,462,459,459,451,454,461,466,466,461,463,469,469,465,463,468,473,482,486,491,498,506,508,507,508,505,501,496,494,493,492,486,484,483 };
Jalisco = new Polygon (JaliscoX, JaliscoY, JaliscoX.length );
if (pintar)
    g.fillPolygon(Jalisco);
else
 g.drawPolygon(Jalisco);

//Colima
g.setColor (Color.BLACK);
int ColimaX[] = {498,499,505,507,506,502,493,484,474,465,456,445,449,459,469,477,486,498};
int ColimaY[] = {613,609,601,594,584,575,571,569,571,576,578,582,589,594,598,600,607,613 };
Colima = new Polygon (ColimaX, ColimaY, ColimaX.length);
if (pintar)
    g.fillPolygon(Colima);
else
 g.drawPolygon(Colima);

//Nayarit
g.setColor (Color.GRAY);
int NayaritX[] = { 454,457,467,472,482,486,489,489,487,484,480,475,465,463,456,450,448,454,454,447,436,430,426,425,426,423,414,415,422,429,431,431,429,424,421,423,429,437,448,451 };
int NayaritY[] = { 515,522,531,530,518,512,505,494,483,467,461,460,458,451,453,454,450,445,436,436,437,437,440,450,453,454,462,471,476,484,491,501,510,516,522,528,529,527,522,516 };
Nayarit = new Polygon (NayaritX, NayaritY, NayaritX.length ); 
if (pintar)
    g.fillPolygon(Nayarit);
else
 g.drawPolygon(Nayarit);

//Sinaloa
g.setColor (Color.ORANGE);
int SinaloaX[] = {289,298,304,314,319,325,336,344,346,352,359,366,372,374,374,376,379,384,390,395,402,409,414,420,430,432,432,433,429,424,416,410,403,398,388,382,377,365,352,342,332,327,333,331,324,318,311,304,296,288,282,277,280};
int SinaloaY[] = {305,304,301,293,284,283,288,297,309,316,319,319,327,335,348,357,370,376,384,387,389,397,416,422,431,436,443,450,458,458,454,449,444,433,430,419,409,399,387,380,372,365,366,360,355,349,344,342,339,335,331,320,311  };
Sinaloa = new Polygon (SinaloaX, SinaloaY, SinaloaX.length);
if (pintar)
    g.fillPolygon(Sinaloa);
else
 g.drawPolygon(Sinaloa);

//Durango
g.setColor (Color.WHITE);
int DurangoX[] = { 372,372,373,378,385,390,393,401,406,410,413,418,420,427,432,437,448,448,451,455,461,466,472,477,484,483,487,490,500,504,503,514,526,548,557,559,560,554,546,544,537,523,518,519,524,526,525,512,503,489,479,467,457,448,439,430,420,412,406,398,394,393,383 };
int DurangoY[] = {337,346,354,364,373,383,390,390,396,403,413,420,433,438,440,442,445,449,452,453,456,460,462,462,459,454,440,428,423,416,407,403,396,396,389,382,368,366,373,377,378,368,358,351,337,321,309,302,299,299,309,310,310,308,308,299,295,298,303,314,323,330,332};
Durango = new Polygon (DurangoX, DurangoY, DurangoX.length);
if (pintar)
    g.fillPolygon(Durango);
else
 g.drawPolygon (Durango);

//Zacatecas
g.setColor (Color.MAGENTA);
int ZacatecasX[] = {490,483,483,485,491,500,500,503,512,520,531,540,550,555,554,554,559,571,584,601,615,623,614,607,602,590,577,570,567,570,576,586,593,605,603,603,599,593,585,580,577,575,570,567,559,557,550,543,531,532,536,543,541,540,533,522,508,491,492,496,508,515,525,523,520,516,513,508,504,504,504,501,497,493,495,495 };
int ZacatecasY[] = {458,451,440,427,421,415,410,404,396,391,391,391,389,384,372,364,361,360,368,376,385,391,398,405,408,413,421,431,438,449,454,459,458,461,471,478,483,486,484,483,482,475,470,465,466,469,471,471,475,481,484,490,496,503,504,507,509,510,505,497,488,480,473,467,464,466,471,471,468,462,458,459,465,465,459,450 };
Zacatecas = new Polygon (ZacatecasX, ZacatecasY, ZacatecasX.length);
if (pintar)
    g.fillPolygon(Zacatecas);
else
 g.drawPolygon(Zacatecas);

//Zacatecas1
g.setColor (Color.MAGENTA);
int Zacatecas1X[] = {523,522,516,508,501,494,494,500,511,525,533,538,540,540,537,530,529,533,530 };
int Zacatecas1Y[] = {464,470,475,478,485,497,505,510,508,509,510,506,499,493,489,484,477,473,467 };
Zacatecas1 = new Polygon (Zacatecas1X, Zacatecas1Y, Zacatecas1X.length);
if (pintar)
    g.fillPolygon(Zacatecas1);
else
 g.drawPolygon(Zacatecas1);

//Aguas Calientes
g.setColor (Color.DARK_GRAY);
int AguasCalientesX[] = {539,549,560,569,576,576,572,564,560,553,545,536,531,530,534 };
int AguasCalientesY[] = {495,493,495,490,483,473,462,464,464,468,468,474,478,487,491};
AguasCalientes = new Polygon (AguasCalientesX, AguasCalientesY, AguasCalientesX.length);
if (pintar)
    g.fillPolygon(AguasCalientes);
else
 g.drawPolygon(AguasCalientes);

//San Luis Potosi
g.setColor (Color.RED);
int SanLuisPotosiX[] = {624,631,634,634,641,641,643,649,653,658,660,663,670,678,687,691,698,710,721,725,725,720,722,723,719,704,698,691,686,677,669,660,652,646,638,630,623,615,608,603,596,595,598,597,591,584,573,565,562,564,571,579,591,603,612,614  };
int SanLuisPotosiY[] = {389,395,406,418,424,432,438,438,438,443,449,453,456,454,458,465,466,467,466,466,475,486,493,501,508,510,509,499,498,500,503,500,499,495,497,498,498,498,492,490,488,483,476,467,464,462,456,451,439,434,426,419,412,410,399,395 };
SanLuisPotosi = new Polygon (SanLuisPotosiX, SanLuisPotosiY, SanLuisPotosiX.length);
if (pintar)
    g.fillPolygon(SanLuisPotosi);
else
 g.drawPolygon(SanLuisPotosi);

//Guanajuato
g.setColor (Color.cyan);
int GuanajuatoX[] = {596,590,593,586,576,571,569,565,569,579,583,593,601,608,615,622,634,642,651,654,647,641,639,642,656,670,682,681,665,650,643,636,626,617,607,600 };
int GuanajuatoY[] = {485,488,498,504,511,518,526,540,547,551,549,552,554,551,554,557,558,557,557,554,549,543,534,527,519,510,502,498,501,500,491,495,498,491,487,486};
Guanajuato = new Polygon(GuanajuatoX, GuanajuatoY, GuanajuatoX.length);
if (pintar)
    g.fillPolygon(Guanajuato);
else
 g.drawPolygon(Guanajuato);

//Queretaro
g.setColor (Color.BLACK);
int QueretaroX[] = {651,653,646,638,637,640,651,661,668,678,686,691,695,701,706,700,693,689,683,678,676,671,661 };
int QueretaroY[] = {557,552,547,538,530,524,520,511,505,499,496,494,501,508,512,516,517,518,524,529,537,540,547  };
Queretaro = new Polygon(QueretaroX, QueretaroY, QueretaroX.length);
if (pintar)
    g.fillPolygon(Queretaro);
else
 g.drawPolygon(Queretaro);

//Hidalgo
g.setColor (Color.DARK_GRAY);
int HidalgoX[] = {673,675,679,685,689,694,699,708,717,721,727,729,736,736,734,728,726,732,736,739,747,751,754,749,745,738,736,735,732,730,723,718,715,716,707,704,702,699,695,692,695,690,683,679  };
int HidalgoY[] = {538,529,524,522,517,515,510,510,510,505,510,508,512,519,524,533,536,537,534,527,526,526,529,532,538,546,549,556,563,567,570,571,567,562,560,562,561,556,553,549,546,542,540,538 };
Hidalgo = new Polygon(HidalgoX, HidalgoY, HidalgoX.length);
if (pintar)
    g.fillPolygon(Hidalgo);
else
 g.drawPolygon(Hidalgo);

//Puebla
g.setColor (Color.GREEN);
int PueblaX[] = {731,733,733,736,734,741,753,756,760,757,756,763,769,777,779,774,771,771,777,782,788,785,778,775,778,785,798,796,787,782,776,770,765,760,754,744,737,731,726,719,713,709,705,703,708,714,716,714,715,720,726,735,744,750,756,757,747,742 };
int PueblaY[] = {567,556,548,539,531,525,522,529,539,546,553,549,546,551,559,567,572,579,582,582,587,591,595,601,604,609,609,616,623,626,631,633,634,634,633,636,635,637,637,634,633,631,625,622,619,618,606,600,590,585,589,592,587,585,584,577,570,569 };
Puebla = new Polygon(PueblaX, PueblaY, PueblaX.length);
if (pintar)
    g.fillPolygon(Puebla);
else
 g.drawPolygon(Puebla);

 //Tlaxcala
g.setColor (Color.yellow);
int TlaxcalaX[] = {718,725,735,745,755,763,759,748,733,724,714,714 };
int TlaxcalaY[] = {588,592,593,590,588,583,576,569,564,568,572,577};
Tlaxcala = new Polygon (TlaxcalaX, TlaxcalaY, TlaxcalaX.length);
if (pintar)
    g.fillPolygon(Tlaxcala);
else
 g.drawPolygon(Tlaxcala);

//Morelos
g.setColor (Color.ORANGE);
int MorelosX[] = {673,683,688,697,706,715,716,715,711,701,693,684,681,676 };
int MorelosY[] = {611,613,619,622,619,617,609,602,594,592,591,593,601,603 };
Morelos = new Polygon(MorelosX, MorelosY, MorelosX.length);
if (pintar)
    g.fillPolygon(Morelos);
else
 g.drawPolygon (Morelos);
 
 //EstadoDeMexico
g.setColor (Color.WHITE);
int EstadoDeMexicoX[] = {679,676,667,660,657,652,642,637,634,634,641,641,644,647,651,660,666,672,680,690,694,694,696,701,708,715,716,718,720,714,712,708,697,691,685 };
int EstadoDeMexicoY[] = {604,611,611,613,616,616,616,612,610,602,595,587,577,568,558,549,543,537,536,542,549,555,559,562,562,564,574,576,581,589,599,594,591,594,599};
EstadoDeMexico = new Polygon (EstadoDeMexicoX, EstadoDeMexicoY, EstadoDeMexicoX.length);
if (pintar)
    g.fillPolygon(EstadoDeMexico);
else
 g.drawPolygon(EstadoDeMexico);

//DF
g.setColor (Color.GRAY);
int DFX[] = {688,692,701,706,706,704,696,689,688,683,688 };
int DFY[] = {595,593,594,591,584,577,572,573,577,581,586 };
DF = new Polygon(DFX, DFY, DFX.length);
if (pintar)
    g.fillPolygon(DF);
else
 g.drawPolygon(DF);

//Campeche                                                
g.setColor (Color.BLUE);                         
int CampecheX[] = {1126,1131,1123,1110,1089,1081,1076,1070,1065,1063,1063,1064,1064,1064,1062,1059,1057,1056,1044,1035,1030,1040,1042,1040,1045,1045,1044,1045,1044,1040,1037,1033,1035,1036,1036,1029,1027,1020,1013,1010,1001,1006,1013,1009,1003,992,986,989,993,1000,1012,1016,1026,1032,1038,1049,1056,1078,1127 };
int CampecheY[] = { 628,562,553,546,539,534,527,522,519,520,525,535,540,545,551,557,565,572,584,589,594,592,594,597,597,601,603,606,609,609,613,614,616,619,620,620,616,616,615,615,610,607,609,603,600,600,601,609,613,617,625,629,627,623,623,627,632,632,628};
Campeche = new Polygon (CampecheX, CampecheY, CampecheX.length);
if (pintar)
    g.fillPolygon(Campeche);
else
 g.drawPolygon(Campeche);

//Yucatan                                               
g.setColor (Color.GREEN);                          
int YucatanX[] = {1131,1186,1190,1192,1190,1180,1173,1182,1183,1180,1175,1167,1161,1154,1149,1143,1139,1132,1122,1114,1107,1095,1088,1082,1074,1070,1066,1067,1072,1076,1079,1077,1082,1091,1103,1111,1116,1121,1131 };
int YucatanY[] = {561,515,507,499,482,477,480,483,486,489,488,486,484,484,484,486,489,489,490,492,495,499,499,503,506,513,518,523,525,526,532,534,536,539,542,544,546,550,561 };
Yucatan = new Polygon (YucatanX, YucatanY, YucatanX.length);
if (pintar)
    g.fillPolygon(Yucatan);
else
 g.drawPolygon(Yucatan);

//Quintanaroo                                             
g.setColor (Color.GRAY);                          
int QuintanarooX[] = {1127,1129,1132,1157,1188,1192,1192,1189,1203,1205,1208,1210,1212,1212,1205,1201,1194,1192,1192,1193,1188,1188,1183,1181,1183,1197,1194,1192,1186,1193,1191,1190,1190,1190,1186,1186,1176,1173,1171,1168,1166,1164,1160,1155,1149,1149,1136,1129,1128 };
int QuintanarooY[] = {627,599,562,541,516,500,490,477,473,478,484,487,491,503,508,514,521,527,535,537,539,544,545,549,552,552,555,560,566,566,574,580,585,592,596,603,597,591,584,582,587,591,600,599,602,607,617,623,626 };
Quintanaroo = new Polygon(QuintanarooX, QuintanarooY, QuintanarooX.length);
if (pintar)
    g.fillPolygon(Quintanaroo);
else
 g.drawPolygon(Quintanaroo);
 

    
    g.drawImage(img, (int)pos.getX(), (int)pos.getY(), null);
    
}

    @Override
    public void mouseClicked(MouseEvent e){
        Point p = e.getPoint();
        if(AguasCalientes.contains(p)) {
            info.setText("Estado: Aguas Calientes");
            habitantes.setText("abitantes: 1 252 265");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("aguascalientes.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        } 
    else if ( BajaCalifornia.contains(p)) {
            info.setText("Estado: baja California");
           habitantes.setText("abitantes: 3 381 080");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("bajacalifornia.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
    else if (BajaCaliforniaSur.contains(p)) {
            info.setText("Estado: Baja California Sur");
             habitantes.setText("abitantes: 718 196");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("bajacaliforniasur.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
      else if (Campeche.contains(p)) {
            info.setText("Estado: campeche");
             habitantes.setText("abitantes: 880 299");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("canpeche.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
         else if (Coahuila.contains(p)) {
            info.setText("Estado: Coahuila");
             habitantes.setText("abitantes: 2 890 108");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("coahuila.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
           
        }
         else if (Colima.contains(p)) {
            info.setText("Estado: Colima");
             habitantes.setText("abitantes: 698 295");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("colima.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
        
         
         else if (Chiapas.contains(p)) {
            info.setText("Estado: Chiapas");
             habitantes.setText("abitantes: 5 119 186");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("chiapas.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
         
        }
        
         else if (Chihuahua.contains(p)) {
            info.setText("Estado: Chihuahua");
             habitantes.setText("abitantes: 3 635 966");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("chihuahua.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
         else if (DF.contains(p)) {
            info.setText("Estado: Distrito Federal");
             habitantes.setText("abitantes:8 893 742");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("estadodemexico.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
          else if (Durango.contains(p)) {
            info.setText("Estado: Durango");
             habitantes.setText("abitantes: 1 728 429");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("durango.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
          
        }
        
            else if (Guanajuato.contains(p)) {
            info.setText("Estado: Guanajuato");
             habitantes.setText("abitantes: 5 719 709");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("guanajuato.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
        
        
            else if (Guerrero.contains(p)) {
            info.setText("Estado: Guerrero");
             habitantes.setText("abitantes: 3 523 858");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("guerrero.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
        
           else if (Hidalgo.contains(p)) {
            info.setText("Estado:Hidalgo");
             habitantes.setText("abitantes: 2 806 334");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("hidalgo.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
            else if (Jalisco.contains(p)) {
            info.setText("Estado:Jalisco");
             habitantes.setText("abitantes: 7 742 303");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("Jalisco.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
         
        }
        
        
        else if (EstadoDeMexico.contains(p)) {
            info.setText("Estado:Estado De Mexico");
             habitantes.setText("abitantes: 16 364 210");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("estadodemexico.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
        
        
        else if (Michoacan.contains(p)) {
            info.setText("Estado:Michoacan");
             habitantes.setText("abitantes: 4 529 914");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("michoacan.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
        
        
        
        else if (Morelos.contains(p)) {
            info.setText("Estado:Morelos");
             habitantes.setText("abitantes:1 874 188");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("morelos.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
          
        
        else if (Nayarit.contains(p)) {
            info.setText("Estado:  Nayarit");
             habitantes.setText("abitantes: 1 178 403");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("nayarit.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
          
        }
         
        else if (NuevoLeon.contains(p)) {
            info.setText("Estado: Nuevo Leon");
             habitantes.setText("abitantes: 4 941 059");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("nuevoleon.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
           
        }
        else if (Oaxaca.contains(p)) {
            info.setText("Estado: Oaxaca");
             habitantes.setText("abitantes: 3 959 042");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("oaxaca.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }   
           else if (Puebla.contains(p)) {
            info.setText("Estado: Puebla");
             habitantes.setText("abitantes: 6 067 607");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("puebla.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
          
        }   
           else if (Queretaro.contains(p)) {
            info.setText("Estado: Queretaro");
             habitantes.setText("abitantes: 1 943 889");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("queretaro.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }   
           else if (Quintanaroo.contains(p)) {
            info.setText("Estado: Quintana Roo");
             habitantes.setText("abitantes: 1 484 960");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("quintanaroo.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }   
        
         else if (SanLuisPotosi.contains(p)) {
            info.setText("Estado: San Luis Potosi");
             habitantes.setText("abitantes: 2 702 145");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("Sanluispotosi.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
           
        }   
            else if (Sinaloa.contains(p)) {
            info.setText("Estado: Sinaloa");
             habitantes.setText("abitantes: 2 932 313");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("sinaloa.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }   
        
           else if (Sonora.contains(p)) {
            info.setText("Estado: Sonora");
             habitantes.setText("abitantes: 2 851 462");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("sonora.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
           
        }
           else if (Tabasco.contains(p)) {
            info.setText("Estado: Tabasco");
             habitantes.setText("abitantes: 2 334 493");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("tabasco.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
          
        }
        
           else if (Tamaulipas.contains(p)) {
            info.setText("Estado: Tamaulipas");
             habitantes.setText("abitantes: 3 461 336");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("tamaulipas.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
             
           else if (Tlaxcala.contains(p)) {
            info.setText("Estado: Tlaxcala");
             habitantes.setText("abitantes: 1 242 734");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("tlaxcala.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
            else if (Veracruz.contains(p)) {
            info.setText("Estado: Veracruz");
             habitantes.setText("abitantes: 7 923 198");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("veracruz.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
         else if (Yucatan.contains(p)) {
            info.setText("Estado: Yucatan");
             habitantes.setText("abitantes: 2 064 151");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("yucatan.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
         else if (Zacatecas.contains(p)) {
            info.setText("Estado: Zacatecas");
             habitantes.setText("abitantes: 1 550 179");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("zacatecas.png"));
            img = aux.getImage();
        
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        else if (Zacatecas1.contains(p)) {
            info.setText("Estado: Zacatecas");
             habitantes.setText("abitantes: 1 550 179");
            try {
            ImageIcon aux = new ImageIcon(this.getClass().getResource("zacatecas.png"));
            img = aux.getImage();
       
            img = aux.getImage();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
        
        if (e.getSource() == boton) {
            if (pintar == true){
                
                pintar = false;
                   
            }
            else
            {
                pintar = true;
                  
        }
            
        }
        if (e.getSource() == botonMusica) {
            if (rola == true){
                
      rola = false;
                    AudioPlayer.player.start(audio);
            }
            else
            {
      rola = true;
                    AudioPlayer.player.stop(audio);
        }
            
        }
        
        repaint();
        
        
     /*if (e.getX() >195 && e.getX()<300&&e.getY()>152 && e.getY()<219)
     {
         info.setText("sonora");
     }
    
     if (e.getX() >195 && e.getX()<300&&e.getY()>152 && e.getY()<219)
     {
         info.setText("sonora");
     }
     */
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        
    }
} 


    
    
          
    
