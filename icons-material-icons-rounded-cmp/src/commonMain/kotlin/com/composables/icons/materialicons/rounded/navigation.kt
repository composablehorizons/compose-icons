package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Navigation: ImageVector
    get() {
        if (_Navigation != null) return _Navigation!!
        
        _Navigation = ImageVector.Builder(
            name = "navigation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.93f, 4.26f)
                lineToRelative(6.15f, 14.99f)
                curveToRelative(0.34f, 0.83f, -0.51f, 1.66f, -1.33f, 1.29f)
                lineToRelative(-5.34f, -2.36f)
                curveToRelative(-0.26f, -0.11f, -0.55f, -0.11f, -0.81f, 0f)
                lineToRelative(-5.34f, 2.36f)
                curveToRelative(-0.82f, 0.36f, -1.67f, -0.46f, -1.33f, -1.29f)
                lineToRelative(6.15f, -14.99f)
                curveToRelative(0.33f, -0.83f, 1.51f, -0.83f, 1.85f, 0f)
                close()
            }
        }.build()
        
        return _Navigation!!
    }

private var _Navigation: ImageVector? = null

