package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TextareaResize: ImageVector
    get() {
        if (_TextareaResize != null) return _TextareaResize!!
        
        _TextareaResize = ImageVector.Builder(
            name = "textarea-resize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2.5f, 2f)
                horizontalLineToRelative(11f)
                arcTo(2.5f, 2.5f, 0f, false, true, 16f, 4.5f)
                verticalLineToRelative(7f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-11f)
                arcTo(2.5f, 2.5f, 0f, false, true, 0f, 11.5f)
                close()
                moveTo(2.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 4.5f)
                verticalLineToRelative(7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 13f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.5f, 3f)
                close()
                moveToRelative(10.854f, 4.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineToRelative(3f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                moveToRelative(0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
            }
        }.build()
        
        return _TextareaResize!!
    }

private var _TextareaResize: ImageVector? = null

