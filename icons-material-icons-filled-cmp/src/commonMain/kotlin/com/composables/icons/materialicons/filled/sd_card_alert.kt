package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sd_card_alert: ImageVector
    get() {
        if (_Sd_card_alert != null) return _Sd_card_alert!!
        
        _Sd_card_alert = ImageVector.Builder(
            name = "sd_card_alert",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(18f, 2f)
                            horizontalLineToRelative(-8f)
                            lineTo(4.02f, 8f)
                            lineTo(4f, 20f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(12f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(4f)
                            curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
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
        
        return _Sd_card_alert!!
    }

private var _Sd_card_alert: ImageVector? = null

