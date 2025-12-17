package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Currency_rupee: ImageVector
    get() {
        if (_Currency_rupee != null) return _Currency_rupee!!
        
        _Currency_rupee = ImageVector.Builder(
            name = "currency_rupee",
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
                    moveTo(10.5f, 14f)
                    horizontalLineTo(9.77f)
                    lineToRelative(5.1f, 5.31f)
                    curveToRelative(0.61f, 0.64f, 0.16f, 1.69f, -0.72f, 1.69f)
                    curveToRelative(-0.27f, 0f, -0.53f, -0.11f, -0.72f, -0.31f)
                    lineTo(7.4f, 14.41f)
                    curveTo(7.14f, 14.15f, 7f, 13.79f, 7f, 13.43f)
                    curveTo(7f, 12.64f, 7.64f, 12f, 8.43f, 12f)
                    horizontalLineToRelative(2.07f)
                    curveToRelative(1.76f, 0f, 3.22f, -1.3f, 3.46f, -3f)
                    lineTo(7f, 9f)
                    curveTo(6.45f, 9f, 6f, 8.55f, 6f, 8f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    lineToRelative(6.66f, 0f)
                    curveTo(13.1f, 5.82f, 11.9f, 5f, 10.5f, 5f)
                    lineTo(7f, 5f)
                    curveTo(6.45f, 5f, 6f, 4.55f, 6f, 4f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(10f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    lineToRelative(-2.26f, 0f)
                    curveToRelative(0.48f, 0.58f, 0.84f, 1.26f, 1.05f, 2f)
                    lineTo(17f, 7f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    lineToRelative(-1.02f, 0f)
                    curveTo(15.72f, 11.8f, 13.36f, 14f, 10.5f, 14f)
                    close()
                }
            }
        }.build()
        
        return _Currency_rupee!!
    }

private var _Currency_rupee: ImageVector? = null

