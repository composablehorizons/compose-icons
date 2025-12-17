package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Dropper_eye: ImageVector
    get() {
        if (_Dropper_eye != null) return _Dropper_eye!!
        
        _Dropper_eye = ImageVector.Builder(
            name = "dropper_eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(644f, 347f)
                lineToRelative(100f, -94f)
                lineToRelative(-37f, -37f)
                lineToRelative(-96f, 96f)
                lineToRelative(33f, 35f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(-33f, -35f)
                lineToRelative(33f, 35f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-190f)
                lineToRelative(357f, -357f)
                lineToRelative(-57f, -57f)
                lineToRelative(57f, -56f)
                lineToRelative(77f, 76f)
                lineToRelative(152f, -152f)
                lineToRelative(150f, 150f)
                lineToRelative(-152f, 152f)
                lineToRelative(56f, 58f)
                lineToRelative(-56f, 56f)
                lineToRelative(-170f, -170f)
                lineToRelative(-334f, 333f)
                verticalLineToRelative(77f)
                horizontalLineToRelative(42f)
                quadToRelative(10f, 22f, 21.5f, 42f)
                reflectiveQuadToRelative(24.5f, 38f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, 80f)
                quadToRelative(-91f, 0f, -168f, -48f)
                reflectiveQuadTo(320f, 740f)
                quadToRelative(35f, -84f, 112f, -132f)
                reflectiveQuadToRelative(168f, -48f)
                quadToRelative(91f, 0f, 168f, 48f)
                reflectiveQuadToRelative(112f, 132f)
                quadToRelative(-35f, 84f, -112f, 132f)
                reflectiveQuadTo(600f, 920f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(57f, 0f, 107.5f, -26f)
                reflectiveQuadToRelative(82.5f, -74f)
                quadToRelative(-32f, -48f, -82.5f, -74f)
                reflectiveQuadTo(600f, 640f)
                quadToRelative(-57f, 0f, -107.5f, 26f)
                reflectiveQuadTo(410f, 740f)
                quadToRelative(32f, 48f, 82.5f, 74f)
                reflectiveQuadTo(600f, 840f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(540f, 740f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(660f, 740f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(600f, 800f)
                close()
            }
        }.build()
        
        return _Dropper_eye!!
    }

private var _Dropper_eye: ImageVector? = null

