package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Gondola_lift: ImageVector
    get() {
        if (_Gondola_lift != null) return _Gondola_lift!!
        
        _Gondola_lift = ImageVector.Builder(
            name = "gondola_lift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-109f)
                lineTo(40f, 360f)
                verticalLineToRelative(-80f)
                lineToRelative(205f, -56f)
                quadToRelative(-2f, -5f, -3.5f, -11f)
                reflectiveQuadToRelative(-1.5f, -13f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(300f, 140f)
                quadToRelative(23f, 0f, 40f, 15f)
                reflectiveQuadToRelative(19f, 38f)
                lineToRelative(81f, -22f)
                verticalLineToRelative(-51f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(29f)
                lineToRelative(86f, -23f)
                quadToRelative(-3f, -6f, -4.5f, -12.5f)
                reflectiveQuadTo(600f, 100f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(660f, 40f)
                quadToRelative(23f, 0f, 40.5f, 16f)
                reflectiveQuadToRelative(19.5f, 39f)
                lineToRelative(200f, -55f)
                verticalLineToRelative(80f)
                lineTo(520f, 229f)
                verticalLineToRelative(131f)
                horizontalLineToRelative(160f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-53f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 520f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(213f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-160f)
                horizontalLineTo(413f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(214f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 440f)
                horizontalLineToRelative(-53f)
                verticalLineToRelative(160f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Gondola_lift!!
    }

private var _Gondola_lift: ImageVector? = null

