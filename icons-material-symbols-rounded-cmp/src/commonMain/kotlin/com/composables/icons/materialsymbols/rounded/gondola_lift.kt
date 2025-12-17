package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Gondola_lift: ImageVector
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
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-109f)
                lineTo(89f, 347f)
                quadToRelative(-18f, 5f, -33.5f, -6.5f)
                reflectiveQuadTo(40f, 309f)
                quadToRelative(0f, -13f, 7.5f, -23f)
                reflectiveQuadTo(68f, 272f)
                lineToRelative(177f, -48f)
                quadToRelative(-2f, -5f, -3.5f, -11f)
                reflectiveQuadToRelative(-1.5f, -13f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(300f, 140f)
                quadToRelative(23f, 0f, 40f, 15f)
                reflectiveQuadToRelative(19f, 38f)
                lineToRelative(81f, -22f)
                verticalLineToRelative(-11f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(14f, 0f, 24.5f, 8f)
                reflectiveQuadToRelative(14.5f, 21f)
                lineToRelative(87f, -23f)
                quadToRelative(-3f, -6f, -4.5f, -12.5f)
                reflectiveQuadTo(600f, 100f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(660f, 40f)
                quadToRelative(23f, 0f, 40.5f, 16f)
                reflectiveQuadToRelative(19.5f, 39f)
                lineToRelative(151f, -42f)
                quadToRelative(18f, -5f, 33.5f, 6.5f)
                reflectiveQuadTo(920f, 91f)
                quadToRelative(0f, 13f, -7.5f, 23f)
                reflectiveQuadTo(892f, 128f)
                lineTo(520f, 229f)
                verticalLineToRelative(131f)
                horizontalLineToRelative(160f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
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

