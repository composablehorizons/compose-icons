package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Stopwatch: ImageVector
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
                moveTo(8.5f, 5.6f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 1f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                verticalLineToRelative(0.57f)
                curveToRelative(1.36f, 0.196f, 2.594f, 0.78f, 3.584f, 1.64f)
                lineToRelative(0.012f, -0.013f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(-0.354f, -0.353f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.708f)
                lineToRelative(1.414f, 1.415f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, 0.707f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.013f, 0.012f)
                arcTo(7f, 7f, 0f, true, true, 7f, 2.071f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(8f, 3f)
                arcToRelative(6f, 6f, 0f, true, false, 0.001f, 12f)
                arcTo(6f, 6f, 0f, false, false, 8f, 3f)
            }
        }.build()
        
        return _Stopwatch!!
    }

private var _Stopwatch: ImageVector? = null

