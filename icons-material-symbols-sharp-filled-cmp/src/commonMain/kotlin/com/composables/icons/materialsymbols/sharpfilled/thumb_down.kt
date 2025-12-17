package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Thumb_down: ImageVector
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
                horizontalLineToRelative(454f)
                verticalLineToRelative(520f)
                lineTo(360f, 920f)
                lineToRelative(-74f, -74f)
                lineToRelative(52f, -206f)
                horizontalLineTo(40f)
                close()
                moveToRelative(680f, 0f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(520f)
                horizontalLineTo(720f)
                close()
            }
        }.build()
        
        return _Thumb_down!!
    }

private var _Thumb_down: ImageVector? = null

