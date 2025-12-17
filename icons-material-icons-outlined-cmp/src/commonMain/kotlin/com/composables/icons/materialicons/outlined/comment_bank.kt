package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Comment_bank: ImageVector
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
                        moveTo(18f, 14f)
                        lineTo(18f, 6f)
                        lineTo(13f, 6f)
                        lineTo(13f, 14f)
                        lineTo(15.5f, 12.5f)
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
                        horizontalLineTo(6f)
                        lineToRelative(-2f, 2f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Comment_bank!!
    }

private var _Comment_bank: ImageVector? = null

