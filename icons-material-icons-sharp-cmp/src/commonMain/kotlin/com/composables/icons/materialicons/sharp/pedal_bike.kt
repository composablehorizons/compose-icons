package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Pedal_bike: ImageVector
    get() {
        if (_Pedal_bike != null) return _Pedal_bike!!
        
        _Pedal_bike = ImageVector.Builder(
            name = "pedal_bike",
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
                    moveTo(18.18f, 10f)
                    lineTo(16f, 4f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2.6f)
                    lineToRelative(1.46f, 4f)
                    horizontalLineToRelative(-4.81f)
                    lineToRelative(-0.36f, -1f)
                    horizontalLineTo(12f)
                    verticalLineTo(7f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(1.75f)
                    lineToRelative(1.82f, 5f)
                    horizontalLineTo(9.9f)
                    curveToRelative(-0.44f, -2.23f, -2.31f, -3.88f, -4.65f, -3.99f)
                    curveTo(2.45f, 9.87f, 0f, 12.2f, 0f, 15f)
                    curveToRelative(0f, 2.8f, 2.2f, 5f, 5f, 5f)
                    curveToRelative(2.46f, 0f, 4.45f, -1.69f, 4.9f, -4f)
                    horizontalLineToRelative(4.2f)
                    curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f)
                    curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5f)
                    curveToRelative(0f, -2.8f, -2.2f, -5f, -5f, -5f)
                    horizontalLineTo(18.18f)
                    close()
                    moveTo(7.82f, 16f)
                    curveToRelative(-0.4f, 1.17f, -1.49f, 2f, -2.82f, 2f)
                    curveToRelative(-1.68f, 0f, -3f, -1.32f, -3f, -3f)
                    reflectiveCurveToRelative(1.32f, -3f, 3f, -3f)
                    curveToRelative(1.33f, 0f, 2.42f, 0.83f, 2.82f, 2f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(7.82f)
                    close()
                    moveTo(14.1f, 14f)
                    horizontalLineToRelative(-1.4f)
                    lineToRelative(-0.73f, -2f)
                    horizontalLineTo(15f)
                    curveTo(14.56f, 12.58f, 14.24f, 13.25f, 14.1f, 14f)
                    close()
                    moveTo(19f, 18f)
                    curveToRelative(-1.68f, 0f, -3f, -1.32f, -3f, -3f)
                    curveToRelative(0f, -0.93f, 0.41f, -1.73f, 1.05f, -2.28f)
                    lineToRelative(0.96f, 2.64f)
                    lineToRelative(1.88f, -0.68f)
                    lineToRelative(-0.97f, -2.67f)
                    curveToRelative(0.03f, 0f, 0.06f, -0.01f, 0.09f, -0.01f)
                    curveToRelative(1.68f, 0f, 3f, 1.32f, 3f, 3f)
                    reflectiveCurveTo(20.68f, 18f, 19f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Pedal_bike!!
    }

private var _Pedal_bike: ImageVector? = null

