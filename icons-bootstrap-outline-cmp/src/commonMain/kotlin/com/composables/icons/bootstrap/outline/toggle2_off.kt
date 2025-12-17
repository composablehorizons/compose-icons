package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Toggle2Off: ImageVector
    get() {
        if (_Toggle2Off != null) return _Toggle2Off!!
        
        _Toggle2Off = ImageVector.Builder(
            name = "toggle2-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 11f)
                curveToRelative(0.628f, -0.836f, 1f, -1.874f, 1f, -3f)
                arcToRelative(4.98f, 4.98f, 0f, false, false, -1f, -3f)
                horizontalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 12f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, -8f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                moveToRelative(0f, 1f)
                arcTo(5f, 5f, 0f, true, false, 5f, 3f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, 10f)
            }
        }.build()
        
        return _Toggle2Off!!
    }

private var _Toggle2Off: ImageVector? = null

