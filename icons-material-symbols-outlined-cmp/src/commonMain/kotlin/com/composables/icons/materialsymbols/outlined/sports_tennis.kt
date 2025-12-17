package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sports_tennis: ImageVector
    get() {
        if (_Sports_tennis != null) return _Sports_tennis!!
        
        _Sports_tennis = ImageVector.Builder(
            name = "sports_tennis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(137f, 800f)
                lineToRelative(-57f, -56f)
                lineToRelative(164f, -164f)
                quadToRelative(31f, -31f, 42.5f, -77.5f)
                reflectiveQuadTo(298f, 360f)
                quadToRelative(0f, -58f, 26f, -114f)
                reflectiveQuadToRelative(74f, -104f)
                quadToRelative(91f, -91f, 201f, -103f)
                reflectiveQuadToRelative(181f, 61f)
                quadToRelative(72f, 72f, 60f, 182f)
                reflectiveQuadTo(738f, 482f)
                quadToRelative(-48f, 48f, -104f, 74f)
                reflectiveQuadToRelative(-114f, 26f)
                quadToRelative(-97f, 0f, -142f, 11f)
                reflectiveQuadToRelative(-77f, 43f)
                lineTo(137f, 800f)
                close()
                moveToRelative(275f, -334f)
                quadToRelative(47f, 46f, 127f, 34f)
                reflectiveQuadToRelative(143f, -75f)
                quadToRelative(64f, -64f, 76.5f, -143.5f)
                reflectiveQuadTo(724f, 157f)
                quadToRelative(-48f, -48f, -125.5f, -36f)
                reflectiveQuadTo(456f, 197f)
                quadToRelative(-63f, 63f, -76.5f, 142.5f)
                reflectiveQuadTo(412f, 466f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(800f, 760f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(640f, 760f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(720f, 840f)
                close()
                moveToRelative(0f, -80f)
                close()
            }
        }.build()
        
        return _Sports_tennis!!
    }

private var _Sports_tennis: ImageVector? = null

