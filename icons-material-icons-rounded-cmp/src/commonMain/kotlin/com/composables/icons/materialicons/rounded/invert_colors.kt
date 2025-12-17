package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Invert_colors: ImageVector
    get() {
        if (_Invert_colors != null) return _Invert_colors!!
        
        _Invert_colors = ImageVector.Builder(
            name = "invert_colors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 4.81f)
                    lineTo(12f, 19f)
                    curveToRelative(-3.31f, 0f, -6f, -2.63f, -6f, -5.87f)
                    curveToRelative(0f, -1.56f, 0.62f, -3.03f, 1.75f, -4.14f)
                    lineTo(12f, 4.81f)
                    moveTo(6.35f, 7.56f)
                    lineTo(6.35f, 7.56f)
                    curveTo(4.9f, 8.99f, 4f, 10.96f, 4f, 13.13f)
                    curveTo(4f, 17.48f, 7.58f, 21f, 12f, 21f)
                    curveToRelative(4.42f, 0f, 8f, -3.52f, 8f, -7.87f)
                    curveToRelative(0f, -2.17f, -0.9f, -4.14f, -2.35f, -5.57f)
                    lineToRelative(0f, 0f)
                    lineTo(12.7f, 2.69f)
                    curveToRelative(-0.39f, -0.38f, -1.01f, -0.38f, -1.4f, 0f)
                    lineTo(6.35f, 7.56f)
                    close()
                }
            }
        }.build()
        
        return _Invert_colors!!
    }

private var _Invert_colors: ImageVector? = null

