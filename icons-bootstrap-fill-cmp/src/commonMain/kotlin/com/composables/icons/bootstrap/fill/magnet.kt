package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Magnet: ImageVector
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
                moveTo(15f, 12f)
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

