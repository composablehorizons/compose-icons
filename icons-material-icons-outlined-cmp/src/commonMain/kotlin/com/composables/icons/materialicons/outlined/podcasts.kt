package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Podcasts: ImageVector
    get() {
        if (_Podcasts != null) return _Podcasts!!
        
        _Podcasts = ImageVector.Builder(
            name = "podcasts",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 12f)
                    curveToRelative(0f, 0.74f, -0.4f, 1.38f, -1f, 1.72f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-8.28f)
                    curveToRelative(-0.6f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveTo(14f, 10.9f, 14f, 12f)
                    close()
                    moveTo(12f, 6f)
                    curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                    curveToRelative(0f, 1.74f, 0.75f, 3.31f, 1.94f, 4.4f)
                    lineToRelative(1.42f, -1.42f)
                    curveTo(8.53f, 14.25f, 8f, 13.19f, 8f, 12f)
                    curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                    reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                    curveToRelative(0f, 1.19f, -0.53f, 2.25f, -1.36f, 2.98f)
                    lineToRelative(1.42f, 1.42f)
                    curveTo(17.25f, 15.31f, 18f, 13.74f, 18f, 12f)
                    curveTo(18f, 8.69f, 15.31f, 6f, 12f, 6f)
                    close()
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 2.85f, 1.2f, 5.41f, 3.11f, 7.24f)
                    lineToRelative(1.42f, -1.42f)
                    curveTo(4.98f, 16.36f, 4f, 14.29f, 4f, 12f)
                    curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                    reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                    curveToRelative(0f, 2.29f, -0.98f, 4.36f, -2.53f, 5.82f)
                    lineToRelative(1.42f, 1.42f)
                    curveTo(20.8f, 17.41f, 22f, 14.85f, 22f, 12f)
                    curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                    close()
                }
            }
        }.build()
        
        return _Podcasts!!
    }

private var _Podcasts: ImageVector? = null

