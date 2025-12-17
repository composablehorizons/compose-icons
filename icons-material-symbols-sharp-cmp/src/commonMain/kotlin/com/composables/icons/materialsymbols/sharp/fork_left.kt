package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fork_left: ImageVector
    get() {
        if (_Fork_left != null) return _Fork_left!!
        
        _Fork_left = ImageVector.Builder(
            name = "fork_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 840f)
                verticalLineToRelative(-160f)
                quadToRelative(-18f, -64f, -63.5f, -94.5f)
                reflectiveQuadTo(357f, 555f)
                quadToRelative(-11f, 0f, -22f, 1.5f)
                reflectiveQuadToRelative(-22f, 3.5f)
                lineToRelative(63f, 64f)
                lineToRelative(-56f, 56f)
                lineToRelative(-160f, -160f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-63f, 64f)
                quadToRelative(9f, -2f, 19f, -3f)
                reflectiveQuadToRelative(21f, -1f)
                quadToRelative(44f, 0f, 88f, 13.5f)
                reflectiveQuadToRelative(79f, 44.5f)
                verticalLineToRelative(-261f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -57f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -63f)
                verticalLineToRelative(567f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Fork_left!!
    }

private var _Fork_left: ImageVector? = null

