package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Noise_control_off: ImageVector
    get() {
        if (_Noise_control_off != null) return _Noise_control_off!!
        
        _Noise_control_off = ImageVector.Builder(
            name = "noise_control_off",
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
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(17f, 12f)
                                arcTo(5f, 5f, 0f, false, true, 12f, 17f)
                                arcTo(5f, 5f, 0f, false, true, 7f, 12f)
                                arcTo(5f, 5f, 0f, false, true, 17f, 12f)
                                close()
                            }
                        }
                    }
                }
            }
        }.build()
        
        return _Noise_control_off!!
    }

private var _Noise_control_off: ImageVector? = null

