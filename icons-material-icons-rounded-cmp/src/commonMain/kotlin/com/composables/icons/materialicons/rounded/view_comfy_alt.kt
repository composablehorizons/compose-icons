package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.View_comfy_alt: ImageVector
    get() {
        if (_View_comfy_alt != null) return _View_comfy_alt!!
        
        _View_comfy_alt = ImageVector.Builder(
            name = "view_comfy_alt",
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
                        moveTo(20f, 4f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                        close()
                        moveTo(10.5f, 17f)
                        horizontalLineToRelative(-3f)
                        curveTo(7.22f, 17f, 7f, 16.78f, 7f, 16.5f)
                        verticalLineToRelative(-3f)
                        curveTo(7f, 13.22f, 7.22f, 13f, 7.5f, 13f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineToRelative(3f)
                        curveTo(11f, 16.78f, 10.78f, 17f, 10.5f, 17f)
                        close()
                        moveTo(10.5f, 11f)
                        horizontalLineToRelative(-3f)
                        curveTo(7.22f, 11f, 7f, 10.78f, 7f, 10.5f)
                        verticalLineToRelative(-3f)
                        curveTo(7f, 7.22f, 7.22f, 7f, 7.5f, 7f)
                        horizontalLineToRelative(3f)
                        curveTo(10.78f, 7f, 11f, 7.22f, 11f, 7.5f)
                        verticalLineToRelative(3f)
                        curveTo(11f, 10.78f, 10.78f, 11f, 10.5f, 11f)
                        close()
                        moveTo(16.5f, 17f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineToRelative(3f)
                        curveTo(17f, 16.78f, 16.78f, 17f, 16.5f, 17f)
                        close()
                        moveTo(16.5f, 11f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                        verticalLineToRelative(-3f)
                        curveTo(13f, 7.22f, 13.22f, 7f, 13.5f, 7f)
                        horizontalLineToRelative(3f)
                        curveTo(16.78f, 7f, 17f, 7.22f, 17f, 7.5f)
                        verticalLineToRelative(3f)
                        curveTo(17f, 10.78f, 16.78f, 11f, 16.5f, 11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _View_comfy_alt!!
    }

private var _View_comfy_alt: ImageVector? = null

