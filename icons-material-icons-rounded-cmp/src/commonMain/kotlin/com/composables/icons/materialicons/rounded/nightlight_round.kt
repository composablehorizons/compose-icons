package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Nightlight_round: ImageVector
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
                        curveToRelative(0.07f, 0f, 0.14f, 0f, 0.21f, 0f)
                        curveToRelative(0.84f, -0.02f, 1.12f, -1.11f, 0.41f, -1.56f)
                        curveToRelative(-2.78f, -1.77f, -4.63f, -4.89f, -4.63f, -8.43f)
                        curveToRelative(0f, -3.55f, 1.85f, -6.66f, 4.63f, -8.44f)
                        curveToRelative(0.7f, -0.45f, 0.44f, -1.54f, -0.39f, -1.56f)
                        curveToRelative(-0.04f, 0f, -0.09f, 0f, -0.13f, 0f)
                        curveToRelative(-4.9f, -0.05f, -9.21f, 3.53f, -9.98f, 8.37f)
                        curveTo(4.64f, 16.61f, 9.45f, 22f, 15.5f, 22f)
                        lineTo(15.5f, 22f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Nightlight_round!!
    }

private var _Nightlight_round: ImageVector? = null

