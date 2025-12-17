package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Currency_ruble: ImageVector
    get() {
        if (_Currency_ruble != null) return _Currency_ruble!!
        
        _Currency_ruble = ImageVector.Builder(
            name = "currency_ruble",
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
                    moveTo(8f, 21f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4.5f)
                    curveToRelative(3.22f, 0f, 5.79f, -2.76f, 5.47f, -6.04f)
                    curveTo(18.7f, 5.1f, 16.14f, 3f, 13.26f, 3f)
                    lineToRelative(-0.96f, 0f)
                    horizontalLineTo(8f)
                    curveTo(7.45f, 3f, 7f, 3.45f, 7f, 4f)
                    verticalLineToRelative(8f)
                    horizontalLineTo(6f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(6f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2f)
                    curveTo(7f, 20.55f, 7.45f, 21f, 8f, 21f)
                    close()
                    moveTo(13.5f, 12f)
                    horizontalLineTo(9f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(4.5f)
                    curveTo(15.43f, 5f, 17f, 6.57f, 17f, 8.5f)
                    reflectiveCurveTo(15.43f, 12f, 13.5f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Currency_ruble!!
    }

private var _Currency_ruble: ImageVector? = null

