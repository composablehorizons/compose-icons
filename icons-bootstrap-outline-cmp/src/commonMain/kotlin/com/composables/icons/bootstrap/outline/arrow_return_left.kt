package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowReturnLeft: ImageVector
    get() {
        if (_ArrowReturnLeft != null) return _ArrowReturnLeft!!
        
        _ArrowReturnLeft = ImageVector.Builder(
            name = "arrow-return-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4.8f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                horizontalLineTo(2.707f)
                lineToRelative(3.347f, 3.346f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineToRelative(-4.2f, -4.2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                lineToRelative(4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, 0.708f)
                lineTo(2.707f, 8.3f)
                horizontalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14f, 6.8f)
                verticalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _ArrowReturnLeft!!
    }

private var _ArrowReturnLeft: ImageVector? = null

