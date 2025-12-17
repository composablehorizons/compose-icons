package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileRuled: ImageVector
    get() {
        if (_FileRuled != null) return _FileRuled!!
        
        _FileRuled = ImageVector.Builder(
            name = "file-ruled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(12f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveToRelative(2f, 7f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                close()
                moveToRelative(-9f, 3f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                close()
                moveToRelative(-3f, -4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineToRelative(3f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _FileRuled!!
    }

private var _FileRuled: ImageVector? = null

