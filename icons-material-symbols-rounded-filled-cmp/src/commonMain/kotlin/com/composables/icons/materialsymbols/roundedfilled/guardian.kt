package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Guardian: ImageVector
    get() {
        if (_Guardian != null) return _Guardian!!
        
        _Guardian = ImageVector.Builder(
            name = "guardian",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                quadToRelative(-186f, 0f, -313f, -69.5f)
                reflectiveQuadTo(40f, 680f)
                quadToRelative(0f, -29f, 12f, -56.5f)
                reflectiveQuadTo(87f, 570f)
                quadToRelative(23f, -26f, 56.5f, -46.5f)
                reflectiveQuadTo(219f, 486f)
                quadToRelative(15f, -6f, 29.5f, 1.5f)
                reflectiveQuadTo(268f, 511f)
                quadToRelative(5f, 15f, -2.5f, 29.5f)
                reflectiveQuadTo(243f, 562f)
                quadToRelative(-28f, 11f, -50.5f, 24.5f)
                reflectiveQuadTo(154f, 616f)
                quadToRelative(-17f, 16f, -25.5f, 32.5f)
                reflectiveQuadTo(120f, 680f)
                quadToRelative(0f, 64f, 108f, 112f)
                reflectiveQuadToRelative(252f, 48f)
                quadToRelative(144f, 0f, 252f, -48f)
                reflectiveQuadToRelative(108f, -112f)
                quadToRelative(0f, -15f, -8.5f, -31.5f)
                reflectiveQuadTo(806f, 616f)
                quadToRelative(-16f, -16f, -38.5f, -29.5f)
                reflectiveQuadTo(717f, 562f)
                quadToRelative(-15f, -7f, -22.5f, -21.5f)
                reflectiveQuadTo(692f, 511f)
                quadToRelative(5f, -16f, 19.5f, -23.5f)
                reflectiveQuadTo(741f, 486f)
                quadToRelative(37f, 15f, 67.5f, 33.5f)
                reflectiveQuadTo(862f, 560f)
                quadToRelative(29f, 27f, 43.5f, 57.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 101f, -127f, 170.5f)
                reflectiveQuadTo(480f, 920f)
                close()
                moveToRelative(-80f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 720f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 240f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 320f)
                horizontalLineTo(600f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 760f)
                close()
                moveToRelative(80f, -560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 200f)
                close()
            }
        }.build()
        
        return _Guardian!!
    }

private var _Guardian: ImageVector? = null

