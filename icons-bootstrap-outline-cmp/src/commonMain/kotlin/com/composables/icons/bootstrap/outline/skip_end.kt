package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SkipEnd: ImageVector
    get() {
        if (_SkipEnd != null) return _SkipEnd!!
        
        _SkipEnd = ImageVector.Builder(
            name = "skip-end",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(3.248f)
                lineTo(5.233f, 3.612f)
                curveTo(4.713f, 3.31f, 4f, 3.655f, 4f, 4.308f)
                verticalLineToRelative(7.384f)
                curveToRelative(0f, 0.653f, 0.713f, 0.998f, 1.233f, 0.696f)
                lineTo(11.5f, 8.752f)
                verticalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
                moveTo(5f, 4.633f)
                lineTo(10.804f, 8f)
                lineTo(5f, 11.367f)
                close()
            }
        }.build()
        
        return _SkipEnd!!
    }

private var _SkipEnd: ImageVector? = null

