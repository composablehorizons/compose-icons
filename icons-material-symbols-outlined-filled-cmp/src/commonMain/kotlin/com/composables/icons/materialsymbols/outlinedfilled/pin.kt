package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pin: ImageVector
    get() {
        if (_Pin != null) return _Pin!!
        
        _Pin = ImageVector.Builder(
            name = "pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(100f, -200f)
                horizontalLineToRelative(46f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-36f)
                lineToRelative(-70f, 50f)
                lineToRelative(24f, 36f)
                lineToRelative(36f, -26f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(124f, 0f)
                horizontalLineToRelative(156f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-94f)
                lineToRelative(-2f, -2f)
                quadToRelative(21f, -20f, 34.5f, -34f)
                reflectiveQuadToRelative(21.5f, -22f)
                quadToRelative(18f, -18f, 27f, -36f)
                reflectiveQuadToRelative(9f, -38f)
                quadToRelative(0f, -29f, -22f, -48.5f)
                reflectiveQuadTo(458f, 360f)
                quadToRelative(-26f, 0f, -47f, 15f)
                reflectiveQuadToRelative(-29f, 39f)
                lineToRelative(40f, 16f)
                quadToRelative(5f, -13f, 14.5f, -20.5f)
                reflectiveQuadTo(458f, 402f)
                quadToRelative(15f, 0f, 24.5f, 8f)
                reflectiveQuadToRelative(9.5f, 20f)
                quadToRelative(0f, 11f, -4f, 20.5f)
                reflectiveQuadTo(470f, 474f)
                lineToRelative(-32f, 32f)
                lineToRelative(-54f, 54f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(296f, 0f)
                quadToRelative(36f, 0f, 58f, -20f)
                reflectiveQuadToRelative(22f, -52f)
                quadToRelative(0f, -18f, -10f, -32f)
                reflectiveQuadToRelative(-28f, -22f)
                verticalLineToRelative(-2f)
                quadToRelative(14f, -8f, 22f, -20.5f)
                reflectiveQuadToRelative(8f, -29.5f)
                quadToRelative(0f, -27f, -21f, -44.5f)
                reflectiveQuadTo(678f, 360f)
                quadToRelative(-25f, 0f, -46.5f, 14.5f)
                reflectiveQuadTo(604f, 410f)
                lineToRelative(40f, 16f)
                quadToRelative(4f, -12f, 13f, -19f)
                reflectiveQuadToRelative(21f, -7f)
                quadToRelative(13f, 0f, 21.5f, 7.5f)
                reflectiveQuadTo(708f, 426f)
                quadToRelative(0f, 14f, -10f, 22f)
                reflectiveQuadToRelative(-26f, 8f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(20f)
                quadToRelative(20f, 0f, 31f, 8f)
                reflectiveQuadToRelative(11f, 22f)
                quadToRelative(0f, 13f, -11f, 22.5f)
                reflectiveQuadToRelative(-25f, 9.5f)
                quadToRelative(-17f, 0f, -26f, -7.5f)
                reflectiveQuadTo(638f, 524f)
                lineToRelative(-40f, 16f)
                quadToRelative(7f, 29f, 28.5f, 44.5f)
                reflectiveQuadTo(680f, 600f)
                close()
            }
        }.build()
        
        return _Pin!!
    }

private var _Pin: ImageVector? = null

