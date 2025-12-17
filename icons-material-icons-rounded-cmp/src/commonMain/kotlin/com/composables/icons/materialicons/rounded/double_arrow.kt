package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Double_arrow: ImageVector
    get() {
        if (_Double_arrow != null) return _Double_arrow!!
        
        _Double_arrow = ImageVector.Builder(
            name = "double_arrow",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.08f, 11.42f)
                        lineToRelative(-4.04f, -5.65f)
                        curveTo(15.7f, 5.29f, 15.15f, 5f, 14.56f, 5f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-1.49f, 0f, -2.35f, 1.68f, -1.49f, 2.89f)
                        lineTo(16f, 12f)
                        lineToRelative(-2.93f, 4.11f)
                        curveToRelative(-0.87f, 1.21f, 0f, 2.89f, 1.49f, 2.89f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.59f, 0f, 1.15f, -0.29f, 1.49f, -0.77f)
                        lineToRelative(4.04f, -5.65f)
                        curveTo(20.33f, 12.23f, 20.33f, 11.77f, 20.08f, 11.42f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.08f, 11.42f)
                        lineTo(9.05f, 5.77f)
                        curveTo(8.7f, 5.29f, 8.15f, 5f, 7.56f, 5f)
                        horizontalLineToRelative(0f)
                        curveTo(6.07f, 5f, 5.2f, 6.68f, 6.07f, 7.89f)
                        lineTo(9f, 12f)
                        lineToRelative(-2.93f, 4.11f)
                        curveTo(5.2f, 17.32f, 6.07f, 19f, 7.56f, 19f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.59f, 0f, 1.15f, -0.29f, 1.49f, -0.77f)
                        lineToRelative(4.04f, -5.65f)
                        curveTo(13.33f, 12.23f, 13.33f, 11.77f, 13.08f, 11.42f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Double_arrow!!
    }

private var _Double_arrow: ImageVector? = null

