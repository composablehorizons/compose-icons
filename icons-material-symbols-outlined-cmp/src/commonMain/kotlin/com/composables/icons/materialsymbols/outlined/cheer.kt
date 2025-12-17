package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Cheer: ImageVector
    get() {
        if (_Cheer != null) return _Cheer!!
        
        _Cheer = ImageVector.Builder(
            name = "cheer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 209f)
                lineToRelative(-40f, -120f)
                lineToRelative(56f, -18f)
                lineToRelative(40f, 119f)
                lineToRelative(-56f, 19f)
                close()
                moveToRelative(138f, -49f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(198f, 49f)
                lineToRelative(-56f, -19f)
                lineToRelative(40f, -119f)
                lineToRelative(56f, 19f)
                lineToRelative(-40f, 119f)
                close()
                moveTo(86f, 920f)
                lineToRelative(-12f, -79f)
                lineToRelative(211f, -32f)
                quadToRelative(11f, -2f, 19.5f, -9.5f)
                reflectiveQuadTo(317f, 781f)
                lineToRelative(34f, -106f)
                quadToRelative(5f, -14f, 0f, -27f)
                reflectiveQuadToRelative(-18f, -20f)
                lineToRelative(-33f, 104f)
                lineToRelative(-76f, -24f)
                lineToRelative(88f, -278f)
                quadToRelative(2f, -6f, 2f, -13f)
                reflectiveQuadToRelative(-2f, -13f)
                lineTo(178f, 656f)
                quadToRelative(-16f, 29f, -44.5f, 46.5f)
                reflectiveQuadTo(72f, 720f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(32f)
                quadToRelative(11f, 0f, 20.5f, -5.5f)
                reflectiveQuadTo(107f, 619f)
                lineToRelative(177f, -334f)
                lineToRelative(50f, 28f)
                quadToRelative(37f, 21f, 52.5f, 60.5f)
                reflectiveQuadTo(389f, 454f)
                lineToRelative(-31f, 98f)
                quadToRelative(44f, 17f, 63.5f, 60f)
                reflectiveQuadToRelative(5.5f, 88f)
                lineToRelative(-34f, 106f)
                quadToRelative(-11f, 32f, -36.5f, 54.5f)
                reflectiveQuadTo(297f, 888f)
                lineTo(86f, 920f)
                close()
                moveToRelative(788f, 0f)
                lineTo(663f, 888f)
                quadToRelative(-34f, -5f, -59.5f, -27.5f)
                reflectiveQuadTo(567f, 806f)
                lineToRelative(-34f, -106f)
                quadToRelative(-14f, -45f, 5.5f, -88f)
                reflectiveQuadToRelative(63.5f, -60f)
                lineToRelative(-31f, -98f)
                quadToRelative(-13f, -41f, 2.5f, -80.5f)
                reflectiveQuadTo(626f, 313f)
                lineToRelative(50f, -28f)
                lineToRelative(177f, 334f)
                quadToRelative(5f, 10f, 14.5f, 15.5f)
                reflectiveQuadTo(888f, 640f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-32f)
                quadToRelative(-33f, 0f, -61.5f, -17.5f)
                reflectiveQuadTo(782f, 656f)
                lineTo(648f, 404f)
                quadToRelative(-2f, 6f, -2f, 13f)
                reflectiveQuadToRelative(2f, 13f)
                lineToRelative(88f, 278f)
                lineToRelative(-76f, 24f)
                lineToRelative(-33f, -104f)
                quadToRelative(-13f, 7f, -18f, 20f)
                reflectiveQuadToRelative(0f, 27f)
                lineToRelative(34f, 106f)
                quadToRelative(4f, 11f, 12.5f, 18.5f)
                reflectiveQuadTo(675f, 809f)
                lineToRelative(211f, 32f)
                lineToRelative(-12f, 79f)
                close()
                moveTo(224f, 708f)
                close()
                moveToRelative(512f, 0f)
                close()
                moveToRelative(-76f, 24f)
                lineToRelative(-58f, -180f)
                lineToRelative(58f, 180f)
                close()
                moveTo(358f, 552f)
                lineToRelative(-58f, 180f)
                lineToRelative(58f, -180f)
                close()
            }
        }.build()
        
        return _Cheer!!
    }

private var _Cheer: ImageVector? = null

