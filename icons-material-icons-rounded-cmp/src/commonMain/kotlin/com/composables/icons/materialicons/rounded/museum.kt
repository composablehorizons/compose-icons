package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Museum: ImageVector
    get() {
        if (_Museum != null) return _Museum!!
        
        _Museum = ImageVector.Builder(
            name = "museum",
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
                    moveTo(21.5f, 11f)
                    curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                    verticalLineTo(9.26f)
                    curveToRelative(0f, -0.16f, -0.08f, -0.32f, -0.21f, -0.41f)
                    lineTo(12.57f, 2.4f)
                    curveToRelative(-0.34f, -0.24f, -0.8f, -0.24f, -1.15f, 0f)
                    lineTo(2.21f, 8.85f)
                    curveTo(2.08f, 8.94f, 2f, 9.1f, 2f, 9.26f)
                    verticalLineToRelative(1.24f)
                    curveTo(2f, 10.78f, 2.22f, 11f, 2.5f, 11f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(9f)
                    horizontalLineTo(3f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(18f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-9f)
                    horizontalLineTo(21.5f)
                    close()
                    moveTo(16f, 17f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-3f)
                    lineToRelative(-1.17f, 1.75f)
                    curveToRelative(-0.4f, 0.59f, -1.27f, 0.59f, -1.66f, 0f)
                    lineTo(10f, 14f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4.7f)
                    curveTo(8f, 11.58f, 8.58f, 11f, 9.3f, 11f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.43f, 0f, 0.84f, 0.22f, 1.08f, 0.58f)
                    lineTo(12f, 14f)
                    lineToRelative(1.61f, -2.42f)
                    curveTo(13.86f, 11.22f, 14.26f, 11f, 14.7f, 11f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.72f, 0f, 1.3f, 0.58f, 1.3f, 1.3f)
                    verticalLineTo(17f)
                    close()
                }
            }
        }.build()
        
        return _Museum!!
    }

private var _Museum: ImageVector? = null

