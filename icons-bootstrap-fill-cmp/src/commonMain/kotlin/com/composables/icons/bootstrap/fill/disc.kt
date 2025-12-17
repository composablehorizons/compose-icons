package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Disc: ImageVector
    get() {
        if (_Disc != null) return _Disc!!
        
        _Disc = ImageVector.Builder(
            name = "disc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-6f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                moveTo(4f, 8f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                moveToRelative(9f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, -5f)
            }
        }.build()
        
        return _Disc!!
    }

private var _Disc: ImageVector? = null

