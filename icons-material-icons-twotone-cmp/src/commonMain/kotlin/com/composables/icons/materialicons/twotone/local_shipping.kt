package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Local_shipping: ImageVector
    get() {
        if (_Local_shipping != null) return _Local_shipping!!
        
        _Local_shipping = ImageVector.Builder(
            name = "local_shipping",
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
                moveTo(3f, 15f)
                horizontalLineToRelative(0.78f)
                curveToRelative(0.55f, -0.61f, 1.34f, -1f, 2.22f, -1f)
                reflectiveCurveToRelative(1.67f, 0.39f, 2.22f, 1f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineToRelative(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                lineToRelative(-3f, -4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(6f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(9f, -3f)
                horizontalLineTo(8.22f)
                curveToRelative(-0.55f, -0.61f, -1.33f, -1f, -2.22f, -1f)
                reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(9f)
                close()
                moveToRelative(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(-1f, -6f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(1.96f, 2.5f)
                horizontalLineTo(17f)
                close()
            }
        }.build()
        
        return _Local_shipping!!
    }

private var _Local_shipping: ImageVector? = null

