package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Airplane_ticket: ImageVector
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
                    moveTo(20.19f, 4f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2.01f, 4.9f, 2.01f, 6f)
                    verticalLineToRelative(4f)
                    curveTo(3.11f, 10f, 4f, 10.9f, 4f, 12f)
                    reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(6f)
                    curveTo(22f, 4.9f, 21.19f, 4f, 20.19f, 4f)
                    close()
                    moveTo(17.73f, 13.3f)
                    lineToRelative(-8.49f, 2.26f)
                    curveToRelative(-0.22f, 0.06f, -0.45f, -0.04f, -0.56f, -0.23f)
                    lineToRelative(-1.12f, -1.95f)
                    curveToRelative(-0.18f, -0.3f, -0.01f, -0.69f, 0.32f, -0.78f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.16f, -0.04f, 0.34f, -0.01f, 0.47f, 0.1f)
                    lineToRelative(1.05f, 0.82f)
                    lineToRelative(2.39f, -0.64f)
                    lineTo(9.9f, 9.6f)
                    curveToRelative(-0.26f, -0.44f, -0.02f, -1.01f, 0.47f, -1.15f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.26f, -0.07f, 0.54f, 0f, 0.74f, 0.18f)
                    lineToRelative(3.69f, 3.44f)
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

