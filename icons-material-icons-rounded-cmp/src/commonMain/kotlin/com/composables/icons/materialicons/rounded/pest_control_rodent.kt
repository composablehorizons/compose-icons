package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pest_control_rodent: ImageVector
    get() {
        if (_Pest_control_rodent != null) return _Pest_control_rodent!!
        
        _Pest_control_rodent = ImageVector.Builder(
            name = "pest_control_rodent",
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
                    moveTo(21.31f, 17.38f)
                    lineToRelative(-2.39f, -2.13f)
                    curveTo(19.44f, 12.89f, 17.56f, 11f, 15.5f, 11f)
                    curveToRelative(-1.16f, 0f, -3.5f, 0.9f, -3.5f, 3.5f)
                    curveToRelative(0f, 0.81f, 0.27f, 1.55f, 0.74f, 2.15f)
                    curveToRelative(0.15f, 0.2f, 0.14f, 0.48f, -0.04f, 0.66f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.21f, 0.21f, -0.56f, 0.19f, -0.75f, -0.04f)
                    curveTo(11.35f, 16.5f, 11f, 15.54f, 11f, 14.5f)
                    curveToRelative(0f, -1.7f, 0.96f, -3.17f, 2.35f, -3.93f)
                    curveToRelative(-0.7f, -0.36f, -1.48f, -0.57f, -2.28f, -0.57f)
                    curveToRelative(-2.38f, 0f, -4.37f, 1.65f, -4.91f, 3.87f)
                    curveToRelative(-1.33f, -0.39f, -2.28f, -1.66f, -2.15f, -3.14f)
                    curveTo(4.15f, 9.16f, 5.54f, 8f, 7.11f, 8f)
                    lineToRelative(2f, 0f)
                    curveToRelative(1.58f, 0f, 2.75f, -0.95f, 2.87f, -2.25f)
                    curveTo(12.13f, 4.25f, 10.96f, 3f, 9.5f, 3f)
                    horizontalLineTo(8.05f)
                    curveToRelative(-0.5f, 0f, -0.96f, 0.34f, -1.04f, 0.83f)
                    curveTo(6.91f, 4.46f, 7.39f, 5f, 8f, 5f)
                    horizontalLineToRelative(1.5f)
                    curveTo(9.78f, 5f, 10f, 5.22f, 10f, 5.5f)
                    curveTo(10f, 5.78f, 9.78f, 6f, 9.5f, 6f)
                    lineTo(7.16f, 6f)
                    curveToRelative(-2.67f, 0f, -4.99f, 2.03f, -5.15f, 4.7f)
                    curveTo(1.86f, 13.25f, 3.62f, 15.42f, 6f, 15.9f)
                    verticalLineToRelative(0.03f)
                    curveTo(6f, 18.73f, 8.27f, 21f, 11.07f, 21f)
                    horizontalLineToRelative(8.86f)
                    curveTo(21.8f, 21f, 22.74f, 18.66f, 21.31f, 17.38f)
                    close()
                    moveTo(18f, 19f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    curveTo(19f, 18.55f, 18.55f, 19f, 18f, 19f)
                    close()
                }
            }
        }.build()
        
        return _Pest_control_rodent!!
    }

private var _Pest_control_rodent: ImageVector? = null

