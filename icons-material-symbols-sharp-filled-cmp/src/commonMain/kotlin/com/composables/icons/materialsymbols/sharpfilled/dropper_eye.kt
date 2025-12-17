package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Dropper_eye: ImageVector
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
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
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

