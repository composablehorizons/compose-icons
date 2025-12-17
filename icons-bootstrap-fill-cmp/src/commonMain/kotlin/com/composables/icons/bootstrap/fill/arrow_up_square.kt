package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowUpSquare: ImageVector
    get() {
        if (_ArrowUpSquare != null) return _ArrowUpSquare!!
        
        _ArrowUpSquare = ImageVector.Builder(
            name = "arrow-up-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 16f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                close()
                moveToRelative(6.5f, -4.5f)
                verticalLineTo(5.707f)
                lineToRelative(2.146f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, 0.708f)
                lineTo(7.5f, 5.707f)
                verticalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
            }
        }.build()
        
        return _ArrowUpSquare!!
    }

private var _ArrowUpSquare: ImageVector? = null

