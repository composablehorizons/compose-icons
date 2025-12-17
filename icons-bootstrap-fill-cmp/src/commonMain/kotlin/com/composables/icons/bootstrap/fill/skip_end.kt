package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SkipEnd: ImageVector
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
                curveTo(4.693f, 3.3f, 4f, 3.678f, 4f, 4.308f)
                verticalLineToRelative(7.384f)
                curveToRelative(0f, 0.63f, 0.692f, 1.01f, 1.233f, 0.697f)
                lineTo(11.5f, 8.753f)
                verticalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
            }
        }.build()
        
        return _SkipEnd!!
    }

private var _SkipEnd: ImageVector? = null

