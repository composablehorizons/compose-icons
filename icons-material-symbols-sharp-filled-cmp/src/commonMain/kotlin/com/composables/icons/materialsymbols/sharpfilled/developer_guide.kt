package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Developer_guide: ImageVector
    get() {
        if (_Developer_guide != null) return _Developer_guide!!
        
        _Developer_guide = ImageVector.Builder(
            name = "developer_guide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -640f)
                verticalLineToRelative(280f)
                lineToRelative(100f, -60f)
                lineToRelative(100f, 60f)
                verticalLineToRelative(-280f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Developer_guide!!
    }

private var _Developer_guide: ImageVector? = null

