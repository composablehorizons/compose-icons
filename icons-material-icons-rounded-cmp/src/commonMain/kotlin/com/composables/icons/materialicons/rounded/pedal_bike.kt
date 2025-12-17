package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pedal_bike: ImageVector
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
                    lineToRelative(-1.7f, -4.68f)
                    curveTo(16.19f, 4.53f, 15.44f, 4f, 14.6f, 4f)
                    horizontalLineTo(13f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1.6f)
                    lineToRelative(1.46f, 4f)
                    horizontalLineToRelative(-4.81f)
                    lineToRelative(-0.36f, -1f)
                    horizontalLineToRelative(0.09f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(8f)
                    curveTo(7.45f, 7f, 7f, 7.45f, 7f, 8f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0.75f)
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
                    curveToRelative(-0.42f, 1.23f, -1.6f, 2.08f, -3.02f, 1.99f)
                    curveTo(3.31f, 17.9f, 2.07f, 16.64f, 2f, 15.14f)
                    curveTo(1.93f, 13.39f, 3.27f, 12f, 5f, 12f)
                    curveToRelative(1.33f, 0f, 2.42f, 0.83f, 2.82f, 2f)
                    horizontalLineTo(6f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineTo(7.82f)
                    close()
                    moveTo(14.1f, 14f)
                    horizontalLineToRelative(-1.4f)
                    lineToRelative(-0.73f, -2f)
                    horizontalLineTo(15f)
                    curveTo(14.56f, 12.58f, 14.24f, 13.25f, 14.1f, 14f)
                    close()
                    moveTo(18.88f, 18f)
                    curveToRelative(-1.54f, -0.06f, -2.84f, -1.37f, -2.88f, -2.92f)
                    curveToRelative(-0.02f, -0.96f, 0.39f, -1.8f, 1.05f, -2.36f)
                    lineToRelative(0.62f, 1.7f)
                    curveToRelative(0.19f, 0.52f, 0.76f, 0.79f, 1.28f, 0.6f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f)
                    lineToRelative(-0.63f, -1.73f)
                    curveToRelative(0f, 0f, 0f, 0f, 0.01f, -0.01f)
                    curveToRelative(1.72f, -0.04f, 3.08f, 1.29f, 3.08f, 3f)
                    curveTo(22f, 16.72f, 20.62f, 18.06f, 18.88f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Pedal_bike!!
    }

private var _Pedal_bike: ImageVector? = null

