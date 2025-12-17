package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Delivery_dining: ImageVector
    get() {
        if (_Delivery_dining != null) return _Delivery_dining!!
        
        _Delivery_dining = ImageVector.Builder(
            name = "delivery_dining",
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
                            moveTo(19f, 7f)
                            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                            horizontalLineToRelative(-2f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(0f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(2.65f)
                            lineTo(13.52f, 14f)
                            horizontalLineTo(10f)
                            verticalLineToRelative(-4f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineTo(6f)
                            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                            verticalLineToRelative(2f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(1f)
                            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                            horizontalLineToRelative(3.52f)
                            curveToRelative(0.61f, 0f, 1.18f, -0.28f, 1.56f, -0.75f)
                            lineToRelative(3.48f, -4.35f)
                            curveTo(18.85f, 10.54f, 19f, 10.1f, 19f, 9.65f)
                            verticalLineTo(7f)
                            close()
                            moveTo(7f, 17f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            horizontalLineToRelative(2f)
                            curveTo(8f, 16.55f, 7.55f, 17f, 7f, 17f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6f, 6f)
                            horizontalLineToRelative(3f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            verticalLineToRelative(0f)
                            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                            horizontalLineTo(6f)
                            curveTo(5.45f, 8f, 5f, 7.55f, 5f, 7f)
                            verticalLineToRelative(0f)
                            curveTo(5f, 6.45f, 5.45f, 6f, 6f, 6f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(19f, 13f)
                            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                            reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                            reflectiveCurveTo(20.66f, 13f, 19f, 13f)
                            close()
                            moveTo(19f, 17f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                            curveTo(20f, 16.55f, 19.55f, 17f, 19f, 17f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Delivery_dining!!
    }

private var _Delivery_dining: ImageVector? = null

