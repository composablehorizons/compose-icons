package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Yard: ImageVector
    get() {
        if (_Yard != null) return _Yard!!
        
        _Yard = ImageVector.Builder(
            name = "yard",
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
                        moveTo(4f, 20f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(4f)
                        horizontalLineTo(4f)
                        verticalLineTo(20f)
                        close()
                        moveTo(8f, 8.22f)
                        curveToRelative(0f, -0.86f, 0.7f, -1.56f, 1.56f, -1.56f)
                        curveToRelative(0.33f, 0f, 0.64f, 0.1f, 0.89f, 0.28f)
                        lineToRelative(-0.01f, -0.12f)
                        curveToRelative(0f, -0.86f, 0.7f, -1.56f, 1.56f, -1.56f)
                        reflectiveCurveToRelative(1.56f, 0.7f, 1.56f, 1.56f)
                        lineToRelative(-0.01f, 0.12f)
                        curveToRelative(0.26f, -0.18f, 0.56f, -0.28f, 0.89f, -0.28f)
                        curveToRelative(0.86f, 0f, 1.56f, 0.7f, 1.56f, 1.56f)
                        curveToRelative(0f, 0.62f, -0.37f, 1.16f, -0.89f, 1.4f)
                        curveTo(15.63f, 9.87f, 16f, 10.41f, 16f, 11.03f)
                        curveToRelative(0f, 0.86f, -0.7f, 1.56f, -1.56f, 1.56f)
                        curveToRelative(-0.33f, 0f, -0.64f, -0.11f, -0.89f, -0.28f)
                        lineToRelative(0.01f, 0.12f)
                        curveToRelative(0f, 0.86f, -0.7f, 1.56f, -1.56f, 1.56f)
                        reflectiveCurveToRelative(-1.56f, -0.7f, -1.56f, -1.56f)
                        lineToRelative(0.01f, -0.12f)
                        curveToRelative(-0.26f, 0.18f, -0.56f, 0.28f, -0.89f, 0.28f)
                        curveTo(8.7f, 12.59f, 8f, 11.89f, 8f, 11.03f)
                        curveToRelative(0f, -0.62f, 0.37f, -1.16f, 0.89f, -1.4f)
                        curveTo(8.37f, 9.38f, 8f, 8.84f, 8f, 8.22f)
                        close()
                        moveTo(12f, 19f)
                        curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                        curveTo(18f, 16.31f, 15.31f, 19f, 12f, 19f)
                        reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                        curveTo(9.31f, 13f, 12f, 15.69f, 12f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 11.03f)
                        curveToRelative(0f, 0.86f, 0.7f, 1.56f, 1.56f, 1.56f)
                        curveToRelative(0.33f, 0f, 0.63f, -0.1f, 0.89f, -0.28f)
                        lineToRelative(-0.01f, 0.12f)
                        curveToRelative(0f, 0.86f, 0.7f, 1.56f, 1.56f, 1.56f)
                        reflectiveCurveToRelative(1.56f, -0.7f, 1.56f, -1.56f)
                        lineToRelative(-0.01f, -0.12f)
                        curveToRelative(0.25f, 0.17f, 0.56f, 0.28f, 0.89f, 0.28f)
                        curveToRelative(0.86f, 0f, 1.56f, -0.7f, 1.56f, -1.56f)
                        curveToRelative(0f, -0.62f, -0.37f, -1.16f, -0.89f, -1.41f)
                        curveTo(15.63f, 9.38f, 16f, 8.84f, 16f, 8.22f)
                        curveToRelative(0f, -0.86f, -0.7f, -1.56f, -1.56f, -1.56f)
                        curveToRelative(-0.33f, 0f, -0.63f, 0.1f, -0.89f, 0.28f)
                        lineToRelative(0.01f, -0.12f)
                        curveToRelative(0f, -0.86f, -0.7f, -1.56f, -1.56f, -1.56f)
                        reflectiveCurveToRelative(-1.56f, 0.7f, -1.56f, 1.56f)
                        lineToRelative(0.01f, 0.12f)
                        curveTo(10.2f, 6.76f, 9.89f, 6.66f, 9.56f, 6.66f)
                        curveTo(8.7f, 6.66f, 8f, 7.36f, 8f, 8.22f)
                        curveToRelative(0f, 0.62f, 0.37f, 1.16f, 0.89f, 1.41f)
                        curveTo(8.37f, 9.87f, 8f, 10.41f, 8f, 11.03f)
                        close()
                        moveTo(12f, 8.06f)
                        curveToRelative(0.86f, 0f, 1.56f, 0.7f, 1.56f, 1.56f)
                        reflectiveCurveToRelative(-0.7f, 1.56f, -1.56f, 1.56f)
                        reflectiveCurveToRelative(-1.56f, -0.7f, -1.56f, -1.56f)
                        reflectiveCurveTo(11.14f, 8.06f, 12f, 8.06f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 13f)
                        curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                        curveTo(15.31f, 19f, 18f, 16.31f, 18f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 19f)
                        curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                        curveTo(6f, 16.31f, 8.69f, 19f, 12f, 19f)
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
                }
            }
        }.build()
        
        return _Yard!!
    }

private var _Yard: ImageVector? = null

