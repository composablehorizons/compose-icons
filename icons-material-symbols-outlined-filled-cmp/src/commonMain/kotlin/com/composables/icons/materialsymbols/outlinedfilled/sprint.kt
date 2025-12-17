package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sprint: ImageVector
    get() {
        if (_Sprint != null) return _Sprint!!
        
        _Sprint = ImageVector.Builder(
            name = "sprint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 800f)
                lineToRelative(-56f, -56f)
                lineToRelative(384f, -384f)
                horizontalLineTo(440f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(233f)
                quadToRelative(16f, 0f, 31f, 6f)
                reflectiveQuadToRelative(26f, 17f)
                lineToRelative(120f, 119f)
                quadToRelative(27f, 27f, 66f, 42f)
                reflectiveQuadToRelative(84f, 16f)
                verticalLineToRelative(80f)
                quadToRelative(-62f, 0f, -112.5f, -19f)
                reflectiveQuadTo(718f, 484f)
                lineToRelative(-40f, -42f)
                lineToRelative(-88f, 88f)
                lineToRelative(90f, 90f)
                lineToRelative(-262f, 151f)
                lineToRelative(-40f, -69f)
                lineToRelative(172f, -99f)
                lineToRelative(-68f, -68f)
                lineToRelative(-266f, 265f)
                close()
                moveToRelative(-96f, -280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveTo(40f, 400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(739f, -80f)
                quadToRelative(-33f, 0f, -57f, -23.5f)
                reflectiveQuadTo(698f, 240f)
                quadToRelative(0f, -33f, 24f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                quadToRelative(33f, 0f, 57f, 23.5f)
                reflectiveQuadToRelative(24f, 56.5f)
                quadToRelative(0f, 33f, -24f, 56.5f)
                reflectiveQuadTo(779f, 320f)
                close()
                moveToRelative(-659f, -40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Sprint!!
    }

private var _Sprint: ImageVector? = null

