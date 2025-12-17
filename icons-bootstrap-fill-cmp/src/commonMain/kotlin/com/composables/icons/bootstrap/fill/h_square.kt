package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.HSquare: ImageVector
    get() {
        if (_HSquare != null) return _HSquare!!
        
        _HSquare = ImageVector.Builder(
            name = "h-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(9f, 4.002f)
                verticalLineTo(12f)
                horizontalLineTo(9.67f)
                verticalLineTo(8.455f)
                horizontalLineTo(6.33f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(4.002f)
                horizontalLineToRelative(1.33f)
                verticalLineToRelative(3.322f)
                horizontalLineToRelative(3.34f)
                verticalLineTo(4.002f)
                close()
            }
        }.build()
        
        return _HSquare!!
    }

private var _HSquare: ImageVector? = null

