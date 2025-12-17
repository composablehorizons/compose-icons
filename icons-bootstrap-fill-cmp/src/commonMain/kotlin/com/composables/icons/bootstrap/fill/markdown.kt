package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Markdown: ImageVector
    get() {
        if (_Markdown != null) return _Markdown!!
        
        _Markdown = ImageVector.Builder(
            name = "markdown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(11.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.793f)
                lineTo(9.854f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(12f, 9.293f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                moveTo(3.56f, 7.01f)
                horizontalLineToRelative(0.056f)
                lineToRelative(1.428f, 3.239f)
                horizontalLineToRelative(0.774f)
                lineToRelative(1.42f, -3.24f)
                horizontalLineToRelative(0.056f)
                verticalLineTo(11f)
                horizontalLineToRelative(1.073f)
                verticalLineTo(5.001f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-1.71f, 3.894f)
                horizontalLineToRelative(-0.039f)
                lineToRelative(-1.71f, -3.894f)
                horizontalLineTo(2.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(1.06f)
                close()
            }
        }.build()
        
        return _Markdown!!
    }

private var _Markdown: ImageVector? = null

