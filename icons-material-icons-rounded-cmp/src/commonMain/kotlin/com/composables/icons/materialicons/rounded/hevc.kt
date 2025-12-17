package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hevc: ImageVector
    get() {
        if (_Hevc != null) return _Hevc!!
        
        _Hevc = ImageVector.Builder(
            name = "hevc",
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
                        moveTo(6.25f, 9f)
                        curveTo(5.84f, 9f, 5.5f, 9.34f, 5.5f, 9.75f)
                        verticalLineTo(11f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(9.75f)
                        curveTo(4.5f, 9.34f, 4.16f, 9f, 3.75f, 9f)
                        reflectiveCurveTo(3f, 9.34f, 3f, 9.75f)
                        verticalLineToRelative(4.5f)
                        curveTo(3f, 14.66f, 3.34f, 15f, 3.75f, 15f)
                        reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                        verticalLineTo(12.5f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(1.75f)
                        curveTo(5.5f, 14.66f, 5.84f, 15f, 6.25f, 15f)
                        reflectiveCurveTo(7f, 14.66f, 7f, 14.25f)
                        verticalLineToRelative(-4.5f)
                        curveTo(7f, 9.34f, 6.66f, 9f, 6.25f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.75f, 10.5f)
                        curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                        curveTo(11.5f, 9.34f, 11.16f, 9f, 10.75f, 9f)
                        horizontalLineTo(9f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1.75f)
                        curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        horizontalLineTo(9.5f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(1.25f)
                        curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        horizontalLineTo(9.5f)
                        verticalLineToRelative(-0.5f)
                        horizontalLineTo(10.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.63f, 9f)
                        curveToRelative(-0.36f, 0f, -0.67f, 0.26f, -0.73f, 0.62f)
                        lineToRelative(-0.65f, 3.88f)
                        lineTo(13.6f, 9.62f)
                        curveTo(13.54f, 9.26f, 13.23f, 9f, 12.87f, 9f)
                        curveToRelative(-0.46f, 0f, -0.8f, 0.41f, -0.73f, 0.86f)
                        lineToRelative(0.65f, 3.91f)
                        curveToRelative(0.12f, 0.71f, 0.73f, 1.23f, 1.46f, 1.23f)
                        reflectiveCurveToRelative(1.34f, -0.52f, 1.46f, -1.23f)
                        lineToRelative(0.65f, -3.91f)
                        curveTo(16.43f, 9.41f, 16.08f, 9f, 15.63f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.5f, 10.5f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        horizontalLineToRelative(0.5f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineTo(10f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-0.5f)
                        curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                        horizontalLineTo(20f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(19.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hevc!!
    }

private var _Hevc: ImageVector? = null

