package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Save_as: ImageVector
    get() {
        if (_Save_as != null) return _Save_as!!
        
        _Save_as = ImageVector.Builder(
            name = "save_as",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(560f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(86f)
                lineToRelative(-80f, 79f)
                verticalLineToRelative(-132f)
                lineTo(647f, 200f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -640f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
                moveTo(520f, 920f)
                verticalLineToRelative(-123f)
                lineToRelative(263f, -262f)
                lineToRelative(123f, 122f)
                lineTo(643f, 920f)
                horizontalLineTo(520f)
                close()
                moveToRelative(300f, -263f)
                lineToRelative(-37f, -37f)
                lineToRelative(37f, 37f)
                close()
                moveTo(580f, 860f)
                horizontalLineToRelative(38f)
                lineToRelative(121f, -122f)
                lineToRelative(-18f, -19f)
                lineToRelative(-19f, -18f)
                lineToRelative(-122f, 121f)
                verticalLineToRelative(38f)
                close()
                moveToRelative(141f, -141f)
                lineToRelative(-19f, -18f)
                lineToRelative(37f, 37f)
                lineToRelative(-18f, -19f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(240f, 320f)
                horizontalLineToRelative(4f)
                lineToRelative(116f, -115f)
                verticalLineToRelative(-5f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
            }
        }.build()
        
        return _Save_as!!
    }

private var _Save_as: ImageVector? = null

