package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bandaid: ImageVector
    get() {
        if (_Bandaid != null) return _Bandaid!!
        
        _Bandaid = ImageVector.Builder(
            name = "bandaid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.121f, 1.879f)
                arcToRelative(3f, 3f, 0f, false, false, -4.242f, 0f)
                lineTo(8.733f, 3.026f)
                lineToRelative(4.261f, 4.26f)
                lineToRelative(1.127f, -1.165f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -4.242f)
                moveTo(12.293f, 8f)
                lineTo(8.027f, 3.734f)
                lineTo(3.738f, 8.031f)
                lineTo(8f, 12.293f)
                close()
                moveToRelative(-5.006f, 4.994f)
                lineTo(3.03f, 8.737f)
                lineTo(1.879f, 9.88f)
                arcToRelative(3f, 3f, 0f, false, false, 4.241f, 4.24f)
                lineToRelative(0.006f, -0.006f)
                lineToRelative(1.16f, -1.121f)
                close()
                moveTo(2.679f, 7.676f)
                lineToRelative(6.492f, -6.504f)
                arcToRelative(4f, 4f, 0f, false, true, 5.66f, 5.653f)
                lineToRelative(-1.477f, 1.529f)
                lineToRelative(-5.006f, 5.006f)
                lineToRelative(-1.523f, 1.472f)
                arcToRelative(4f, 4f, 0f, false, true, -5.653f, -5.66f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(1.505f, -1.492f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.56f, 7.646f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.706f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.708f)
                close()
                moveToRelative(1.415f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.707f)
                moveTo(8.39f, 4.818f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.707f)
                close()
                moveToRelative(0f, 5.657f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.707f)
                close()
                moveTo(9.803f, 9.06f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.707f)
                close()
                moveToRelative(1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.706f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.708f)
                close()
                moveTo(6.975f, 9.06f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.707f)
                close()
                moveTo(8.39f, 7.646f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.708f)
                close()
                moveToRelative(1.413f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.707f)
            }
        }.build()
        
        return _Bandaid!!
    }

private var _Bandaid: ImageVector? = null

