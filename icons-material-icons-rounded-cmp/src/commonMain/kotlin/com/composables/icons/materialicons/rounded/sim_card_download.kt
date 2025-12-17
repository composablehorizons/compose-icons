package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sim_card_download: ImageVector
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
                    moveTo(18f, 2f)
                    horizontalLineToRelative(-7.17f)
                    curveTo(10.3f, 2f, 9.79f, 2.21f, 9.41f, 2.59f)
                    lineTo(4.59f, 7.41f)
                    curveTo(4.21f, 7.79f, 4f, 8.3f, 4f, 8.83f)
                    verticalLineTo(20f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
                    close()
                    moveTo(11.65f, 16.65f)
                    lineToRelative(-2.79f, -2.79f)
                    curveTo(8.54f, 13.54f, 8.76f, 13f, 9.21f, 13f)
                    horizontalLineTo(11f)
                    verticalLineToRelative(-2.99f)
                    curveToRelative(0f, -0.55f, 0.44f, -0.99f, 0.99f, -1f)
                    horizontalLineToRelative(0f)
                    curveTo(12.55f, 9f, 13f, 9.45f, 13f, 10.01f)
                    verticalLineTo(13f)
                    horizontalLineToRelative(1.79f)
                    curveToRelative(0.45f, 0f, 0.67f, 0.54f, 0.35f, 0.85f)
                    lineToRelative(-2.79f, 2.79f)
                    curveTo(12.16f, 16.84f, 11.84f, 16.84f, 11.65f, 16.65f)
                    close()
                }
            }
        }.build()
        
        return _Sim_card_download!!
    }

private var _Sim_card_download: ImageVector? = null

