package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Splitscreen: ImageVector
    get() {
        if (_Splitscreen != null) return _Splitscreen!!
        
        _Splitscreen = ImageVector.Builder(
            name = "splitscreen",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(18f, 4f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(6f)
                        verticalLineTo(4f)
                        horizontalLineTo(18f)
                        moveTo(18f, 2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
                        close()
                        moveTo(18f, 15f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-5f)
                        horizontalLineTo(18f)
                        moveTo(18f, 13f)
                        horizontalLineTo(6f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-5f)
                        curveTo(20f, 13.9f, 19.1f, 13f, 18f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Splitscreen!!
    }

private var _Splitscreen: ImageVector? = null

