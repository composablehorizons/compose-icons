package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sports_motorsports: ImageVector
    get() {
        if (_Sports_motorsports != null) return _Sports_motorsports!!
        
        _Sports_motorsports = ImageVector.Builder(
            name = "sports_motorsports",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveToRelative(80f, 240f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -101f, -73.5f, -170.5f)
                reflectiveQuadTo(550f, 240f)
                quadToRelative(-48f, 0f, -93f, 11f)
                reflectiveQuadToRelative(-87f, 33f)
                lineToRelative(100f, 40f)
                quadToRelative(41f, 17f, 65.5f, 52.5f)
                reflectiveQuadTo(560f, 456f)
                quadToRelative(0f, 60f, -41.5f, 102f)
                reflectiveQuadTo(418f, 600f)
                horizontalLineTo(162f)
                quadToRelative(-2f, 24f, -2f, 54.5f)
                verticalLineToRelative(65.5f)
                horizontalLineToRelative(400f)
                close()
                moveTo(176f, 520f)
                horizontalLineToRelative(240f)
                quadToRelative(27f, 0f, 45.5f, -18.5f)
                reflectiveQuadTo(480f, 456f)
                quadToRelative(0f, -19f, -10.5f, -34.5f)
                reflectiveQuadTo(440f, 398f)
                lineToRelative(-148f, -60f)
                quadToRelative(-42f, 37f, -71.5f, 84f)
                reflectiveQuadTo(176f, 520f)
                close()
                moveToRelative(384f, 280f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -98f, 37f, -183.5f)
                reflectiveQuadToRelative(100.5f, -149f)
                quadTo(281f, 234f, 367f, 197f)
                reflectiveQuadToRelative(183f, -37f)
                quadToRelative(68f, 0f, 128f, 25f)
                reflectiveQuadToRelative(105f, 68.5f)
                quadTo(828f, 297f, 854f, 355f)
                reflectiveQuadToRelative(26f, 125f)
                quadToRelative(0f, 66f, -25f, 124.5f)
                reflectiveQuadToRelative(-68.5f, 102f)
                quadTo(743f, 750f, 684.5f, 775f)
                reflectiveQuadTo(560f, 800f)
                close()
            }
        }.build()
        
        return _Sports_motorsports!!
    }

private var _Sports_motorsports: ImageVector? = null

