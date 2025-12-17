package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Golf_course: ImageVector
    get() {
        if (_Golf_course != null) return _Golf_course!!
        
        _Golf_course = ImageVector.Builder(
            name = "golf_course",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(780f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 780f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(780f, 720f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(840f, 780f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 840f)
                close()
                moveTo(400f, 880f)
                quadToRelative(-100f, 0f, -170f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                quadToRelative(0f, -23f, 33f, -41f)
                reflectiveQuadToRelative(87f, -29f)
                verticalLineToRelative(30f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 760f)
                verticalLineToRelative(-616f)
                quadToRelative(0f, -23f, 19f, -34.5f)
                reflectiveQuadToRelative(39f, -1.5f)
                lineToRelative(190f, 93f)
                quadToRelative(23f, 11f, 23f, 36f)
                reflectiveQuadToRelative(-22f, 36f)
                lineToRelative(-169f, 87f)
                verticalLineToRelative(362f)
                quadToRelative(86f, 5f, 143f, 26.5f)
                reflectiveQuadToRelative(57f, 51.5f)
                quadToRelative(0f, 33f, -70f, 56.5f)
                reflectiveQuadTo(400f, 880f)
                close()
            }
        }.build()
        
        return _Golf_course!!
    }

private var _Golf_course: ImageVector? = null

