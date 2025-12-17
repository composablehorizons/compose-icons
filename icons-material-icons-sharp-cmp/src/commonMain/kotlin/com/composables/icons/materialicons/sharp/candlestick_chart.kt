package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Candlestick_chart: ImageVector
    get() {
        if (_Candlestick_chart != null) return _Candlestick_chart!!
        
        _Candlestick_chart = ImageVector.Builder(
            name = "candlestick_chart",
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
                            moveTo(9f, 4f)
                            lineTo(7f, 4f)
                            lineTo(7f, 6f)
                            lineTo(5f, 6f)
                            lineTo(5f, 18f)
                            lineTo(7f, 18f)
                            lineTo(7f, 20f)
                            lineTo(9f, 20f)
                            lineTo(9f, 18f)
                            lineTo(11f, 18f)
                            lineTo(11f, 6f)
                            lineTo(9f, 6f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(19f, 8f)
                            lineTo(17f, 8f)
                            lineTo(17f, 4f)
                            lineTo(15f, 4f)
                            lineTo(15f, 8f)
                            lineTo(13f, 8f)
                            lineTo(13f, 15f)
                            lineTo(15f, 15f)
                            lineTo(15f, 20f)
                            lineTo(17f, 20f)
                            lineTo(17f, 15f)
                            lineTo(19f, 15f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Candlestick_chart!!
    }

private var _Candlestick_chart: ImageVector? = null

