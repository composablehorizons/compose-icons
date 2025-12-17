package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Location_pin: ImageVector
    get() {
        if (_Location_pin != null) return _Location_pin!!
        
        _Location_pin = ImageVector.Builder(
            name = "location_pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineTo(12f, 2f)
                curveTo(8.13f, 2f, 5f, 5.13f, 5f, 9f)
                curveToRelative(0f, 1.74f, 0.5f, 3.37f, 1.41f, 4.84f)
                curveToRelative(0.95f, 1.54f, 2.2f, 2.86f, 3.16f, 4.4f)
                curveToRelative(0.47f, 0.75f, 0.81f, 1.45f, 1.17f, 2.26f)
                curveTo(11f, 21.05f, 11.21f, 22f, 12f, 22f)
                horizontalLineToRelative(0f)
                curveToRelative(0.79f, 0f, 1f, -0.95f, 1.25f, -1.5f)
                curveToRelative(0.37f, -0.81f, 0.7f, -1.51f, 1.17f, -2.26f)
                curveToRelative(0.96f, -1.53f, 2.21f, -2.85f, 3.16f, -4.4f)
                curveTo(18.5f, 12.37f, 19f, 10.74f, 19f, 9f)
                curveTo(19f, 5.13f, 15.87f, 2f, 12f, 2f)
                close()
                moveTo(12f, 11.75f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(13.38f, 11.75f, 12f, 11.75f)
                close()
            }
        }.build()
        
        return _Location_pin!!
    }

private var _Location_pin: ImageVector? = null

