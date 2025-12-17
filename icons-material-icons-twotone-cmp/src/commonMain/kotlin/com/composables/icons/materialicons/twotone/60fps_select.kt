package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.`60fps_select`: ImageVector
    get() {
        if (_60fps_select != null) return _60fps_select!!
        
        _60fps_select = ImageVector.Builder(
            name = "60fps_select",
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
                        moveTo(18f, 6f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(6f)
                        horizontalLineTo(18f)
                        close()
                        moveTo(18f, 4f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(3f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(20f, 4.9f, 19.1f, 4f, 18f, 4f)
                        close()
                        moveTo(11f, 6f)
                        verticalLineTo(4f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 4f, 4f, 4.9f, 4f, 6f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(3f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(6f)
                        verticalLineTo(6f)
                        horizontalLineTo(11f)
                        close()
                        moveTo(9f, 10f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(9f)
                        close()
                        moveTo(5f, 22f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(22f)
                        close()
                        moveTo(9f, 22f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(22f)
                        close()
                        moveTo(13f, 22f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(22f)
                        close()
                        moveTo(21f, 22f)
                        horizontalLineToRelative(-6f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(22f)
                        close()
                    }
                }
            }
        }.build()
        
        return _60fps_select!!
    }

private var _60fps_select: ImageVector? = null

