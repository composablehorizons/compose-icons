package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wifi_1_bar: ImageVector
    get() {
        if (_Wifi_1_bar != null) return _Wifi_1_bar!!
        
        _Wifi_1_bar = ImageVector.Builder(
            name = "wifi_1_bar",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 18f)
                    arcTo(2f, 2f, 0f, false, true, 12f, 20f)
                    arcTo(2f, 2f, 0f, false, true, 10f, 18f)
                    arcTo(2f, 2f, 0f, false, true, 14f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Wifi_1_bar!!
    }

private var _Wifi_1_bar: ImageVector? = null

