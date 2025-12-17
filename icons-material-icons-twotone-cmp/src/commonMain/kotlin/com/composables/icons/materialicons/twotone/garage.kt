package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Garage: ImageVector
    get() {
        if (_Garage != null) return _Garage!!
        
        _Garage = ImageVector.Builder(
            name = "garage",
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
                        moveTo(17f, 11.51f)
                        verticalLineTo(11.5f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(0.01f)
                        verticalLineToRelative(2.99f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(11.51f)
                        close()
                        moveTo(9f, 14f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(9.55f, 14f, 9f, 14f)
                        close()
                        moveTo(15f, 14f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(15.55f, 14f, 15f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 20f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(4f)
                        horizontalLineTo(4f)
                        verticalLineTo(20f)
                        close()
                        moveTo(5f, 11.19f)
                        curveTo(5.82f, 8.72f, 6.34f, 7.16f, 6.56f, 6.5f)
                        curveToRelative(0.05f, -0.16f, 0.12f, -0.29f, 0.19f, -0.4f)
                        curveTo(6.77f, 6.08f, 6.78f, 6.06f, 6.8f, 6.04f)
                        curveTo(7.18f, 5.51f, 7.72f, 5.5f, 7.72f, 5.5f)
                        horizontalLineToRelative(8.56f)
                        curveToRelative(0f, 0f, 0.54f, 0.01f, 0.92f, 0.53f)
                        curveToRelative(0.02f, 0.03f, 0.03f, 0.05f, 0.05f, 0.07f)
                        curveToRelative(0.07f, 0.11f, 0.14f, 0.24f, 0.19f, 0.4f)
                        curveToRelative(0.22f, 0.66f, 0.74f, 2.23f, 1.56f, 4.69f)
                        verticalLineToRelative(6.5f)
                        curveToRelative(0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f)
                        horizontalLineToRelative(-0.44f)
                        curveToRelative(-0.44f, 0f, -0.78f, -0.36f, -0.78f, -0.81f)
                        verticalLineTo(16.5f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(1.19f)
                        curveToRelative(0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f)
                        horizontalLineTo(5.78f)
                        curveTo(5.35f, 18.5f, 5f, 18.14f, 5f, 17.69f)
                        verticalLineTo(11.19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                        close()
                        moveTo(20f, 20f)
                        horizontalLineTo(4f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 9f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 8f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 10f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 16f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.78f, 18.5f)
                        horizontalLineToRelative(0.44f)
                        curveTo(6.65f, 18.5f, 7f, 18.14f, 7f, 17.69f)
                        verticalLineTo(16.5f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(1.19f)
                        curveToRelative(0f, 0.45f, 0.34f, 0.81f, 0.78f, 0.81f)
                        horizontalLineToRelative(0.44f)
                        curveToRelative(0.43f, 0f, 0.78f, -0.36f, 0.78f, -0.81f)
                        verticalLineToRelative(-6.5f)
                        curveToRelative(-0.82f, -2.46f, -1.34f, -4.03f, -1.56f, -4.69f)
                        curveToRelative(-0.05f, -0.16f, -0.12f, -0.29f, -0.19f, -0.4f)
                        curveToRelative(-0.02f, -0.02f, -0.03f, -0.04f, -0.05f, -0.07f)
                        curveToRelative(-0.38f, -0.52f, -0.92f, -0.53f, -0.92f, -0.53f)
                        horizontalLineTo(7.72f)
                        curveToRelative(0f, 0f, -0.54f, 0.01f, -0.92f, 0.54f)
                        curveTo(6.78f, 6.06f, 6.77f, 6.08f, 6.75f, 6.1f)
                        curveTo(6.68f, 6.21f, 6.61f, 6.34f, 6.56f, 6.5f)
                        curveTo(6.34f, 7.16f, 5.82f, 8.72f, 5f, 11.19f)
                        verticalLineToRelative(6.5f)
                        curveTo(5f, 18.14f, 5.35f, 18.5f, 5.78f, 18.5f)
                        close()
                        moveTo(8.33f, 7.5f)
                        horizontalLineToRelative(7.34f)
                        lineToRelative(0.23f, 0.69f)
                        lineToRelative(0.43f, 1.31f)
                        horizontalLineTo(7.67f)
                        lineTo(8.33f, 7.5f)
                        close()
                        moveTo(7f, 11.51f)
                        verticalLineTo(11.5f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(0.01f)
                        verticalLineToRelative(2.99f)
                        horizontalLineTo(7f)
                        verticalLineTo(11.51f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Garage!!
    }

private var _Garage: ImageVector? = null

