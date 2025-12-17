package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowLeft: ImageVector
    get() {
        if (_ArrowLeft != null) return _ArrowLeft!!
        
        _ArrowLeft = ImageVector.Builder(
            name = "arrow-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(2.707f)
                lineToRelative(3.147f, -3.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, -0.708f)
                lineToRelative(-4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                lineToRelative(4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(2.707f, 8.5f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 15f, 8f)
            }
        }.build()
        
        return _ArrowLeft!!
    }

private var _ArrowLeft: ImageVector? = null

