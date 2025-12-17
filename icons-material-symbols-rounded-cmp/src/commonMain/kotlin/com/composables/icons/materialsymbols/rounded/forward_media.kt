package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Forward_media: ImageVector
    get() {
        if (_Forward_media != null) return _Forward_media!!
        
        _Forward_media = ImageVector.Builder(
            name = "forward_media",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 160f)
                horizontalLineToRelative(6f)
                lineToRelative(-34f, -34f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(509f, 69f)
                lineToRelative(103f, 103f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(509f, 331f)
                quadToRelative(-12f, 12f, -28.5f, 11.5f)
                reflectiveQuadTo(452f, 330f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(11f, -27.5f)
                lineToRelative(34f, -34f)
                horizontalLineToRelative(-6f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(106f, 0f, 185f, -69f)
                reflectiveQuadToRelative(93f, -174f)
                quadToRelative(2f, -16f, 14f, -26.5f)
                reflectiveQuadToRelative(28f, -10.5f)
                quadToRelative(16f, 0f, 28f, 10f)
                reflectiveQuadToRelative(10f, 25f)
                quadToRelative(-14f, 139f, -116f, 232f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Forward_media!!
    }

private var _Forward_media: ImageVector? = null

