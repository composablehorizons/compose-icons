package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mountain_flag: ImageVector
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
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                horizontalLineToRelative(208f)
                quadToRelative(11f, 0f, 17f, 9.5f)
                reflectiveQuadToRelative(1f, 19.5f)
                lineToRelative(-22f, 42f)
                quadToRelative(-2f, 5f, -2f, 9f)
                reflectiveQuadToRelative(2f, 9f)
                lineToRelative(22f, 42f)
                quadToRelative(5f, 10f, -1f, 19.5f)
                reflectiveQuadToRelative(-17f, 9.5f)
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
                moveTo(209f, 880f)
                quadToRelative(-45f, 0f, -68.5f, -37.5f)
                reflectiveQuadTo(137f, 765f)
                lineToRelative(108f, -220f)
                lineToRelative(152f, 101f)
                lineToRelative(83f, -41f)
                lineToRelative(83f, 41f)
                lineToRelative(150f, -99f)
                lineToRelative(109f, 217f)
                quadToRelative(20f, 40f, -3.5f, 78f)
                reflectiveQuadTo(750f, 880f)
                horizontalLineTo(209f)
                close()
            }
        }.build()
        
        return _Mountain_flag!!
    }

private var _Mountain_flag: ImageVector? = null

