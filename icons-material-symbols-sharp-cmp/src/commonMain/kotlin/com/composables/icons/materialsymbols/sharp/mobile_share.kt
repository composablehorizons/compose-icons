package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_share: ImageVector
    get() {
        if (_Mobile_share != null) return _Mobile_share!!
        
        _Mobile_share = ImageVector.Builder(
            name = "mobile_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(86f)
                lineToRelative(-42f, 44f)
                lineToRelative(56f, 56f)
                lineToRelative(140f, -140f)
                lineToRelative(-140f, -140f)
                lineToRelative(-56f, 56f)
                lineToRelative(42f, 44f)
                horizontalLineTo(320f)
                verticalLineToRelative(200f)
                close()
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(204f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(484f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-720f)
                horizontalLineTo(280f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-720f)
                verticalLineToRelative(720f)
                close()
            }
        }.build()
        
        return _Mobile_share!!
    }

private var _Mobile_share: ImageVector? = null

