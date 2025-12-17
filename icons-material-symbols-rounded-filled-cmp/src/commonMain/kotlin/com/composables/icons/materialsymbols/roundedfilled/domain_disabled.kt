package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Domain_disabled: ImageVector
    get() {
        if (_Domain_disabled != null) return _Domain_disabled!!
        
        _Domain_disabled = ImageVector.Builder(
            name = "domain_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 360f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(800f, 679f)
                verticalLineToRelative(-319f)
                horizontalLineTo(500f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(420f, 280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-99f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(281f, 160f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(99f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(500f, 200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(300f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 360f)
                close()
                moveTo(792f, 905f)
                lineToRelative(-66f, -65f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-568f)
                lineToRelative(-24f, -24f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(848f, 904f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(792f, 905f)
                close()
                moveTo(160f, 760f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 160f)
                horizontalLineToRelative(166f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-86f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(240f, -240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Domain_disabled!!
    }

private var _Domain_disabled: ImageVector? = null

