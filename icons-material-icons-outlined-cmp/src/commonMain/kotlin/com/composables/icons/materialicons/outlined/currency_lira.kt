package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Currency_lira: ImageVector
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
                    moveTo(9f, 8.76f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(4.51f)
                    lineTo(15f, 5f)
                    verticalLineToRelative(2.36f)
                    lineToRelative(-4f, 2.51f)
                    lineToRelative(0.01f, 2.35f)
                    lineTo(15f, 9.72f)
                    verticalLineToRelative(2.36f)
                    lineToRelative(-4f, 2.51f)
                    verticalLineTo(19f)
                    curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0f, 3.87f, -3.13f, 7f, -7f, 7f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-5.16f)
                    lineToRelative(-3f, 1.88f)
                    lineToRelative(0f, -2.36f)
                    lineToRelative(3f, -1.88f)
                    verticalLineToRelative(-2.36f)
                    lineTo(6f, 13f)
                    lineToRelative(0f, -2.36f)
                    lineTo(9f, 8.76f)
                    close()
                }
            }
        }.build()
        
        return _Currency_lira!!
    }

private var _Currency_lira: ImageVector? = null

