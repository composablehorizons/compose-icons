package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Threads: ImageVector
    get() {
        if (_Threads != null) return _Threads!!
        
        _Threads = ImageVector.Builder(
            name = "threads",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.81f, 9.204f)
                curveToRelative(0f, -0.41f, 0.197f, -1.062f, 1.727f, -1.062f)
                curveToRelative(0.469f, 0f, 0.758f, 0.034f, 1.146f, 0.121f)
                curveToRelative(-0.124f, 1.606f, -0.91f, 1.818f, -1.674f, 1.818f)
                curveToRelative(-0.418f, 0f, -1.2f, -0.218f, -1.2f, -0.877f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.59f, 16f)
                horizontalLineToRelative(10.82f)
                arcTo(2.59f, 2.59f, 0f, false, false, 16f, 13.41f)
                verticalLineTo(2.59f)
                arcTo(2.59f, 2.59f, 0f, false, false, 13.41f, 0f)
                horizontalLineTo(2.59f)
                arcTo(2.59f, 2.59f, 0f, false, false, 0f, 2.59f)
                verticalLineToRelative(10.82f)
                arcTo(2.59f, 2.59f, 0f, false, false, 2.59f, 16f)
                moveTo(5.866f, 5.91f)
                curveToRelative(0.567f, -0.81f, 1.315f, -1.126f, 2.35f, -1.126f)
                curveToRelative(0.73f, 0f, 1.351f, 0.246f, 1.795f, 0.711f)
                curveToRelative(0.443f, 0.466f, 0.696f, 1.132f, 0.754f, 1.983f)
                quadToRelative(0.368f, 0.154f, 0.678f, 0.363f)
                curveToRelative(0.832f, 0.559f, 1.29f, 1.395f, 1.29f, 2.353f)
                curveToRelative(0f, 2.037f, -1.67f, 3.806f, -4.692f, 3.806f)
                curveToRelative(-2.595f, 0f, -5.291f, -1.51f, -5.291f, -6.004f)
                curveTo(2.75f, 3.526f, 5.361f, 2f, 8.033f, 2f)
                curveToRelative(1.234f, 0f, 4.129f, 0.182f, 5.217f, 3.777f)
                lineToRelative(-1.02f, 0.264f)
                curveToRelative(-0.842f, -2.56f, -2.607f, -2.968f, -4.224f, -2.968f)
                curveToRelative(-2.675f, 0f, -4.187f, 1.628f, -4.187f, 5.093f)
                curveToRelative(0f, 3.107f, 1.69f, 4.757f, 4.222f, 4.757f)
                curveToRelative(2.083f, 0f, 3.636f, -1.082f, 3.636f, -2.667f)
                curveToRelative(0f, -1.079f, -0.906f, -1.595f, -0.953f, -1.595f)
                curveToRelative(-0.177f, 0.925f, -0.651f, 2.482f, -2.733f, 2.482f)
                curveToRelative(-1.213f, 0f, -2.26f, -0.838f, -2.26f, -1.936f)
                curveToRelative(0f, -1.568f, 1.488f, -2.136f, 2.663f, -2.136f)
                curveToRelative(0.44f, 0f, 0.97f, 0.03f, 1.247f, 0.086f)
                curveToRelative(0f, -0.478f, -0.404f, -1.296f, -1.426f, -1.296f)
                curveToRelative(-0.911f, 0f, -1.16f, 0.288f, -1.45f, 0.624f)
                lineToRelative(-0.024f, 0.027f)
                curveToRelative(-0.202f, -0.135f, -0.875f, -0.601f, -0.875f, -0.601f)
                close()
            }
        }.build()
        
        return _Threads!!
    }

private var _Threads: ImageVector? = null

