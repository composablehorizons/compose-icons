package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 3.163f, -5f)
                horizontalLineTo(14f)
                lineTo(15.5f, 8f)
                lineTo(14f, 9.5f)
                lineToRelative(-1f, -1f)
                lineToRelative(-1f, 1f)
                lineToRelative(-1f, -1f)
                lineToRelative(-1f, 1f)
                lineToRelative(-1f, -1f)
                lineToRelative(-1f, 1f)
                horizontalLineTo(6.663f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.163f, 2f)
                moveTo(2.5f, 9f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

