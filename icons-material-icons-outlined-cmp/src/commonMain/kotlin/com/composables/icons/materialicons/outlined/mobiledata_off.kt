package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Mobiledata_off: ImageVector
    get() {
        if (_Mobiledata_off != null) return _Mobiledata_off!!
        
        _Mobiledata_off = ImageVector.Builder(
            name = "mobiledata_off",
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
                        moveTo(16f, 6.82f)
                        lineTo(17.59f, 8.41f)
                        lineTo(19f, 7f)
                        lineTo(15f, 3f)
                        lineTo(11f, 7f)
                        lineTo(12.41f, 8.41f)
                        lineTo(14f, 6.82f)
                        lineTo(14f, 11.17f)
                        lineTo(16f, 13.17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1.39f, 4.22f)
                        lineTo(8f, 10.83f)
                        lineTo(8f, 17.18f)
                        lineTo(6.41f, 15.59f)
                        lineTo(5f, 17f)
                        lineTo(9f, 21f)
                        lineTo(13f, 17f)
                        lineTo(11.59f, 15.59f)
                        lineTo(10f, 17.18f)
                        lineTo(10f, 12.83f)
                        lineTo(19.78f, 22.61f)
                        lineTo(21.19f, 21.19f)
                        lineTo(2.81f, 2.81f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mobiledata_off!!
    }

private var _Mobiledata_off: ImageVector? = null

