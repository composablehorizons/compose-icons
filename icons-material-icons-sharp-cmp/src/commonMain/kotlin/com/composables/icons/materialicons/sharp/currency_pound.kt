package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Currency_pound: ImageVector
    get() {
        if (_Currency_pound != null) return _Currency_pound!!
        
        _Currency_pound = ImageVector.Builder(
            name = "currency_pound",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 21f)
                    curveToRelative(1.93f, 0f, 3.62f, -1.17f, 4f, -3f)
                    lineToRelative(-1.75f, -0.88f)
                    curveTo(16f, 18.21f, 15.33f, 19f, 14f, 19f)
                    lineToRelative(-4.9f, 0f)
                    curveToRelative(0.83f, -1f, 1.5f, -2.34f, 1.5f, -4f)
                    curveToRelative(0f, -0.35f, -0.03f, -0.69f, -0.08f, -1f)
                    lineTo(14f, 14f)
                    verticalLineToRelative(-2f)
                    lineToRelative(-4.18f, 0f)
                    curveTo(9f, 10.42f, 8f, 9.6f, 8f, 8f)
                    curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                    curveToRelative(1.5f, 0f, 2.79f, 0.95f, 3.28f, 2.28f)
                    lineTo(16.63f, 6f)
                    curveToRelative(-0.8f, -2.05f, -2.79f, -3.5f, -5.13f, -3.5f)
                    curveTo(8.46f, 2.5f, 6f, 4.96f, 6f, 8f)
                    curveToRelative(0f, 1.78f, 0.79f, 2.9f, 1.49f, 4f)
                    lineTo(6f, 12f)
                    verticalLineToRelative(2f)
                    lineToRelative(2.47f, 0f)
                    curveToRelative(0.08f, 0.31f, 0.13f, 0.64f, 0.13f, 1f)
                    curveToRelative(0f, 2.7f, -2.6f, 4f, -2.6f, 4f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Currency_pound!!
    }

private var _Currency_pound: ImageVector? = null

