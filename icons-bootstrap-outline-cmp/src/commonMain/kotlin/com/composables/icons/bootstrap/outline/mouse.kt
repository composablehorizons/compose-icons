package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Mouse: ImageVector
    get() {
        if (_Mouse != null) return _Mouse!!
        
        _Mouse = ImageVector.Builder(
            name = "mouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 3f)
                moveToRelative(4f, 8f)
                arcToRelative(4f, 4f, 0f, false, true, -8f, 0f)
                verticalLineTo(5f)
                arcToRelative(4f, 4f, 0f, true, true, 8f, 0f)
                close()
                moveTo(8f, 0f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, 5f)
                verticalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, false, false, 10f, 0f)
                verticalLineTo(5f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, -5f)
            }
        }.build()
        
        return _Mouse!!
    }

private var _Mouse: ImageVector? = null

