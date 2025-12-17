package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Fork_right: ImageVector
    get() {
        if (_Fork_right != null) return _Fork_right!!
        
        _Fork_right = ImageVector.Builder(
            name = "fork_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                verticalLineToRelative(-567f)
                lineToRelative(-64f, 63f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 57f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(261f)
                quadToRelative(35f, -31f, 79f, -44.5f)
                reflectiveQuadToRelative(88f, -13.5f)
                quadToRelative(11f, 0f, 21f, 1f)
                reflectiveQuadToRelative(19f, 3f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                quadToRelative(-11f, -2f, -22f, -3.5f)
                reflectiveQuadToRelative(-22f, -1.5f)
                quadToRelative(-54f, 0f, -99.5f, 30.5f)
                reflectiveQuadTo(440f, 680f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Fork_right!!
    }

private var _Fork_right: ImageVector? = null

