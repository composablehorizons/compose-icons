package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Data_array: ImageVector
    get() {
        if (_Data_array != null) return _Data_array!!
        
        _Data_array = ImageVector.Builder(
            name = "data_array",
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
                        moveTo(15f, 4f)
                        lineTo(15f, 6f)
                        lineTo(18f, 6f)
                        lineTo(18f, 18f)
                        lineTo(15f, 18f)
                        lineTo(15f, 20f)
                        lineTo(20f, 20f)
                        lineTo(20f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 20f)
                        lineTo(9f, 20f)
                        lineTo(9f, 18f)
                        lineTo(6f, 18f)
                        lineTo(6f, 6f)
                        lineTo(9f, 6f)
                        lineTo(9f, 4f)
                        lineTo(4f, 4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Data_array!!
    }

private var _Data_array: ImageVector? = null

