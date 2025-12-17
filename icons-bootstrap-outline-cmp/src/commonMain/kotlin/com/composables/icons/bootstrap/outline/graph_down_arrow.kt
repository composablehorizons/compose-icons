package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GraphDownArrow: ImageVector
    get() {
        if (_GraphDownArrow != null) return _GraphDownArrow!!
        
        _GraphDownArrow = ImageVector.Builder(
            name = "graph-down-arrow",
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
                moveToRelative(10f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(2.6f)
                lineToRelative(-3.613f, -4.417f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.74f, -0.037f)
                lineTo(7.06f, 8.233f)
                lineTo(3.404f, 3.206f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.808f, 0.588f)
                lineToRelative(4f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.758f, 0.06f)
                lineToRelative(2.609f, -2.61f)
                lineTo(13.445f, 11f)
                horizontalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
            }
        }.build()
        
        return _GraphDownArrow!!
    }

private var _GraphDownArrow: ImageVector? = null

