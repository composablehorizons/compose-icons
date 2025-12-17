package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`5g`: ImageVector
    get() {
        if (_5g != null) return _5g!!
        
        _5g = ImageVector.Builder(
            name = "5g",
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
                        moveTo(16.5f, 13f)
                        horizontalLineTo(19f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(7f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-5f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(5f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(-4.5f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 13f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(5f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(5f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(7f)
                        horizontalLineTo(3f)
                        verticalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _5g!!
    }

private var _5g: ImageVector? = null

