package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Biotech: ImageVector
    get() {
        if (_Biotech != null) return _Biotech!!
        
        _Biotech = ImageVector.Builder(
            name = "biotech",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -61f, 33.5f, -111f)
                reflectiveQuadToRelative(90.5f, -73f)
                quadToRelative(8f, -34f, 35.5f, -55f)
                reflectiveQuadToRelative(62.5f, -21f)
                lineToRelative(-22f, -62f)
                lineToRelative(38f, -14f)
                lineToRelative(-14f, -36f)
                lineToRelative(76f, -28f)
                lineToRelative(12f, 38f)
                lineToRelative(38f, -14f)
                lineToRelative(110f, 300f)
                lineToRelative(-38f, 14f)
                lineToRelative(14f, 38f)
                lineToRelative(-76f, 28f)
                lineToRelative(-12f, -38f)
                lineToRelative(-38f, 14f)
                lineToRelative(-24f, -66f)
                quadToRelative(-15f, 14f, -34.5f, 21f)
                reflectiveQuadToRelative(-39.5f, 5f)
                quadToRelative(-22f, -2f, -41f, -13.5f)
                reflectiveQuadTo(338f, 378f)
                quadToRelative(-27f, 16f, -42.5f, 43f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(346f, -458f)
                lineToRelative(36f, -14f)
                lineToRelative(-68f, -188f)
                lineToRelative(-38f, 14f)
                lineToRelative(70f, 188f)
                close()
                moveToRelative(-126f, -22f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 360f)
                close()
                moveToRelative(126f, 22f)
                close()
                moveToRelative(-126f, -62f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Biotech!!
    }

private var _Biotech: ImageVector? = null

