package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Currency_exchange: ImageVector
    get() {
        if (_Currency_exchange != null) return _Currency_exchange!!
        
        _Currency_exchange = ImageVector.Builder(
            name = "currency_exchange",
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
                    moveTo(12.89f, 11.1f)
                    curveToRelative(-1.78f, -0.59f, -2.64f, -0.96f, -2.64f, -1.9f)
                    curveToRelative(0f, -1.02f, 1.11f, -1.39f, 1.81f, -1.39f)
                    curveToRelative(1.31f, 0f, 1.79f, 0.99f, 1.9f, 1.34f)
                    lineToRelative(1.58f, -0.67f)
                    curveTo(15.39f, 8.03f, 14.72f, 6.56f, 13f, 6.24f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1.26f)
                    curveTo(8.52f, 6.82f, 8.51f, 9.12f, 8.51f, 9.22f)
                    curveToRelative(0f, 2.27f, 2.25f, 2.91f, 3.35f, 3.31f)
                    curveToRelative(1.58f, 0.56f, 2.28f, 1.07f, 2.28f, 2.03f)
                    curveToRelative(0f, 1.13f, -1.05f, 1.61f, -1.98f, 1.61f)
                    curveToRelative(-1.82f, 0f, -2.34f, -1.87f, -2.4f, -2.09f)
                    lineTo(8.1f, 14.75f)
                    curveToRelative(0.63f, 2.19f, 2.28f, 2.78f, 2.9f, 2.96f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-1.24f)
                    curveToRelative(0.4f, -0.09f, 2.9f, -0.59f, 2.9f, -3.22f)
                    curveTo(15.9f, 13.15f, 15.29f, 11.93f, 12.89f, 11.1f)
                    close()
                    moveTo(3f, 21f)
                    horizontalLineTo(1f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(2f)
                    lineToRelative(-2.48f, 0f)
                    curveToRelative(1.61f, 2.41f, 4.36f, 4f, 7.48f, 4f)
                    curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0f, 6.08f, -4.92f, 11f, -11f, 11f)
                    curveToRelative(-3.72f, 0f, -7.01f, -1.85f, -9f, -4.67f)
                    lineTo(3f, 21f)
                    close()
                    moveTo(1f, 12f)
                    curveTo(1f, 5.92f, 5.92f, 1f, 12f, 1f)
                    curveToRelative(3.72f, 0f, 7.01f, 1.85f, 9f, 4.67f)
                    lineTo(21f, 3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(-6f)
                    verticalLineTo(7f)
                    lineToRelative(2.48f, 0f)
                    curveTo(17.87f, 4.59f, 15.12f, 3f, 12f, 3f)
                    curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                    horizontalLineTo(1f)
                    close()
                }
            }
        }.build()
        
        return _Currency_exchange!!
    }

private var _Currency_exchange: ImageVector? = null

