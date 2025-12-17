package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowDownRight: ImageVector
    get() {
        if (_ArrowDownRight != null) return _ArrowDownRight!!
        
        _ArrowDownRight = ImageVector.Builder(
            name = "arrow-down-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(4.793f)
                lineTo(2.146f, 2.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                lineTo(13f, 12.293f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                close()
            }
        }.build()
        
        return _ArrowDownRight!!
    }

private var _ArrowDownRight: ImageVector? = null

