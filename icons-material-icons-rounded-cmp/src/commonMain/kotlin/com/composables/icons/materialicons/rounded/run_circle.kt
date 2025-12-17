package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Run_circle: ImageVector
    get() {
        if (_Run_circle != null) return _Run_circle!!
        
        _Run_circle = ImageVector.Builder(
            name = "run_circle",
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
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(13.5f, 6f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    curveTo(12.5f, 6.45f, 12.95f, 6f, 13.5f, 6f)
                    close()
                    moveTo(15.41f, 11.91f)
                    curveToRelative(-0.71f, -0.2f, -1.63f, -0.74f, -2.32f, -1.66f)
                    lineToRelative(-0.41f, 2.35f)
                    lineToRelative(1.19f, 1.3f)
                    curveTo(13.95f, 13.98f, 14f, 14.1f, 14f, 14.22f)
                    verticalLineToRelative(3.28f)
                    curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(-3.08f)
                    lineToRelative(-1.11f, -1.21f)
                    lineToRelative(-0.43f, 2.15f)
                    curveToRelative(-0.05f, 0.27f, -0.32f, 0.45f, -0.59f, 0.39f)
                    lineToRelative(-2.78f, -0.57f)
                    curveToRelative(-0.27f, -0.06f, -0.45f, -0.32f, -0.39f, -0.59f)
                    verticalLineToRelative(0f)
                    curveToRelative(0.06f, -0.27f, 0.32f, -0.44f, 0.59f, -0.39f)
                    lineToRelative(2.29f, 0.47f)
                    lineToRelative(0.96f, -4.89f)
                    lineTo(10f, 10.35f)
                    verticalLineToRelative(1.15f)
                    curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                    horizontalLineToRelative(0f)
                    curveTo(9.22f, 12f, 9f, 11.78f, 9f, 11.5f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -0.21f, 0.13f, -0.4f, 0.33f, -0.47f)
                    lineToRelative(2.95f, -1.09f)
                    curveToRelative(0.49f, -0.18f, 1.02f, 0.04f, 1.25f, 0.51f)
                    curveToRelative(0.65f, 1.35f, 1.55f, 1.85f, 2.1f, 2f)
                    curveTo(15.85f, 11f, 16f, 11.18f, 16f, 11.4f)
                    verticalLineToRelative(0.04f)
                    curveTo(16f, 11.75f, 15.71f, 11.99f, 15.41f, 11.91f)
                    close()
                }
            }
        }.build()
        
        return _Run_circle!!
    }

private var _Run_circle: ImageVector? = null

