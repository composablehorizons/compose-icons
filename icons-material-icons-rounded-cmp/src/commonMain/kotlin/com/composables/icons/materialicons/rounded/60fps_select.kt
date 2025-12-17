package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`60fps_select`: ImageVector
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
                        moveTo(11f, 5f)
                        lineTo(11f, 5f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
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
                        horizontalLineToRelative(4f)
                        curveTo(10.55f, 6f, 11f, 5.55f, 11f, 5f)
                        close()
                        moveTo(9f, 10f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(9f)
                        close()
                        moveTo(4f, 22f)
                        lineTo(4f, 22f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(3f)
                        curveTo(5f, 21.55f, 4.55f, 22f, 4f, 22f)
                        close()
                        moveTo(8f, 22f)
                        lineTo(8f, 22f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(3f)
                        curveTo(9f, 21.55f, 8.55f, 22f, 8f, 22f)
                        close()
                        moveTo(12f, 22f)
                        lineTo(12f, 22f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(3f)
                        curveTo(13f, 21.55f, 12.55f, 22f, 12f, 22f)
                        close()
                        moveTo(20f, 22f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(3f)
                        curveTo(21f, 21.55f, 20.55f, 22f, 20f, 22f)
                        close()
                    }
                }
            }
        }.build()
        
        return _60fps_select!!
    }

private var _60fps_select: ImageVector? = null

