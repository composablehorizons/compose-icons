package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Mask: ImageVector
    get() {
        if (_Mask != null) return _Mask!!
        
        _Mask = ImageVector.Builder(
            name = "mask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.225f, 1.227f)
                arcTo(7.5f, 7.5f, 0f, false, true, 10.5f, 8f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, -4.275f, 6.773f)
                arcToRelative(7f, 7f, 0f, true, false, 0f, -13.546f)
                moveTo(4.187f, 0.966f)
                arcToRelative(8f, 8f, 0f, true, true, 7.627f, 14.069f)
                arcTo(8f, 8f, 0f, false, true, 4.186f, 0.964f)
                close()
            }
        }.build()
        
        return _Mask!!
    }

private var _Mask: ImageVector? = null

