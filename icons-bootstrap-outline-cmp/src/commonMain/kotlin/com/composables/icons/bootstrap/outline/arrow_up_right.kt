package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowUpRight: ImageVector
    get() {
        if (_ArrowUpRight != null) return _ArrowUpRight!!
        
        _ArrowUpRight = ImageVector.Builder(
            name = "arrow-up-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(4.793f)
                lineTo(2.146f, 13.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(13f, 3.707f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
            }
        }.build()
        
        return _ArrowUpRight!!
    }

private var _ArrowUpRight: ImageVector? = null

