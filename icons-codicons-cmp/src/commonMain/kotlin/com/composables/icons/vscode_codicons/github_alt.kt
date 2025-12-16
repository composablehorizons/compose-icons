package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GithubAlt: ImageVector
    get() {
        if (_GithubAlt != null) return _GithubAlt!!
        
        _GithubAlt = ImageVector.Builder(
            name = "github-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.0346f, 5.82524f)
                curveTo(21.9445f, 6.91709f, 22.3994f, 8.19091f, 22.3994f, 9.64671f)
                curveTo(22.3994f, 14.924f, 19.3969f, 16.4707f, 16.5763f, 16.9257f)
                curveTo(16.9402f, 17.5626f, 17.0312f, 18.2905f, 17.0312f, 19.0184f)
                verticalLineTo(22.7489f)
                curveTo(17.0312f, 23.2038f, 16.7582f, 23.4768f, 16.3943f, 23.4768f)
                curveTo(16.0303f, 23.4768f, 15.6664f, 23.2038f, 15.6664f, 22.7489f)
                verticalLineTo(19.0184f)
                curveTo(15.7574f, 18.1995f, 15.4844f, 17.4716f, 14.9385f, 16.9257f)
                lineTo(15.3934f, 15.7428f)
                curveTo(18.214f, 15.3789f, 21.1256f, 14.469f, 21.1256f, 9.55572f)
                curveTo(21.1256f, 8.37289f, 20.6707f, 7.28104f, 19.8518f, 6.37117f)
                lineTo(19.6698f, 5.64327f)
                curveTo(20.0338f, 4.7334f, 20.0338f, 3.73254f, 19.7608f, 2.91365f)
                curveTo(19.3059f, 3.00464f, 18.396f, 3.18661f, 16.8492f, 4.27846f)
                lineTo(16.3033f, 4.36945f)
                curveTo(14.1196f, 3.82352f, 11.9359f, 3.82352f, 9.75222f, 4.36945f)
                lineTo(9.2063f, 4.27846f)
                curveTo(7.56853f, 3.2776f, 6.65866f, 3.00464f, 6.20372f, 3.00464f)
                curveTo(5.93076f, 3.91451f, 5.93076f, 4.91537f, 6.29471f, 5.73426f)
                lineTo(6.11274f, 6.46215f)
                curveTo(5.20286f, 7.37203f, 4.74793f, 8.55486f, 4.74793f, 9.64671f)
                curveTo(4.74793f, 14.469f, 7.47754f, 15.4699f, 10.4801f, 15.8338f)
                lineTo(10.8441f, 17.0167f)
                curveTo(10.2981f, 17.5626f, 10.0252f, 18.2905f, 10.1162f, 19.0184f)
                verticalLineTo(19.9283f)
                verticalLineTo(20.0192f)
                verticalLineTo(22.8399f)
                curveTo(10.1162f, 23.2038f, 9.84321f, 23.5677f, 9.38828f, 23.5677f)
                curveTo(9.02433f, 23.5677f, 8.66038f, 23.2948f, 8.66038f, 22.8399f)
                verticalLineTo(20.7471f)
                curveTo(5.6578f, 21.3841f, 4.47497f, 19.8373f, 3.5651f, 18.6544f)
                curveTo(3.11016f, 18.1085f, 2.74621f, 17.6536f, 2.29127f, 17.5626f)
                curveTo(2.20029f, 17.4716f, 1.92733f, 17.1077f, 2.01831f, 16.7437f)
                curveTo(2.1093f, 16.3798f, 2.47325f, 16.1068f, 2.8372f, 16.2888f)
                curveTo(3.74707f, 16.4707f, 4.29299f, 17.1986f, 4.83892f, 17.8356f)
                curveTo(5.6578f, 18.9274f, 6.47669f, 19.9283f, 8.93334f, 19.3823f)
                verticalLineTo(19.0184f)
                curveTo(8.84235f, 18.2905f, 9.02433f, 17.5626f, 9.38828f, 16.9257f)
                curveTo(6.65866f, 16.3798f, 3.47411f, 14.833f, 3.47411f, 9.64671f)
                curveTo(3.47411f, 8.19091f, 3.92904f, 6.91709f, 4.83892f, 5.82524f)
                curveTo(4.56595f, 4.55142f, 4.65694f, 3.18661f, 5.11188f, 2.09477f)
                lineTo(5.56681f, 1.73082f)
                curveTo(5.74879f, 1.63983f, 7.02261f, 1.36687f, 9.66124f, 3.00464f)
                curveTo(11.8449f, 2.45872f, 14.1196f, 2.45872f, 16.3033f, 3.00464f)
                curveTo(18.8509f, 1.27588f, 20.2158f, 1.54884f, 20.3977f, 1.63983f)
                lineTo(20.8527f, 2.00378f)
                curveTo(21.3076f, 3.2776f, 21.3986f, 4.55142f, 21.0346f, 5.82524f)
                close()
            }
        }.build()
        
        return _GithubAlt!!
    }

private var _GithubAlt: ImageVector? = null

