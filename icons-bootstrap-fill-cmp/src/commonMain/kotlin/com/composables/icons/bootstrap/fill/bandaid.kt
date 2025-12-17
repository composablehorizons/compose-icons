package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Bandaid: ImageVector
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
                moveTo(2.68f, 7.676f)
                lineToRelative(6.49f, -6.504f)
                arcToRelative(4f, 4f, 0f, false, true, 5.66f, 5.653f)
                lineToRelative(-1.477f, 1.529f)
                lineToRelative(-5.006f, 5.006f)
                lineToRelative(-1.523f, 1.472f)
                arcToRelative(4f, 4f, 0f, false, true, -5.653f, -5.66f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(1.505f, -1.492f)
                lineToRelative(0.001f, -0.002f)
                close()
                moveToRelative(5.71f, -2.858f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, -0.707f)
                close()
                moveTo(6.974f, 6.939f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.707f)
                moveTo(5.56f, 8.354f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.708f)
                moveToRelative(2.828f, 2.828f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.707f)
                moveToRelative(1.414f, -2.121f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, -0.707f)
                moveToRelative(1.414f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.706f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.708f)
                close()
                moveToRelative(-4.242f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, -0.707f)
                moveToRelative(1.414f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.708f)
                moveToRelative(1.414f, -2.122f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, -0.707f)
                moveTo(8.646f, 3.354f)
                lineToRelative(4f, 4f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(-4f, -4f)
                close()
                moveToRelative(-1.292f, 9.292f)
                lineToRelative(-4f, -4f)
                lineToRelative(-0.708f, 0.708f)
                lineToRelative(4f, 4f)
                close()
            }
        }.build()
        
        return _Bandaid!!
    }

private var _Bandaid: ImageVector? = null

