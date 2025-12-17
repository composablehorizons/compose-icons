package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Polyline: ImageVector
    get() {
        if (_Polyline != null) return _Polyline!!
        
        _Polyline = ImageVector.Builder(
            name = "polyline",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(10.04f, 6.85f)
                    lineTo(7.3f, 10f)
                    horizontalLineTo(4.5f)
                    curveTo(3.67f, 10f, 3f, 10.67f, 3f, 11.5f)
                    verticalLineToRelative(3f)
                    curveTo(3f, 15.33f, 3.67f, 16f, 4.5f, 16f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.14f, 0f, 0.27f, -0.02f, 0.39f, -0.05f)
                    lineTo(15f, 19.5f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                    horizontalLineToRelative(-3f)
                    curveToRelative(-0.75f, 0f, -1.37f, 0.55f, -1.48f, 1.27f)
                    lineTo(9f, 14.26f)
                    verticalLineTo(11.5f)
                    curveToRelative(0f, -0.12f, -0.01f, -0.24f, -0.04f, -0.36f)
                    lineTo(11.7f, 8f)
                    horizontalLineToRelative(2.8f)
                    curveTo(15.33f, 8f, 16f, 7.33f, 16f, 6.5f)
                    verticalLineToRelative(-3f)
                    curveTo(16f, 2.67f, 15.33f, 2f, 14.5f, 2f)
                    horizontalLineToRelative(-3f)
                    curveTo(10.67f, 2f, 10f, 2.67f, 10f, 3.5f)
                    verticalLineToRelative(3f)
                    curveTo(10f, 6.62f, 10.01f, 6.74f, 10.04f, 6.85f)
                    close()
                }
            }
        }.build()
        
        return _Polyline!!
    }

private var _Polyline: ImageVector? = null

