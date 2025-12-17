package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Directions_off: ImageVector
    get() {
        if (_Directions_off != null) return _Directions_off!!
        
        _Directions_off = ImageVector.Builder(
            name = "directions_off",
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
                        moveTo(13f, 7.5f)
                        lineTo(16.5f, 11f)
                        lineTo(15.17f, 12.34f)
                        lineTo(18.62f, 15.79f)
                        lineTo(22.41f, 12f)
                        lineTo(12.01f, 1.58f)
                        lineTo(8.21f, 5.38f)
                        lineTo(13f, 10.17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1.39f, 4.22f)
                        lineToRelative(3.99f, 3.99f)
                        lineToRelative(-3.79f, 3.79f)
                        lineTo(12.01f, 22.4f)
                        lineToRelative(3.79f, -3.79f)
                        lineToRelative(3.99f, 3.99f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        close()
                        moveTo(9.99f, 12.82f)
                        verticalLineTo(15f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-4.18f)
                        lineTo(9.99f, 12.82f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Directions_off!!
    }

private var _Directions_off: ImageVector? = null

