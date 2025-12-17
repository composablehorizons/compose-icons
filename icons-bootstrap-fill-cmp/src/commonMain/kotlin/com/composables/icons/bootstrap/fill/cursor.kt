package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Cursor: ImageVector
    get() {
        if (_Cursor != null) return _Cursor!!
        
        _Cursor = ImageVector.Builder(
            name = "cursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.082f, 2.182f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.103f, 0.557f)
                lineTo(8.528f, 15.467f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.917f, -0.007f)
                lineTo(5.57f, 10.694f)
                lineTo(0.803f, 8.652f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.006f, -0.916f)
                lineToRelative(12.728f, -5.657f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.556f, 0.103f)
                close()
            }
        }.build()
        
        return _Cursor!!
    }

private var _Cursor: ImageVector? = null

