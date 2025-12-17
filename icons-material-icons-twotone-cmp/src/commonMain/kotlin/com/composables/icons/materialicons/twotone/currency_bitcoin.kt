package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Currency_bitcoin: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17.06f, 11.57f)
                    curveTo(17.65f, 10.88f, 18f, 9.98f, 18f, 9f)
                    curveToRelative(0f, -1.86f, -1.27f, -3.43f, -3f, -3.87f)
                    lineTo(15f, 3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(3f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(10f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                    curveTo(19f, 13.55f, 18.22f, 12.27f, 17.06f, 11.57f)
                    close()
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
                }
            }
        }.build()
        
        return _Currency_bitcoin!!
    }

private var _Currency_bitcoin: ImageVector? = null

