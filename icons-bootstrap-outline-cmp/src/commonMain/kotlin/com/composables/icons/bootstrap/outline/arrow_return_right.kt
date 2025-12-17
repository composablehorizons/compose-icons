package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowReturnRight: ImageVector
    get() {
        if (_ArrowReturnRight != null) return _ArrowReturnRight!!
        
        _ArrowReturnRight = ImageVector.Builder(
            name = "arrow-return-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 1.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 1f, 2f)
                verticalLineToRelative(4.8f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(9.793f)
                lineToRelative(-3.347f, 3.346f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineToRelative(4.2f, -4.2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.708f)
                lineToRelative(-4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0.708f)
                lineTo(13.293f, 8.3f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 6.8f)
                verticalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
            }
        }.build()
        
        return _ArrowReturnRight!!
    }

private var _ArrowReturnRight: ImageVector? = null

