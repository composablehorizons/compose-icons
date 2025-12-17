package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ev_mobiledata_badge: ImageVector
    get() {
        if (_Ev_mobiledata_badge != null) return _Ev_mobiledata_badge!!
        
        _Ev_mobiledata_badge = ImageVector.Builder(
            name = "ev_mobiledata_badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 120f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(280f, -160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 440f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 280f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 680f)
                horizontalLineToRelative(160f)
                close()
                moveToRelative(220f, -160f)
                lineToRelative(-53f, -211f)
                quadToRelative(-3f, -13f, -13f, -21f)
                reflectiveQuadToRelative(-24f, -8f)
                quadToRelative(-19f, 0f, -31f, 15f)
                reflectiveQuadToRelative(-7f, 33f)
                lineToRelative(81f, 323f)
                quadToRelative(3f, 13f, 13f, 21f)
                reflectiveQuadToRelative(24f, 8f)
                horizontalLineToRelative(20f)
                quadToRelative(14f, 0f, 24f, -8f)
                reflectiveQuadToRelative(13f, -21f)
                lineToRelative(81f, -323f)
                quadToRelative(5f, -18f, -7f, -33f)
                reflectiveQuadToRelative(-31f, -15f)
                quadToRelative(-14f, 0f, -24f, 8f)
                reflectiveQuadToRelative(-13f, 21f)
                lineToRelative(-53f, 211f)
                close()
            }
        }.build()
        
        return _Ev_mobiledata_badge!!
    }

private var _Ev_mobiledata_badge: ImageVector? = null

