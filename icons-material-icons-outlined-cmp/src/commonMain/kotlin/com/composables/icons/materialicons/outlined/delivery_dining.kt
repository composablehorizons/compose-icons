package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Delivery_dining: ImageVector
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
                            horizontalLineToRelative(-3f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(2.65f)
                            lineTo(13.52f, 14f)
                            horizontalLineTo(10f)
                            verticalLineTo(9f)
                            horizontalLineTo(6f)
                            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(2f)
                            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                            horizontalLineToRelative(4.48f)
                            lineTo(19f, 10.35f)
                            verticalLineTo(7f)
                            close()
                            moveTo(4f, 14f)
                            verticalLineToRelative(-1f)
                            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(3f)
                            horizontalLineTo(4f)
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
                            moveTo(5f, 6f)
                            horizontalLineTo(10f)
                            verticalLineTo(8f)
                            horizontalLineTo(5f)
                            verticalLineTo(6f)
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

