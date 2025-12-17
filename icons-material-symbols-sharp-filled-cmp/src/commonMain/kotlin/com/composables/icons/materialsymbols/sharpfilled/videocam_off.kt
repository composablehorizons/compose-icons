package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Videocam_off: ImageVector
    get() {
        if (_Videocam_off != null) return _Videocam_off!!
        
        _Videocam_off = ImageVector.Builder(
            name = "videocam_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 700f)
                lineTo(720f, 540f)
                verticalLineToRelative(67f)
                lineTo(273f, 160f)
                horizontalLineToRelative(447f)
                verticalLineToRelative(260f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                close()
                moveTo(822f, 934f)
                lineTo(26f, 138f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(160f, 160f)
                lineToRelative(560f, 560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Videocam_off!!
    }

private var _Videocam_off: ImageVector? = null

