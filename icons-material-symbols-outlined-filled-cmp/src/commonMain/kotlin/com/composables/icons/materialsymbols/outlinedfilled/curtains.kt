package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Curtains: ImageVector
    get() {
        if (_Curtains != null) return _Curtains!!
        
        _Curtains = ImageVector.Builder(
            name = "curtains",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(249f, -360f)
                quadToRelative(68f, 45f, 105f, 123f)
                reflectiveQuadToRelative(44f, 157f)
                horizontalLineToRelative(4f)
                quadToRelative(7f, -79f, 44f, -157f)
                reflectiveQuadToRelative(105f, -123f)
                quadToRelative(-68f, -45f, -105f, -123f)
                reflectiveQuadToRelative(-44f, -157f)
                horizontalLineToRelative(-4f)
                quadToRelative(-7f, 79f, -44f, 157f)
                reflectiveQuadTo(329f, 480f)
                close()
            }
        }.build()
        
        return _Curtains!!
    }

private var _Curtains: ImageVector? = null

