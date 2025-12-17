package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Flight_takeoff: ImageVector
    get() {
        if (_Flight_takeoff != null) return _Flight_takeoff!!
        
        _Flight_takeoff = ImageVector.Builder(
            name = "flight_takeoff",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(2.5f, 19f)
                            horizontalLineToRelative(19f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(-19f)
                            verticalLineTo(19f)
                            close()
                            moveTo(22.07f, 9.64f)
                            curveToRelative(-0.21f, -0.8f, -1.04f, -1.28f, -1.84f, -1.06f)
                            lineTo(14.92f, 10f)
                            lineToRelative(-6.9f, -6.43f)
                            lineTo(6.09f, 4.08f)
                            lineToRelative(4.14f, 7.17f)
                            lineToRelative(-4.97f, 1.33f)
                            lineToRelative(-1.97f, -1.54f)
                            lineToRelative(-1.45f, 0.39f)
                            lineToRelative(2.59f, 4.49f)
                            curveToRelative(0f, 0f, 7.12f, -1.9f, 16.57f, -4.43f)
                            curveTo(21.81f, 11.26f, 22.28f, 10.44f, 22.07f, 9.64f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Flight_takeoff!!
    }

private var _Flight_takeoff: ImageVector? = null

