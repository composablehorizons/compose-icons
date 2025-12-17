package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Box_add: ImageVector
    get() {
        if (_Box_add != null) return _Box_add!!
        
        _Box_add = ImageVector.Builder(
            name = "box_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 320f)
                horizontalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
                moveToRelative(-440f, 0f)
                horizontalLineToRelative(338f)
                horizontalLineToRelative(-18f)
                horizontalLineToRelative(14f)
                horizontalLineToRelative(-334f)
                close()
                moveToRelative(16f, -80f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
                moveToRelative(184f, 270f)
                lineToRelative(80f, -40f)
                lineToRelative(80f, 40f)
                verticalLineToRelative(-190f)
                horizontalLineTo(400f)
                verticalLineToRelative(190f)
                close()
                moveToRelative(182f, 330f)
                horizontalLineTo(120f)
                verticalLineToRelative(-608f)
                lineToRelative(92f, -112f)
                horizontalLineToRelative(536f)
                lineToRelative(92f, 112f)
                verticalLineToRelative(225f)
                quadToRelative(-19f, -7f, -39f, -11f)
                reflectiveQuadToRelative(-41f, -4f)
                verticalLineToRelative(-122f)
                horizontalLineTo(640f)
                verticalLineToRelative(153f)
                quadToRelative(-35f, 20f, -61f, 49.5f)
                reflectiveQuadTo(538f, 589f)
                lineToRelative(-58f, -29f)
                lineToRelative(-160f, 80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(334f)
                quadToRelative(8f, 23f, 20f, 43f)
                reflectiveQuadToRelative(28f, 37f)
                close()
                moveToRelative(138f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Box_add!!
    }

private var _Box_add: ImageVector? = null

