package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Reply: ImageVector
    get() {
        if (_Reply != null) return _Reply!!
        
        _Reply = ImageVector.Builder(
            name = "reply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(273f)
                lineToRelative(144f, 144f)
                lineToRelative(-57f, 56f)
                lineToRelative(-240f, -240f)
                lineToRelative(240f, -240f)
                lineToRelative(57f, 56f)
                lineToRelative(-144f, 144f)
                horizontalLineToRelative(367f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Reply!!
    }

private var _Reply: ImageVector? = null

