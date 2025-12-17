package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Voice_selection_off: ImageVector
    get() {
        if (_Voice_selection_off != null) return _Voice_selection_off!!
        
        _Voice_selection_off = ImageVector.Builder(
            name = "voice_selection_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(855f, 740f)
                lineToRelative(-64f, -64f)
                quadToRelative(20f, -81f, -3f, -160f)
                reflectiveQuadToRelative(-83f, -138f)
                lineToRelative(56f, -58f)
                quadToRelative(55f, 54f, 87f, 126f)
                reflectiveQuadToRelative(32f, 156f)
                quadToRelative(0f, 36f, -6.5f, 71f)
                reflectiveQuadTo(855f, 740f)
                close()
                moveTo(398f, 284f)
                lineToRelative(-74f, -146f)
                lineToRelative(72f, -36f)
                lineToRelative(136f, 272f)
                verticalLineToRelative(45f)
                lineTo(398f, 284f)
                close()
                moveTo(820f, 933f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 57f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(179f)
                verticalLineToRelative(-28f)
                quadToRelative(-46f, -23f, -72.5f, -66.5f)
                reflectiveQuadTo(160f, 611f)
                verticalLineToRelative(-91f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(240f)
                verticalLineToRelative(11f)
                quadToRelative(0f, 35f, 21.5f, 61.5f)
                reflectiveQuadTo(316f, 708f)
                lineToRelative(26f, 3f)
                verticalLineToRelative(169f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Voice_selection_off!!
    }

private var _Voice_selection_off: ImageVector? = null

