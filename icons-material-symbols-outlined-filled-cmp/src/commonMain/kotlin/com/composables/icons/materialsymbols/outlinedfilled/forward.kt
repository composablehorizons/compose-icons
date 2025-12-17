package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Forward: ImageVector
    get() {
        if (_Forward != null) return _Forward!!
        
        _Forward = ImageVector.Builder(
            name = "forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 680f)
                lineToRelative(-57f, -56f)
                lineToRelative(184f, -184f)
                lineToRelative(-184f, -184f)
                lineToRelative(57f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                close()
                moveTo(80f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(280f, 400f)
                horizontalLineToRelative(247f)
                lineTo(383f, 256f)
                lineToRelative(57f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                lineToRelative(-57f, -56f)
                lineToRelative(144f, -144f)
                horizontalLineTo(280f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Forward!!
    }

private var _Forward: ImageVector? = null

