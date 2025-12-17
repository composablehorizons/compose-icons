package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Man_3: ImageVector
    get() {
        if (_Man_3 != null) return _Man_3!!
        
        _Man_3 = ImageVector.Builder(
            name = "man_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 890f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 290f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 370f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, -630f)
                lineToRelative(-90f, -90f)
                lineToRelative(90f, -90f)
                lineToRelative(90f, 90f)
                lineToRelative(-90f, 90f)
                close()
            }
        }.build()
        
        return _Man_3!!
    }

private var _Man_3: ImageVector? = null

