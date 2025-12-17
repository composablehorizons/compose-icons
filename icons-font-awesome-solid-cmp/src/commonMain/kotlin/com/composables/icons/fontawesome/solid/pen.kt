package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Pen: ImageVector
    get() {
        if (_Pen != null) return _Pen!!
        
        _Pen = ImageVector.Builder(
            name = "pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(290.74f, 93.24f)
                lineToRelative(128.02f, 128.02f)
                lineToRelative(-277.99f, 277.99f)
                lineToRelative(-114.14f, 12.6f)
                curveTo(11.35f, 513.54f, -1.56f, 500.62f, 0.14f, 485.34f)
                lineToRelative(12.7f, -114.22f)
                lineToRelative(277.9f, -277.88f)
                close()
                moveToRelative(207.2f, -19.06f)
                lineToRelative(-60.11f, -60.11f)
                curveToRelative(-18.75f, -18.75f, -49.16f, -18.75f, -67.91f, 0f)
                lineToRelative(-56.55f, 56.55f)
                lineToRelative(128.02f, 128.02f)
                lineToRelative(56.55f, -56.55f)
                curveToRelative(18.75f, -18.76f, 18.75f, -49.16f, 0f, -67.91f)
                close()
            }
        }.build()
        
        return _Pen!!
    }

private var _Pen: ImageVector? = null

