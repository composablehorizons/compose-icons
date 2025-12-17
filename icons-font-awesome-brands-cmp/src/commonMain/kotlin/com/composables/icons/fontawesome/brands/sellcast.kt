package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Sellcast: ImageVector
    get() {
        if (_Sellcast != null) return _Sellcast!!
        
        _Sellcast = ImageVector.Builder(
            name = "sellcast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(353.4f, 32f)
                horizontalLineTo(94.7f)
                curveTo(42.6f, 32f, 0f, 74.6f, 0f, 126.6f)
                verticalLineToRelative(258.7f)
                curveTo(0f, 437.4f, 42.6f, 480f, 94.7f, 480f)
                horizontalLineToRelative(258.7f)
                curveToRelative(52.1f, 0f, 94.7f, -42.6f, 94.7f, -94.6f)
                verticalLineTo(126.6f)
                curveToRelative(0f, -52f, -42.6f, -94.6f, -94.7f, -94.6f)
                close()
                moveToRelative(-50f, 316.4f)
                curveToRelative(-27.9f, 48.2f, -89.9f, 64.9f, -138.2f, 37.2f)
                curveToRelative(-22.9f, 39.8f, -54.9f, 8.6f, -42.3f, -13.2f)
                lineToRelative(15.7f, -27.2f)
                curveToRelative(5.9f, -10.3f, 19.2f, -13.9f, 29.5f, -7.9f)
                curveToRelative(18.6f, 10.8f, -0.1f, -0.1f, 18.5f, 10.7f)
                curveToRelative(27.6f, 15.9f, 63.4f, 6.3f, 79.4f, -21.3f)
                curveToRelative(15.9f, -27.6f, 6.3f, -63.4f, -21.3f, -79.4f)
                curveToRelative(-17.8f, -10.2f, -0.6f, -0.4f, -18.6f, -10.6f)
                curveToRelative(-24.6f, -14.2f, -3.4f, -51.9f, 21.6f, -37.5f)
                curveToRelative(18.6f, 10.8f, -0.1f, -0.1f, 18.5f, 10.7f)
                curveToRelative(48.4f, 28f, 65.1f, 90.3f, 37.2f, 138.5f)
                close()
                moveToRelative(21.8f, -208.8f)
                curveToRelative(-17f, 29.5f, -16.3f, 28.8f, -19f, 31.5f)
                curveToRelative(-6.5f, 6.5f, -16.3f, 8.7f, -26.5f, 3.6f)
                curveToRelative(-18.6f, -10.8f, 0.1f, 0.1f, -18.5f, -10.7f)
                curveToRelative(-27.6f, -15.9f, -63.4f, -6.3f, -79.4f, 21.3f)
                reflectiveCurveToRelative(-6.3f, 63.4f, 21.3f, 79.4f)
                curveToRelative(0f, 0f, 18.5f, 10.6f, 18.6f, 10.6f)
                curveToRelative(24.6f, 14.2f, 3.4f, 51.9f, -21.6f, 37.5f)
                curveToRelative(-18.6f, -10.8f, 0.1f, 0.1f, -18.5f, -10.7f)
                curveToRelative(-48.2f, -27.8f, -64.9f, -90.1f, -37.1f, -138.4f)
                curveToRelative(27.9f, -48.2f, 89.9f, -64.9f, 138.2f, -37.2f)
                lineToRelative(4.8f, -8.4f)
                curveToRelative(14.3f, -24.9f, 52f, -3.3f, 37.7f, 21.5f)
                close()
            }
        }.build()
        
        return _Sellcast!!
    }

private var _Sellcast: ImageVector? = null

