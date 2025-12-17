package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Auto_delete: ImageVector
    get() {
        if (_Auto_delete != null) return _Auto_delete!!
        
        _Auto_delete = ImageVector.Builder(
            name = "auto_delete",
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
                        moveTo(16f, 9f)
                        curveToRelative(-0.7f, 0f, -1.37f, 0.1f, -2f, 0.29f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 5f, 2f, 5.9f, 2f, 7f)
                        verticalLineToRelative(10f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(5.68f)
                        curveToRelative(1.12f, 2.36f, 3.53f, 4f, 6.32f, 4f)
                        curveToRelative(3.87f, 0f, 7f, -3.13f, 7f, -7f)
                        curveTo(23f, 12.13f, 19.87f, 9f, 16f, 9f)
                        close()
                        moveTo(16f, 21f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                        reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                        reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-2.5f)
                        lineToRelative(-0.71f, -0.71f)
                        curveTo(10.61f, 1.11f, 10.35f, 1f, 10.09f, 1f)
                        horizontalLineTo(5.91f)
                        curveTo(5.65f, 1f, 5.39f, 1.11f, 5.21f, 1.29f)
                        lineTo(4.5f, 2f)
                        horizontalLineTo(2f)
                        curveTo(1.45f, 2f, 1f, 2.45f, 1f, 3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineTo(14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.75f, 12f)
                        lineTo(15.75f, 12f)
                        curveTo(15.34f, 12f, 15f, 12.34f, 15f, 12.75f)
                        verticalLineToRelative(3.68f)
                        curveToRelative(0f, 0.36f, 0.19f, 0.68f, 0.5f, 0.86f)
                        lineToRelative(2.52f, 1.47f)
                        curveToRelative(0.33f, 0.19f, 0.75f, 0.09f, 0.96f, -0.22f)
                        verticalLineToRelative(0f)
                        curveToRelative(0.23f, -0.34f, 0.12f, -0.81f, -0.24f, -1.02f)
                        lineTo(16.5f, 16.2f)
                        verticalLineToRelative(-3.45f)
                        curveTo(16.5f, 12.34f, 16.16f, 12f, 15.75f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_delete!!
    }

private var _Auto_delete: ImageVector? = null

