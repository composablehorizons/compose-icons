package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) return _Lightbulb!!
        
        _Lightbulb = ImageVector.Builder(
            name = "lightbulb",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 21f)
                curveToRelative(0f, 0.5f, 0.4f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.6f, 0f, 1f, -0.5f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineTo(9f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(3f, -19f)
                curveTo(8.1f, 2f, 5f, 5.1f, 5f, 9f)
                curveToRelative(0f, 2.4f, 1.2f, 4.5f, 3f, 5.7f)
                verticalLineTo(17f)
                curveToRelative(0f, 0.5f, 0.4f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.6f, 0f, 1f, -0.5f, 1f, -1f)
                verticalLineToRelative(-2.3f)
                curveToRelative(1.8f, -1.3f, 3f, -3.4f, 3f, -5.7f)
                curveToRelative(0f, -3.9f, -3.1f, -7f, -7f, -7f)
                close()
            }
        }.build()
        
        return _Lightbulb!!
    }

private var _Lightbulb: ImageVector? = null

