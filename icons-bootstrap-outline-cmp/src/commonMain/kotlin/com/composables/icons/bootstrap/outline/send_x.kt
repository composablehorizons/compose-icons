package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SendX: ImageVector
    get() {
        if (_SendX != null) return _SendX!!
        
        _SendX = ImageVector.Builder(
            name = "send-x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.964f, 0.686f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.65f, -0.65f)
                lineTo(0.767f, 5.855f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.124f, 1.329f)
                lineToRelative(4.995f, 3.178f)
                lineToRelative(1.531f, 2.406f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.844f, -0.536f)
                lineTo(6.637f, 10.07f)
                lineToRelative(7.494f, -7.494f)
                lineToRelative(-1.895f, 4.738f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.928f, 0.372f)
                close()
                moveToRelative(-2.54f, 1.183f)
                lineTo(5.93f, 9.363f)
                lineTo(1.591f, 6.602f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 7f, 0f)
                moveToRelative(-4.854f, -1.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                lineToRelative(0.647f, 0.646f)
                lineToRelative(-0.647f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineToRelative(0.646f, -0.647f)
                lineToRelative(0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineToRelative(-0.647f, -0.646f)
                lineToRelative(0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineToRelative(-0.646f, 0.647f)
                lineToRelative(-0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
            }
        }.build()
        
        return _SendX!!
    }

private var _SendX: ImageVector? = null

