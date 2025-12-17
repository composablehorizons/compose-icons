package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Stopwatch: ImageVector
    get() {
        if (_Stopwatch != null) return _Stopwatch!!
        
        _Stopwatch = ImageVector.Builder(
            name = "stopwatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(7f)
                verticalLineToRelative(1.07f)
                arcTo(7.001f, 7.001f, 0f, false, false, 8f, 16f)
                arcToRelative(7f, 7f, 0f, false, false, 5.29f, -11.584f)
                lineToRelative(0.013f, -0.012f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(0.353f, 0.354f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.707f, -0.707f)
                lineToRelative(-1.414f, -1.415f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, 0.707f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.012f, 0.012f)
                arcTo(6.97f, 6.97f, 0f, false, false, 9f, 2.071f)
                verticalLineTo(1f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(2f, 5.6f)
                verticalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(3f)
                verticalLineTo(5.6f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
            }
        }.build()
        
        return _Stopwatch!!
    }

private var _Stopwatch: ImageVector? = null

