package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Send: ImageVector
    get() {
        if (_Send != null) return _Send!!
        
        _Send = ImageVector.Builder(
            name = "send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.854f, 0.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.11f, 0.54f)
                lineToRelative(-5.819f, 14.547f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.329f, 0.124f)
                lineToRelative(-3.178f, -4.995f)
                lineTo(0.643f, 7.184f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.124f, -1.33f)
                lineTo(15.314f, 0.037f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.54f, 0.11f)
                close()
                moveTo(6.636f, 10.07f)
                lineToRelative(2.761f, 4.338f)
                lineTo(14.13f, 2.576f)
                close()
                moveToRelative(6.787f, -8.201f)
                lineTo(1.591f, 6.602f)
                lineToRelative(4.339f, 2.76f)
                close()
            }
        }.build()
        
        return _Send!!
    }

private var _Send: ImageVector? = null

