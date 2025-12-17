package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Hubspot: ImageVector
    get() {
        if (_Hubspot != null) return _Hubspot!!
        
        _Hubspot = ImageVector.Builder(
            name = "hubspot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(267.4f, 211.6f)
                curveToRelative(-25.1f, 23.7f, -40.8f, 57.3f, -40.8f, 94.6f)
                curveToRelative(0f, 29.3f, 9.7f, 56.3f, 26f, 78f)
                lineTo(203.1f, 434f)
                curveToRelative(-4.4f, -1.6f, -9.1f, -2.5f, -14f, -2.5f)
                curveToRelative(-10.8f, 0f, -20.9f, 4.2f, -28.5f, 11.8f)
                curveToRelative(-7.6f, 7.6f, -11.8f, 17.8f, -11.8f, 28.6f)
                reflectiveCurveToRelative(4.2f, 20.9f, 11.8f, 28.5f)
                curveToRelative(7.6f, 7.6f, 17.8f, 11.6f, 28.5f, 11.6f)
                curveToRelative(10.8f, 0f, 20.9f, -3.9f, 28.6f, -11.6f)
                curveToRelative(7.6f, -7.6f, 11.8f, -17.8f, 11.8f, -28.5f)
                curveToRelative(0f, -4.2f, -0.6f, -8.2f, -1.9f, -12.1f)
                lineToRelative(50f, -50.2f)
                curveToRelative(22f, 16.9f, 49.4f, 26.9f, 79.3f, 26.9f)
                curveToRelative(71.9f, 0f, 130f, -58.3f, 130f, -130.2f)
                curveToRelative(0f, -65.2f, -47.7f, -119.2f, -110.2f, -128.7f)
                verticalLineTo(116f)
                curveToRelative(17.5f, -7.4f, 28.2f, -23.8f, 28.2f, -42.9f)
                curveToRelative(0f, -26.1f, -20.9f, -47.9f, -47f, -47.9f)
                reflectiveCurveTo(311.2f, 47f, 311.2f, 73.1f)
                curveToRelative(0f, 19.1f, 10.7f, 35.5f, 28.2f, 42.9f)
                verticalLineToRelative(61.2f)
                curveToRelative(-15.2f, 2.1f, -29.6f, 6.7f, -42.7f, 13.6f)
                curveToRelative(-27.6f, -20.9f, -117.5f, -85.7f, -168.9f, -124.8f)
                curveToRelative(1.2f, -4.4f, 2f, -9f, 2f, -13.8f)
                curveTo(129.8f, 23.4f, 106.3f, 0f, 77.4f, 0f)
                curveTo(48.6f, 0f, 25.2f, 23.4f, 25.2f, 52.2f)
                curveToRelative(0f, 28.9f, 23.4f, 52.3f, 52.2f, 52.3f)
                curveToRelative(9.8f, 0f, 18.9f, -2.9f, 26.8f, -7.6f)
                lineToRelative(163.2f, 114.7f)
                close()
                moveToRelative(89.5f, 163.6f)
                curveToRelative(-38.1f, 0f, -69f, -30.9f, -69f, -69f)
                reflectiveCurveToRelative(30.9f, -69f, 69f, -69f)
                reflectiveCurveToRelative(69f, 30.9f, 69f, 69f)
                reflectiveCurveToRelative(-30.9f, 69f, -69f, 69f)
                close()
            }
        }.build()
        
        return _Hubspot!!
    }

private var _Hubspot: ImageVector? = null

