package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Earbuds_2: ImageVector
    get() {
        if (_Earbuds_2 != null) return _Earbuds_2!!
        
        _Earbuds_2 = ImageVector.Builder(
            name = "earbuds_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 920f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(640f)
                close()
                moveTo(500f, 760f)
                quadToRelative(-68f, 0f, -116f, -46f)
                reflectiveQuadToRelative(-48f, -114f)
                quadToRelative(0f, -67f, 48f, -113.5f)
                reflectiveQuadTo(500f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(120f, 520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(440f)
                horizontalLineTo(120f)
                close()
                moveToRelative(260f, -160f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                quadToRelative(67f, 0f, 115.5f, 46.5f)
                reflectiveQuadTo(624f, 200f)
                quadToRelative(0f, 68f, -48.5f, 114f)
                reflectiveQuadTo(460f, 360f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Earbuds_2!!
    }

private var _Earbuds_2: ImageVector? = null

