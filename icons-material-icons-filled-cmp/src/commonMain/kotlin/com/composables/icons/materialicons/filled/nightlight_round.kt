package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Nightlight_round: ImageVector
    get() {
        if (_Nightlight_round != null) return _Nightlight_round!!
        
        _Nightlight_round = ImageVector.Builder(
            name = "nightlight_round",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.01f, 12f)
                curveToRelative(0f, -3.57f, 2.2f, -6.62f, 5.31f, -7.87f)
                curveToRelative(0.89f, -0.36f, 0.75f, -1.69f, -0.19f, -1.9f)
                curveToRelative(-1.1f, -0.24f, -2.27f, -0.3f, -3.48f, -0.14f)
                curveToRelative(-4.51f, 0.6f, -8.12f, 4.31f, -8.59f, 8.83f)
                curveTo(4.44f, 16.93f, 9.13f, 22f, 15.01f, 22f)
                curveToRelative(0.73f, 0f, 1.43f, -0.08f, 2.12f, -0.23f)
                curveToRelative(0.95f, -0.21f, 1.1f, -1.53f, 0.2f, -1.9f)
                curveToRelative(-3.22f, -1.29f, -5.33f, -4.41f, -5.32f, -7.87f)
                close()
            }
        }.build()
        
        return _Nightlight_round!!
    }

private var _Nightlight_round: ImageVector? = null

