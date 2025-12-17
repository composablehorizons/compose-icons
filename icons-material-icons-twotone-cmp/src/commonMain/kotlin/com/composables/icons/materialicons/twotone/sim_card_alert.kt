package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sim_card_alert: ImageVector
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
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(6f, 8.83f)
                                verticalLineTo(20f)
                                horizontalLineToRelative(12f)
                                verticalLineTo(4f)
                                horizontalLineToRelative(-7.17f)
                                lineTo(6f, 8.83f)
                                close()
                                moveTo(11f, 8f)
                                horizontalLineToRelative(2f)
                                verticalLineToRelative(5f)
                                horizontalLineToRelative(-2f)
                                verticalLineTo(8f)
                                close()
                                moveTo(11f, 15f)
                                horizontalLineToRelative(2f)
                                verticalLineToRelative(2f)
                                horizontalLineToRelative(-2f)
                                verticalLineTo(15f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(18f, 2f)
                                horizontalLineToRelative(-8f)
                                lineTo(4f, 8f)
                                verticalLineToRelative(12f)
                                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                                horizontalLineToRelative(12f)
                                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                                verticalLineTo(4f)
                                curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
                                close()
                                moveTo(18f, 20f)
                                horizontalLineTo(6f)
                                verticalLineTo(8.83f)
                                lineTo(10.83f, 4f)
                                horizontalLineTo(18f)
                                verticalLineTo(20f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(11f, 15f)
                                horizontalLineTo(13f)
                                verticalLineTo(17f)
                                horizontalLineTo(11f)
                                verticalLineTo(15f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(11f, 8f)
                                horizontalLineTo(13f)
                                verticalLineTo(13f)
                                horizontalLineTo(11f)
                                verticalLineTo(8f)
                                close()
                            }
                        }
                    }
                }
            }
        }.build()
        
        return _Sim_card_alert!!
    }

private var _Sim_card_alert: ImageVector? = null

