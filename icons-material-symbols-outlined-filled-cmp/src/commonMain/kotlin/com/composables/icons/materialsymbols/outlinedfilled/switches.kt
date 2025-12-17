package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Switches: ImageVector
    get() {
        if (_Switches != null) return _Switches!!
        
        _Switches = ImageVector.Builder(
            name = "switches",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(280f, 280f)
                quadToRelative(50f, 0f, 90.5f, 22f)
                reflectiveQuadToRelative(69.5f, 58f)
                horizontalLineToRelative(320f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(440f)
                quadToRelative(-29f, 36f, -69.5f, 58f)
                reflectiveQuadTo(280f, 680f)
                close()
                moveToRelative(196f, -160f)
                horizontalLineToRelative(284f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 440f)
                horizontalLineTo(476f)
                quadToRelative(2f, 9f, 3f, 20f)
                reflectiveQuadToRelative(1f, 20f)
                quadToRelative(0f, 9f, -1f, 20f)
                reflectiveQuadToRelative(-3f, 20f)
                close()
            }
        }.build()
        
        return _Switches!!
    }

private var _Switches: ImageVector? = null

