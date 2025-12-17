package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Arrow90degRight: ImageVector
    get() {
        if (_Arrow90degRight != null) return _Arrow90degRight!!
        
        _Arrow90degRight = ImageVector.Builder(
            name = "arrow-90deg-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.854f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.708f)
                lineToRelative(-4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0.708f)
                lineTo(13.293f, 4f)
                horizontalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 1f, 6.5f)
                verticalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 5f)
                horizontalLineToRelative(9.793f)
                lineToRelative(-3.147f, 3.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _Arrow90degRight!!
    }

private var _Arrow90degRight: ImageVector? = null

