package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sim_card_download: ImageVector
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
                        moveTo(11f, 9.02f)
                        lineTo(13f, 9f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(3f)
                        lineToRelative(-4f, 4f)
                        lineToRelative(-4f, -4f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(9.02f)
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
                        moveTo(12f, 17f)
                        lineTo(16f, 13f)
                        lineTo(13f, 13f)
                        lineTo(13f, 9f)
                        lineTo(11f, 9.02f)
                        lineTo(11f, 13f)
                        lineTo(8f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sim_card_download!!
    }

private var _Sim_card_download: ImageVector? = null

