package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MenuUp: ImageVector
    get() {
        if (_MenuUp != null) return _MenuUp!!
        
        _MenuUp = ImageVector.Builder(
            name = "menu-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.646f, 15.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineTo(10.207f, 14f)
                horizontalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(3.793f)
                close()
                moveTo(1f, 9f)
                verticalLineTo(6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(14f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-3.793f)
                arcToRelative(1f, 1f, 0f, false, false, -0.707f, 0.293f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.5f, -1.5f)
                arcTo(1f, 1f, 0f, false, false, 5.793f, 13f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(0f, -5f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
                moveTo(2f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveToRelative(0f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveToRelative(0f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
            }
        }.build()
        
        return _MenuUp!!
    }

private var _MenuUp: ImageVector? = null

