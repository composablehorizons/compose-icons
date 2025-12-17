package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sim_card_alert: ImageVector
    get() {
        if (_Sim_card_alert != null) return _Sim_card_alert!!
        
        _Sim_card_alert = ImageVector.Builder(
            name = "sim_card_alert",
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
                            moveTo(20f, 2f)
                            horizontalLineTo(10f)
                            lineTo(4f, 8f)
                            verticalLineToRelative(14f)
                            horizontalLineToRelative(16f)
                            verticalLineTo(2f)
                            close()
                            moveTo(13f, 17f)
                            horizontalLineToRelative(-2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(17f)
                            close()
                            moveTo(13f, 13f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(8f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Sim_card_alert!!
    }

private var _Sim_card_alert: ImageVector? = null

