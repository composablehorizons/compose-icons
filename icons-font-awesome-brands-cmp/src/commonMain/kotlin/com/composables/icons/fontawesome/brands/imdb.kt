package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Imdb: ImageVector
    get() {
        if (_Imdb != null) return _Imdb!!
        
        _Imdb = ImageVector.Builder(
            name = "imdb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(21.3f, 229.2f)
                horizontalLineTo(21f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.3f, 0.3f, -0.4f)
                close()
                moveTo(97f, 319.8f)
                horizontalLineTo(64f)
                verticalLineTo(192f)
                horizontalLineToRelative(33f)
                close()
                moveToRelative(113.2f, 0f)
                horizontalLineToRelative(-28.7f)
                verticalLineToRelative(-86.4f)
                lineToRelative(-11.6f, 86.4f)
                horizontalLineToRelative(-20.6f)
                lineToRelative(-12.2f, -84.5f)
                verticalLineToRelative(84.5f)
                horizontalLineToRelative(-29f)
                verticalLineTo(192f)
                horizontalLineToRelative(42.8f)
                curveToRelative(3.3f, 19.8f, 6f, 39.9f, 8.7f, 59.9f)
                lineToRelative(7.6f, -59.9f)
                horizontalLineToRelative(43f)
                close()
                moveToRelative(11.4f, 0f)
                verticalLineTo(192f)
                horizontalLineToRelative(24.6f)
                curveToRelative(17.6f, 0f, 44.7f, -1.6f, 49f, 20.9f)
                curveToRelative(1.7f, 7.6f, 1.4f, 16.3f, 1.4f, 24.4f)
                curveToRelative(0f, 88.5f, 11.1f, 82.6f, -75f, 82.5f)
                close()
                moveToRelative(160.9f, -29.2f)
                curveToRelative(0f, 15.7f, -2.4f, 30.9f, -22.2f, 30.9f)
                curveToRelative(-9f, 0f, -15.2f, -3f, -20.9f, -9.8f)
                lineToRelative(-1.9f, 8.1f)
                horizontalLineToRelative(-29.8f)
                verticalLineTo(192f)
                horizontalLineToRelative(31.7f)
                verticalLineToRelative(41.7f)
                curveToRelative(6f, -6.5f, 12f, -9.2f, 20.9f, -9.2f)
                curveToRelative(21.4f, 0f, 22.2f, 12.8f, 22.2f, 30.1f)
                close()
                moveTo(265f, 229.9f)
                curveToRelative(0f, -9.7f, 1.6f, -16f, -10.3f, -16f)
                verticalLineToRelative(83.7f)
                curveToRelative(12.2f, 0.3f, 10.3f, -8.7f, 10.3f, -18.4f)
                close()
                moveToRelative(85.5f, 26.1f)
                curveToRelative(0f, -5.4f, 1.1f, -12.7f, -6.2f, -12.7f)
                curveToRelative(-6f, 0f, -4.9f, 8.9f, -4.9f, 12.7f)
                curveToRelative(0f, 0.6f, -1.1f, 39.6f, 1.1f, 44.7f)
                curveToRelative(0.8f, 1.6f, 2.2f, 2.4f, 3.8f, 2.4f)
                curveToRelative(7.8f, 0f, 6.2f, -9f, 6.2f, -14.4f)
                close()
            }
        }.build()
        
        return _Imdb!!
    }

private var _Imdb: ImageVector? = null

