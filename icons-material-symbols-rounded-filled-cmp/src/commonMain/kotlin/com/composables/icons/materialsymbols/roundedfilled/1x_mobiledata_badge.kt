package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.`1x_mobiledata_badge`: ImageVector
    get() {
        if (_1x_mobiledata_badge != null) return _1x_mobiledata_badge!!
        
        _1x_mobiledata_badge = ImageVector.Builder(
            name = "1x_mobiledata_badge",
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
                moveToRelative(160f, -480f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 360f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(330f, 193f)
                lineToRelative(60f, 109f)
                quadToRelative(5f, 8f, 13f, 13f)
                reflectiveQuadToRelative(18f, 5f)
                quadToRelative(20f, 0f, 30f, -17.5f)
                reflectiveQuadToRelative(0f, -34.5f)
                lineToRelative(-81f, -148f)
                lineToRelative(82f, -148f)
                quadToRelative(10f, -17f, -0.5f, -34.5f)
                reflectiveQuadTo(701f, 280f)
                quadToRelative(-10f, 0f, -18f, 5f)
                reflectiveQuadToRelative(-13f, 13f)
                lineToRelative(-60f, 109f)
                lineToRelative(-60f, -109f)
                quadToRelative(-5f, -8f, -13f, -13f)
                reflectiveQuadToRelative(-18f, -5f)
                quadToRelative(-20f, 0f, -30f, 17.5f)
                reflectiveQuadToRelative(0f, 34.5f)
                lineToRelative(81f, 148f)
                lineToRelative(-82f, 148f)
                quadToRelative(-10f, 17f, 0.5f, 34.5f)
                reflectiveQuadTo(519f, 680f)
                quadToRelative(10f, 0f, 18f, -5f)
                reflectiveQuadToRelative(13f, -13f)
                lineToRelative(60f, -109f)
                close()
            }
        }.build()
        
        return _1x_mobiledata_badge!!
    }

private var _1x_mobiledata_badge: ImageVector? = null

