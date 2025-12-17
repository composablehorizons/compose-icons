package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Columns: ImageVector
    get() {
        if (_Columns != null) return _Columns!!
        
        _Columns = ImageVector.Builder(
            name = "columns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(8.5f, 0f)
                verticalLineToRelative(8f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                close()
                moveToRelative(0f, 9f)
                verticalLineToRelative(3f)
                horizontalLineTo(15f)
                verticalLineToRelative(-3f)
                close()
                moveToRelative(-1f, -9f)
                horizontalLineTo(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(1f, 14f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(6f)
                horizontalLineTo(1f)
                close()
            }
        }.build()
        
        return _Columns!!
    }

private var _Columns: ImageVector? = null

