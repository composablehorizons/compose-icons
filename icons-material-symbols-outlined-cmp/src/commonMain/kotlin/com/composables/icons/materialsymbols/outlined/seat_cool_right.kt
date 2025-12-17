package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Seat_cool_right: ImageVector
    get() {
        if (_Seat_cool_right != null) return _Seat_cool_right!!
        
        _Seat_cool_right = ImageVector.Builder(
            name = "seat_cool_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(279f, 840f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 720f)
                horizontalLineToRelative(203f)
                quadToRelative(21f, 0f, 40.5f, 8f)
                reflectiveQuadToRelative(36.5f, 19f)
                verticalLineToRelative(-44f)
                quadToRelative(0f, -70f, 18.5f, -137f)
                reflectiveQuadTo(706f, 436f)
                lineToRelative(20f, -42f)
                quadToRelative(11f, -25f, 7.5f, -51.5f)
                reflectiveQuadTo(711f, 296f)
                quadToRelative(-8f, -8f, -12f, -18f)
                reflectiveQuadToRelative(-4f, -21f)
                quadToRelative(0f, -23f, 16.5f, -40f)
                reflectiveQuadToRelative(39.5f, -17f)
                quadToRelative(20f, 0f, 37f, 10.5f)
                reflectiveQuadToRelative(26f, 28.5f)
                quadToRelative(13f, 25f, 19.5f, 52f)
                reflectiveQuadToRelative(6.5f, 55f)
                quadToRelative(0f, 16f, -2f, 31.5f)
                reflectiveQuadToRelative(-7f, 30.5f)
                lineToRelative(-96f, 373f)
                quadToRelative(-8f, 26f, -29f, 42.5f)
                reflectiveQuadTo(658f, 840f)
                horizontalLineTo(279f)
                close()
                moveToRelative(51f, -240f)
                verticalLineToRelative(-88f)
                lineToRelative(-69f, 69f)
                lineToRelative(-43f, -42f)
                lineToRelative(112f, -111f)
                verticalLineToRelative(-38f)
                horizontalLineToRelative(-38f)
                lineTo(181f, 501f)
                lineToRelative(-43f, -42f)
                lineToRelative(69f, -69f)
                horizontalLineToRelative(-87f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(87f)
                lineToRelative(-69f, -69f)
                lineToRelative(43f, -42f)
                lineToRelative(111f, 111f)
                horizontalLineToRelative(38f)
                verticalLineToRelative(-38f)
                lineTo(218f, 181f)
                lineToRelative(43f, -42f)
                lineToRelative(69f, 69f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(88f)
                lineToRelative(68f, -69f)
                lineToRelative(43f, 42f)
                lineToRelative(-111f, 111f)
                verticalLineToRelative(38f)
                horizontalLineToRelative(37f)
                lineToRelative(111f, -111f)
                lineToRelative(43f, 42f)
                lineToRelative(-69f, 69f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-88f)
                lineToRelative(69f, 69f)
                lineToRelative(-43f, 42f)
                lineToRelative(-111f, -111f)
                horizontalLineToRelative(-37f)
                verticalLineToRelative(38f)
                lineToRelative(111f, 111f)
                lineToRelative(-43f, 42f)
                lineToRelative(-68f, -69f)
                verticalLineToRelative(88f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Seat_cool_right!!
    }

private var _Seat_cool_right: ImageVector? = null

