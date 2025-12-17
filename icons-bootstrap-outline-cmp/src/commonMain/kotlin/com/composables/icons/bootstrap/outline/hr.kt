package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Hr: ImageVector
    get() {
        if (_Hr != null) return _Hr!!
        
        _Hr = ImageVector.Builder(
            name = "hr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveTo(2f, 9.5f)
                horizontalLineToRelative(1f)
                verticalLineTo(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(1f)
                verticalLineTo(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(-1.5f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
        }.build()
        
        return _Hr!!
    }

private var _Hr: ImageVector? = null

