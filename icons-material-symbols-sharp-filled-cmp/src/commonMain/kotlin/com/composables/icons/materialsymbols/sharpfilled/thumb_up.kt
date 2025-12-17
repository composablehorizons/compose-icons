package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Thumb_up: ImageVector
    get() {
        if (_Thumb_up != null) return _Thumb_up!!
        
        _Thumb_up = ImageVector.Builder(
            name = "thumb_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-520f)
                lineToRelative(280f, -280f)
                lineToRelative(74f, 74f)
                lineToRelative(-52f, 206f)
                horizontalLineToRelative(298f)
                verticalLineToRelative(176f)
                lineTo(774f, 840f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(520f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Thumb_up!!
    }

private var _Thumb_up: ImageVector? = null

