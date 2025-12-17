package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Cyclone: ImageVector
    get() {
        if (_Cyclone != null) return _Cyclone!!
        
        _Cyclone = ImageVector.Builder(
            name = "cyclone",
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
                        moveTo(12f, 8f)
                        curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        curveTo(16f, 9.79f, 14.21f, 8f, 12f, 8f)
                        close()
                        moveTo(12f, 14f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        curveTo(14f, 13.1f, 13.1f, 14f, 12f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 7.47f)
                        verticalLineTo(5.35f)
                        curveTo(20.05f, 4.77f, 16.56f, 4f, 12f, 4f)
                        curveTo(9.85f, 4f, 7.89f, 4.86f, 6.46f, 6.24f)
                        curveTo(6.59f, 5.39f, 6.86f, 3.84f, 7.47f, 2f)
                        horizontalLineTo(5.35f)
                        curveTo(4.77f, 3.95f, 4f, 7.44f, 4f, 12f)
                        curveToRelative(0f, 2.15f, 0.86f, 4.11f, 2.24f, 5.54f)
                        curveToRelative(-0.85f, -0.14f, -2.4f, -0.4f, -4.24f, -1.01f)
                        verticalLineToRelative(2.12f)
                        curveTo(3.95f, 19.23f, 7.44f, 20f, 12f, 20f)
                        curveToRelative(2.15f, 0f, 4.11f, -0.86f, 5.54f, -2.24f)
                        curveToRelative(-0.14f, 0.85f, -0.4f, 2.4f, -1.01f, 4.24f)
                        horizontalLineToRelative(2.12f)
                        curveTo(19.23f, 20.05f, 20f, 16.56f, 20f, 12f)
                        curveToRelative(0f, -2.15f, -0.86f, -4.11f, -2.24f, -5.54f)
                        curveTo(18.61f, 6.59f, 20.16f, 6.86f, 22f, 7.47f)
                        close()
                        moveTo(12f, 18f)
                        curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                        reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                        reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                        reflectiveCurveTo(15.31f, 18f, 12f, 18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cyclone!!
    }

private var _Cyclone: ImageVector? = null

