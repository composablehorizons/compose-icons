package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.`30fps_select`: ImageVector
    get() {
        if (_30fps_select != null) return _30fps_select!!
        
        _30fps_select = ImageVector.Builder(
            name = "30fps_select",
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
                        moveTo(4f, 4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(5f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-1.5f)
                        curveTo(11f, 9.67f, 10.83f, 9f, 10f, 9f)
                        curveToRelative(0.83f, 0f, 1f, -0.67f, 1f, -1.5f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(4f)
                        close()
                        moveTo(18f, 4f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineTo(18f)
                        close()
                        moveTo(18f, 6f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(6f)
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
        
        return _30fps_select!!
    }

private var _30fps_select: ImageVector? = null

