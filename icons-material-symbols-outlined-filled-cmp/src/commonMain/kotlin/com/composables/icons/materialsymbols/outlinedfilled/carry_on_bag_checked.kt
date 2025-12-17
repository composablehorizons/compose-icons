package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Carry_on_bag_checked: ImageVector
    get() {
        if (_Carry_on_bag_checked != null) return _Carry_on_bag_checked!!
        
        _Carry_on_bag_checked = ImageVector.Builder(
            name = "carry_on_bag_checked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(692f, 810f)
                lineToRelative(142f, -142f)
                lineToRelative(-30f, -30f)
                lineToRelative(-112f, 112f)
                lineToRelative(-56f, -56f)
                lineToRelative(-30f, 30f)
                lineToRelative(86f, 86f)
                close()
                moveToRelative(28f, 110f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(-300f, -80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(480f, 80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(372f)
                quadToRelative(-89f, 29f, -144.5f, 102f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 32f, 7f, 61.5f)
                reflectiveQuadToRelative(21f, 58.5f)
                horizontalLineToRelative(-48f)
                close()
                moveToRelative(-100f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 760f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Carry_on_bag_checked!!
    }

private var _Carry_on_bag_checked: ImageVector? = null

