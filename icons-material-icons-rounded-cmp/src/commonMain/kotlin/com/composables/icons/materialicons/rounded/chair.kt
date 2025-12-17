package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Chair: ImageVector
    get() {
        if (_Chair != null) return _Chair!!
        
        _Chair = ImageVector.Builder(
            name = "chair",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 9f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                        verticalLineToRelative(-5f)
                        curveTo(23f, 9.9f, 22.1f, 9f, 21f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 11f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -1.86f, 1.28f, -3.41f, 3f, -3.86f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                        horizontalLineTo(7f)
                        curveTo(5.35f, 3f, 4f, 4.35f, 4f, 6f)
                        verticalLineToRelative(1.14f)
                        curveTo(5.72f, 7.59f, 7f, 9.14f, 7f, 11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Chair!!
    }

private var _Chair: ImageVector? = null

