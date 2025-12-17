package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Currency_yen: ImageVector
    get() {
        if (_Currency_yen != null) return _Currency_yen!!
        
        _Currency_yen = ImageVector.Builder(
            name = "currency_yen",
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
                    moveTo(6.82f, 3f)
                    curveToRelative(0.34f, 0f, 0.66f, 0.17f, 0.84f, 0.46f)
                    lineTo(12f, 10.29f)
                    lineToRelative(4.34f, -6.83f)
                    curveTo(16.52f, 3.17f, 16.84f, 3f, 17.18f, 3f)
                    curveToRelative(0.79f, 0f, 1.27f, 0.87f, 0.84f, 1.54f)
                    lineTo(13.92f, 11f)
                    horizontalLineTo(17f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(3.08f)
                    lineTo(5.98f, 4.54f)
                    curveTo(5.55f, 3.87f, 6.03f, 3f, 6.82f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Currency_yen!!
    }

private var _Currency_yen: ImageVector? = null

