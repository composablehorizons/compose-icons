package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Reply_all: ImageVector
    get() {
        if (_Reply_all != null) return _Reply_all!!
        
        _Reply_all = ImageVector.Builder(
            name = "reply_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 680f)
                lineTo(80f, 440f)
                lineToRelative(240f, -240f)
                lineToRelative(57f, 56f)
                lineToRelative(-184f, 184f)
                lineToRelative(184f, 184f)
                lineToRelative(-57f, 56f)
                close()
                moveToRelative(480f, 80f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(433f)
                lineToRelative(144f, 144f)
                lineToRelative(-57f, 56f)
                lineToRelative(-240f, -240f)
                lineToRelative(240f, -240f)
                lineToRelative(57f, 56f)
                lineToRelative(-144f, 144f)
                horizontalLineToRelative(247f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 600f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Reply_all!!
    }

private var _Reply_all: ImageVector? = null

