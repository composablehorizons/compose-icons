package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Speaker_notes_off: ImageVector
    get() {
        if (_Speaker_notes_off != null) return _Speaker_notes_off!!
        
        _Speaker_notes_off = ImageVector.Builder(
            name = "speaker_notes_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 932f)
                lineTo(606f, 720f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                verticalLineToRelative(-700f)
                horizontalLineToRelative(100f)
                lineToRelative(260f, 260f)
                horizontalLineTo(328f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(8f, -218f)
                lineTo(554f, 440f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(-80f)
                horizontalLineTo(474f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(286f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(46f)
                lineTo(194f, 80f)
                horizontalLineToRelative(686f)
                verticalLineToRelative(634f)
                horizontalLineToRelative(-52f)
                close()
                moveTo(280f, 560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 560f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 440f)
                close()
            }
        }.build()
        
        return _Speaker_notes_off!!
    }

private var _Speaker_notes_off: ImageVector? = null

