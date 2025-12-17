package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Researchgate: ImageVector
    get() {
        if (_Researchgate != null) return _Researchgate!!
        
        _Researchgate = ImageVector.Builder(
            name = "researchgate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                verticalLineToRelative(448f)
                horizontalLineToRelative(448f)
                verticalLineTo(32f)
                horizontalLineTo(0f)
                close()
                moveToRelative(262.2f, 334.4f)
                curveToRelative(-6.6f, 3f, -33.2f, 6f, -50f, -14.2f)
                curveToRelative(-9.2f, -10.6f, -25.3f, -33.3f, -42.2f, -63.6f)
                curveToRelative(-8.9f, 0f, -14.7f, 0f, -21.4f, -0.6f)
                verticalLineToRelative(46.4f)
                curveToRelative(0f, 23.5f, 6f, 21.2f, 25.8f, 23.9f)
                verticalLineToRelative(8.1f)
                curveToRelative(-6.9f, -0.3f, -23.1f, -0.8f, -35.6f, -0.8f)
                curveToRelative(-13.1f, 0f, -26.1f, 0.6f, -33.6f, 0.8f)
                verticalLineToRelative(-8.1f)
                curveToRelative(15.5f, -2.9f, 22f, -1.3f, 22f, -23.9f)
                verticalLineTo(225f)
                curveToRelative(0f, -22.6f, -6.4f, -21f, -22f, -23.9f)
                verticalLineTo(193f)
                curveToRelative(25.8f, 1f, 53.1f, -0.6f, 70.9f, -0.6f)
                curveToRelative(31.7f, 0f, 55.9f, 14.4f, 55.9f, 45.6f)
                curveToRelative(0f, 21.1f, -16.7f, 42.2f, -39.2f, 47.5f)
                curveToRelative(13.6f, 24.2f, 30f, 45.6f, 42.2f, 58.9f)
                curveToRelative(7.2f, 7.8f, 17.2f, 14.7f, 27.2f, 14.7f)
                verticalLineToRelative(7.3f)
                close()
                moveToRelative(22.9f, -135f)
                curveToRelative(-23.3f, 0f, -32.2f, -15.7f, -32.2f, -32.2f)
                verticalLineTo(167f)
                curveToRelative(0f, -12.2f, 8.8f, -30.4f, 34f, -30.4f)
                reflectiveCurveToRelative(30.4f, 17.9f, 30.4f, 17.9f)
                lineToRelative(-10.7f, 7.2f)
                reflectiveCurveToRelative(-5.5f, -12.5f, -19.7f, -12.5f)
                curveToRelative(-7.9f, 0f, -19.7f, 7.3f, -19.7f, 19.7f)
                verticalLineToRelative(26.8f)
                curveToRelative(0f, 13.4f, 6.6f, 23.3f, 17.9f, 23.3f)
                curveToRelative(14.1f, 0f, 21.5f, -10.9f, 21.5f, -26.8f)
                horizontalLineToRelative(-17.9f)
                verticalLineToRelative(-10.7f)
                horizontalLineToRelative(30.4f)
                curveToRelative(0f, 20.5f, 4.7f, 49.9f, -34f, 49.9f)
                close()
                moveToRelative(-116.5f, 44.7f)
                curveToRelative(-9.4f, 0f, -13.6f, -0.3f, -20f, -0.8f)
                verticalLineToRelative(-69.7f)
                curveToRelative(6.4f, -0.6f, 15f, -0.6f, 22.5f, -0.6f)
                curveToRelative(23.3f, 0f, 37.2f, 12.2f, 37.2f, 34.5f)
                curveToRelative(0f, 21.9f, -15f, 36.6f, -39.7f, 36.6f)
                close()
            }
        }.build()
        
        return _Researchgate!!
    }

private var _Researchgate: ImageVector? = null

