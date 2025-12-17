package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Radiation: ImageVector
    get() {
        if (_Radiation != null) return _Radiation!!
        
        _Radiation = ImageVector.Builder(
            name = "radiation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(328.2f, 255.8f)
                horizontalLineToRelative(151.6f)
                curveToRelative(9.1f, 0f, 16.8f, -7.7f, 16.2f, -16.8f)
                curveToRelative(-5.1f, -75.8f, -44.4f, -142.2f, -102.5f, -184.2f)
                curveToRelative(-7.4f, -5.3f, -17.9f, -2.9f, -22.7f, 4.8f)
                lineTo(290.4f, 188f)
                curveToRelative(22.6f, 14.3f, 37.8f, 39.2f, 37.8f, 67.8f)
                close()
                moveToRelative(-37.8f, 67.7f)
                curveToRelative(-12.3f, 7.7f, -26.8f, 12.4f, -42.4f, 12.4f)
                curveToRelative(-15.6f, 0f, -30f, -4.7f, -42.4f, -12.4f)
                lineTo(125.2f, 452f)
                curveToRelative(-4.8f, 7.7f, -2.4f, 18.1f, 5.6f, 22.4f)
                curveTo(165.7f, 493.2f, 205.6f, 504f, 248f, 504f)
                reflectiveCurveToRelative(82.3f, -10.8f, 117.2f, -29.6f)
                curveToRelative(8f, -4.3f, 10.4f, -14.8f, 5.6f, -22.4f)
                lineToRelative(-80.4f, -128.5f)
                close()
                moveTo(248f, 303.8f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                reflectiveCurveToRelative(-21.5f, -48f, -48f, -48f)
                reflectiveCurveToRelative(-48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                close()
                moveToRelative(-231.8f, -48f)
                horizontalLineToRelative(151.6f)
                curveToRelative(0f, -28.6f, 15.2f, -53.5f, 37.8f, -67.7f)
                lineTo(125.2f, 59.7f)
                curveToRelative(-4.8f, -7.7f, -15.3f, -10.2f, -22.7f, -4.8f)
                curveTo(44.4f, 96.9f, 5.1f, 163.3f, 0f, 239.1f)
                curveToRelative(-0.6f, 9f, 7.1f, 16.7f, 16.2f, 16.7f)
                close()
            }
        }.build()
        
        return _Radiation!!
    }

private var _Radiation: ImageVector? = null

