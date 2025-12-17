package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.UserCircle: ImageVector
    get() {
        if (_UserCircle != null) return _UserCircle!!
        
        _UserCircle = ImageVector.Builder(
            name = "user-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 104f)
                curveToRelative(-53f, 0f, -96f, 43f, -96f, 96f)
                reflectiveCurveToRelative(43f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -43f, 96f, -96f)
                reflectiveCurveToRelative(-43f, -96f, -96f, -96f)
                close()
                moveToRelative(0f, 144f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                reflectiveCurveToRelative(21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                close()
                moveToRelative(0f, -240f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-49.7f, 0f, -95.1f, -18.3f, -130.1f, -48.4f)
                curveToRelative(14.9f, -23f, 40.4f, -38.6f, 69.6f, -39.5f)
                curveToRelative(20.8f, 6.4f, 40.6f, 9.6f, 60.5f, 9.6f)
                reflectiveCurveToRelative(39.7f, -3.1f, 60.5f, -9.6f)
                curveToRelative(29.2f, 1f, 54.7f, 16.5f, 69.6f, 39.5f)
                curveToRelative(-35f, 30.1f, -80.4f, 48.4f, -130.1f, 48.4f)
                close()
                moveToRelative(162.7f, -84.1f)
                curveToRelative(-24.4f, -31.4f, -62.1f, -51.9f, -105.1f, -51.9f)
                curveToRelative(-10.2f, 0f, -26f, 9.6f, -57.6f, 9.6f)
                curveToRelative(-31.5f, 0f, -47.4f, -9.6f, -57.6f, -9.6f)
                curveToRelative(-42.9f, 0f, -80.6f, 20.5f, -105.1f, 51.9f)
                curveTo(61.9f, 339.2f, 48f, 299.2f, 48f, 256f)
                curveToRelative(0f, -110.3f, 89.7f, -200f, 200f, -200f)
                reflectiveCurveToRelative(200f, 89.7f, 200f, 200f)
                curveToRelative(0f, 43.2f, -13.9f, 83.2f, -37.3f, 115.9f)
                close()
            }
        }.build()
        
        return _UserCircle!!
    }

private var _UserCircle: ImageVector? = null

