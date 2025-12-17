package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Thunderstorm: ImageVector
    get() {
        if (_Thunderstorm != null) return _Thunderstorm!!
        
        _Thunderstorm = ImageVector.Builder(
            name = "thunderstorm",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.92f, 7.02f)
                        curveTo(17.45f, 4.18f, 14.97f, 2f, 12f, 2f)
                        curveTo(9.82f, 2f, 7.83f, 3.18f, 6.78f, 5.06f)
                        curveTo(4.09f, 5.41f, 2f, 7.74f, 2f, 10.5f)
                        curveTo(2f, 13.53f, 4.47f, 16f, 7.5f, 16f)
                        horizontalLineToRelative(10f)
                        curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                        curveTo(22f, 9.16f, 20.21f, 7.23f, 17.92f, 7.02f)
                        close()
                        moveTo(17.5f, 14f)
                        horizontalLineToRelative(-10f)
                        curveTo(5.57f, 14f, 4f, 12.43f, 4f, 10.5f)
                        curveToRelative(0f, -1.74f, 1.31f, -3.23f, 3.04f, -3.46f)
                        lineToRelative(0.99f, -0.13f)
                        lineToRelative(0.49f, -0.87f)
                        curveTo(9.23f, 4.78f, 10.56f, 4f, 12f, 4f)
                        curveToRelative(1.94f, 0f, 3.63f, 1.44f, 3.95f, 3.35f)
                        lineToRelative(0.25f, 1.52f)
                        lineToRelative(1.54f, 0.14f)
                        curveTo(19.01f, 9.13f, 20f, 10.22f, 20f, 11.5f)
                        curveTo(20f, 12.88f, 18.88f, 14f, 17.5f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.8f, 17f)
                        lineTo(11.9f, 20.32f)
                        lineTo(13.9f, 21.32f)
                        lineTo(11.55f, 24f)
                        lineTo(14.2f, 24f)
                        lineTo(17.1f, 20.68f)
                        lineTo(15.1f, 19.68f)
                        lineTo(17.45f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.8f, 17f)
                        lineTo(5.9f, 20.32f)
                        lineTo(7.9f, 21.32f)
                        lineTo(5.55f, 24f)
                        lineTo(8.2f, 24f)
                        lineTo(11.1f, 20.68f)
                        lineTo(9.1f, 19.68f)
                        lineTo(11.45f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Thunderstorm!!
    }

private var _Thunderstorm: ImageVector? = null

