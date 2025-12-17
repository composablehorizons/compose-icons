package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Rheumatology: ImageVector
    get() {
        if (_Rheumatology != null) return _Rheumatology!!
        
        _Rheumatology = ImageVector.Builder(
            name = "rheumatology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-174f)
                lineToRelative(-83f, -84f)
                quadToRelative(-16f, -17f, -25f, -37.5f)
                reflectiveQuadTo(161f, 543f)
                quadToRelative(23f, 27f, 55.5f, 42f)
                reflectiveQuadToRelative(68.5f, 15f)
                quadToRelative(31f, 0f, 58.5f, -11f)
                reflectiveQuadToRelative(56.5f, -35f)
                quadToRelative(2f, -2f, 5f, -4f)
                reflectiveQuadToRelative(5f, -3f)
                quadToRelative(2f, 1f, 5.5f, 3f)
                reflectiveQuadToRelative(5.5f, 4f)
                quadToRelative(29f, 24f, 56.5f, 35f)
                reflectiveQuadToRelative(57.5f, 11f)
                quadToRelative(37f, 0f, 69.5f, -15f)
                reflectiveQuadToRelative(55.5f, -42f)
                quadToRelative(-2f, 22f, -11f, 42.5f)
                reflectiveQuadTo(624f, 622f)
                lineToRelative(-84f, 84f)
                verticalLineToRelative(174f)
                horizontalLineTo(280f)
                close()
                moveToRelative(5f, -320f)
                quadToRelative(-52f, 0f, -88.5f, -36.5f)
                reflectiveQuadTo(160f, 435f)
                quadToRelative(0f, -26f, 10f, -48.5f)
                reflectiveQuadToRelative(27f, -39.5f)
                lineToRelative(83f, -84f)
                verticalLineToRelative(-183f)
                horizontalLineToRelative(260f)
                verticalLineToRelative(182f)
                lineToRelative(84f, 84f)
                quadToRelative(17f, 17f, 26.5f, 40f)
                reflectiveQuadToRelative(9.5f, 49f)
                quadToRelative(0f, 52f, -36f, 88.5f)
                reflectiveQuadTo(535f, 560f)
                quadToRelative(-33f, 0f, -53.5f, -12.5f)
                reflectiveQuadTo(447f, 523f)
                quadToRelative(-15f, -12f, -23.5f, -14.5f)
                reflectiveQuadTo(410f, 506f)
                quadToRelative(-9f, 0f, -18.5f, 6f)
                reflectiveQuadTo(374f, 523f)
                quadToRelative(-14f, 12f, -34.5f, 24.5f)
                reflectiveQuadTo(285f, 560f)
                close()
                moveToRelative(621f, 129f)
                lineToRelative(-195f, -64f)
                lineToRelative(26f, -77f)
                lineToRelative(195f, 65f)
                lineToRelative(-26f, 76f)
                close()
                moveToRelative(14f, -169f)
                horizontalLineTo(735f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(185f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(11f, -175f)
                lineToRelative(-196f, 66f)
                lineToRelative(-24f, -77f)
                lineToRelative(196f, -65f)
                lineToRelative(24f, 76f)
                close()
            }
        }.build()
        
        return _Rheumatology!!
    }

private var _Rheumatology: ImageVector? = null

