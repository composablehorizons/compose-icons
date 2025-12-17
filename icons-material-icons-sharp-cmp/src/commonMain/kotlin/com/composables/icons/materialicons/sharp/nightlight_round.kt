package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Nightlight_round: ImageVector
    get() {
        if (_Nightlight_round != null) return _Nightlight_round!!
        
        _Nightlight_round = ImageVector.Builder(
            name = "nightlight_round",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.5f, 22f)
                        curveToRelative(1.05f, 0f, 2.05f, -0.16f, 3f, -0.46f)
                        curveToRelative(-4.06f, -1.27f, -7f, -5.06f, -7f, -9.54f)
                        reflectiveCurveToRelative(2.94f, -8.27f, 7f, -9.54f)
                        curveTo(17.55f, 2.16f, 16.55f, 2f, 15.5f, 2f)
                        curveToRelative(-5.52f, 0f, -10f, 4.48f, -10f, 10f)
                        reflectiveCurveTo(9.98f, 22f, 15.5f, 22f)
                        lineTo(15.5f, 22f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Nightlight_round!!
    }

private var _Nightlight_round: ImageVector? = null

