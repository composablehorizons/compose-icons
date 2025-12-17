package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Ice_skating: ImageVector
    get() {
        if (_Ice_skating != null) return _Ice_skating!!
        
        _Ice_skating = ImageVector.Builder(
            name = "ice_skating",
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
                    moveTo(21.87f, 17f)
                    curveToRelative(-0.47f, 0f, -0.85f, 0.34f, -0.98f, 0.8f)
                    curveTo(20.54f, 19.07f, 19.38f, 20f, 18f, 20f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(1f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    lineToRelative(0f, -0.88f)
                    curveToRelative(0f, -2.1f, -1.55f, -3.53f, -3.03f, -3.88f)
                    lineToRelative(-2.7f, -0.67f)
                    curveTo(12.4f, 10.35f, 11.7f, 9.76f, 11.32f, 9f)
                    horizontalLineTo(8.5f)
                    curveTo(8.22f, 9f, 8f, 8.78f, 8f, 8.5f)
                    reflectiveCurveTo(8.22f, 8f, 8.5f, 8f)
                    horizontalLineToRelative(2.52f)
                    lineTo(11f, 7f)
                    horizontalLineTo(8.5f)
                    curveTo(8.22f, 7f, 8f, 6.78f, 8f, 6.5f)
                    curveTo(8f, 6.22f, 8.22f, 6f, 8.5f, 6f)
                    horizontalLineTo(11f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(11f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(3f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(15f)
                    curveToRelative(2.33f, 0f, 4.29f, -1.6f, 4.84f, -3.75f)
                    curveTo(23.01f, 17.62f, 22.52f, 17f, 21.87f, 17f)
                    close()
                    moveTo(14f, 20f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Ice_skating!!
    }

private var _Ice_skating: ImageVector? = null

