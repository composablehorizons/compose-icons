package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.WindowClose: ImageVector
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
                moveToRelative(0f, 394f)
                curveToRelative(0f, 3.3f, -2.7f, 6f, -6f, 6f)
                horizontalLineTo(54f)
                curveToRelative(-3.3f, 0f, -6f, -2.7f, -6f, -6f)
                verticalLineTo(86f)
                curveToRelative(0f, -3.3f, 2.7f, -6f, 6f, -6f)
                horizontalLineToRelative(404f)
                curveToRelative(3.3f, 0f, 6f, 2.7f, 6f, 6f)
                verticalLineToRelative(340f)
                close()
                moveTo(356.5f, 194.6f)
                lineTo(295.1f, 256f)
                lineToRelative(61.4f, 61.4f)
                curveToRelative(4.6f, 4.6f, 4.6f, 12.1f, 0f, 16.8f)
                lineToRelative(-22.3f, 22.3f)
                curveToRelative(-4.6f, 4.6f, -12.1f, 4.6f, -16.8f, 0f)
                lineTo(256f, 295.1f)
                lineToRelative(-61.4f, 61.4f)
                curveToRelative(-4.6f, 4.6f, -12.1f, 4.6f, -16.8f, 0f)
                lineToRelative(-22.3f, -22.3f)
                curveToRelative(-4.6f, -4.6f, -4.6f, -12.1f, 0f, -16.8f)
                lineToRelative(61.4f, -61.4f)
                lineToRelative(-61.4f, -61.4f)
                curveToRelative(-4.6f, -4.6f, -4.6f, -12.1f, 0f, -16.8f)
                lineToRelative(22.3f, -22.3f)
                curveToRelative(4.6f, -4.6f, 12.1f, -4.6f, 16.8f, 0f)
                lineToRelative(61.4f, 61.4f)
                lineToRelative(61.4f, -61.4f)
                curveToRelative(4.6f, -4.6f, 12.1f, -4.6f, 16.8f, 0f)
                lineToRelative(22.3f, 22.3f)
                curveToRelative(4.7f, 4.6f, 4.7f, 12.1f, 0f, 16.8f)
                close()
            }
        }.build()
        
        return _WindowClose!!
    }

private var _WindowClose: ImageVector? = null

