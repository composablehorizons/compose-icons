package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hourglass_disabled: ImageVector
    get() {
        if (_Hourglass_disabled != null) return _Hourglass_disabled!!
        
        _Hourglass_disabled = ImageVector.Builder(
            name = "hourglass_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 903f)
                lineToRelative(-24f, -23f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 800f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -61f, 28.5f, -114.5f)
                reflectiveQuadTo(348f, 480f)
                quadToRelative(-32f, -20f, -54.5f, -48f)
                reflectiveQuadTo(257f, 370f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
                moveTo(640f, 160f)
                horizontalLineTo(292f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(252f, 120f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(468f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 55f, -23f, 104.5f)
                reflectiveQuadTo(631f, 467f)
                quadToRelative(-11f, 9f, -26f, 3.5f)
                reflectiveQuadTo(582f, 451f)
                quadToRelative(-8f, -14f, -5.5f, -29f)
                reflectiveQuadToRelative(13.5f, -26f)
                quadToRelative(23f, -23f, 36.5f, -53f)
                reflectiveQuadToRelative(13.5f, -63f)
                verticalLineToRelative(-120f)
                close()
                moveTo(320f, 800f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-47f)
                lineTo(419f, 532f)
                quadToRelative(-45f, 19f, -72f, 59f)
                reflectiveQuadToRelative(-27f, 89f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(400f, 0f)
                close()
            }
        }.build()
        
        return _Hourglass_disabled!!
    }

private var _Hourglass_disabled: ImageVector? = null

