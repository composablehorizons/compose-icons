package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Carry_on_bag_checked: ImageVector
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
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(372f)
                quadToRelative(-89f, 29f, -144.5f, 102f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 32f, 7f, 61.5f)
                reflectiveQuadToRelative(21f, 58.5f)
                horizontalLineToRelative(-48f)
                close()
                moveToRelative(-180f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(560f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Carry_on_bag_checked!!
    }

private var _Carry_on_bag_checked: ImageVector? = null

