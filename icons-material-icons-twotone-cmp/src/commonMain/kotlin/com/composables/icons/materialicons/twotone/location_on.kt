package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Location_on: ImageVector
    get() {
        if (_Location_on != null) return _Location_on!!
        
        _Location_on = ImageVector.Builder(
            name = "location_on",
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
                moveTo(12f, 4f)
                curveTo(9.24f, 4f, 7f, 6.24f, 7f, 9f)
                curveToRelative(0f, 2.85f, 2.92f, 7.21f, 5f, 9.88f)
                curveToRelative(2.11f, -2.69f, 5f, -7f, 5f, -9.88f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveToRelative(0f, 7.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveTo(8.13f, 2f, 5f, 5.13f, 5f, 9f)
                curveToRelative(0f, 5.25f, 7f, 13f, 7f, 13f)
                reflectiveCurveToRelative(7f, -7.75f, 7f, -13f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                close()
                moveTo(7f, 9f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 2.88f, -2.88f, 7.19f, -5f, 9.88f)
                curveTo(9.92f, 16.21f, 7f, 11.85f, 7f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, false, true, 12f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 9.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, false, true, 14.5f, 9f)
                close()
            }
        }.build()
        
        return _Location_on!!
    }

private var _Location_on: ImageVector? = null

