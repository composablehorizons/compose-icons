package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nest_cam_iq_outdoor: ImageVector
    get() {
        if (_Nest_cam_iq_outdoor != null) return _Nest_cam_iq_outdoor!!
        
        _Nest_cam_iq_outdoor = ImageVector.Builder(
            name = "nest_cam_iq_outdoor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(563f, 810f)
                quadToRelative(-11f, 13f, -27.5f, 14.5f)
                reflectiveQuadTo(506f, 815f)
                lineTo(353f, 687f)
                quadToRelative(-50f, -42f, -72f, -102f)
                reflectiveQuadToRelative(-11f, -123f)
                lineToRelative(-56f, -47f)
                quadToRelative(-12f, -11f, -13.5f, -26.5f)
                reflectiveQuadTo(209f, 360f)
                horizontalLineToRelative(-49f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(80f, 520f)
                verticalLineToRelative(-400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(160f, 200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(115f)
                lineToRelative(62f, -75f)
                quadToRelative(11f, -13f, 27.5f, -14.5f)
                reflectiveQuadTo(394f, 200f)
                lineToRelative(55f, 46f)
                quadToRelative(61f, -23f, 124f, -12f)
                reflectiveQuadToRelative(113f, 53f)
                lineToRelative(153f, 128f)
                quadToRelative(13f, 11f, 14.5f, 27.5f)
                reflectiveQuadTo(844f, 471f)
                lineTo(563f, 810f)
                close()
            }
        }.build()
        
        return _Nest_cam_iq_outdoor!!
    }

private var _Nest_cam_iq_outdoor: ImageVector? = null

