package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Pets: ImageVector
    get() {
        if (_Pets != null) return _Pets!!
        
        _Pets = ImageVector.Builder(
            name = "pets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 485f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveToRelative(180f, -160f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveToRelative(180f, 160f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(266f, 885f)
                quadToRelative(-45f, 0f, -75.5f, -34.5f)
                reflectiveQuadTo(160f, 769f)
                quadToRelative(0f, -52f, 35.5f, -91f)
                reflectiveQuadToRelative(70.5f, -77f)
                quadToRelative(29f, -31f, 50f, -67.5f)
                reflectiveQuadToRelative(50f, -68.5f)
                quadToRelative(22f, -26f, 51f, -43f)
                reflectiveQuadToRelative(63f, -17f)
                quadToRelative(34f, 0f, 63f, 16f)
                reflectiveQuadToRelative(51f, 42f)
                quadToRelative(28f, 32f, 49.5f, 69f)
                reflectiveQuadToRelative(50.5f, 69f)
                quadToRelative(35f, 38f, 70.5f, 77f)
                reflectiveQuadToRelative(35.5f, 91f)
                quadToRelative(0f, 47f, -30.5f, 81.5f)
                reflectiveQuadTo(694f, 885f)
                quadToRelative(-54f, 0f, -107f, -9f)
                reflectiveQuadToRelative(-107f, -9f)
                quadToRelative(-54f, 0f, -107f, 9f)
                reflectiveQuadToRelative(-107f, 9f)
                close()
            }
        }.build()
        
        return _Pets!!
    }

private var _Pets: ImageVector? = null

