package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Flight_land: ImageVector
    get() {
        if (_Flight_land != null) return _Flight_land!!
        
        _Flight_land = ImageVector.Builder(
            name = "flight_land",
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
                            moveTo(19.34f, 15.85f)
                            curveToRelative(0.8f, 0.21f, 1.62f, -0.26f, 1.84f, -1.06f)
                            curveToRelative(0.21f, -0.8f, -0.26f, -1.62f, -1.06f, -1.84f)
                            lineToRelative(-5.31f, -1.42f)
                            lineToRelative(-2.76f, -9.02f)
                            lineTo(10.12f, 2f)
                            verticalLineToRelative(8.28f)
                            lineTo(5.15f, 8.95f)
                            lineTo(4.22f, 6.63f)
                            lineTo(2.77f, 6.24f)
                            verticalLineToRelative(5.17f)
                            lineTo(19.34f, 15.85f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Flight_land!!
    }

private var _Flight_land: ImageVector? = null

