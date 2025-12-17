package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_arrow_up_right: ImageVector
    get() {
        if (_Mobile_arrow_up_right != null) return _Mobile_arrow_up_right!!
        
        _Mobile_arrow_up_right = ImageVector.Builder(
            name = "mobile_arrow_up_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(396f, 620f)
                lineToRelative(124f, -124f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(104f)
                lineTo(340f, 564f)
                lineToRelative(56f, 56f)
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
        
        return _Mobile_arrow_up_right!!
    }

private var _Mobile_arrow_up_right: ImageVector? = null

