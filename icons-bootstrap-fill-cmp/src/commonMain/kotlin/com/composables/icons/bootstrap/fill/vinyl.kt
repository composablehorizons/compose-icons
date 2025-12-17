package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Vinyl: ImageVector
    get() {
        if (_Vinyl != null) return _Vinyl!!
        
        _Vinyl = ImageVector.Builder(
            name = "vinyl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 6f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                moveToRelative(0f, 3f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(4f, 8f)
                arcToRelative(4f, 4f, 0f, true, false, 8f, 0f)
                arcToRelative(4f, 4f, 0f, false, false, -8f, 0f)
            }
        }.build()
        
        return _Vinyl!!
    }

private var _Vinyl: ImageVector? = null

