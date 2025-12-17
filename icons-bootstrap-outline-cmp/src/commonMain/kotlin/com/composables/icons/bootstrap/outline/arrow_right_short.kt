package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowRightShort: ImageVector
    get() {
        if (_ArrowRightShort != null) return _ArrowRightShort!!
        
        _ArrowRightShort = ImageVector.Builder(
            name = "arrow-right-short",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5.793f)
                lineTo(8.146f, 5.354f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                lineToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(10.293f, 8.5f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 8f)
            }
        }.build()
        
        return _ArrowRightShort!!
    }

private var _ArrowRightShort: ImageVector? = null

