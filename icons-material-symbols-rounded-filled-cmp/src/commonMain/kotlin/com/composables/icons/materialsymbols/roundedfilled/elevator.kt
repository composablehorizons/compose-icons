package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Elevator: ImageVector
    get() {
        if (_Elevator != null) return _Elevator!!
        
        _Elevator = ImageVector.Builder(
            name = "elevator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 560f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 720f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 680f)
                verticalLineToRelative(-120f)
                quadToRelative(11f, -11f, 25.5f, -17.5f)
                reflectiveQuadTo(440f, 520f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 380f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(240f, 460f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 16f, 14.5f, 22.5f)
                reflectiveQuadTo(280f, 560f)
                close()
                moveToRelative(60f, -220f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(390f, 290f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(340f, 240f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(290f, 290f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(340f, 340f)
                close()
                moveToRelative(216f, 100f)
                horizontalLineToRelative(128f)
                quadToRelative(12f, 0f, 17.5f, -10.5f)
                reflectiveQuadTo(701f, 409f)
                lineToRelative(-64f, -102f)
                quadToRelative(-6f, -10f, -17f, -10f)
                reflectiveQuadToRelative(-17f, 10f)
                lineToRelative(-64f, 102f)
                quadToRelative(-6f, 10f, -0.5f, 20.5f)
                reflectiveQuadTo(556f, 440f)
                close()
                moveToRelative(81f, 213f)
                lineToRelative(64f, -102f)
                quadToRelative(6f, -10f, 0.5f, -20.5f)
                reflectiveQuadTo(684f, 520f)
                horizontalLineTo(556f)
                quadToRelative(-12f, 0f, -17.5f, 10.5f)
                reflectiveQuadToRelative(0.5f, 20.5f)
                lineToRelative(64f, 102f)
                quadToRelative(6f, 10f, 17f, 10f)
                reflectiveQuadToRelative(17f, -10f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Elevator!!
    }

private var _Elevator: ImageVector? = null

