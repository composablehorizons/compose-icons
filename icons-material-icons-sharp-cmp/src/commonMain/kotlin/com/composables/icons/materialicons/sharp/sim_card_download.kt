package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sim_card_download: ImageVector
    get() {
        if (_Sim_card_download != null) return _Sim_card_download!!
        
        _Sim_card_download = ImageVector.Builder(
            name = "sim_card_download",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 2f)
                    horizontalLineTo(10f)
                    lineTo(4f, 8f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(2f)
                    close()
                    moveTo(12f, 17f)
                    lineToRelative(-4f, -4f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(9.02f)
                    lineTo(13f, 9f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(3f)
                    lineTo(12f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Sim_card_download!!
    }

private var _Sim_card_download: ImageVector? = null

