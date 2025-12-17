package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CircleSquare: ImageVector
    get() {
        if (_CircleSquare != null) return _CircleSquare!!
        
        _CircleSquare = ImageVector.Builder(
            name = "circle-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 6f)
                arcToRelative(6f, 6f, 0f, true, true, 12f, 0f)
                arcTo(6f, 6f, 0f, false, true, 0f, 6f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.93f, 5f)
                horizontalLineToRelative(1.57f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.57f)
                arcToRelative(7f, 7f, 0f, false, true, -1f, -0.22f)
                verticalLineToRelative(1.79f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5.5f, 16f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 4f)
                horizontalLineToRelative(-1.79f)
                quadToRelative(0.145f, 0.486f, 0.22f, 1f)
            }
        }.build()
        
        return _CircleSquare!!
    }

private var _CircleSquare: ImageVector? = null

