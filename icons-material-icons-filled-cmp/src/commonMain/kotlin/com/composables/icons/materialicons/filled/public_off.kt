package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Public_off: ImageVector
    get() {
        if (_Public_off != null) return _Public_off!!
        
        _Public_off = ImageVector.Builder(
            name = "public_off",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11f, 8.17f)
                    lineTo(6.49f, 3.66f)
                    curveTo(8.07f, 2.61f, 9.96f, 2f, 12f, 2f)
                    curveToRelative(5.52f, 0f, 10f, 4.48f, 10f, 10f)
                    curveToRelative(0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f)
                    lineToRelative(-1.46f, -1.46f)
                    curveTo(19.59f, 14.87f, 20f, 13.48f, 20f, 12f)
                    curveToRelative(0f, -3.35f, -2.07f, -6.22f, -5f, -7.41f)
                    verticalLineTo(5f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(8.17f)
                    close()
                    moveTo(21.19f, 21.19f)
                    lineToRelative(-1.41f, 1.41f)
                    lineToRelative(-2.27f, -2.27f)
                    curveTo(15.93f, 21.39f, 14.04f, 22f, 12f, 22f)
                    curveTo(6.48f, 22f, 2f, 17.52f, 2f, 12f)
                    curveToRelative(0f, -2.04f, 0.61f, -3.93f, 1.66f, -5.51f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(21.19f, 21.19f)
                    close()
                    moveTo(11f, 18f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineToRelative(-1f)
                    lineToRelative(-4.79f, -4.79f)
                    curveTo(4.08f, 10.79f, 4f, 11.38f, 4f, 12f)
                    curveToRelative(0f, 4.08f, 3.05f, 7.44f, 7f, 7.93f)
                    verticalLineTo(18f)
                    close()
                }
            }
        }.build()
        
        return _Public_off!!
    }

private var _Public_off: ImageVector? = null

