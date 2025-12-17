package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowsVertical: ImageVector
    get() {
        if (_ArrowsVertical != null) return _ArrowsVertical!!
        
        _ArrowsVertical = ImageVector.Builder(
            name = "arrows-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.354f, 14.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineToRelative(-2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, -0.708f)
                lineTo(7.5f, 13.293f)
                verticalLineTo(2.707f)
                lineTo(6.354f, 3.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                lineToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8.5f, 2.707f)
                verticalLineToRelative(10.586f)
                lineToRelative(1.146f, -1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _ArrowsVertical!!
    }

private var _ArrowsVertical: ImageVector? = null

