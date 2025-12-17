package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Currency_rupee: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.66f, 7f)
                        curveTo(13.1f, 5.82f, 11.9f, 5f, 10.5f, 5f)
                        lineTo(6f, 5f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(2f)
                        lineToRelative(-3.26f, 0f)
                        curveToRelative(0.48f, 0.58f, 0.84f, 1.26f, 1.05f, 2f)
                        lineTo(18f, 7f)
                        verticalLineToRelative(2f)
                        lineToRelative(-2.02f, 0f)
                        curveToRelative(-0.25f, 2.8f, -2.61f, 5f, -5.48f, 5f)
                        horizontalLineTo(9.77f)
                        lineToRelative(6.73f, 7f)
                        horizontalLineToRelative(-2.77f)
                        lineTo(7f, 14f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(3.5f)
                        curveToRelative(1.76f, 0f, 3.22f, -1.3f, 3.46f, -3f)
                        lineTo(6f, 9f)
                        verticalLineTo(7f)
                        lineTo(13.66f, 7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Currency_rupee!!
    }

private var _Currency_rupee: ImageVector? = null

