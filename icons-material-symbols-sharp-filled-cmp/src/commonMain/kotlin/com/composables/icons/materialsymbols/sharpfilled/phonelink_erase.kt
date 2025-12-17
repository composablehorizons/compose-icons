package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Phonelink_erase: ImageVector
    get() {
        if (_Phonelink_erase != null) return _Phonelink_erase!!
        
        _Phonelink_erase = ImageVector.Builder(
            name = "phonelink_erase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
                moveToRelative(416f, -280f)
                lineToRelative(-56f, -56f)
                lineToRelative(104f, -104f)
                lineToRelative(-104f, -104f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 104f)
                lineToRelative(104f, -104f)
                lineToRelative(56f, 56f)
                lineToRelative(-104f, 104f)
                lineToRelative(104f, 104f)
                lineToRelative(-56f, 56f)
                lineToRelative(-104f, -104f)
                lineToRelative(-104f, 104f)
                close()
            }
        }.build()
        
        return _Phonelink_erase!!
    }

private var _Phonelink_erase: ImageVector? = null

