package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Grid3x3: ImageVector
    get() {
        if (_Grid3x3 != null) return _Grid3x3!!
        
        _Grid3x3 = ImageVector.Builder(
            name = "grid-3x3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 0f)
                horizontalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 1.5f)
                verticalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 14.5f)
                close()
                moveTo(1.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(5f)
                horizontalLineToRelative(4f)
                verticalLineTo(1f)
                close()
                moveTo(5f, 6f)
                horizontalLineTo(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(1f, 4f)
                horizontalLineToRelative(4f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                close()
                moveToRelative(-1f, 1f)
                horizontalLineTo(1f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(5f)
                close()
                moveToRelative(1f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
                moveToRelative(5f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(11f)
                close()
                moveToRelative(0f, -1f)
                horizontalLineToRelative(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(0f, -5f)
                horizontalLineToRelative(4f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(11f)
                close()
                moveToRelative(-1f, 0f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Grid3x3!!
    }

private var _Grid3x3: ImageVector? = null

