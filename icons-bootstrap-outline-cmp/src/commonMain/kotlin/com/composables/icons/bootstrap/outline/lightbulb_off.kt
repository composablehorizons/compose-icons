package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.LightbulbOff: ImageVector
    get() {
        if (_LightbulbOff != null) return _LightbulbOff!!
        
        _LightbulbOff = ImageVector.Builder(
            name = "lightbulb-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.23f, 4.35f)
                arcTo(6f, 6f, 0f, false, false, 2f, 6f)
                curveToRelative(0f, 1.691f, 0.7f, 3.22f, 1.826f, 4.31f)
                curveToRelative(0.203f, 0.196f, 0.359f, 0.4f, 0.453f, 0.619f)
                lineToRelative(0.762f, 1.769f)
                arcTo(0.5f, 0.5f, 0f, false, false, 5.5f, 13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                lineToRelative(0.224f, 0.447f)
                arcToRelative(1f, 1f, 0f, false, false, 0.894f, 0.553f)
                horizontalLineToRelative(2.764f)
                arcToRelative(1f, 1f, 0f, false, false, 0.894f, -0.553f)
                lineTo(10.5f, 15f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.288f, -0.091f)
                lineTo(9.878f, 12f)
                horizontalLineTo(5.83f)
                lineToRelative(-0.632f, -1.467f)
                arcToRelative(3f, 3f, 0f, false, false, -0.676f, -0.941f)
                arcToRelative(4.98f, 4.98f, 0f, false, true, -1.455f, -4.405f)
                close()
                moveToRelative(1.588f, -2.653f)
                lineToRelative(0.708f, 0.707f)
                arcToRelative(5f, 5f, 0f, false, true, 7.07f, 7.07f)
                lineToRelative(0.707f, 0.707f)
                arcToRelative(6f, 6f, 0f, false, false, -8.484f, -8.484f)
                close()
                moveToRelative(-2.172f, -0.051f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(12f, 12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineToRelative(-12f, -12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
            }
        }.build()
        
        return _LightbulbOff!!
    }

private var _LightbulbOff: ImageVector? = null

