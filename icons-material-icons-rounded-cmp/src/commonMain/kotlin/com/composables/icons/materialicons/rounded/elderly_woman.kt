package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Elderly_woman: ImageVector
    get() {
        if (_Elderly_woman != null) return _Elderly_woman!!
        
        _Elderly_woman = ImageVector.Builder(
            name = "elderly_woman",
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
                        moveTo(18.52f, 11f)
                        curveToRelative(-1.57f, 0f, -2.94f, -0.9f, -3.6f, -2.21f)
                        lineToRelative(-0.79f, -1.67f)
                        lineToRelative(0f, 0f)
                        curveTo(14.12f, 7.1f, 13.63f, 6f, 12.34f, 6f)
                        lineToRelative(0f, 0f)
                        curveTo(8.72f, 6f, 6f, 16.69f, 6f, 19f)
                        horizontalLineToRelative(2.5f)
                        lineTo(7f, 21f)
                        curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                        curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f)
                        lineTo(11f, 19f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-2.71f)
                        curveToRelative(0f, -0.22f, -0.04f, -0.43f, -0.1f, -0.64f)
                        lineTo(13f, 13f)
                        lineToRelative(0.49f, -2.71f)
                        curveToRelative(0.81f, 1.23f, 2.05f, 2.14f, 3.51f, 2.52f)
                        verticalLineTo(13f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        reflectiveCurveTo(18f, 13.28f, 18f, 13f)
                        verticalLineToRelative(-0.5f)
                        curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                        reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineToRelative(10f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineToRelative(-10f)
                        curveTo(20f, 11.71f, 19.38f, 11f, 18.52f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.6f, 2.91f)
                        curveToRelative(-0.06f, 0.19f, -0.1f, 0.38f, -0.1f, 0.59f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        curveToRelative(-0.21f, 0f, -0.4f, 0.04f, -0.59f, 0.1f)
                        curveTo(12.76f, 1.25f, 12.41f, 1f, 12f, 1f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveTo(11f, 2.41f, 11.25f, 2.76f, 11.6f, 2.91f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Elderly_woman!!
    }

private var _Elderly_woman: ImageVector? = null

