package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Wind: ImageVector
    get() {
        if (_Wind != null) return _Wind!!
        
        _Wind = ImageVector.Builder(
            name = "wind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 2f)
                arcTo(2.5f, 2.5f, 0f, false, false, 10f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcTo(3.5f, 3.5f, 0f, true, true, 12.5f, 8f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -5f)
                moveToRelative(-7f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(2f, 2f, 0f, true, true, 2f, 2f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveTo(0f, 9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 9f)
                horizontalLineToRelative(10.042f)
                arcToRelative(3f, 3f, 0f, true, true, -3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, -2f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _Wind!!
    }

private var _Wind: ImageVector? = null

