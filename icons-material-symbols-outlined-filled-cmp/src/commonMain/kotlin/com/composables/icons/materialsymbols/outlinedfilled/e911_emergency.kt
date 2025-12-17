package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.E911_emergency: ImageVector
    get() {
        if (_E911_emergency != null) return _E911_emergency!!
        
        _E911_emergency = ImageVector.Builder(
            name = "e911_emergency",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(64f)
                lineToRelative(79f, -263f)
                quadToRelative(8f, -26f, 29.5f, -41.5f)
                reflectiveQuadTo(420f, 400f)
                horizontalLineToRelative(120f)
                quadToRelative(26f, 0f, 47.5f, 15.5f)
                reflectiveQuadTo(617f, 457f)
                lineToRelative(79f, 263f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(240f, -480f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(238f, 99f)
                lineToRelative(-57f, -57f)
                lineToRelative(142f, -141f)
                lineToRelative(56f, 56f)
                lineToRelative(-141f, 142f)
                close()
                moveToRelative(42f, 181f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                close()
                moveTo(282f, 419f)
                lineTo(141f, 277f)
                lineToRelative(56f, -56f)
                lineToRelative(142f, 141f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(40f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _E911_emergency!!
    }

private var _E911_emergency: ImageVector? = null

