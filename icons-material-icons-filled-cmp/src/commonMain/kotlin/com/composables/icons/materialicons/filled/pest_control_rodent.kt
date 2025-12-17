package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Pest_control_rodent: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21.31f, 17.38f)
                    lineToRelative(-2.39f, -2.13f)
                    curveTo(19.44f, 12.89f, 17.56f, 11f, 15.5f, 11f)
                    curveToRelative(-1.16f, 0f, -3.5f, 0.9f, -3.5f, 3.5f)
                    curveToRelative(0f, 0.97f, 0.39f, 1.84f, 1.03f, 2.47f)
                    lineToRelative(-0.71f, 0.71f)
                    curveTo(11.5f, 16.87f, 11f, 15.74f, 11f, 14.5f)
                    curveToRelative(0f, -1.7f, 0.96f, -3.17f, 2.35f, -3.93f)
                    curveToRelative(-0.7f, -0.36f, -1.48f, -0.57f, -2.28f, -0.57f)
                    curveToRelative(-2.38f, 0f, -4.37f, 1.65f, -4.91f, 3.87f)
                    curveTo(4.91f, 13.5f, 4f, 12.36f, 4f, 11f)
                    curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                    curveToRelative(0.94f, 0f, 1.56f, 0f, 2.5f, 0f)
                    curveTo(10.88f, 8f, 12f, 6.88f, 12f, 5.5f)
                    curveTo(12f, 4.12f, 10.88f, 3f, 9.5f, 3f)
                    horizontalLineTo(8f)
                    curveTo(7.45f, 3f, 7f, 3.45f, 7f, 4f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1.5f)
                    curveTo(9.78f, 5f, 10f, 5.22f, 10f, 5.5f)
                    curveTo(10f, 5.78f, 9.78f, 6f, 9.5f, 6f)
                    curveTo(9.47f, 6f, 9f, 6f, 7f, 6f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    curveToRelative(0f, 2.42f, 1.72f, 4.44f, 4f, 4.9f)
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

