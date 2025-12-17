package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cottage: ImageVector
    get() {
        if (_Cottage != null) return _Cottage!!
        
        _Cottage = ImageVector.Builder(
            name = "cottage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                verticalLineToRelative(-295f)
                lineToRelative(-40f, 31f)
                quadToRelative(-14f, 10f, -30f, 8f)
                reflectiveQuadToRelative(-26f, -16f)
                quadToRelative(-10f, -14f, -8f, -30f)
                reflectiveQuadToRelative(15f, -26f)
                lineToRelative(89f, -68f)
                verticalLineToRelative(-84f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 280f)
                verticalLineToRelative(23f)
                lineToRelative(191f, -146f)
                quadToRelative(11f, -8f, 23.5f, -12f)
                reflectiveQuadToRelative(25.5f, -4f)
                quadToRelative(13f, 0f, 25.5f, 4f)
                reflectiveQuadToRelative(23.5f, 12f)
                lineToRelative(360f, 275f)
                quadToRelative(13f, 10f, 15f, 26f)
                reflectiveQuadToRelative(-8f, 30f)
                quadToRelative(-10f, 13f, -26f, 15f)
                reflectiveQuadToRelative(-29f, -8f)
                lineToRelative(-41f, -30f)
                verticalLineToRelative(295f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(540f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 640f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 760f)
                close()
                moveToRelative(52f, -560f)
                quadToRelative(-23f, 0f, -35.5f, -19f)
                reflectiveQuadToRelative(-1.5f, -39f)
                quadToRelative(17f, -29f, 44.5f, -45.5f)
                reflectiveQuadTo(280f, 80f)
                quadToRelative(11f, 0f, 21f, -5.5f)
                reflectiveQuadToRelative(15f, -15.5f)
                quadToRelative(5f, -9f, 13.5f, -14f)
                reflectiveQuadToRelative(19.5f, -5f)
                quadToRelative(23f, 0f, 35f, 19f)
                reflectiveQuadToRelative(1f, 39f)
                quadToRelative(-17f, 29f, -44.5f, 45.5f)
                reflectiveQuadTo(280f, 160f)
                quadToRelative(-11f, 0f, -21f, 5f)
                reflectiveQuadToRelative(-15f, 16f)
                quadToRelative(-5f, 9f, -13f, 14f)
                reflectiveQuadToRelative(-19f, 5f)
                close()
            }
        }.build()
        
        return _Cottage!!
    }

private var _Cottage: ImageVector? = null

