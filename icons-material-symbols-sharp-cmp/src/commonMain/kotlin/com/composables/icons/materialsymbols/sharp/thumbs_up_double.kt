package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Thumbs_up_double: ImageVector
    get() {
        if (_Thumbs_up_double != null) return _Thumbs_up_double!!
        
        _Thumbs_up_double = ImageVector.Builder(
            name = "thumbs_up_double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(713f, 680f)
                lineToRelative(127f, -297f)
                verticalLineToRelative(-23f)
                horizontalLineTo(588f)
                lineToRelative(19f, -134f)
                lineToRelative(-55f, 55f)
                lineToRelative(-56f, -57f)
                lineToRelative(144f, -144f)
                lineToRelative(60f, 60f)
                lineToRelative(-20f, 140f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                lineTo(800f, 680f)
                horizontalLineToRelative(-87f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-360f)
                lineToRelative(240f, -240f)
                lineToRelative(60f, 60f)
                lineToRelative(-20f, 140f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                lineTo(560f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(267f)
                lineToRelative(93f, -216f)
                verticalLineToRelative(-24f)
                horizontalLineTo(348f)
                lineToRelative(19f, -134f)
                lineToRelative(-127f, 127f)
                verticalLineToRelative(247f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-247f)
                verticalLineToRelative(247f)
                close()
            }
        }.build()
        
        return _Thumbs_up_double!!
    }

private var _Thumbs_up_double: ImageVector? = null

