package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowDownLeft: ImageVector
    get() {
        if (_ArrowDownLeft != null) return _ArrowDownLeft!!
        
        _ArrowDownLeft = ImageVector.Builder(
            name = "arrow-down-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(3.707f)
                lineTo(13.854f, 2.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(3f, 12.293f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                close()
            }
        }.build()
        
        return _ArrowDownLeft!!
    }

private var _ArrowDownLeft: ImageVector? = null

