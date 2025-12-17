package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Person_pin_circle: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                    curveToRelative(0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.22f)
                    curveToRelative(0.36f, 0.32f, 0.97f, 0.32f, 1.33f, 0f)
                    curveTo(17.55f, 17.12f, 20f, 13.38f, 20f, 10.2f)
                    curveTo(20f, 5.22f, 16.2f, 2f, 12f, 2f)
                    close()
                    moveTo(7.69f, 12.49f)
                    curveTo(8.88f, 11.56f, 10.37f, 11f, 12f, 11f)
                    reflectiveCurveToRelative(3.12f, 0.56f, 4.31f, 1.49f)
                    curveTo(15.45f, 13.98f, 13.85f, 15f, 12f, 15f)
                    reflectiveCurveTo(8.55f, 13.98f, 7.69f, 12.49f)
                    close()
                    moveTo(12f, 6f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    curveTo(10f, 6.9f, 10.9f, 6f, 12f, 6f)
                    close()
                }
            }
        }.build()
        
        return _Person_pin_circle!!
    }

private var _Person_pin_circle: ImageVector? = null

