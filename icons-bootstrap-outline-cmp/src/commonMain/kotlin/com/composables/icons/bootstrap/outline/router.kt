package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Router: ImageVector
    get() {
        if (_Router != null) return _Router!!
        
        _Router = ImageVector.Builder(
            name = "router",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.525f, 3.025f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.95f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.707f, -0.707f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -6.364f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.707f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.94f, 4.44f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.12f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -3.536f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.707f)
                close()
                moveTo(2.5f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveToRelative(4.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                moveToRelative(2.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveToRelative(1.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.974f, 2.342f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.948f, 0.316f)
                lineTo(3.806f, 8f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 9.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 13f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                arcTo(0.5f, 0.5f, 0f, false, false, 5f, 13f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 8f)
                horizontalLineToRelative(-2.306f)
                lineToRelative(1.78f, -5.342f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.948f, -0.316f)
                lineTo(11.14f, 8f)
                horizontalLineTo(4.86f)
                close()
                moveTo(14.5f, 9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
            }
        }.build()
        
        return _Router!!
    }

private var _Router: ImageVector? = null

