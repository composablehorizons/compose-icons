package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ImageAlt: ImageVector
    get() {
        if (_ImageAlt != null) return _ImageAlt!!
        
        _ImageAlt = ImageVector.Builder(
            name = "image-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                moveToRelative(4.225f, 4.053f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.577f, 0.093f)
                lineToRelative(-3.71f, 4.71f)
                lineToRelative(-2.66f, -2.772f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.63f, 0.062f)
                lineTo(0.002f, 13f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }.build()
        
        return _ImageAlt!!
    }

private var _ImageAlt: ImageVector? = null

