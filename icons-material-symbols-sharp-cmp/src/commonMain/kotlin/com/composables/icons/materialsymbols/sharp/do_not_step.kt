package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Do_not_step: ImageVector
    get() {
        if (_Do_not_step != null) return _Do_not_step!!
        
        _Do_not_step = ImageVector.Builder(
            name = "do_not_step",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(740f, 627f)
                lineToRelative(-56f, -56f)
                lineToRelative(179f, -179f)
                lineToRelative(57f, 56f)
                lineToRelative(-180f, 179f)
                close()
                moveToRelative(-84f, -85f)
                lineToRelative(-57f, -56f)
                lineToRelative(123f, -123f)
                lineToRelative(-170f, -170f)
                lineToRelative(-123f, 123f)
                lineToRelative(-57f, -57f)
                lineToRelative(180f, -179f)
                lineToRelative(283f, 283f)
                lineToRelative(-179f, 179f)
                close()
                moveTo(791f, 904f)
                lineTo(553f, 667f)
                lineTo(420f, 800f)
                horizontalLineTo(40f)
                verticalLineToRelative(-158f)
                quadToRelative(34f, -14f, 67f, -28.5f)
                reflectiveQuadToRelative(65f, -34.5f)
                lineToRelative(69f, 69f)
                lineToRelative(28f, -28f)
                lineToRelative(-66f, -66f)
                lineToRelative(15.5f, -15.5f)
                quadTo(226f, 531f, 234f, 522f)
                lineToRelative(66f, 66f)
                lineToRelative(28f, -28f)
                lineToRelative(-71f, -71f)
                quadToRelative(6f, -11f, 10.5f, -22f)
                reflectiveQuadToRelative(7.5f, -23f)
                lineToRelative(84f, 84f)
                lineToRelative(28f, -28f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(735f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(122f, 720f)
                horizontalLineToRelative(265f)
                lineToRelative(110f, -110f)
                lineToRelative(-67f, -67f)
                lineToRelative(-190f, 190f)
                lineToRelative(-64f, -64f)
                quadToRelative(-14f, 6f, -27f, 12.5f)
                reflectiveQuadTo(122f, 694f)
                verticalLineToRelative(26f)
                close()
                moveToRelative(308f, -177f)
                close()
                moveToRelative(96f, -130f)
                close()
            }
        }.build()
        
        return _Do_not_step!!
    }

private var _Do_not_step: ImageVector? = null

