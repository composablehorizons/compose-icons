package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Person_pin: ImageVector
    get() {
        if (_Person_pin != null) return _Person_pin!!
        
        _Person_pin = ImageVector.Builder(
            name = "person_pin",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                curveToRelative(0f, 4.17f, 2.84f, 7.67f, 6.69f, 8.69f)
                lineTo(12f, 22f)
                lineToRelative(2.31f, -2.31f)
                curveTo(18.16f, 18.67f, 21f, 15.17f, 21f, 11f)
                curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                close()
                moveToRelative(0f, 2f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveToRelative(0f, 14.3f)
                curveToRelative(-2.5f, 0f, -4.71f, -1.28f, -6f, -3.22f)
                curveToRelative(0.03f, -1.99f, 4f, -3.08f, 6f, -3.08f)
                curveToRelative(1.99f, 0f, 5.97f, 1.09f, 6f, 3.08f)
                curveToRelative(-1.29f, 1.94f, -3.5f, 3.22f, -6f, 3.22f)
                close()
            }
        }.build()
        
        return _Person_pin!!
    }

private var _Person_pin: ImageVector? = null

