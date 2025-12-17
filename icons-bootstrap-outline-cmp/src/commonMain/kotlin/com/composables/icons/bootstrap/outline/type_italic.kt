package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TypeItalic: ImageVector
    get() {
        if (_TypeItalic != null) return _TypeItalic!!
        
        _TypeItalic = ImageVector.Builder(
            name = "type-italic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.991f, 11.674f)
                lineTo(9.53f, 4.455f)
                curveToRelative(0.123f, -0.595f, 0.246f, -0.71f, 1.347f, -0.807f)
                lineToRelative(0.11f, -0.52f)
                horizontalLineTo(7.211f)
                lineToRelative(-0.11f, 0.52f)
                curveToRelative(1.06f, 0.096f, 1.128f, 0.212f, 1.005f, 0.807f)
                lineTo(6.57f, 11.674f)
                curveToRelative(-0.123f, 0.595f, -0.246f, 0.71f, -1.346f, 0.806f)
                lineToRelative(-0.11f, 0.52f)
                horizontalLineToRelative(3.774f)
                lineToRelative(0.11f, -0.52f)
                curveToRelative(-1.06f, -0.095f, -1.129f, -0.211f, -1.006f, -0.806f)
                close()
            }
        }.build()
        
        return _TypeItalic!!
    }

private var _TypeItalic: ImageVector? = null

