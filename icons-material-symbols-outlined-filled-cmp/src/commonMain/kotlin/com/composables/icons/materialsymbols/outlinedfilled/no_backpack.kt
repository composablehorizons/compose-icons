package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.No_backpack: ImageVector
    get() {
        if (_No_backpack != null) return _No_backpack!!
        
        _No_backpack = ImageVector.Builder(
            name = "no_backpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 547f)
                lineToRelative(140f, 140f)
                verticalLineToRelative(-367f)
                quadToRelative(0f, -56f, -34f, -98f)
                reflectiveQuadToRelative(-86f, -56f)
                verticalLineToRelative(-86f)
                horizontalLineTo(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(86f)
                lineToRelative(313f, 314f)
                horizontalLineToRelative(67f)
                verticalLineToRelative(67f)
                close()
                moveTo(791f, 904f)
                lineTo(663f, 776f)
                horizontalLineToRelative(112f)
                lineToRelative(25f, 24f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 12.5f, -62f)
                reflectiveQuadToRelative(34.5f, -51f)
                lineToRelative(39f, 39f)
                verticalLineToRelative(113f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(735f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(300f, 560f)
                horizontalLineToRelative(147f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-67f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _No_backpack!!
    }

private var _No_backpack: ImageVector? = null

