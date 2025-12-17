package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Speaker_notes_off: ImageVector
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
                moveTo(280f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 560f)
                close()
                moveToRelative(548f, 154f)
                lineToRelative(-74f, -74f)
                horizontalLineToRelative(46f)
                verticalLineToRelative(-480f)
                horizontalLineTo(274f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(686f)
                verticalLineToRelative(634f)
                horizontalLineToRelative(-52f)
                close()
                moveTo(554f, 440f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(246f)
                verticalLineToRelative(80f)
                horizontalLineTo(554f)
                close()
                moveTo(820f, 932f)
                lineTo(606f, 720f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                verticalLineToRelative(-688f)
                lineToRelative(-52f, -52f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(514f, 400f)
                close()
                moveToRelative(-234f, 40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 440f)
                close()
                moveToRelative(154f, -120f)
                lineToRelative(-34f, -34f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(434f)
                close()
                moveToRelative(-90f, 136f)
                close()
                moveTo(160f, 272f)
                verticalLineToRelative(413f)
                lineToRelative(46f, -45f)
                horizontalLineToRelative(322f)
                lineTo(160f, 272f)
                close()
            }
        }.build()
        
        return _Speaker_notes_off!!
    }

private var _Speaker_notes_off: ImageVector? = null

