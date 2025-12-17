package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Currency_ruble: ImageVector
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
                    moveTo(13.5f, 3f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(9f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4.5f)
                    curveToRelative(3.04f, 0f, 5.5f, -2.46f, 5.5f, -5.5f)
                    curveTo(19f, 5.46f, 16.54f, 3f, 13.5f, 3f)
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

