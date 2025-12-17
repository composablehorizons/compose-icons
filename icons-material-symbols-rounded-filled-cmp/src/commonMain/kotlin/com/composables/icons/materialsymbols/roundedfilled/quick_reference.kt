package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Quick_reference: ImageVector
    get() {
        if (_Quick_reference != null) return _Quick_reference!!
        
        _Quick_reference = ImageVector.Builder(
            name = "quick_reference",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 800f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(0f, 280f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(520f, 360f)
                horizontalLineToRelative(160f)
                lineTo(480f, 160f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, -200f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 360f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(287f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(13f)
                quadToRelative(0f, 17f, -13.5f, 28f)
                reflectiveQuadToRelative(-31.5f, 8f)
                quadToRelative(-8f, -1f, -17f, -1.5f)
                reflectiveQuadToRelative(-18f, -0.5f)
                quadToRelative(-57f, 0f, -107.5f, 21.5f)
                reflectiveQuadTo(484f, 480f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 560f)
                horizontalLineToRelative(107f)
                quadToRelative(-9f, 19f, -15f, 39f)
                reflectiveQuadToRelative(-9f, 41f)
                horizontalLineToRelative(-83f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 720f)
                horizontalLineToRelative(83f)
                quadToRelative(5f, 29f, 15f, 56.5f)
                reflectiveQuadToRelative(26f, 52.5f)
                quadToRelative(11f, 17f, 2.5f, 34f)
                reflectiveQuadTo(420f, 880f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Quick_reference!!
    }

private var _Quick_reference: ImageVector? = null

