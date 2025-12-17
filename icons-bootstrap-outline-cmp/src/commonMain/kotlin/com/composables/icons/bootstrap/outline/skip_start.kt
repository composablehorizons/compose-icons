package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SkipStart: ImageVector
    get() {
        if (_SkipStart != null) return _SkipStart!!
        
        _SkipStart = ImageVector.Builder(
            name = "skip-start",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(3.248f)
                lineToRelative(6.267f, -3.636f)
                curveToRelative(0.52f, -0.302f, 1.233f, 0.043f, 1.233f, 0.696f)
                verticalLineToRelative(7.384f)
                curveToRelative(0f, 0.653f, -0.713f, 0.998f, -1.233f, 0.696f)
                lineTo(5f, 8.752f)
                verticalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                close()
                moveToRelative(7.5f, 0.633f)
                lineTo(5.696f, 8f)
                lineToRelative(5.804f, 3.367f)
                close()
            }
        }.build()
        
        return _SkipStart!!
    }

private var _SkipStart: ImageVector? = null

