package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Send_to_mobile: ImageVector
    get() {
        if (_Send_to_mobile != null) return _Send_to_mobile!!
        
        _Send_to_mobile = ImageVector.Builder(
            name = "send_to_mobile",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(17f, 18f)
                        lineTo(7f, 18f)
                        lineTo(7f, 6f)
                        lineTo(17f, 6f)
                        lineTo(17f, 7f)
                        lineTo(19f, 7f)
                        lineTo(19f, 1f)
                        lineTo(5f, 1f)
                        lineTo(5f, 23f)
                        lineTo(19f, 23f)
                        lineTo(19f, 17f)
                        lineTo(17f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 12f)
                        lineTo(18f, 8f)
                        lineTo(18f, 11f)
                        lineTo(13f, 11f)
                        lineTo(13f, 13f)
                        lineTo(18f, 13f)
                        lineTo(18f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Send_to_mobile!!
    }

private var _Send_to_mobile: ImageVector? = null

