package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GraphUpArrow: ImageVector
    get() {
        if (_GraphUpArrow != null) return _GraphUpArrow!!
        
        _GraphUpArrow = ImageVector.Builder(
            name = "graph-up-arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                close()
                moveToRelative(10f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(4.9f)
                lineToRelative(-3.613f, 4.417f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.74f, 0.037f)
                lineTo(7.06f, 6.767f)
                lineToRelative(-3.656f, 5.027f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.808f, -0.588f)
                lineToRelative(4f, -5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.758f, -0.06f)
                lineToRelative(2.609f, 2.61f)
                lineTo(13.445f, 4f)
                horizontalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _GraphUpArrow!!
    }

private var _GraphUpArrow: ImageVector? = null

