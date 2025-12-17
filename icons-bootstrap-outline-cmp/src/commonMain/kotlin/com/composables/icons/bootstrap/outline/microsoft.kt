package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Microsoft: ImageVector
    get() {
        if (_Microsoft != null) return _Microsoft!!
        
        _Microsoft = ImageVector.Builder(
            name = "microsoft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.462f, 0f)
                horizontalLineTo(0f)
                verticalLineToRelative(7.19f)
                horizontalLineToRelative(7.462f)
                close()
                moveTo(16f, 0f)
                horizontalLineTo(8.538f)
                verticalLineToRelative(7.19f)
                horizontalLineTo(16f)
                close()
                moveTo(7.462f, 8.211f)
                horizontalLineTo(0f)
                verticalLineTo(16f)
                horizontalLineToRelative(7.462f)
                close()
                moveToRelative(8.538f, 0f)
                horizontalLineTo(8.538f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                close()
            }
        }.build()
        
        return _Microsoft!!
    }

private var _Microsoft: ImageVector? = null

