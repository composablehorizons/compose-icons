package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Category: ImageVector
    get() {
        if (_Category != null) return _Category!!
        
        _Category = ImageVector.Builder(
            name = "category",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(297f, 379f)
                lineToRelative(149f, -243f)
                quadToRelative(6f, -10f, 15f, -14.5f)
                reflectiveQuadToRelative(19f, -4.5f)
                quadToRelative(10f, 0f, 19f, 4.5f)
                reflectiveQuadToRelative(15f, 14.5f)
                lineToRelative(149f, 243f)
                quadToRelative(6f, 10f, 6f, 21f)
                reflectiveQuadToRelative(-5f, 20f)
                quadToRelative(-5f, 9f, -14f, 14.5f)
                reflectiveQuadToRelative(-21f, 5.5f)
                horizontalLineTo(331f)
                quadToRelative(-12f, 0f, -21f, -5.5f)
                reflectiveQuadTo(296f, 420f)
                quadToRelative(-5f, -9f, -5f, -20f)
                reflectiveQuadToRelative(6f, -21f)
                close()
                moveTo(700f, 880f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(520f, 700f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(700f, 520f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(880f, 700f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(700f, 880f)
                close()
                moveToRelative(-580f, -60f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 540f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 580f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 860f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 820f)
                close()
            }
        }.build()
        
        return _Category!!
    }

private var _Category: ImageVector? = null

