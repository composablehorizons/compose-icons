package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mountain_flag: ImageVector
    get() {
        if (_Mountain_flag != null) return _Mountain_flag!!
        
        _Mountain_flag = ImageVector.Builder(
            name = "mountain_flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(281f, 473f)
                lineToRelative(33f, -68f)
                quadToRelative(10f, -21f, 29.5f, -33f)
                reflectiveQuadToRelative(42.5f, -12f)
                horizontalLineToRelative(54f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(280f)
                lineToRelative(-40f, 80f)
                lineToRelative(40f, 80f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(51f)
                quadToRelative(23f, 0f, 41.5f, 12f)
                reflectiveQuadToRelative(29.5f, 32f)
                lineToRelative(35f, 70f)
                lineToRelative(-120f, 80f)
                lineToRelative(-77f, -39f)
                lineToRelative(-77f, 39f)
                lineToRelative(-122f, -81f)
                close()
                moveTo(80f, 880f)
                lineToRelative(165f, -335f)
                lineToRelative(152f, 101f)
                lineToRelative(83f, -41f)
                lineToRelative(83f, 41f)
                lineToRelative(150f, -99f)
                lineTo(880f, 880f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Mountain_flag!!
    }

private var _Mountain_flag: ImageVector? = null

