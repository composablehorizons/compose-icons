package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowUpLeftSquare: ImageVector
    get() {
        if (_ArrowUpLeftSquare != null) return _ArrowUpLeftSquare!!
        
        _ArrowUpLeftSquare = ImageVector.Builder(
            name = "arrow-up-left-square",
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
                moveToRelative(8.096f, 10.803f)
                lineTo(6f, 6.707f)
                verticalLineToRelative(2.768f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineTo(6.707f)
                lineToRelative(4.096f, 4.096f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, 0.707f)
            }
        }.build()
        
        return _ArrowUpLeftSquare!!
    }

private var _ArrowUpLeftSquare: ImageVector? = null

