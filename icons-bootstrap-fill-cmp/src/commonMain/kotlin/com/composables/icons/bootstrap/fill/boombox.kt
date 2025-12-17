package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Boombox: ImageVector
    get() {
        if (_Boombox != null) return _Boombox!!
        
        _Boombox = ImageVector.Builder(
            name = "boombox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12.5f)
                verticalLineTo(0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 0f)
                moveTo(2f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                moveToRelative(7.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveToRelative(1.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                moveTo(9.5f, 3f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                moveTo(6f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                moveToRelative(-1.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveToRelative(7f, 1f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                moveToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(2f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -5f, 0f)
                moveToRelative(7f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -5f, 0f)
            }
        }.build()
        
        return _Boombox!!
    }

private var _Boombox: ImageVector? = null

