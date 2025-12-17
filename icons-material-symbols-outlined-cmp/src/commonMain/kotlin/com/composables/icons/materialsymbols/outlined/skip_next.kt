package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Skip_next: ImageVector
    get() {
        if (_Skip_next != null) return _Skip_next!!
        
        _Skip_next = ImageVector.Builder(
            name = "skip_next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-440f, 0f)
                verticalLineToRelative(-480f)
                lineToRelative(360f, 240f)
                lineToRelative(-360f, 240f)
                close()
                moveToRelative(80f, -240f)
                close()
                moveToRelative(0f, 90f)
                lineToRelative(136f, -90f)
                lineToRelative(-136f, -90f)
                verticalLineToRelative(180f)
                close()
            }
        }.build()
        
        return _Skip_next!!
    }

private var _Skip_next: ImageVector? = null

