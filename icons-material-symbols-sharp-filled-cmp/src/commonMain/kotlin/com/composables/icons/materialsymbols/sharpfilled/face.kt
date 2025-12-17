package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Face: ImageVector
    get() {
        if (_Face != null) return _Face!!
        
        _Face = ImageVector.Builder(
            name = "face",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 570f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(310f, 520f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(360f, 470f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(410f, 520f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(360f, 570f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(550f, 520f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(600f, 470f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(650f, 520f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(600f, 570f)
                close()
                moveTo(480f, 800f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -24f, -3f, -46.5f)
                reflectiveQuadTo(786f, 390f)
                quadToRelative(-21f, 5f, -42f, 7.5f)
                reflectiveQuadToRelative(-44f, 2.5f)
                quadToRelative(-91f, 0f, -172f, -39f)
                reflectiveQuadTo(390f, 252f)
                quadToRelative(-32f, 78f, -91.5f, 135.5f)
                reflectiveQuadTo(160f, 474f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Face!!
    }

private var _Face: ImageVector? = null

