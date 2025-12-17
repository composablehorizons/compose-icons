package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Highlighter: ImageVector
    get() {
        if (_Highlighter != null) return _Highlighter!!
        
        _Highlighter = ImageVector.Builder(
            name = "highlighter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 544f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 479.98f)
                lineTo(99.92f, 512f)
                lineToRelative(35.45f, -35.45f)
                lineToRelative(-67.04f, -67.04f)
                lineTo(0f, 479.98f)
                close()
                moveToRelative(124.61f, -240.01f)
                arcToRelative(36.592f, 36.592f, 0f, false, false, -10.79f, 38.1f)
                lineToRelative(13.05f, 42.83f)
                lineToRelative(-50.93f, 50.94f)
                lineToRelative(96.23f, 96.23f)
                lineToRelative(50.86f, -50.86f)
                lineToRelative(42.74f, 13.08f)
                curveToRelative(13.73f, 4.2f, 28.65f, -0.01f, 38.15f, -10.78f)
                lineToRelative(35.55f, -41.64f)
                lineToRelative(-173.34f, -173.34f)
                lineToRelative(-41.52f, 35.44f)
                close()
                moveToRelative(403.31f, -160.7f)
                lineToRelative(-63.2f, -63.2f)
                curveToRelative(-20.49f, -20.49f, -53.38f, -21.52f, -75.12f, -2.35f)
                lineTo(190.55f, 183.68f)
                lineToRelative(169.77f, 169.78f)
                lineTo(530.27f, 154.4f)
                curveToRelative(19.18f, -21.74f, 18.15f, -54.63f, -2.35f, -75.13f)
                close()
            }
        }.build()
        
        return _Highlighter!!
    }

private var _Highlighter: ImageVector? = null

