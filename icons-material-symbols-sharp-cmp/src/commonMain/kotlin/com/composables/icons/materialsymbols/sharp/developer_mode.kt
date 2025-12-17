package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Developer_mode: ImageVector
    get() {
        if (_Developer_mode != null) return _Developer_mode!!
        
        _Developer_mode = ImageVector.Builder(
            name = "developer_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 664f)
                lineTo(160f, 480f)
                lineToRelative(184f, -184f)
                lineToRelative(56f, 58f)
                lineToRelative(-126f, 126f)
                lineToRelative(126f, 126f)
                lineToRelative(-56f, 58f)
                close()
                moveToRelative(-144f, 16f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(200f)
                verticalLineToRelative(-240f)
                close()
                moveToRelative(80f, -400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 520f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(336f, 504f)
                lineToRelative(-56f, -58f)
                lineToRelative(126f, -126f)
                lineToRelative(-126f, -126f)
                lineToRelative(56f, -58f)
                lineToRelative(184f, 184f)
                lineToRelative(-184f, 184f)
                close()
                moveTo(280f, 160f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Developer_mode!!
    }

private var _Developer_mode: ImageVector? = null

