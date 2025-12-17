package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Data_object: ImageVector
    get() {
        if (_Data_object != null) return _Data_object!!
        
        _Data_object = ImageVector.Builder(
            name = "data_object",
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
                        moveTo(4f, 10f)
                        lineTo(2f, 10f)
                        lineTo(2f, 14f)
                        lineTo(4f, 14f)
                        lineTo(4f, 20f)
                        lineTo(10f, 20f)
                        lineTo(10f, 18f)
                        lineTo(6f, 18f)
                        lineTo(6f, 12.5f)
                        lineTo(4f, 12.5f)
                        lineTo(4f, 11.5f)
                        lineTo(6f, 11.5f)
                        lineTo(6f, 6f)
                        lineTo(10f, 6f)
                        lineTo(10f, 4f)
                        lineTo(4f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 10f)
                        lineTo(20f, 4f)
                        lineTo(14f, 4f)
                        lineTo(14f, 6f)
                        lineTo(18f, 6f)
                        lineTo(18f, 11.5f)
                        lineTo(20f, 11.5f)
                        lineTo(20f, 12.5f)
                        lineTo(18f, 12.5f)
                        lineTo(18f, 18f)
                        lineTo(14f, 18f)
                        lineTo(14f, 20f)
                        lineTo(20f, 20f)
                        lineTo(20f, 14f)
                        lineTo(22f, 14f)
                        lineTo(22f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Data_object!!
    }

private var _Data_object: ImageVector? = null

