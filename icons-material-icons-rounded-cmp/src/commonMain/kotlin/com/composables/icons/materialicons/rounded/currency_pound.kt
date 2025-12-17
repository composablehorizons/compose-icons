package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Currency_pound: ImageVector
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
                    moveTo(17.21f, 17.61f)
                    curveToRelative(-0.47f, -0.24f, -1.03f, -0.05f, -1.31f, 0.4f)
                    curveTo(15.54f, 18.61f, 14.93f, 19f, 14f, 19f)
                    lineToRelative(-4.9f, 0f)
                    curveToRelative(0.83f, -1f, 1.5f, -2.34f, 1.5f, -4f)
                    curveToRelative(0f, -0.35f, -0.03f, -0.69f, -0.08f, -1f)
                    lineTo(13f, 14f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    lineToRelative(-3.18f, 0f)
                    curveTo(9f, 10.42f, 8f, 9.6f, 8f, 8f)
                    curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                    curveToRelative(1.2f, 0f, 2.26f, 0.61f, 2.89f, 1.53f)
                    curveToRelative(0.27f, 0.4f, 0.77f, 0.59f, 1.22f, 0.4f)
                    curveToRelative(0.6f, -0.25f, 0.8f, -0.99f, 0.43f, -1.53f)
                    curveToRelative(-0.99f, -1.45f, -2.66f, -2.4f, -4.54f, -2.4f)
                    curveTo(8.46f, 2.5f, 6f, 4.96f, 6f, 8f)
                    curveToRelative(0f, 1.78f, 0.79f, 2.9f, 1.49f, 4f)
                    lineTo(7f, 12f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    lineToRelative(1.47f, 0f)
                    curveToRelative(0.08f, 0.31f, 0.13f, 0.64f, 0.13f, 1f)
                    curveToRelative(0f, 1.9f, -1.29f, 3.11f, -2.06f, 3.66f)
                    curveTo(6.2f, 18.9f, 6f, 19.29f, 6f, 19.71f)
                    verticalLineToRelative(0f)
                    curveTo(6f, 20.42f, 6.58f, 21f, 7.29f, 21f)
                    horizontalLineTo(14f)
                    curveToRelative(1.55f, 0f, 2.95f, -0.76f, 3.63f, -2f)
                    curveTo(17.91f, 18.49f, 17.72f, 17.86f, 17.21f, 17.61f)
                    close()
                }
            }
        }.build()
        
        return _Currency_pound!!
    }

private var _Currency_pound: ImageVector? = null

