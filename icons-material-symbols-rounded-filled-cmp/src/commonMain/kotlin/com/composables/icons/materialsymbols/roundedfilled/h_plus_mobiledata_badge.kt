package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.H_plus_mobiledata_badge: ImageVector
    get() {
        if (_H_plus_mobiledata_badge != null) return _H_plus_mobiledata_badge!!
        
        _H_plus_mobiledata_badge = ImageVector.Builder(
            name = "h_plus_mobiledata_badge",
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
                moveToRelative(140f, -320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(460f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(500f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(460f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(420f, 320f)
                verticalLineToRelative(120f)
                horizontalLineTo(260f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(220f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(180f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(220f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(260f, 640f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(660f, 600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(700f, 560f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(780f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(740f, 440f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(660f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(620f, 400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(580f, 520f)
                horizontalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _H_plus_mobiledata_badge!!
    }

private var _H_plus_mobiledata_badge: ImageVector? = null

