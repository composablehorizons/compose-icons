package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Gofore: ImageVector
    get() {
        if (_Gofore != null) return _Gofore!!
        
        _Gofore = ImageVector.Builder(
            name = "gofore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 400f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(324f, 319.8f)
                horizontalLineToRelative(-13.2f)
                verticalLineToRelative(34.7f)
                curveToRelative(-24.5f, 23.1f, -56.3f, 35.8f, -89.9f, 35.8f)
                curveToRelative(-73.2f, 0f, -132.4f, -60.2f, -132.4f, -134.4f)
                curveToRelative(0f, -74.1f, 59.2f, -134.4f, 132.4f, -134.4f)
                curveToRelative(35.3f, 0f, 68.6f, 14f, 93.6f, 39.4f)
                lineToRelative(62.3f, -63.3f)
                curveTo(335f, 55.3f, 279.7f, 32f, 220.7f, 32f)
                curveTo(98f, 32f, 0f, 132.6f, 0f, 256f)
                curveToRelative(0f, 122.5f, 97f, 224f, 220.7f, 224f)
                curveToRelative(63.2f, 0f, 124.5f, -26.2f, 171f, -82.5f)
                curveToRelative(-2f, -27.6f, -13.4f, -77.7f, -67.7f, -77.7f)
                close()
                moveToRelative(-12.1f, -112.5f)
                horizontalLineTo(205.6f)
                verticalLineToRelative(89f)
                horizontalLineTo(324f)
                curveToRelative(33.5f, 0f, 60.5f, 15.1f, 76f, 41.8f)
                verticalLineToRelative(-30.6f)
                curveToRelative(0f, -65.2f, -40.4f, -100.2f, -88.1f, -100.2f)
                close()
            }
        }.build()
        
        return _Gofore!!
    }

private var _Gofore: ImageVector? = null

