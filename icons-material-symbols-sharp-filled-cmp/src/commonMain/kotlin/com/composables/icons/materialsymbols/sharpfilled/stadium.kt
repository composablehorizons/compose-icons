package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stadium: ImageVector
    get() {
        if (_Stadium != null) return _Stadium!!
        
        _Stadium = ImageVector.Builder(
            name = "stadium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 280f)
                verticalLineToRelative(-160f)
                lineToRelative(160f, 80f)
                lineToRelative(-160f, 80f)
                close()
                moveToRelative(600f, 0f)
                verticalLineToRelative(-160f)
                lineToRelative(160f, 80f)
                lineToRelative(-160f, 80f)
                close()
                moveToRelative(-280f, -40f)
                verticalLineToRelative(-160f)
                lineToRelative(160f, 80f)
                lineToRelative(-160f, 80f)
                close()
                moveTo(360f, 875f)
                quadToRelative(-52f, -5f, -102f, -15f)
                reflectiveQuadToRelative(-89.5f, -24.5f)
                quadTo(129f, 821f, 104.5f, 802f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -25f, 31.5f, -46.5f)
                reflectiveQuadToRelative(85.5f, -38f)
                quadToRelative(54f, -16.5f, 127f, -26f)
                reflectiveQuadToRelative(156f, -9.5f)
                quadToRelative(83f, 0f, 156f, 9.5f)
                reflectiveQuadToRelative(127f, 26f)
                quadToRelative(54f, 16.5f, 85.5f, 38f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 23f, -24.5f, 42f)
                reflectiveQuadToRelative(-64f, 33.5f)
                quadTo(752f, 850f, 702f, 860f)
                reflectiveQuadTo(600f, 875f)
                verticalLineToRelative(-195f)
                horizontalLineTo(360f)
                verticalLineToRelative(195f)
                close()
                moveToRelative(120f, -435f)
                quadToRelative(97f, 0f, 167.5f, -11.5f)
                reflectiveQuadTo(760f, 402f)
                quadToRelative(0f, -5f, -76f, -23.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-128f, 0f, -204f, 18.5f)
                reflectiveQuadTo(200f, 402f)
                quadToRelative(42f, 15f, 112.5f, 26.5f)
                reflectiveQuadTo(480f, 440f)
                close()
            }
        }.build()
        
        return _Stadium!!
    }

private var _Stadium: ImageVector? = null

