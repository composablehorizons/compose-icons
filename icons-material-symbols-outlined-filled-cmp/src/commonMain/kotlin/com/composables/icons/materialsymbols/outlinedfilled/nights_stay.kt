package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nights_stay: ImageVector
    get() {
        if (_Nights_stay != null) return _Nights_stay!!
        
        _Nights_stay = ImageVector.Builder(
            name = "nights_stay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 560f)
                quadToRelative(48f, 0f, 88f, 26f)
                reflectiveQuadToRelative(59f, 71f)
                lineToRelative(10f, 23f)
                horizontalLineToRelative(25f)
                quadToRelative(42f, 0f, 70f, 29.5f)
                reflectiveQuadToRelative(28f, 70.5f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                horizontalLineTo(240f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 720f)
                quadToRelative(0f, -67f, 47f, -113.5f)
                reflectiveQuadTo(240f, 560f)
                close()
                moveToRelative(210f, -440f)
                quadToRelative(-18f, 99f, 11f, 193.5f)
                reflectiveQuadTo(561f, 479f)
                quadToRelative(71f, 71f, 165.5f, 100f)
                reflectiveQuadTo(920f, 590f)
                quadToRelative(-26f, 142f, -135f, 234.5f)
                reflectiveQuadTo(533f, 920f)
                quadToRelative(32f, -26f, 49.5f, -62.5f)
                reflectiveQuadTo(600f, 780f)
                quadToRelative(0f, -68f, -42.5f, -117.5f)
                reflectiveQuadTo(449f, 603f)
                quadToRelative(-32f, -57f, -87.5f, -90f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(-32f, 0f, -62.5f, 8f)
                reflectiveQuadTo(120f, 512f)
                quadToRelative(2f, -145f, 94.5f, -255f)
                reflectiveQuadTo(450f, 120f)
                close()
            }
        }.build()
        
        return _Nights_stay!!
    }

private var _Nights_stay: ImageVector? = null

