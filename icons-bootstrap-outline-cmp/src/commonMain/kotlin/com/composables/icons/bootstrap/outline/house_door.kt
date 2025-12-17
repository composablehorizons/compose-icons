package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HouseDoor: ImageVector
    get() {
        if (_HouseDoor != null) return _HouseDoor!!
        
        _HouseDoor = ImageVector.Builder(
            name = "house-door",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.354f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
                lineToRelative(-6f, 6f)
                arcTo(0.5f, 0.5f, 0f, false, false, 1.5f, 7.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.146f, -0.354f)
                lineTo(13f, 5.793f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.293f)
                close()
                moveTo(2.5f, 14f)
                verticalLineTo(7.707f)
                lineToRelative(5.5f, -5.5f)
                lineToRelative(5.5f, 5.5f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _HouseDoor!!
    }

private var _HouseDoor: ImageVector? = null

