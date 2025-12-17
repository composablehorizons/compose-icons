package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nest_cam_iq_outdoor: ImageVector
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
                moveToRelative(-36f, -83f)
                lineToRelative(231f, -277f)
                lineToRelative(-124f, -102f)
                quadToRelative(-42f, -34f, -95.5f, -33f)
                reflectiveQuadTo(434f, 337f)
                lineToRelative(-61f, -50f)
                lineToRelative(-77f, 92f)
                lineToRelative(60f, 50f)
                quadToRelative(-12f, 54f, -3f, 107.5f)
                reflectiveQuadToRelative(51f, 88.5f)
                lineToRelative(123f, 102f)
                close()
                moveToRelative(0f, -220f)
                close()
            }
        }.build()
        
        return _Nest_cam_iq_outdoor!!
    }

private var _Nest_cam_iq_outdoor: ImageVector? = null

