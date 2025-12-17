package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Temple_buddhist: ImageVector
    get() {
        if (_Temple_buddhist != null) return _Temple_buddhist!!
        
        _Temple_buddhist = ImageVector.Builder(
            name = "temple_buddhist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-366f)
                quadToRelative(-52f, -13f, -86f, -55f)
                reflectiveQuadToRelative(-34f, -98f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 32f, 23.5f, 55.5f)
                reflectiveQuadTo(199f, 440f)
                horizontalLineToRelative(41f)
                verticalLineToRelative(-86f)
                quadToRelative(-52f, -13f, -86f, -55f)
                reflectiveQuadToRelative(-34f, -98f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 32f, 23.5f, 55.5f)
                reflectiveQuadTo(279f, 280f)
                horizontalLineToRelative(21f)
                lineToRelative(180f, -240f)
                lineToRelative(180f, 240f)
                horizontalLineToRelative(21f)
                quadToRelative(32f, 0f, 55.5f, -23.5f)
                reflectiveQuadTo(760f, 201f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 56f, -34f, 98f)
                reflectiveQuadToRelative(-86f, 55f)
                verticalLineToRelative(86f)
                horizontalLineToRelative(41f)
                quadToRelative(32f, 0f, 55.5f, -23.5f)
                reflectiveQuadTo(840f, 361f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 56f, -34f, 98f)
                reflectiveQuadToRelative(-86f, 55f)
                verticalLineToRelative(366f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, -600f)
                horizontalLineToRelative(160f)
                lineToRelative(-80f, -107f)
                lineToRelative(-80f, 107f)
                close()
                moveToRelative(-80f, 160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, 360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-280f)
                horizontalLineTo(240f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(240f, -280f)
                close()
                moveToRelative(0f, -240f)
                close()
                moveToRelative(0f, 160f)
                close()
            }
        }.build()
        
        return _Temple_buddhist!!
    }

private var _Temple_buddhist: ImageVector? = null

