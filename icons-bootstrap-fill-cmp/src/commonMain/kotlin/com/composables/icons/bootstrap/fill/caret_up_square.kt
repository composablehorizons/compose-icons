package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CaretUpSquare: ImageVector
    get() {
        if (_CaretUpSquare != null) return _CaretUpSquare!!
        
        _CaretUpSquare = ImageVector.Builder(
            name = "caret-up-square",
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
                moveToRelative(4f, 9f)
                horizontalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.374f, -0.832f)
                lineToRelative(-4f, -4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.748f, 0f)
                lineToRelative(-4f, 4.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 4f, 11f)
            }
        }.build()
        
        return _CaretUpSquare!!
    }

private var _CaretUpSquare: ImageVector? = null

