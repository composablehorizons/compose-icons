package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Person_pin_circle: ImageVector
    get() {
        if (_Person_pin_circle != null) return _Person_pin_circle!!
        
        _Person_pin_circle = ImageVector.Builder(
            name = "person_pin_circle",
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
                            moveTo(12f, 2f)
                            curveTo(8.14f, 2f, 5f, 5.14f, 5f, 9f)
                            curveToRelative(0f, 5.25f, 7f, 13f, 7f, 13f)
                            reflectiveCurveToRelative(7f, -7.75f, 7f, -13f)
                            curveTo(19f, 5.14f, 15.86f, 2f, 12f, 2f)
                            close()
                            moveTo(12f, 4f)
                            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                            curveToRelative(0f, 1.11f, -0.9f, 2f, -2f, 2f)
                            reflectiveCurveToRelative(-2f, -0.89f, -2f, -2f)
                            curveTo(10f, 4.9f, 10.9f, 4f, 12f, 4f)
                            close()
                            moveTo(12f, 14f)
                            curveToRelative(-1.67f, 0f, -3.14f, -0.85f, -4f, -2.15f)
                            curveToRelative(0.02f, -1.32f, 2.67f, -2.05f, 4f, -2.05f)
                            reflectiveCurveToRelative(3.98f, 0.73f, 4f, 2.05f)
                            curveTo(15.14f, 13.15f, 13.67f, 14f, 12f, 14f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Person_pin_circle!!
    }

private var _Person_pin_circle: ImageVector? = null

