package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Architecture: ImageVector
    get() {
        if (_Architecture != null) return _Architecture!!
        
        _Architecture = ImageVector.Builder(
            name = "architecture",
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
                        moveTo(6.36f, 18.78f)
                        lineTo(6.61f, 21f)
                        lineToRelative(1.62f, -1.54f)
                        lineToRelative(2.77f, -7.6f)
                        curveToRelative(-0.68f, -0.17f, -1.28f, -0.51f, -1.77f, -0.98f)
                        lineTo(6.36f, 18.78f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.77f, 10.88f)
                        curveToRelative(-0.49f, 0.47f, -1.1f, 0.81f, -1.77f, 0.98f)
                        lineToRelative(2.77f, 7.6f)
                        lineTo(17.39f, 21f)
                        lineToRelative(0.26f, -2.22f)
                        lineTo(14.77f, 10.88f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.94f, 8.6f)
                        curveToRelative(0.3f, -1.56f, -0.6f, -2.94f, -1.94f, -3.42f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1.18f)
                        curveTo(9.84f, 5.6f, 9f, 6.7f, 9f, 8f)
                        curveToRelative(0f, 1.84f, 1.66f, 3.3f, 3.56f, 2.95f)
                        curveTo(13.74f, 10.73f, 14.71f, 9.78f, 14.94f, 8.6f)
                        close()
                        moveTo(12f, 9f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(13f, 8.55f, 12.55f, 9f, 12f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Architecture!!
    }

private var _Architecture: ImageVector? = null

