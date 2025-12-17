package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Mizuni: ImageVector
    get() {
        if (_Mizuni != null) return _Mizuni!!
        
        _Mizuni = ImageVector.Builder(
            name = "mizuni",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119.1f, 0f, 256f)
                curveToRelative(0f, 137f, 111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                curveTo(496f, 119.1f, 385f, 8f, 248f, 8f)
                close()
                moveToRelative(-80f, 351.9f)
                curveToRelative(-31.4f, 10.6f, -58.8f, 27.3f, -80f, 48.2f)
                verticalLineTo(136f)
                curveToRelative(0f, -22.1f, 17.9f, -40f, 40f, -40f)
                reflectiveCurveToRelative(40f, 17.9f, 40f, 40f)
                verticalLineToRelative(223.9f)
                close()
                moveToRelative(120f, -9.9f)
                curveToRelative(-12.9f, -2f, -26.2f, -3.1f, -39.8f, -3.1f)
                curveToRelative(-13.8f, 0f, -27.2f, 1.1f, -40.2f, 3.1f)
                verticalLineTo(136f)
                curveToRelative(0f, -22.1f, 17.9f, -40f, 40f, -40f)
                reflectiveCurveToRelative(40f, 17.9f, 40f, 40f)
                verticalLineToRelative(214f)
                close()
                moveToRelative(120f, 57.7f)
                curveToRelative(-21.2f, -20.8f, -48.6f, -37.4f, -80f, -48f)
                verticalLineTo(136f)
                curveToRelative(0f, -22.1f, 17.9f, -40f, 40f, -40f)
                reflectiveCurveToRelative(40f, 17.9f, 40f, 40f)
                verticalLineToRelative(271.7f)
                close()
            }
        }.build()
        
        return _Mizuni!!
    }

private var _Mizuni: ImageVector? = null

