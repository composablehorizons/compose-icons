package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserCircle: ImageVector
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
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(48.6f, 0f, 88f, 39.4f, 88f, 88f)
                reflectiveCurveToRelative(-39.4f, 88f, -88f, 88f)
                reflectiveCurveToRelative(-88f, -39.4f, -88f, -88f)
                reflectiveCurveToRelative(39.4f, -88f, 88f, -88f)
                close()
                moveToRelative(0f, 344f)
                curveToRelative(-58.7f, 0f, -111.3f, -26.6f, -146.5f, -68.2f)
                curveToRelative(18.8f, -35.4f, 55.6f, -59.8f, 98.5f, -59.8f)
                curveToRelative(2.4f, 0f, 4.8f, 0.4f, 7.1f, 1.1f)
                curveToRelative(13f, 4.2f, 26.6f, 6.9f, 40.9f, 6.9f)
                curveToRelative(14.3f, 0f, 28f, -2.7f, 40.9f, -6.9f)
                curveToRelative(2.3f, -0.7f, 4.7f, -1.1f, 7.1f, -1.1f)
                curveToRelative(42.9f, 0f, 79.7f, 24.4f, 98.5f, 59.8f)
                curveTo(359.3f, 421.4f, 306.7f, 448f, 248f, 448f)
                close()
            }
        }.build()
        
        return _UserCircle!!
    }

private var _UserCircle: ImageVector? = null

