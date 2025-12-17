package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Tumblr: ImageVector
    get() {
        if (_Tumblr != null) return _Tumblr!!
        
        _Tumblr = ImageVector.Builder(
            name = "tumblr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(309.8f, 480.3f)
                curveToRelative(-13.6f, 14.5f, -50f, 31.7f, -97.4f, 31.7f)
                curveToRelative(-120.8f, 0f, -147f, -88.8f, -147f, -140.6f)
                verticalLineToRelative(-144f)
                horizontalLineTo(17.9f)
                curveToRelative(-5.5f, 0f, -10f, -4.5f, -10f, -10f)
                verticalLineToRelative(-68f)
                curveToRelative(0f, -7.2f, 4.5f, -13.6f, 11.3f, -16f)
                curveToRelative(62f, -21.8f, 81.5f, -76f, 84.3f, -117.1f)
                curveToRelative(0.8f, -11f, 6.5f, -16.3f, 16.1f, -16.3f)
                horizontalLineToRelative(70.9f)
                curveToRelative(5.5f, 0f, 10f, 4.5f, 10f, 10f)
                verticalLineToRelative(115.2f)
                horizontalLineToRelative(83f)
                curveToRelative(5.5f, 0f, 10f, 4.4f, 10f, 9.9f)
                verticalLineToRelative(81.7f)
                curveToRelative(0f, 5.5f, -4.5f, 10f, -10f, 10f)
                horizontalLineToRelative(-83.4f)
                verticalLineTo(360f)
                curveToRelative(0f, 34.2f, 23.7f, 53.6f, 68f, 35.8f)
                curveToRelative(4.8f, -1.9f, 9f, -3.2f, 12.7f, -2.2f)
                curveToRelative(3.5f, 0.9f, 5.8f, 3.4f, 7.4f, 7.9f)
                lineToRelative(22f, 64.3f)
                curveToRelative(1.8f, 5f, 3.3f, 10.6f, -0.4f, 14.5f)
                close()
            }
        }.build()
        
        return _Tumblr!!
    }

private var _Tumblr: ImageVector? = null

