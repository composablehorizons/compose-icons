package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Currency_bitcoin: ImageVector
    get() {
        if (_Currency_bitcoin != null) return _Currency_bitcoin!!
        
        _Currency_bitcoin = ImageVector.Builder(
            name = "currency_bitcoin",
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
                    moveTo(10f, 7f)
                    horizontalLineToRelative(4f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(7f)
                    close()
                    moveTo(15f, 17f)
                    horizontalLineToRelative(-5f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(5f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    reflectiveCurveTo(16.1f, 17f, 15f, 17f)
                    close()
                    moveTo(15f, 4f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveTo(9f, 3.45f, 9f, 4f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(7f)
                    curveTo(6.45f, 5f, 6f, 5.45f, 6f, 6f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(10f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                    curveToRelative(0f, -1.45f, -0.78f, -2.73f, -1.94f, -3.43f)
                    curveTo(17.65f, 10.88f, 18f, 9.98f, 18f, 9f)
                    curveToRelative(0f, -1.86f, -1.27f, -3.43f, -3f, -3.87f)
                    lineTo(15f, 4f)
                    close()
                }
            }
        }.build()
        
        return _Currency_bitcoin!!
    }

private var _Currency_bitcoin: ImageVector? = null

