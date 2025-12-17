package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Recommend: ImageVector
    get() {
        if (_Recommend != null) return _Recommend!!
        
        _Recommend = ImageVector.Builder(
            name = "recommend",
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
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(18f, 11.8f)
                        curveToRelative(0.02f, 0.17f, -0.02f, 0.35f, -0.1f, 0.5f)
                        lineToRelative(-2.1f, 4.9f)
                        curveToRelative(-0.22f, 0.51f, -0.74f, 0.83f, -1.3f, 0.8f)
                        horizontalLineTo(9f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineToRelative(-5f)
                        curveToRelative(-0.02f, -0.38f, 0.13f, -0.74f, 0.4f, -1f)
                        lineTo(12f, 5f)
                        lineToRelative(0.69f, 0.69f)
                        curveToRelative(0.18f, 0.19f, 0.29f, 0.44f, 0.3f, 0.7f)
                        verticalLineToRelative(0.2f)
                        lineTo(12.41f, 10f)
                        horizontalLineTo(17f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(11.8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Recommend!!
    }

private var _Recommend: ImageVector? = null

