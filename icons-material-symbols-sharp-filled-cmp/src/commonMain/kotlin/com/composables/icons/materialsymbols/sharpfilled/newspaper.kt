package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) return _Newspaper!!
        
        _Newspaper = ImageVector.Builder(
            name = "newspaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-720f)
                lineToRelative(67f, 67f)
                lineToRelative(66f, -67f)
                lineToRelative(67f, 67f)
                lineToRelative(67f, -67f)
                lineToRelative(66f, 67f)
                lineToRelative(67f, -67f)
                lineToRelative(67f, 67f)
                lineToRelative(66f, -67f)
                lineToRelative(67f, 67f)
                lineToRelative(67f, -67f)
                lineToRelative(66f, 67f)
                lineToRelative(67f, -67f)
                verticalLineToRelative(720f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(360f, 0f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
                moveTo(160f, 440f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Newspaper!!
    }

private var _Newspaper: ImageVector? = null

