package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wall_art: ImageVector
    get() {
        if (_Wall_art != null) return _Wall_art!!
        
        _Wall_art = ImageVector.Builder(
            name = "wall_art",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(240f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -160f)
                horizontalLineToRelative(480f)
                lineTo(570f, 520f)
                lineTo(450f, 680f)
                lineToRelative(-90f, -120f)
                lineToRelative(-120f, 160f)
                close()
                moveToRelative(460f, -200f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(760f, 460f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(700f, 400f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(640f, 460f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(700f, 520f)
                close()
                moveTo(404f, 240f)
                horizontalLineToRelative(152f)
                lineToRelative(-76f, -76f)
                lineToRelative(-76f, 76f)
                close()
            }
        }.build()
        
        return _Wall_art!!
    }

private var _Wall_art: ImageVector? = null

