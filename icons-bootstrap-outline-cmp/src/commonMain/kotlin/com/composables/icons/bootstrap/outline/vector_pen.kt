package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.VectorPen: ImageVector
    get() {
        if (_VectorPen != null) return _VectorPen!!
        
        _VectorPen = ImageVector.Builder(
            name = "vector-pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.646f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-1.902f, 1.902f)
                lineToRelative(-0.829f, 3.313f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.024f, 1.073f)
                lineTo(1.254f, 14.746f)
                lineTo(4.358f, 4.4f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.43f, 3.377f)
                lineToRelative(3.313f, -0.828f)
                close()
                moveToRelative(-1.8f, 2.908f)
                lineToRelative(-3.173f, 0.793f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.358f, 0.342f)
                lineToRelative(-2.57f, 8.565f)
                lineToRelative(8.567f, -2.57f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.34f, -0.357f)
                lineToRelative(0.794f, -3.174f)
                lineToRelative(-3.6f, -3.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.832f, 13.228f)
                lineTo(8f, 9f)
                arcToRelative(1f, 1f, 0f, true, false, -1f, -1f)
                lineToRelative(-4.228f, 5.168f)
                lineToRelative(-0.026f, 0.086f)
                close()
            }
        }.build()
        
        return _VectorPen!!
    }

private var _VectorPen: ImageVector? = null

