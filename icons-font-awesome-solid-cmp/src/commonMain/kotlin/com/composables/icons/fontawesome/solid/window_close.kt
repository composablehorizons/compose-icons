package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.WindowClose: ImageVector
    get() {
        if (_WindowClose != null) return _WindowClose!!
        
        _WindowClose = ImageVector.Builder(
            name = "window-close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-83.6f, 290.5f)
                curveToRelative(4.8f, 4.8f, 4.8f, 12.6f, 0f, 17.4f)
                lineToRelative(-40.5f, 40.5f)
                curveToRelative(-4.8f, 4.8f, -12.6f, 4.8f, -17.4f, 0f)
                lineTo(256f, 313.3f)
                lineToRelative(-66.5f, 67.1f)
                curveToRelative(-4.8f, 4.8f, -12.6f, 4.8f, -17.4f, 0f)
                lineToRelative(-40.5f, -40.5f)
                curveToRelative(-4.8f, -4.8f, -4.8f, -12.6f, 0f, -17.4f)
                lineToRelative(67.1f, -66.5f)
                lineToRelative(-67.1f, -66.5f)
                curveToRelative(-4.8f, -4.8f, -4.8f, -12.6f, 0f, -17.4f)
                lineToRelative(40.5f, -40.5f)
                curveToRelative(4.8f, -4.8f, 12.6f, -4.8f, 17.4f, 0f)
                lineToRelative(66.5f, 67.1f)
                lineToRelative(66.5f, -67.1f)
                curveToRelative(4.8f, -4.8f, 12.6f, -4.8f, 17.4f, 0f)
                lineToRelative(40.5f, 40.5f)
                curveToRelative(4.8f, 4.8f, 4.8f, 12.6f, 0f, 17.4f)
                lineTo(313.3f, 256f)
                lineToRelative(67.1f, 66.5f)
                close()
            }
        }.build()
        
        return _WindowClose!!
    }

private var _WindowClose: ImageVector? = null

