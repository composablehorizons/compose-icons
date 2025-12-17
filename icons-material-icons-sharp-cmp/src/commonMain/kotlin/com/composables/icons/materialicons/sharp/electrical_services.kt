package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Electrical_services: ImageVector
    get() {
        if (_Electrical_services != null) return _Electrical_services!!
        
        _Electrical_services = ImageVector.Builder(
            name = "electrical_services",
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
                        moveTo(18f, 13f)
                        horizontalLineTo(21f)
                        verticalLineTo(15f)
                        horizontalLineTo(18f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 12f)
                        lineTo(12f, 14f)
                        lineTo(10f, 14f)
                        lineTo(10f, 18f)
                        lineTo(12f, 18f)
                        lineTo(12f, 20f)
                        lineTo(17f, 20f)
                        lineTo(17f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 11f)
                        lineTo(12f, 11f)
                        lineTo(12f, 4f)
                        lineTo(4f, 4f)
                        lineTo(4f, 6f)
                        lineTo(10f, 6f)
                        lineTo(10f, 9f)
                        lineTo(3f, 9f)
                        lineTo(3f, 17f)
                        lineTo(9f, 17f)
                        lineTo(9f, 15f)
                        lineTo(5f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 17f)
                        horizontalLineTo(21f)
                        verticalLineTo(19f)
                        horizontalLineTo(18f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Electrical_services!!
    }

private var _Electrical_services: ImageVector? = null

