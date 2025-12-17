package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Recommend: ImageVector
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
                        moveTo(12f, 4f)
                        curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                        reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                        reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                        reflectiveCurveTo(16.41f, 4f, 12f, 4f)
                        close()
                        moveTo(17.9f, 12.3f)
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
                        verticalLineToRelative(0.8f)
                        curveTo(18.02f, 11.97f, 17.98f, 12.15f, 17.9f, 12.3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                        reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 10f)
                        horizontalLineToRelative(-4.59f)
                        lineToRelative(0.58f, -3.41f)
                        verticalLineToRelative(-0.2f)
                        curveToRelative(-0.01f, -0.26f, -0.12f, -0.51f, -0.3f, -0.7f)
                        lineTo(12f, 5f)
                        lineToRelative(-4.6f, 5f)
                        curveToRelative(-0.27f, 0.26f, -0.42f, 0.62f, -0.4f, 1f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(5.5f)
                        curveToRelative(0.56f, 0.03f, 1.08f, -0.29f, 1.3f, -0.8f)
                        lineToRelative(2.1f, -4.9f)
                        curveToRelative(0.08f, -0.15f, 0.12f, -0.33f, 0.1f, -0.5f)
                        verticalLineTo(11f)
                        curveTo(18f, 10.45f, 17.55f, 10f, 17f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Recommend!!
    }

private var _Recommend: ImageVector? = null

