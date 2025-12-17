package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.View_compact_alt: ImageVector
    get() {
        if (_View_compact_alt != null) return _View_compact_alt!!
        
        _View_compact_alt = ImageVector.Builder(
            name = "view_compact_alt",
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
                        moveTo(11f, 16.5f)
                        horizontalLineTo(8f)
                        curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineToRelative(3f)
                        curveTo(11.5f, 16.28f, 11.28f, 16.5f, 11f, 16.5f)
                        close()
                        moveTo(11f, 11.5f)
                        horizontalLineTo(8f)
                        curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineToRelative(3f)
                        curveTo(11.5f, 11.28f, 11.28f, 11.5f, 11f, 11.5f)
                        close()
                        moveTo(16f, 16.5f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineToRelative(3f)
                        curveTo(16.5f, 16.28f, 16.28f, 16.5f, 16f, 16.5f)
                        close()
                        moveTo(16f, 11.5f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineToRelative(3f)
                        curveTo(16.5f, 11.28f, 16.28f, 11.5f, 16f, 11.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _View_compact_alt!!
    }

private var _View_compact_alt: ImageVector? = null

