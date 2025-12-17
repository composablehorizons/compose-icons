package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Backspace: ImageVector
    get() {
        if (_Backspace != null) return _Backspace!!
        
        _Backspace = ImageVector.Builder(
            name = "backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(576f, 64f)
                horizontalLineTo(205.26f)
                arcTo(63.97f, 63.97f, 0f, false, false, 160f, 82.75f)
                lineTo(9.37f, 233.37f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.76f, 0f, 45.25f)
                lineTo(160f, 429.25f)
                curveToRelative(12f, 12f, 28.28f, 18.75f, 45.25f, 18.75f)
                horizontalLineTo(576f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                verticalLineTo(128f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                close()
                moveToRelative(-84.69f, 254.06f)
                curveToRelative(6.25f, 6.25f, 6.25f, 16.38f, 0f, 22.63f)
                lineToRelative(-22.62f, 22.62f)
                curveToRelative(-6.25f, 6.25f, -16.38f, 6.25f, -22.63f, 0f)
                lineTo(384f, 301.25f)
                lineToRelative(-62.06f, 62.06f)
                curveToRelative(-6.25f, 6.25f, -16.38f, 6.25f, -22.63f, 0f)
                lineToRelative(-22.62f, -22.62f)
                curveToRelative(-6.25f, -6.25f, -6.25f, -16.38f, 0f, -22.63f)
                lineTo(338.75f, 256f)
                lineToRelative(-62.06f, -62.06f)
                curveToRelative(-6.25f, -6.25f, -6.25f, -16.38f, 0f, -22.63f)
                lineToRelative(22.62f, -22.62f)
                curveToRelative(6.25f, -6.25f, 16.38f, -6.25f, 22.63f, 0f)
                lineTo(384f, 210.75f)
                lineToRelative(62.06f, -62.06f)
                curveToRelative(6.25f, -6.25f, 16.38f, -6.25f, 22.63f, 0f)
                lineToRelative(22.62f, 22.62f)
                curveToRelative(6.25f, 6.25f, 6.25f, 16.38f, 0f, 22.63f)
                lineTo(429.25f, 256f)
                lineToRelative(62.06f, 62.06f)
                close()
            }
        }.build()
        
        return _Backspace!!
    }

private var _Backspace: ImageVector? = null

