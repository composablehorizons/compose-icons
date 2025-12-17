package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Biotech: ImageVector
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
                quadToRelative(0f, -57f, 29f, -105f)
                reflectiveQuadToRelative(80f, -73f)
                quadToRelative(-4f, 22f, 1.5f, 43f)
                reflectiveQuadToRelative(17.5f, 40f)
                quadToRelative(-23f, 16f, -35.5f, 41f)
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
                moveToRelative(360f, -356f)
                lineToRelative(-12f, -38f)
                lineToRelative(-38f, 14f)
                lineToRelative(-20f, -53f)
                quadToRelative(20f, -16f, 31f, -38.5f)
                reflectiveQuadToRelative(11f, -48.5f)
                quadToRelative(0f, -47f, -33f, -79.5f)
                reflectiveQuadTo(418f, 208f)
                lineToRelative(-18f, -50f)
                lineToRelative(38f, -14f)
                lineToRelative(-14f, -36f)
                lineToRelative(76f, -28f)
                lineToRelative(12f, 38f)
                lineToRelative(38f, -14f)
                lineToRelative(110f, 300f)
                lineToRelative(-38f, 14f)
                lineToRelative(14f, 38f)
                lineToRelative(-76f, 28f)
                close()
                moveToRelative(-140f, -92f)
                quadToRelative(-30f, 0f, -51f, -21f)
                reflectiveQuadToRelative(-21f, -51f)
                quadToRelative(0f, -30f, 21f, -51f)
                reflectiveQuadToRelative(51f, -21f)
                quadToRelative(30f, 0f, 51f, 21f)
                reflectiveQuadToRelative(21f, 51f)
                quadToRelative(0f, 30f, -21f, 51f)
                reflectiveQuadToRelative(-51f, 21f)
                close()
            }
        }.build()
        
        return _Biotech!!
    }

private var _Biotech: ImageVector? = null

