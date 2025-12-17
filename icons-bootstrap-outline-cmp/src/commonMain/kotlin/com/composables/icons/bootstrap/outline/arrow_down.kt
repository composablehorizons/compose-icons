package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowDown: ImageVector
    get() {
        if (_ArrowDown != null) return _ArrowDown!!
        
        _ArrowDown = ImageVector.Builder(
            name = "arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(11.793f)
                lineToRelative(3.146f, -3.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                lineToRelative(-4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineToRelative(-4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, -0.708f)
                lineTo(7.5f, 13.293f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 1f)
            }
        }.build()
        
        return _ArrowDown!!
    }

private var _ArrowDown: ImageVector? = null

