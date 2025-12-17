package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CarSide: ImageVector
    get() {
        if (_CarSide != null) return _CarSide!!
        
        _CarSide = ImageVector.Builder(
            name = "car-side",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(544f, 192f)
                horizontalLineToRelative(-16f)
                lineTo(419.22f, 56.02f)
                arcTo(64.025f, 64.025f, 0f, false, false, 369.24f, 32f)
                horizontalLineTo(155.33f)
                curveToRelative(-26.17f, 0f, -49.7f, 15.93f, -59.42f, 40.23f)
                lineTo(48f, 194.26f)
                curveTo(20.44f, 201.4f, 0f, 226.21f, 0f, 256f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                curveToRelative(0f, 53.02f, 42.98f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -42.98f, 96f, -96f)
                horizontalLineToRelative(128f)
                curveToRelative(0f, 53.02f, 42.98f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -42.98f, 96f, -96f)
                horizontalLineToRelative(48f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                close()
                moveTo(160f, 432f)
                curveToRelative(-26.47f, 0f, -48f, -21.53f, -48f, -48f)
                reflectiveCurveToRelative(21.53f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.53f, 48f, 48f)
                reflectiveCurveToRelative(-21.53f, 48f, -48f, 48f)
                close()
                moveToRelative(72f, -240f)
                horizontalLineTo(116.93f)
                lineToRelative(38.4f, -96f)
                horizontalLineTo(232f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(48f, 0f)
                verticalLineTo(96f)
                horizontalLineToRelative(89.24f)
                lineToRelative(76.8f, 96f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, 240f)
                curveToRelative(-26.47f, 0f, -48f, -21.53f, -48f, -48f)
                reflectiveCurveToRelative(21.53f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.53f, 48f, 48f)
                reflectiveCurveToRelative(-21.53f, 48f, -48f, 48f)
                close()
            }
        }.build()
        
        return _CarSide!!
    }

private var _CarSide: ImageVector? = null

