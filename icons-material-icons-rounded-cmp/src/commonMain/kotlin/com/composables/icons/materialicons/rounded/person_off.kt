package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Person_off: ImageVector
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
                    moveTo(20.49f, 20.49f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(8.18f, 8.18f)
                    curveToRelative(-1.82f, 0.23f, -3.41f, 0.8f, -4.7f, 1.46f)
                    curveTo(4.6f, 15.08f, 4f, 16.11f, 4f, 17.22f)
                    lineTo(4f, 20f)
                    horizontalLineToRelative(13.17f)
                    lineToRelative(1.9f, 1.9f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                    close()
                }
            }
        }.build()
        
        return _Person_off!!
    }

private var _Person_off: ImageVector? = null

