package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Spa: ImageVector
    get() {
        if (_Spa != null) return _Spa!!
        
        _Spa = ImageVector.Builder(
            name = "spa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-94f, -12f, -168f, -48f)
                reflectiveQuadToRelative(-125.5f, -94f)
                quadTo(135f, 680f, 108f, 603.5f)
                reflectiveQuadTo(81f, 434f)
                quadToRelative(110f, 11f, 186f, 40f)
                reflectiveQuadToRelative(123.5f, 82f)
                quadTo(438f, 609f, 459f, 688.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -337f)
                quadToRelative(-23f, -35f, -62.5f, -69f)
                reflectiveQuadTo(326f, 412f)
                quadToRelative(6f, -42f, 20f, -87f)
                reflectiveQuadToRelative(34f, -88.5f)
                quadToRelative(20f, -43.5f, 45.5f, -83.5f)
                reflectiveQuadToRelative(54.5f, -73f)
                quadToRelative(29f, 33f, 54.5f, 73f)
                reflectiveQuadToRelative(45.5f, 83.5f)
                quadToRelative(20f, 43.5f, 34f, 88.5f)
                reflectiveQuadToRelative(20f, 87f)
                quadToRelative(-52f, 27f, -91.5f, 61f)
                reflectiveQuadTo(480f, 543f)
                close()
                moveToRelative(80f, 321f)
                quadToRelative(-2f, -70f, -10.5f, -129.5f)
                reflectiveQuadTo(523f, 622f)
                quadToRelative(47f, -81f, 129.5f, -132f)
                reflectiveQuadTo(879f, 434f)
                quadToRelative(1f, 158f, -84.5f, 272.5f)
                reflectiveQuadTo(560f, 864f)
                close()
            }
        }.build()
        
        return _Spa!!
    }

private var _Spa: ImageVector? = null

