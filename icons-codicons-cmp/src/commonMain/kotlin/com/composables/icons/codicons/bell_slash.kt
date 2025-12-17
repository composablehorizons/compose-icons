package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.BellSlash: ImageVector
    get() {
        if (_BellSlash != null) return _BellSlash!!
        
        _BellSlash = ImageVector.Builder(
            name = "bell-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.23901f, 3.118f)
                lineTo(4.53201f, 2.411f)
                curveTo(5.43201f, 1.541f, 6.65201f, 1f, 7.99901f, 1f)
                curveTo(10.756f, 1f, 12.999f, 3.243f, 12.999f, 6f)
                verticalLineTo(9.901f)
                lineTo(13.65f, 11.529f)
                lineTo(11.999f, 9.878f)
                verticalLineTo(5.999f)
                curveTo(11.999f, 3.793f, 10.205f, 1.999f, 7.99901f, 1.999f)
                curveTo(6.92701f, 1.999f, 5.95701f, 2.428f, 5.23801f, 3.117f)
                lineTo(5.23901f, 3.118f)
                close()
                moveTo(14.854f, 14.854f)
                curveTo(14.756f, 14.952f, 14.628f, 15f, 14.5f, 15f)
                curveTo(14.372f, 15f, 14.244f, 14.951f, 14.146f, 14.854f)
                lineTo(12.292f, 13f)
                horizontalLineTo(9.99901f)
                curveTo(9.99901f, 14.108f, 9.10701f, 15f, 7.99901f, 15f)
                curveTo(6.89101f, 15f, 5.99901f, 14.108f, 5.99901f, 13f)
                horizontalLineTo(2.49901f)
                curveTo(2.33301f, 13f, 2.17801f, 12.918f, 2.08501f, 12.78f)
                curveTo(1.99201f, 12.643f, 1.97301f, 12.468f, 2.03501f, 12.314f)
                lineTo(2.99901f, 9.901f)
                verticalLineTo(6f)
                curveTo(2.99901f, 5.325f, 3.14601f, 4.688f, 3.39501f, 4.103f)
                lineTo(1.14601f, 1.854f)
                curveTo(0.951006f, 1.659f, 0.951006f, 1.342f, 1.14601f, 1.147f)
                curveTo(1.34101f, 0.952f, 1.65801f, 0.952f, 1.85301f, 1.147f)
                lineTo(14.853f, 14.147f)
                curveTo(15.048f, 14.342f, 15.048f, 14.659f, 14.853f, 14.854f)
                horizontalLineTo(14.854f)
                close()
                moveTo(9.00001f, 13f)
                horizontalLineTo(7.00001f)
                curveTo(7.00001f, 13.556f, 7.44401f, 14f, 8.00001f, 14f)
                curveTo(8.55601f, 14f, 9.00001f, 13.556f, 9.00001f, 13f)
                close()
                moveTo(11.293f, 12f)
                lineTo(4.16301f, 4.87f)
                curveTo(4.05701f, 5.228f, 4.00001f, 5.607f, 4.00001f, 6f)
                verticalLineTo(9.998f)
                curveTo(4.00001f, 10.062f, 3.98801f, 10.125f, 3.96401f, 10.184f)
                lineTo(3.23801f, 12.001f)
                horizontalLineTo(11.293f)
                verticalLineTo(12f)
                close()
            }
        }.build()
        
        return _BellSlash!!
    }

private var _BellSlash: ImageVector? = null

