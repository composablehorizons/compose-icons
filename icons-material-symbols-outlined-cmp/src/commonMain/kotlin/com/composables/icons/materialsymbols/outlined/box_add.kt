package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Box_add: ImageVector
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
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-499f)
                quadToRelative(0f, -14f, 4.5f, -27f)
                reflectiveQuadToRelative(13.5f, -24f)
                lineToRelative(50f, -61f)
                quadToRelative(11f, -14f, 27.5f, -21.5f)
                reflectiveQuadTo(250f, 120f)
                horizontalLineToRelative(460f)
                quadToRelative(18f, 0f, 34.5f, 7.5f)
                reflectiveQuadTo(772f, 149f)
                lineToRelative(50f, 61f)
                quadToRelative(9f, 11f, 13.5f, 24f)
                reflectiveQuadToRelative(4.5f, 27f)
                verticalLineToRelative(196f)
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

