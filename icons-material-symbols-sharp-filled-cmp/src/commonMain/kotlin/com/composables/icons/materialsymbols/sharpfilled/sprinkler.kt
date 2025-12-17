package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sprinkler: ImageVector
    get() {
        if (_Sprinkler != null) return _Sprinkler!!
        
        _Sprinkler = ImageVector.Builder(
            name = "sprinkler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveToRelative(120f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 560f)
                close()
                moveToRelative(113f, -114f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(673f, 406f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(713f, 366f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(753f, 406f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(713f, 446f)
                close()
                moveToRelative(113f, -112f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(786f, 294f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(826f, 254f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(866f, 294f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(826f, 334f)
                close()
                moveTo(360f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveTo(247f, 446f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(207f, 406f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(247f, 366f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(287f, 406f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(247f, 446f)
                close()
                moveTo(134f, 334f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(94f, 294f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(134f, 254f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(174f, 294f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(134f, 334f)
                close()
                moveTo(440f, 880f)
                verticalLineToRelative(-160f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Sprinkler!!
    }

private var _Sprinkler: ImageVector? = null

