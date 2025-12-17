package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.No_sound: ImageVector
    get() {
        if (_No_sound != null) return _No_sound!!
        
        _No_sound = ImageVector.Builder(
            name = "no_sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(616f, 640f)
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
                moveToRelative(-496f, -40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(160f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(640f)
                lineTo(280f, 600f)
                horizontalLineTo(120f)
                close()
                moveToRelative(280f, -246f)
                lineToRelative(-86f, 86f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(114f)
                lineToRelative(86f, 86f)
                verticalLineToRelative(-252f)
                close()
                moveTo(300f, 480f)
                close()
            }
        }.build()
        
        return _No_sound!!
    }

private var _No_sound: ImageVector? = null

