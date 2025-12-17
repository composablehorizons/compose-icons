package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Person_pin_circle: ImageVector
    get() {
        if (_Person_pin_circle != null) return _Person_pin_circle!!
        
        _Person_pin_circle = ImageVector.Builder(
            name = "person_pin_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.5f, 10.2f)
                curveToRelative(0f, 2.57f, -2.1f, 5.79f, -6.16f, 9.51f)
                lineTo(12f, 20.01f)
                lineToRelative(-0.34f, -0.31f)
                curveTo(7.6f, 15.99f, 5.5f, 12.77f, 5.5f, 10.2f)
                curveToRelative(0f, -3.84f, 2.82f, -6.7f, 6.5f, -6.7f)
                reflectiveCurveTo(18.5f, 6.35f, 18.5f, 10.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 11f)
                curveToRelative(1.33f, 0f, 4f, 0.67f, 4f, 2f)
                verticalLineToRelative(0.16f)
                curveTo(15.03f, 14.28f, 13.6f, 15f, 12f, 15f)
                reflectiveCurveToRelative(-3.03f, -0.72f, -4f, -1.84f)
                verticalLineTo(13f)
                curveTo(8f, 11.67f, 10.67f, 11f, 12f, 11f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveTo(13.1f, 10f, 12f, 10f)
                close()
                moveTo(18f, 10.2f)
                curveTo(18f, 6.57f, 15.35f, 4f, 12f, 4f)
                reflectiveCurveToRelative(-6f, 2.57f, -6f, 6.2f)
                curveToRelative(0f, 2.34f, 1.95f, 5.44f, 6f, 9.14f)
                curveTo(16.05f, 15.64f, 18f, 12.54f, 18f, 10.2f)
                close()
                moveTo(12f, 2f)
                curveToRelative(4.2f, 0f, 8f, 3.22f, 8f, 8.2f)
                curveToRelative(0f, 3.32f, -2.67f, 7.25f, -8f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8f, -8.48f, -8f, -11.8f)
                curveTo(4f, 5.22f, 7.8f, 2f, 12f, 2f)
                close()
            }
        }.build()
        
        return _Person_pin_circle!!
    }

private var _Person_pin_circle: ImageVector? = null

