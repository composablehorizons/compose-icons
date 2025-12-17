package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Delete_forever: ImageVector
    get() {
        if (_Delete_forever != null) return _Delete_forever!!
        
        _Delete_forever = ImageVector.Builder(
            name = "delete_forever",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(376f, 660f)
                lineToRelative(104f, -104f)
                lineToRelative(104f, 104f)
                lineToRelative(56f, -56f)
                lineToRelative(-104f, -104f)
                lineToRelative(104f, -104f)
                lineToRelative(-56f, -56f)
                lineToRelative(-104f, 104f)
                lineToRelative(-104f, -104f)
                lineToRelative(-56f, 56f)
                lineToRelative(104f, 104f)
                lineToRelative(-104f, 104f)
                lineToRelative(56f, 56f)
                close()
                moveTo(200f, 840f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(600f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-520f)
                horizontalLineTo(280f)
                verticalLineToRelative(520f)
                close()
                moveToRelative(0f, -520f)
                verticalLineToRelative(520f)
                verticalLineToRelative(-520f)
                close()
            }
        }.build()
        
        return _Delete_forever!!
    }

private var _Delete_forever: ImageVector? = null

