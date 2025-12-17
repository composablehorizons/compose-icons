package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Seat_cool_left: ImageVector
    get() {
        if (_Seat_cool_left != null) return _Seat_cool_left!!
        
        _Seat_cool_left = ImageVector.Builder(
            name = "seat_cool_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(681f, 840f)
                horizontalLineTo(240f)
                lineTo(129f, 408f)
                quadToRelative(-4f, -15f, -6.5f, -30.5f)
                reflectiveQuadTo(120f, 346f)
                quadToRelative(0f, -28f, 6.5f, -55f)
                reflectiveQuadToRelative(19.5f, -52f)
                quadToRelative(9f, -18f, 25.5f, -28.5f)
                reflectiveQuadTo(208f, 200f)
                quadToRelative(23f, 0f, 40f, 17f)
                reflectiveQuadToRelative(17f, 40f)
                quadToRelative(0f, 11f, -4f, 21f)
                reflectiveQuadToRelative(-12f, 18f)
                quadToRelative(-19f, 20f, -22.5f, 46.5f)
                reflectiveQuadTo(234f, 394f)
                lineToRelative(20f, 42f)
                quadToRelative(29f, 63f, 47.5f, 130f)
                reflectiveQuadTo(320f, 703f)
                verticalLineToRelative(44f)
                quadToRelative(17f, -11f, 36f, -19f)
                reflectiveQuadToRelative(40f, -8f)
                horizontalLineToRelative(204f)
                quadToRelative(34f, 0f, 57.5f, 23.5f)
                reflectiveQuadTo(681f, 800f)
                verticalLineToRelative(40f)
                close()
                moveTo(570f, 600f)
                verticalLineToRelative(-88f)
                lineToRelative(-69f, 69f)
                lineToRelative(-42f, -42f)
                lineToRelative(111f, -111f)
                verticalLineToRelative(-38f)
                horizontalLineToRelative(-38f)
                lineTo(421f, 501f)
                lineToRelative(-42f, -42f)
                lineToRelative(69f, -69f)
                horizontalLineToRelative(-88f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(88f)
                lineToRelative(-69f, -69f)
                lineToRelative(42f, -42f)
                lineToRelative(111f, 111f)
                horizontalLineToRelative(38f)
                verticalLineToRelative(-38f)
                lineTo(459f, 181f)
                lineToRelative(42f, -42f)
                lineToRelative(69f, 69f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(88f)
                lineToRelative(69f, -69f)
                lineToRelative(42f, 42f)
                lineToRelative(-111f, 111f)
                verticalLineToRelative(38f)
                horizontalLineToRelative(38f)
                lineToRelative(111f, -111f)
                lineToRelative(42f, 42f)
                lineToRelative(-69f, 69f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-88f)
                lineToRelative(69f, 69f)
                lineToRelative(-42f, 42f)
                lineToRelative(-111f, -111f)
                horizontalLineToRelative(-38f)
                verticalLineToRelative(38f)
                lineToRelative(111f, 111f)
                lineToRelative(-42f, 42f)
                lineToRelative(-69f, -69f)
                verticalLineToRelative(88f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Seat_cool_left!!
    }

private var _Seat_cool_left: ImageVector? = null

