package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`60fps`: ImageVector
    get() {
        if (_60fps != null) return _60fps!!
        
        _60fps = ImageVector.Builder(
            name = "60fps",
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
                        moveTo(19f, 8f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(8f)
                        horizontalLineTo(19f)
                        moveTo(19f, 5f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                        horizontalLineToRelative(4f)
                        curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                        verticalLineTo(8f)
                        curveTo(22f, 6.34f, 20.66f, 5f, 19f, 5f)
                        close()
                        moveTo(10f, 8f)
                        verticalLineTo(5f)
                        horizontalLineTo(5f)
                        curveTo(3.34f, 5f, 2f, 6.34f, 2f, 8f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                        horizontalLineToRelative(3f)
                        curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                        horizontalLineTo(5f)
                        verticalLineTo(8f)
                        horizontalLineTo(10f)
                        close()
                        moveTo(8f, 13f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _60fps!!
    }

private var _60fps: ImageVector? = null

