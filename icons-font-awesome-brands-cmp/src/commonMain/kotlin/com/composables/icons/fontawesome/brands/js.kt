package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Js: ImageVector
    get() {
        if (_Js != null) return _Js!!
        
        _Js = ImageVector.Builder(
            name = "js",
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
                moveToRelative(243.8f, 349.4f)
                curveToRelative(0f, 43.6f, -25.6f, 63.5f, -62.9f, 63.5f)
                curveToRelative(-33.7f, 0f, -53.2f, -17.4f, -63.2f, -38.5f)
                lineToRelative(34.3f, -20.7f)
                curveToRelative(6.6f, 11.7f, 12.6f, 21.6f, 27.1f, 21.6f)
                curveToRelative(13.8f, 0f, 22.6f, -5.4f, 22.6f, -26.5f)
                verticalLineTo(237.7f)
                horizontalLineToRelative(42.1f)
                verticalLineToRelative(143.7f)
                close()
                moveToRelative(99.6f, 63.5f)
                curveToRelative(-39.1f, 0f, -64.4f, -18.6f, -76.7f, -43f)
                lineToRelative(34.3f, -19.8f)
                curveToRelative(9f, 14.7f, 20.8f, 25.6f, 41.5f, 25.6f)
                curveToRelative(17.4f, 0f, 28.6f, -8.7f, 28.6f, -20.8f)
                curveToRelative(0f, -14.4f, -11.4f, -19.5f, -30.7f, -28f)
                lineToRelative(-10.5f, -4.5f)
                curveToRelative(-30.4f, -12.9f, -50.5f, -29.2f, -50.5f, -63.5f)
                curveToRelative(0f, -31.6f, 24.1f, -55.6f, 61.6f, -55.6f)
                curveToRelative(26.8f, 0f, 46f, 9.3f, 59.8f, 33.7f)
                lineTo(368f, 290f)
                curveToRelative(-7.2f, -12.9f, -15f, -18f, -27.1f, -18f)
                curveToRelative(-12.3f, 0f, -20.1f, 7.8f, -20.1f, 18f)
                curveToRelative(0f, 12.6f, 7.8f, 17.7f, 25.9f, 25.6f)
                lineToRelative(10.5f, 4.5f)
                curveToRelative(35.8f, 15.3f, 55.9f, 31f, 55.9f, 66.2f)
                curveToRelative(0f, 37.8f, -29.8f, 58.6f, -69.7f, 58.6f)
                close()
            }
        }.build()
        
        return _Js!!
    }

private var _Js: ImageVector? = null

