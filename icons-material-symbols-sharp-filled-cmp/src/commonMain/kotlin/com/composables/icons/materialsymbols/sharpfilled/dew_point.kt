package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Dew_point: ImageVector
    get() {
        if (_Dew_point != null) return _Dew_point!!
        
        _Dew_point = ImageVector.Builder(
            name = "dew_point",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 440f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(560f, 380f)
                quadToRelative(0f, -13f, 9.5f, -30f)
                reflectiveQuadToRelative(20.5f, -32.5f)
                quadToRelative(11f, -15.5f, 20.5f, -26.5f)
                lineToRelative(9.5f, -11f)
                lineToRelative(9.5f, 11f)
                quadToRelative(9.5f, 11f, 20.5f, 26.5f)
                reflectiveQuadToRelative(20.5f, 32.5f)
                quadToRelative(9.5f, 17f, 9.5f, 30f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(620f, 440f)
                close()
                moveToRelative(160f, -120f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 260f)
                quadToRelative(0f, -13f, 9.5f, -30f)
                reflectiveQuadToRelative(20.5f, -32.5f)
                quadToRelative(11f, -15.5f, 20.5f, -26.5f)
                lineToRelative(9.5f, -11f)
                lineToRelative(9.5f, 11f)
                quadToRelative(9.5f, 11f, 20.5f, 26.5f)
                reflectiveQuadToRelative(20.5f, 32.5f)
                quadToRelative(9.5f, 17f, 9.5f, 30f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 320f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 500f)
                quadToRelative(0f, -13f, 9.5f, -30f)
                reflectiveQuadToRelative(20.5f, -32.5f)
                quadToRelative(11f, -15.5f, 20.5f, -26.5f)
                lineToRelative(9.5f, -11f)
                lineToRelative(9.5f, 11f)
                quadToRelative(9.5f, 11f, 20.5f, 26.5f)
                reflectiveQuadToRelative(20.5f, 32.5f)
                quadToRelative(9.5f, 17f, 9.5f, 30f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 560f)
                close()
                moveTo(360f, 840f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(160f, 640f)
                quadToRelative(0f, -48f, 21f, -89.5f)
                reflectiveQuadToRelative(59f, -70.5f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(240f)
                quadToRelative(38f, 29f, 59f, 70.5f)
                reflectiveQuadToRelative(21f, 89.5f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(360f, 840f)
                close()
                moveTo(240f, 640f)
                horizontalLineToRelative(240f)
                quadToRelative(0f, -29f, -12.5f, -54f)
                reflectiveQuadTo(432f, 544f)
                lineToRelative(-32f, -24f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 240f)
                verticalLineToRelative(280f)
                lineToRelative(-32f, 24f)
                quadToRelative(-23f, 17f, -35.5f, 42f)
                reflectiveQuadTo(240f, 640f)
                close()
            }
        }.build()
        
        return _Dew_point!!
    }

private var _Dew_point: ImageVector? = null

