package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CaretLeftSquare: ImageVector
    get() {
        if (_CaretLeftSquare != null) return _CaretLeftSquare!!
        
        _CaretLeftSquare = ImageVector.Builder(
            name = "caret-left-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(10.5f, 10f)
                verticalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.832f, -0.374f)
                lineToRelative(-4.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.748f)
                lineToRelative(4.5f, 4f)
                arcTo(0.5f, 0.5f, 0f, false, false, 10.5f, 12f)
            }
        }.build()
        
        return _CaretLeftSquare!!
    }

private var _CaretLeftSquare: ImageVector? = null

