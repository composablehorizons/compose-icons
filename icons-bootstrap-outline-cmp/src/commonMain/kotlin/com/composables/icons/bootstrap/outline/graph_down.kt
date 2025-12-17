package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GraphDown: ImageVector
    get() {
        if (_GraphDown != null) return _GraphDown!!
        
        _GraphDown = ImageVector.Builder(
            name = "graph-down",
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
                moveToRelative(14.817f, 11.887f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.07f, -0.704f)
                lineToRelative(-4.5f, -5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.74f, -0.037f)
                lineTo(7.06f, 8.233f)
                lineTo(3.404f, 3.206f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.808f, 0.588f)
                lineToRelative(4f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.758f, 0.06f)
                lineToRelative(2.609f, -2.61f)
                lineToRelative(4.15f, 5.073f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.704f, 0.07f)
            }
        }.build()
        
        return _GraphDown!!
    }

private var _GraphDown: ImageVector? = null

