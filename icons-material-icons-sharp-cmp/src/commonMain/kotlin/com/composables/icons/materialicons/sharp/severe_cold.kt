package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Severe_cold: ImageVector
    get() {
        if (_Severe_cold != null) return _Severe_cold!!
        
        _Severe_cold = ImageVector.Builder(
            name = "severe_cold",
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
                        moveTo(12f, 10.41f)
                        lineTo(16f, 6.41f)
                        lineTo(14.59f, 5f)
                        lineTo(12f, 7.59f)
                        lineTo(12f, 4f)
                        lineTo(10f, 4f)
                        lineTo(10f, 7.59f)
                        lineTo(7.41f, 5f)
                        lineTo(6f, 6.41f)
                        lineTo(10f, 10.41f)
                        lineTo(10f, 12f)
                        lineTo(8.41f, 12f)
                        lineTo(4.41f, 8f)
                        lineTo(3f, 9.41f)
                        lineTo(5.59f, 12f)
                        lineTo(2f, 12f)
                        lineTo(2f, 14f)
                        lineTo(5.59f, 14f)
                        lineTo(3f, 16.59f)
                        lineTo(4.41f, 18f)
                        lineTo(8.41f, 14f)
                        lineTo(10f, 14f)
                        lineTo(10f, 15.59f)
                        lineTo(6f, 19.59f)
                        lineTo(7.41f, 21f)
                        lineTo(10f, 18.41f)
                        lineTo(10f, 22f)
                        lineTo(12f, 22f)
                        lineTo(12f, 18.41f)
                        lineTo(14.59f, 21f)
                        lineTo(16f, 19.59f)
                        lineTo(12f, 15.59f)
                        lineTo(12f, 14f)
                        lineTo(13.59f, 14f)
                        lineTo(17.59f, 18f)
                        lineTo(19f, 16.59f)
                        lineTo(16.41f, 14f)
                        lineTo(20f, 14f)
                        lineTo(20f, 12f)
                        lineTo(12f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 2f)
                        horizontalLineTo(21f)
                        verticalLineTo(7f)
                        horizontalLineTo(19f)
                        verticalLineTo(2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 8f)
                        horizontalLineTo(21f)
                        verticalLineTo(10f)
                        horizontalLineTo(19f)
                        verticalLineTo(8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Severe_cold!!
    }

private var _Severe_cold: ImageVector? = null

