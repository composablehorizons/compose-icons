package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Subtitles_off: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(446f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(206f)
                lineTo(26f, 138f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                lineToRelative(-56f, 56f)
                lineToRelative(-136f, -134f)
                horizontalLineTo(80f)
                close()
                moveToRelative(720f, -114f)
                verticalLineToRelative(-446f)
                horizontalLineTo(354f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(606f)
                verticalLineToRelative(606f)
                lineToRelative(-80f, -80f)
                close()
                moveTo(594f, 480f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(80f)
                horizontalLineTo(594f)
                close()
                moveToRelative(-354f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(337f, -17f)
                close()
                moveToRelative(-194f, 34f)
                close()
            }
        }.build()
        
        return _Subtitles_off!!
    }

private var _Subtitles_off: ImageVector? = null

