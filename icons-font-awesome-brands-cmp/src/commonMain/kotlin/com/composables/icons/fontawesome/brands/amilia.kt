package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Amilia: ImageVector
    get() {
        if (_Amilia != null) return _Amilia!!
        
        _Amilia = ImageVector.Builder(
            name = "amilia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240.1f, 32f)
                curveToRelative(-61.9f, 0f, -131.5f, 16.9f, -184.2f, 55.4f)
                curveToRelative(-5.1f, 3.1f, -9.1f, 9.2f, -7.2f, 19.4f)
                curveToRelative(1.1f, 5.1f, 5.1f, 27.4f, 10.2f, 39.6f)
                curveToRelative(4.1f, 10.2f, 14.2f, 10.2f, 20.3f, 6.1f)
                curveToRelative(32.5f, -22.3f, 96.5f, -47.7f, 152.3f, -47.7f)
                curveToRelative(57.9f, 0f, 58.9f, 28.4f, 58.9f, 73.1f)
                verticalLineToRelative(38.5f)
                curveTo(203f, 227.7f, 78.2f, 251f, 46.7f, 264.2f)
                curveTo(11.2f, 280.5f, 16.3f, 357.7f, 16.3f, 376f)
                reflectiveCurveToRelative(15.2f, 104f, 124.9f, 104f)
                curveToRelative(47.8f, 0f, 113.7f, -20.7f, 153.3f, -42.1f)
                verticalLineToRelative(25.4f)
                curveToRelative(0f, 3f, 2.1f, 8.2f, 6.1f, 9.1f)
                curveToRelative(3.1f, 1f, 50.7f, 2f, 59.9f, 2f)
                reflectiveCurveToRelative(62.5f, 0.3f, 66.5f, -0.7f)
                curveToRelative(4.1f, -1f, 5.1f, -6.1f, 5.1f, -9.1f)
                verticalLineTo(168f)
                curveToRelative(-0.1f, -80.3f, -57.9f, -136f, -192f, -136f)
                close()
                moveToRelative(50.2f, 348f)
                curveToRelative(-21.4f, 13.2f, -48.7f, 24.4f, -79.1f, 24.4f)
                curveToRelative(-52.8f, 0f, -58.9f, -33.5f, -59f, -44.7f)
                curveToRelative(0f, -12.2f, -3f, -42.7f, 18.3f, -52.9f)
                curveToRelative(24.3f, -13.2f, 75.1f, -29.4f, 119.8f, -33.5f)
                close()
            }
        }.build()
        
        return _Amilia!!
    }

private var _Amilia: ImageVector? = null

