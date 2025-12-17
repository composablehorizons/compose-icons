package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.AppIndicator: ImageVector
    get() {
        if (_AppIndicator != null) return _AppIndicator!!
        
        _AppIndicator = ImageVector.Builder(
            name = "app-indicator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 2f)
                arcTo(3.5f, 3.5f, 0f, false, false, 2f, 5.5f)
                verticalLineToRelative(5f)
                arcTo(3.5f, 3.5f, 0f, false, false, 5.5f, 14f)
                horizontalLineToRelative(5f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 3.5f, -3.5f)
                verticalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(2.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -4.5f, 4.5f)
                horizontalLineToRelative(-5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 1f, 10.5f)
                verticalLineToRelative(-5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 5.5f, 1f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 3f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
            }
        }.build()
        
        return _AppIndicator!!
    }

private var _AppIndicator: ImageVector? = null

