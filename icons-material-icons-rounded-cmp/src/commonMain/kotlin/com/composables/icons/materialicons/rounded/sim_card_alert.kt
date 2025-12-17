package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sim_card_alert: ImageVector
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
                            moveTo(18f, 2f)
                            horizontalLineToRelative(-7.17f)
                            curveTo(10.3f, 2f, 9.79f, 2.21f, 9.41f, 2.59f)
                            lineTo(4.6f, 7.42f)
                            curveTo(4.23f, 7.79f, 4.02f, 8.3f, 4.02f, 8.82f)
                            lineTo(4f, 20f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(12f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(4f)
                            curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
                            close()
                            moveTo(12f, 17f)
                            lineTo(12f, 17f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineToRelative(0f)
                            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                            horizontalLineToRelative(0f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            verticalLineToRelative(0f)
                            curveTo(13f, 16.55f, 12.55f, 17f, 12f, 17f)
                            close()
                            moveTo(12f, 13f)
                            lineTo(12f, 13f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineTo(9f)
                            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                            lineToRelative(0f, 0f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            verticalLineToRelative(3f)
                            curveTo(13f, 12.55f, 12.55f, 13f, 12f, 13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Sim_card_alert!!
    }

private var _Sim_card_alert: ImageVector? = null

