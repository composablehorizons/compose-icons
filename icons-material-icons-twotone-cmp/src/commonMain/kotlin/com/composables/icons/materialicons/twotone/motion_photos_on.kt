package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Motion_photos_on: ImageVector
    get() {
        if (_Motion_photos_on != null) return _Motion_photos_on!!
        
        _Motion_photos_on = ImageVector.Builder(
            name = "motion_photos_on",
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
                moveTo(2.88f, 7.88f)
                lineToRelative(1.54f, 1.54f)
                curveTo(4.15f, 10.23f, 4f, 11.1f, 4f, 12f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                curveToRelative(-0.9f, 0f, -1.77f, 0.15f, -2.58f, 0.42f)
                lineTo(7.89f, 2.89f)
                curveTo(9.15f, 2.32f, 10.54f, 2f, 12f, 2f)
                curveToRelative(5.52f, 0f, 10f, 4.48f, 10f, 10f)
                reflectiveCurveToRelative(-4.48f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.52f, 2f, 12f)
                curveTo(2f, 10.53f, 2.32f, 9.14f, 2.88f, 7.88f)
                close()
                moveTo(7f, 5.5f)
                curveTo(7f, 6.33f, 6.33f, 7f, 5.5f, 7f)
                reflectiveCurveTo(4f, 6.33f, 4f, 5.5f)
                reflectiveCurveTo(4.67f, 4f, 5.5f, 4f)
                reflectiveCurveTo(7f, 4.67f, 7f, 5.5f)
                close()
            }
        }.build()
        
        return _Motion_photos_on!!
    }

private var _Motion_photos_on: ImageVector? = null

