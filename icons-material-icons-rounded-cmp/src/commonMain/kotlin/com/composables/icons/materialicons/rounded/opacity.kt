package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Opacity: ImageVector
    get() {
        if (_Opacity != null) return _Opacity!!
        
        _Opacity = ImageVector.Builder(
            name = "opacity",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17.65f, 7.56f)
                    lineTo(17.65f, 7.56f)
                    lineTo(12.7f, 2.69f)
                    curveToRelative(-0.39f, -0.38f, -1.01f, -0.38f, -1.4f, 0f)
                    lineTo(6.35f, 7.56f)
                    lineToRelative(0f, 0f)
                    curveTo(4.9f, 8.99f, 4f, 10.96f, 4f, 13.13f)
                    curveTo(4f, 17.48f, 7.58f, 21f, 12f, 21f)
                    curveToRelative(4.42f, 0f, 8f, -3.52f, 8f, -7.87f)
                    curveTo(20f, 10.96f, 19.1f, 8.99f, 17.65f, 7.56f)
                    close()
                    moveTo(7.75f, 8.99f)
                    lineTo(12f, 4.81f)
                    lineToRelative(4.25f, 4.18f)
                    curveToRelative(0.88f, 0.87f, 2.04f, 2.59f, 1.67f, 5.01f)
                    horizontalLineTo(6.07f)
                    curveTo(5.7f, 11.58f, 6.87f, 9.85f, 7.75f, 8.99f)
                    close()
                }
            }
        }.build()
        
        return _Opacity!!
    }

private var _Opacity: ImageVector? = null

