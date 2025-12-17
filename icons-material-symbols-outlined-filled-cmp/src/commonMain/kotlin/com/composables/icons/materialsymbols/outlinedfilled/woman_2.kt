package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Woman_2: ImageVector
    get() {
        if (_Woman_2 != null) return _Woman_2!!
        
        _Woman_2 = ImageVector.Builder(
            name = "woman_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineTo(280f)
                lineToRelative(122f, -308f)
                quadToRelative(10f, -24f, 31f, -38f)
                reflectiveQuadToRelative(47f, -14f)
                quadToRelative(26f, 0f, 47f, 14f)
                reflectiveQuadToRelative(31f, 38f)
                lineToRelative(122f, 308f)
                horizontalLineTo(540f)
                verticalLineToRelative(240f)
                horizontalLineTo(420f)
                close()
                moveToRelative(60f, -640f)
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
        
        return _Woman_2!!
    }

private var _Woman_2: ImageVector? = null

