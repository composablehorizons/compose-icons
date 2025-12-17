package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Parking_meter: ImageVector
    get() {
        if (_Parking_meter != null) return _Parking_meter!!
        
        _Parking_meter = ImageVector.Builder(
            name = "parking_meter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 400f)
                horizontalLineToRelative(168f)
                lineToRelative(-42f, -120f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 200f)
                horizontalLineToRelative(140f)
                quadToRelative(19f, 0f, 34.5f, 11f)
                reflectiveQuadToRelative(21.5f, 29f)
                lineToRelative(80f, 227f)
                quadToRelative(2f, 6f, 3f, 13f)
                reflectiveQuadToRelative(1f, 14f)
                verticalLineToRelative(306f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 840f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(220f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(220f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(160f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(220f, 640f)
                close()
                moveToRelative(460f, -430f)
                quadToRelative(-38f, 0f, -64f, 26f)
                reflectiveQuadToRelative(-26f, 64f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(620f, 330f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(650f, 300f)
                reflectiveQuadToRelative(8.5f, -21.5f)
                quadTo(667f, 270f, 680f, 270f)
                reflectiveQuadToRelative(21.5f, 8.5f)
                quadTo(710f, 287f, 710f, 300f)
                reflectiveQuadToRelative(8.5f, 21.5f)
                quadTo(727f, 330f, 740f, 330f)
                reflectiveQuadToRelative(21.5f, -8.5f)
                quadTo(770f, 313f, 770f, 300f)
                quadToRelative(0f, -38f, -26f, -64f)
                reflectiveQuadToRelative(-64f, -26f)
                close()
                moveToRelative(-50f, 230f)
                horizontalLineToRelative(100f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(760f, 410f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(730f, 380f)
                horizontalLineTo(630f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(600f, 410f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(630f, 440f)
                close()
                moveToRelative(50f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-89f)
                quadToRelative(-14f, 0f, -25f, -8f)
                reflectiveQuadToRelative(-14f, -22f)
                lineToRelative(-44f, -178f)
                quadToRelative(-3f, -14f, -5f, -27f)
                reflectiveQuadToRelative(-2f, -27f)
                quadToRelative(0f, -88f, 62.5f, -153f)
                reflectiveQuadTo(680f, 80f)
                quadToRelative(94f, 0f, 156.5f, 65f)
                reflectiveQuadTo(899f, 298f)
                quadToRelative(0f, 14f, -2f, 27f)
                reflectiveQuadToRelative(-5f, 27f)
                lineToRelative(-44f, 178f)
                quadToRelative(-3f, 14f, -14f, 22f)
                reflectiveQuadToRelative(-25f, 8f)
                horizontalLineToRelative(-89f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 840f)
                close()
            }
        }.build()
        
        return _Parking_meter!!
    }

private var _Parking_meter: ImageVector? = null

