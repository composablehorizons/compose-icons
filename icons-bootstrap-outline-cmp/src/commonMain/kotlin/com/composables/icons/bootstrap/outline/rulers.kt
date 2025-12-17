package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Rulers: ImageVector
    get() {
        if (_Rulers != null) return _Rulers!!
        
        _Rulers = ImageVector.Builder(
            name = "rulers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineTo(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineToRelative(4f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _Rulers!!
    }

private var _Rulers: ImageVector? = null

