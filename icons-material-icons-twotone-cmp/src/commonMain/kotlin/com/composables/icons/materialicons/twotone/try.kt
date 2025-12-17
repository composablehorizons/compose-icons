package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Try: ImageVector
    get() {
        if (_Try != null) return _Try!!
        
        _Try = ImageVector.Builder(
            name = "try",
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
                        moveTo(4f, 17.17f)
                        lineTo(5.17f, 16f)
                        horizontalLineTo(20f)
                        verticalLineTo(4f)
                        horizontalLineTo(4f)
                        verticalLineTo(17.17f)
                        close()
                        moveTo(10.43f, 8.43f)
                        lineTo(12f, 5f)
                        lineToRelative(1.57f, 3.43f)
                        lineTo(17f, 10f)
                        lineToRelative(-3.43f, 1.57f)
                        lineTo(12f, 15f)
                        lineToRelative(-1.57f, -3.43f)
                        lineTo(7f, 10f)
                        lineTo(10.43f, 8.43f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                        verticalLineToRelative(18f)
                        lineToRelative(4f, -4f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                        close()
                        moveTo(20f, 16f)
                        horizontalLineTo(5.17f)
                        lineTo(4f, 17.17f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 15f)
                        lineTo(13.57f, 11.57f)
                        lineTo(17f, 10f)
                        lineTo(13.57f, 8.43f)
                        lineTo(12f, 5f)
                        lineTo(10.43f, 8.43f)
                        lineTo(7f, 10f)
                        lineTo(10.43f, 11.57f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Try!!
    }

private var _Try: ImageVector? = null

