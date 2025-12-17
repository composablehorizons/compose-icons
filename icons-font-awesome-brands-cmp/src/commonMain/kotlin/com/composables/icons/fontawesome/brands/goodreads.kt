package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Goodreads: ImageVector
    get() {
        if (_Goodreads != null) return _Goodreads!!
        
        _Goodreads = ImageVector.Builder(
            name = "goodreads",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(299.9f, 191.2f)
                curveToRelative(5.1f, 37.3f, -4.7f, 79f, -35.9f, 100.7f)
                curveToRelative(-22.3f, 15.5f, -52.8f, 14.1f, -70.8f, 5.7f)
                curveToRelative(-37.1f, -17.3f, -49.5f, -58.6f, -46.8f, -97.2f)
                curveToRelative(4.3f, -60.9f, 40.9f, -87.9f, 75.3f, -87.5f)
                curveToRelative(46.9f, -0.2f, 71.8f, 31.8f, 78.2f, 78.3f)
                close()
                moveTo(448f, 88f)
                verticalLineToRelative(336f)
                curveToRelative(0f, 30.9f, -25.1f, 56f, -56f, 56f)
                horizontalLineTo(56f)
                curveToRelative(-30.9f, 0f, -56f, -25.1f, -56f, -56f)
                verticalLineTo(88f)
                curveToRelative(0f, -30.9f, 25.1f, -56f, 56f, -56f)
                horizontalLineToRelative(336f)
                curveToRelative(30.9f, 0f, 56f, 25.1f, 56f, 56f)
                close()
                moveTo(330f, 313.2f)
                reflectiveCurveToRelative(-0.1f, -34f, -0.1f, -217.3f)
                horizontalLineToRelative(-29f)
                verticalLineToRelative(40.3f)
                curveToRelative(-0.8f, 0.3f, -1.2f, -0.5f, -1.6f, -1.2f)
                curveToRelative(-9.6f, -20.7f, -35.9f, -46.3f, -76f, -46f)
                curveToRelative(-51.9f, 0.4f, -87.2f, 31.2f, -100.6f, 77.8f)
                curveToRelative(-4.3f, 14.9f, -5.8f, 30.1f, -5.5f, 45.6f)
                curveToRelative(1.7f, 77.9f, 45.1f, 117.8f, 112.4f, 115.2f)
                curveToRelative(28.9f, -1.1f, 54.5f, -17f, 69f, -45.2f)
                curveToRelative(0.5f, -1f, 1.1f, -1.9f, 1.7f, -2.9f)
                curveToRelative(0.2f, 0.1f, 0.4f, 0.1f, 0.6f, 0.2f)
                curveToRelative(0.3f, 3.8f, 0.2f, 30.7f, 0.1f, 34.5f)
                curveToRelative(-0.2f, 14.8f, -2f, 29.5f, -7.2f, 43.5f)
                curveToRelative(-7.8f, 21f, -22.3f, 34.7f, -44.5f, 39.5f)
                curveToRelative(-17.8f, 3.9f, -35.6f, 3.8f, -53.2f, -1.2f)
                curveToRelative(-21.5f, -6.1f, -36.5f, -19f, -41.1f, -41.8f)
                curveToRelative(-0.3f, -1.6f, -1.3f, -1.3f, -2.3f, -1.3f)
                horizontalLineToRelative(-26.8f)
                curveToRelative(0.8f, 10.6f, 3.2f, 20.3f, 8.5f, 29.2f)
                curveToRelative(24.2f, 40.5f, 82.7f, 48.5f, 128.2f, 37.4f)
                curveToRelative(49.9f, -12.3f, 67.3f, -54.9f, 67.4f, -106.3f)
                close()
            }
        }.build()
        
        return _Goodreads!!
    }

private var _Goodreads: ImageVector? = null

