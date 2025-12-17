package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Resume: ImageVector
    get() {
        if (_Resume != null) return _Resume!!
        
        _Resume = ImageVector.Builder(
            name = "resume",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                lineToRelative(400f, -240f)
                lineToRelative(-400f, -240f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Resume!!
    }

private var _Resume: ImageVector? = null

