package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Magnet: ImageVector
    get() {
        if (_Magnet != null) return _Magnet!!
        
        _Magnet = ImageVector.Builder(
            name = "magnet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, 7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineTo(8f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineTo(8f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, -7f)
                moveToRelative(7f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(5f, 12f)
                horizontalLineTo(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-6f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(8f)
                horizontalLineTo(0f)
                close()
            }
        }.build()
        
        return _Magnet!!
    }

private var _Magnet: ImageVector? = null

