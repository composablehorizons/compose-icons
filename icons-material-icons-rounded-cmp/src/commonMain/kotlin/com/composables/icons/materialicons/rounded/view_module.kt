package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.View_module: ImageVector
    get() {
        if (_View_module != null) return _View_module!!
        
        _View_module = ImageVector.Builder(
            name = "view_module",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.67f, 6f)
                    verticalLineToRelative(4.5f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-3.33f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(3.33f)
                    curveTo(14.22f, 5f, 14.67f, 5.45f, 14.67f, 6f)
                    close()
                    moveTo(16.67f, 11.5f)
                    horizontalLineTo(20f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-3.33f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(4.5f)
                    curveTo(15.67f, 11.05f, 16.11f, 11.5f, 16.67f, 11.5f)
                    close()
                    moveTo(14.67f, 18f)
                    verticalLineToRelative(-4.5f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-3.33f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineTo(18f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(3.33f)
                    curveTo(14.22f, 19f, 14.67f, 18.55f, 14.67f, 18f)
                    close()
                    moveTo(15.67f, 13.5f)
                    verticalLineTo(18f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineTo(20f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-4.5f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-3.33f)
                    curveTo(16.11f, 12.5f, 15.67f, 12.95f, 15.67f, 13.5f)
                    close()
                    moveTo(7.33f, 12.5f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineTo(18f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(3.33f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-4.5f)
                    curveTo(8.33f, 12.95f, 7.89f, 12.5f, 7.33f, 12.5f)
                    close()
                    moveTo(8.33f, 10.5f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(4f)
                    curveTo(3.45f, 5f, 3f, 5.45f, 3f, 6f)
                    verticalLineToRelative(4.5f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(3.33f)
                    curveTo(7.89f, 11.5f, 8.33f, 11.05f, 8.33f, 10.5f)
                    close()
                }
            }
        }.build()
        
        return _View_module!!
    }

private var _View_module: ImageVector? = null

