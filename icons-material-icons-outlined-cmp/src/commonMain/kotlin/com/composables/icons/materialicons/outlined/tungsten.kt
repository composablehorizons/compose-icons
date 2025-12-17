package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Tungsten: ImageVector
    get() {
        if (_Tungsten != null) return _Tungsten!!
        
        _Tungsten = ImageVector.Builder(
            name = "tungsten",
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
                        moveTo(11f, 19f)
                        horizontalLineTo(13f)
                        verticalLineTo(22f)
                        horizontalLineTo(11f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 11f)
                        horizontalLineTo(5f)
                        verticalLineTo(13f)
                        horizontalLineTo(2f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 11f)
                        horizontalLineTo(22f)
                        verticalLineTo(13f)
                        horizontalLineTo(19f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.894072f, 17.8014f)
                        lineTo(17.3012f, 16.394272f)
                        lineTo(19.4225f, 18.515572f)
                        lineTo(18.015371f, 19.922699f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4.5841703f, 18.508501f)
                        lineTo(6.70547f, 16.387201f)
                        lineTo(8.112597f, 17.79433f)
                        lineTo(5.9912977f, 19.91563f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 8.02f)
                        verticalLineTo(3f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(5.02f)
                        curveTo(7.79f, 8.94f, 7f, 10.37f, 7f, 12f)
                        curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                        reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                        curveTo(17f, 10.37f, 16.21f, 8.94f, 15f, 8.02f)
                        close()
                        moveTo(11f, 5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2.1f)
                        curveTo(12.68f, 7.04f, 12.34f, 7f, 12f, 7f)
                        reflectiveCurveToRelative(-0.68f, 0.04f, -1f, 0.1f)
                        verticalLineTo(5f)
                        close()
                        moveTo(12f, 15f)
                        curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                        reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                        curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                        reflectiveCurveTo(13.65f, 15f, 12f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Tungsten!!
    }

private var _Tungsten: ImageVector? = null

