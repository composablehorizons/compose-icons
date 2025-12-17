package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Tools: ImageVector
    get() {
        if (_Tools != null) return _Tools!!
        
        _Tools = ImageVector.Builder(
            name = "tools",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 0f)
                lineTo(0f, 1f)
                lineToRelative(2.2f, 3.081f)
                arcToRelative(1f, 1f, 0f, false, false, 0.815f, 0.419f)
                horizontalLineToRelative(0.07f)
                arcToRelative(1f, 1f, 0f, false, true, 0.708f, 0.293f)
                lineToRelative(2.675f, 2.675f)
                lineToRelative(-2.617f, 2.654f)
                arcTo(3.003f, 3.003f, 0f, false, false, 0f, 13f)
                arcToRelative(3f, 3f, 0f, true, false, 5.878f, -0.851f)
                lineToRelative(2.654f, -2.617f)
                lineToRelative(0.968f, 0.968f)
                lineToRelative(-0.305f, 0.914f)
                arcToRelative(1f, 1f, 0f, false, false, 0.242f, 1.023f)
                lineToRelative(3.27f, 3.27f)
                arcToRelative(0.997f, 0.997f, 0f, false, false, 1.414f, 0f)
                lineToRelative(1.586f, -1.586f)
                arcToRelative(0.997f, 0.997f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-3.27f, -3.27f)
                arcToRelative(1f, 1f, 0f, false, false, -1.023f, -0.242f)
                lineTo(10.5f, 9.5f)
                lineToRelative(-0.96f, -0.96f)
                lineToRelative(2.68f, -2.643f)
                arcTo(3.005f, 3.005f, 0f, false, false, 16f, 3f)
                quadToRelative(0f, -0.405f, -0.102f, -0.777f)
                lineToRelative(-2.14f, 2.141f)
                lineTo(12f, 4f)
                lineToRelative(-0.364f, -1.757f)
                lineTo(13.777f, 0.102f)
                arcToRelative(3f, 3f, 0f, false, false, -3.675f, 3.68f)
                lineTo(7.462f, 6.46f)
                lineTo(4.793f, 3.793f)
                arcToRelative(1f, 1f, 0f, false, true, -0.293f, -0.707f)
                verticalLineToRelative(-0.071f)
                arcToRelative(1f, 1f, 0f, false, false, -0.419f, -0.814f)
                close()
                moveToRelative(9.646f, 10.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(2.914f, 2.915f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.707f)
                lineToRelative(-2.915f, -2.914f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                moveTo(3f, 11f)
                lineToRelative(0.471f, 0.242f)
                lineToRelative(0.529f, 0.026f)
                lineToRelative(0.287f, 0.445f)
                lineToRelative(0.445f, 0.287f)
                lineToRelative(0.026f, 0.529f)
                lineTo(5f, 13f)
                lineToRelative(-0.242f, 0.471f)
                lineToRelative(-0.026f, 0.529f)
                lineToRelative(-0.445f, 0.287f)
                lineToRelative(-0.287f, 0.445f)
                lineToRelative(-0.529f, 0.026f)
                lineTo(3f, 15f)
                lineToRelative(-0.471f, -0.242f)
                lineTo(2f, 14.732f)
                lineToRelative(-0.287f, -0.445f)
                lineTo(1.268f, 14f)
                lineToRelative(-0.026f, -0.529f)
                lineTo(1f, 13f)
                lineToRelative(0.242f, -0.471f)
                lineToRelative(0.026f, -0.529f)
                lineToRelative(0.445f, -0.287f)
                lineToRelative(0.287f, -0.445f)
                lineToRelative(0.529f, -0.026f)
                close()
            }
        }.build()
        
        return _Tools!!
    }

private var _Tools: ImageVector? = null

