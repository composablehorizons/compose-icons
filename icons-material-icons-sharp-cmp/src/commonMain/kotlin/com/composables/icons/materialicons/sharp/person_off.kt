package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Person_off: ImageVector
    get() {
        if (_Person_off != null) return _Person_off!!
        
        _Person_off = ImageVector.Builder(
            name = "person_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(8.65f, 5.82f)
                    curveTo(9.36f, 4.72f, 10.6f, 4f, 12f, 4f)
                    curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                    curveToRelative(0f, 1.4f, -0.72f, 2.64f, -1.82f, 3.35f)
                    lineTo(8.65f, 5.82f)
                    close()
                    moveTo(20f, 17.17f)
                    curveToRelative(-0.02f, -1.1f, -0.63f, -2.11f, -1.61f, -2.62f)
                    curveToRelative(-0.54f, -0.28f, -1.13f, -0.54f, -1.77f, -0.76f)
                    lineTo(20f, 17.17f)
                    close()
                    moveTo(21.19f, 21.19f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(8.89f, 8.89f)
                    curveToRelative(-1.81f, 0.23f, -3.39f, 0.79f, -4.67f, 1.45f)
                    curveTo(4.61f, 15.07f, 4f, 16.1f, 4f, 17.22f)
                    verticalLineTo(20f)
                    horizontalLineToRelative(13.17f)
                    lineToRelative(2.61f, 2.61f)
                    lineTo(21.19f, 21.19f)
                    close()
                }
            }
        }.build()
        
        return _Person_off!!
    }

private var _Person_off: ImageVector? = null

