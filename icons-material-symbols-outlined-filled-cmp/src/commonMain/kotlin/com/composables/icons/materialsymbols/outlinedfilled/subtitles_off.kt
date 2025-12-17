package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Subtitles_off: ImageVector
    get() {
        if (_Subtitles_off != null) return _Subtitles_off!!
        
        _Subtitles_off = ImageVector.Builder(
            name = "subtitles_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 400f)
                horizontalLineTo(514f)
                lineTo(274f, 160f)
                horizontalLineToRelative(526f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(476f)
                quadToRelative(0f, 11f, -2f, 21f)
                reflectiveQuadToRelative(-8f, 19f)
                lineTo(594f, 480f)
                horizontalLineToRelative(126f)
                verticalLineToRelative(-80f)
                close()
                moveTo(822f, 934f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                verticalLineToRelative(112f)
                lineTo(26f, 138f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(240f, 480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-48f)
                lineToRelative(-32f, -32f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(206f, 80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(286f)
                lineToRelative(-80f, -80f)
                close()
            }
        }.build()
        
        return _Subtitles_off!!
    }

private var _Subtitles_off: ImageVector? = null

