package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.MenuButton: ImageVector
    get() {
        if (_MenuButton != null) return _MenuButton!!
        
        _MenuButton = ImageVector.Builder(
            name = "menu-button",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 1.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 5f)
                horizontalLineToRelative(8f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 3.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 0f)
                close()
                moveToRelative(5.927f, 2.427f)
                arcTo(0.25f, 0.25f, 0f, false, true, 7.604f, 2f)
                horizontalLineToRelative(0.792f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.177f, 0.427f)
                lineToRelative(-0.396f, 0.396f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.354f, 0f)
                close()
                moveTo(0f, 8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(1f, 3f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(14f, -1f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(2f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _MenuButton!!
    }

private var _MenuButton: ImageVector? = null

