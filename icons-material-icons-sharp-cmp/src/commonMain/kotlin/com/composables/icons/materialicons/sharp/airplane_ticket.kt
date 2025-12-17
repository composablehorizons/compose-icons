package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Airplane_ticket: ImageVector
    get() {
        if (_Airplane_ticket != null) return _Airplane_ticket!!
        
        _Airplane_ticket = ImageVector.Builder(
            name = "airplane_ticket",
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
                    moveTo(22f, 4f)
                    horizontalLineTo(2.01f)
                    verticalLineToRelative(6f)
                    curveTo(3.11f, 10f, 4f, 10.9f, 4f, 12f)
                    reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(4f)
                    close()
                    moveTo(17.73f, 13.3f)
                    lineToRelative(-8.86f, 2.36f)
                    lineToRelative(-1.66f, -2.88f)
                    lineToRelative(0.93f, -0.25f)
                    lineToRelative(1.26f, 0.99f)
                    lineToRelative(2.39f, -0.64f)
                    lineToRelative(-2.4f, -4.16f)
                    lineToRelative(1.4f, -0.38f)
                    lineToRelative(4.01f, 3.74f)
                    lineToRelative(2.44f, -0.65f)
                    curveToRelative(0.51f, -0.14f, 1.04f, 0.17f, 1.18f, 0.68f)
                    curveTo(18.55f, 12.62f, 18.25f, 13.15f, 17.73f, 13.3f)
                    close()
                }
            }
        }.build()
        
        return _Airplane_ticket!!
    }

private var _Airplane_ticket: ImageVector? = null

