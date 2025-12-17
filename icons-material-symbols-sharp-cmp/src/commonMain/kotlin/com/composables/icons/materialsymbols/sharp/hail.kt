package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hail: ImageVector
    get() {
        if (_Hail != null) return _Hail!!
        
        _Hail = ImageVector.Builder(
            name = "hail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-476f)
                quadToRelative(-50f, 17f, -65f, 62.5f)
                reflectiveQuadTo(280f, 560f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -128f, 75f, -204f)
                reflectiveQuadToRelative(205f, -76f)
                quadToRelative(100f, 0f, 150f, -49.5f)
                reflectiveQuadTo(680f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 88f, -37.5f, 157.5f)
                reflectiveQuadTo(600f, 336f)
                verticalLineToRelative(544f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Hail!!
    }

private var _Hail: ImageVector? = null

