package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Mitten: ImageVector
    get() {
        if (_Mitten != null) return _Mitten!!
        
        _Mitten = ImageVector.Builder(
            name = "mitten",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 416f)
                horizontalLineTo(48f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(320f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(57f, -209.1f)
                curveToRelative(-27.2f, -22.6f, -67.5f, -19f, -90.1f, 8.2f)
                lineToRelative(-20.9f, 25f)
                lineToRelative(-29.6f, -128.4f)
                curveToRelative(-18f, -77.5f, -95.4f, -125.9f, -172.8f, -108f)
                curveTo(34.2f, 21.6f, -14.2f, 98.9f, 3.7f, 176.4f)
                lineTo(51.6f, 384f)
                horizontalLineToRelative(309f)
                lineToRelative(72.5f, -87f)
                curveToRelative(22.7f, -27.2f, 19f, -67.5f, -8.1f, -90.1f)
                close()
            }
        }.build()
        
        return _Mitten!!
    }

private var _Mitten: ImageVector? = null

