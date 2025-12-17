package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Computer_cancel: ImageVector
    get() {
        if (_Computer_cancel != null) return _Computer_cancel!!
        
        _Computer_cancel = ImageVector.Builder(
            name = "computer_cancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(376f, 580f)
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
                moveTo(40f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(40f, -120f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Computer_cancel!!
    }

private var _Computer_cancel: ImageVector? = null

