package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Thumb_down: ImageVector
    get() {
        if (_Thumb_down != null) return _Thumb_down!!
        
        _Thumb_down = ImageVector.Builder(
            name = "thumb_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 640f)
                verticalLineToRelative(-176f)
                lineToRelative(146f, -344f)
                horizontalLineToRelative(494f)
                verticalLineToRelative(520f)
                lineTo(400f, 920f)
                lineToRelative(-74f, -74f)
                lineToRelative(52f, -206f)
                horizontalLineTo(40f)
                close()
                moveToRelative(560f, -440f)
                horizontalLineTo(240f)
                lineTo(120f, 480f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(360f)
                lineToRelative(-54f, 220f)
                lineToRelative(174f, -174f)
                verticalLineToRelative(-406f)
                close()
                moveToRelative(0f, 406f)
                verticalLineToRelative(-406f)
                verticalLineToRelative(406f)
                close()
                moveToRelative(80f, 34f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-360f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(520f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Thumb_down!!
    }

private var _Thumb_down: ImageVector? = null

