package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mountain_flag: ImageVector
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
                moveTo(348f, 517f)
                lineToRelative(55f, 37f)
                lineToRelative(59f, -30f)
                quadToRelative(8f, -5f, 18f, -5f)
                reflectiveQuadToRelative(18f, 5f)
                lineToRelative(59f, 30f)
                lineToRelative(53f, -35f)
                lineToRelative(-40f, -79f)
                horizontalLineTo(386f)
                lineToRelative(-38f, 77f)
                close()
                moveTo(209f, 800f)
                horizontalLineToRelative(541f)
                lineTo(646f, 591f)
                lineToRelative(-64f, 43f)
                quadToRelative(-9f, 6f, -19.5f, 6.5f)
                reflectiveQuadTo(542f, 636f)
                lineToRelative(-62f, -31f)
                lineToRelative(-62f, 31f)
                quadToRelative(-10f, 5f, -20.5f, 4f)
                reflectiveQuadToRelative(-19.5f, -7f)
                lineToRelative(-66f, -43f)
                lineToRelative(-103f, 210f)
                close()
                moveToRelative(-65f, 80f)
                quadToRelative(-23f, 0f, -34.5f, -19f)
                reflectiveQuadToRelative(-1.5f, -39f)
                lineToRelative(206f, -417f)
                quadToRelative(10f, -20f, 29.5f, -32.5f)
                reflectiveQuadTo(386f, 360f)
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
                horizontalLineToRelative(50f)
                quadToRelative(23f, 0f, 42f, 12f)
                reflectiveQuadToRelative(30f, 32f)
                lineToRelative(209f, 418f)
                quadToRelative(10f, 20f, -1.5f, 39f)
                reflectiveQuadTo(815f, 880f)
                horizontalLineTo(144f)
                close()
                moveToRelative(336f, -275f)
                close()
            }
        }.build()
        
        return _Mountain_flag!!
    }

private var _Mountain_flag: ImageVector? = null

