package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Balcony: ImageVector
    get() {
        if (_Balcony != null) return _Balcony!!
        
        _Balcony = ImageVector.Builder(
            name = "balcony",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 480f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 480f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -20f, 9.5f, -38.5f)
                reflectiveQuadTo(160f, 571f)
                verticalLineToRelative(-171f)
                quadToRelative(0f, -66f, 25f, -124.5f)
                reflectiveQuadToRelative(68.5f, -102f)
                quadTo(297f, 130f, 355.5f, 105f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(66f, 0f, 124.5f, 25f)
                reflectiveQuadToRelative(102f, 68.5f)
                quadTo(750f, 217f, 775f, 275.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(171f)
                quadToRelative(21f, 12f, 30.5f, 30.5f)
                reflectiveQuadTo(840f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveTo(240f, 560f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-397f)
                quadToRelative(-86f, 14f, -143f, 80.5f)
                reflectiveQuadTo(240f, 400f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -90f, -57f, -156.5f)
                reflectiveQuadTo(520f, 163f)
                verticalLineToRelative(397f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Balcony!!
    }

private var _Balcony: ImageVector? = null

