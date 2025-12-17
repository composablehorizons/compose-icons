package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Electric_rickshaw: ImageVector
    get() {
        if (_Electric_rickshaw != null) return _Electric_rickshaw!!
        
        _Electric_rickshaw = ImageVector.Builder(
            name = "electric_rickshaw",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(3f, 13f)
                            horizontalLineToRelative(0.17f)
                            curveTo(3.58f, 11.84f, 4.7f, 11f, 6f, 11f)
                            curveToRelative(0.35f, 0f, 0.69f, 0.06f, 1f, 0.17f)
                            verticalLineTo(10f)
                            horizontalLineTo(3f)
                            verticalLineTo(13f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(19f, 11f)
                            horizontalLineToRelative(-3f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(1.17f)
                            curveToRelative(0.3f, -0.85f, 0.98f, -1.53f, 1.83f, -1.83f)
                            verticalLineTo(11f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21f, 11.18f)
                            verticalLineTo(9.72f)
                            curveToRelative(0f, -0.47f, -0.16f, -0.92f, -0.46f, -1.28f)
                            lineTo(16.6f, 3.72f)
                            curveTo(16.22f, 3.26f, 15.66f, 3f, 15.06f, 3f)
                            horizontalLineTo(3f)
                            curveTo(1.9f, 3f, 1f, 3.9f, 1f, 5f)
                            verticalLineToRelative(8f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(0.18f)
                            curveTo(3.6f, 16.16f, 4.7f, 17f, 6f, 17f)
                            reflectiveCurveToRelative(2.4f, -0.84f, 2.82f, -2f)
                            horizontalLineToRelative(8.37f)
                            curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
                            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                            curveTo(23f, 12.7f, 22.16f, 11.6f, 21f, 11.18f)
                            close()
                            moveTo(6f, 15f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                            reflectiveCurveTo(6.55f, 15f, 6f, 15f)
                            close()
                            moveTo(7f, 11.17f)
                            curveTo(6.69f, 11.06f, 6.35f, 11f, 6f, 11f)
                            curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                            horizontalLineTo(3f)
                            verticalLineToRelative(-3f)
                            horizontalLineToRelative(4f)
                            verticalLineTo(11.17f)
                            close()
                            moveTo(7f, 8f)
                            horizontalLineTo(3f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(4f)
                            verticalLineTo(8f)
                            close()
                            moveTo(14f, 13f)
                            horizontalLineTo(9f)
                            verticalLineToRelative(-3f)
                            horizontalLineToRelative(3f)
                            verticalLineTo(8f)
                            horizontalLineTo(9f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(5f)
                            verticalLineTo(13f)
                            close()
                            moveTo(16f, 6.12f)
                            lineTo(18.4f, 9f)
                            horizontalLineTo(16f)
                            verticalLineTo(6.12f)
                            close()
                            moveTo(17.17f, 13f)
                            horizontalLineTo(16f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(0.17f)
                            curveTo(18.15f, 11.47f, 17.47f, 12.15f, 17.17f, 13f)
                            close()
                            moveTo(20f, 15f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                            reflectiveCurveTo(20.55f, 15f, 20f, 15f)
                            close()
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 20f)
                        lineTo(11f, 20f)
                        lineTo(11f, 18f)
                        lineTo(17f, 21f)
                        lineTo(13f, 21f)
                        lineTo(13f, 23f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Electric_rickshaw!!
    }

private var _Electric_rickshaw: ImageVector? = null

