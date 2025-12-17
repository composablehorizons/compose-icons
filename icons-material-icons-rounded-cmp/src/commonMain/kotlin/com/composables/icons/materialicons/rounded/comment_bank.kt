package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Comment_bank: ImageVector
    get() {
        if (_Comment_bank != null) return _Comment_bank!!
        
        _Comment_bank = ImageVector.Builder(
            name = "comment_bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                        verticalLineToRelative(15.59f)
                        curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                        lineTo(6f, 18f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                        close()
                        moveTo(18.24f, 11.55f)
                        lineTo(16.5f, 10.5f)
                        lineToRelative(-1.74f, 1.05f)
                        curveToRelative(-0.33f, 0.2f, -0.76f, -0.04f, -0.76f, -0.43f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(7.12f)
                        curveTo(19f, 11.51f, 18.58f, 11.75f, 18.24f, 11.55f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Comment_bank!!
    }

private var _Comment_bank: ImageVector? = null

