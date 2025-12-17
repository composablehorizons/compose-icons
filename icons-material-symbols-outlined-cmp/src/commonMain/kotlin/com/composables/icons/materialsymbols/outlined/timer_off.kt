package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Timer_off: ImageVector
    get() {
        if (_Timer_off != null) return _Timer_off!!
        
        _Timer_off = ImageVector.Builder(
            name = "timer_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(798f, 686f)
                lineToRelative(-60f, -60f)
                quadToRelative(11f, -27f, 16.5f, -53.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-24f, 0f, -51f, 5f)
                reflectiveQuadToRelative(-56f, 16f)
                lineToRelative(-60f, -60f)
                quadToRelative(38f, -20f, 80.5f, -30.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(60f, 0f, 117.5f, 20f)
                reflectiveQuadTo(706f, 238f)
                lineToRelative(56f, -56f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 56f)
                quadToRelative(38f, 51f, 58f, 108.5f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(0f, 42f, -10.5f, 83.5f)
                reflectiveQuadTo(798f, 686f)
                close()
                moveTo(520f, 408f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(8f)
                lineToRelative(80f, 80f)
                close()
                moveTo(792f, 904f)
                lineToRelative(-96f, -96f)
                quadToRelative(-48f, 35f, -103.5f, 53.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-74f, 0f, -139.5f, -28.5f)
                reflectiveQuadTo(226f, 774f)
                quadToRelative(-49f, -49f, -77.5f, -114.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -60f, 18.5f, -115.5f)
                reflectiveQuadTo(192f, 304f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(480f, 800f)
                quadToRelative(42f, 0f, 82f, -13f)
                reflectiveQuadToRelative(75f, -37f)
                lineTo(248f, 361f)
                quadToRelative(-24f, 35f, -36f, 75f)
                reflectiveQuadToRelative(-12f, 84f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                close()
                moveTo(360f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(83f, 435f)
                close()
                moveToRelative(113f, -112f)
                close()
            }
        }.build()
        
        return _Timer_off!!
    }

private var _Timer_off: ImageVector? = null

