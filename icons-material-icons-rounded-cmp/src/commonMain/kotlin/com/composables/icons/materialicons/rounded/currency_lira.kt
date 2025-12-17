package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Currency_lira: ImageVector
    get() {
        if (_Currency_lira != null) return _Currency_lira!!
        
        _Currency_lira = ImageVector.Builder(
            name = "currency_lira",
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
                    moveTo(9f, 15.84f)
                    lineToRelative(-1.47f, 0.92f)
                    curveTo(6.86f, 17.18f, 6f, 16.7f, 6f, 15.91f)
                    curveToRelative(0f, -0.34f, 0.18f, -0.66f, 0.47f, -0.85f)
                    lineTo(9f, 13.48f)
                    verticalLineToRelative(-2.36f)
                    lineToRelative(-1.47f, 0.92f)
                    curveTo(6.86f, 12.46f, 6f, 11.98f, 6f, 11.19f)
                    curveToRelative(0f, -0.34f, 0.18f, -0.66f, 0.47f, -0.85f)
                    lineTo(9f, 8.76f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(3.51f)
                    lineToRelative(2.47f, -1.55f)
                    curveTo(14.14f, 5.54f, 15f, 6.02f, 15f, 6.81f)
                    curveToRelative(0f, 0.34f, -0.18f, 0.66f, -0.47f, 0.85f)
                    lineTo(11f, 9.87f)
                    lineToRelative(0.01f, 2.35f)
                    lineToRelative(2.46f, -1.54f)
                    curveToRelative(0.67f, -0.42f, 1.53f, 0.06f, 1.53f, 0.85f)
                    curveToRelative(0f, 0.34f, -0.18f, 0.66f, -0.47f, 0.85f)
                    lineTo(11f, 14.59f)
                    verticalLineTo(19f)
                    curveToRelative(2.47f, 0f, 4.52f, -1.79f, 4.93f, -4.15f)
                    curveToRelative(0.08f, -0.49f, 0.49f, -0.85f, 0.98f, -0.85f)
                    curveToRelative(0.61f, 0f, 1.09f, 0.54f, 1f, 1.14f)
                    curveTo(17.37f, 18.46f, 14.48f, 21f, 11f, 21f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(15.84f)
                    close()
                }
            }
        }.build()
        
        return _Currency_lira!!
    }

private var _Currency_lira: ImageVector? = null

