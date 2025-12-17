package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.No_food: ImageVector
    get() {
        if (_No_food != null) return _No_food!!
        
        _No_food = ImageVector.Builder(
            name = "no_food",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(487f, 600f)
                horizontalLineTo(40f)
                quadToRelative(0f, -121f, 93.5f, -180.5f)
                reflectiveQuadTo(340f, 360f)
                quadToRelative(5f, 0f, 11f, 0.5f)
                reflectiveQuadToRelative(11f, 0.5f)
                verticalLineToRelative(113f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(40f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveTo(80f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 880f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineTo(80f)
                close()
                moveToRelative(785f, -170f)
                lineTo(458f, 344f)
                lineToRelative(-18f, -144f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(200f)
                lineToRelative(-55f, 550f)
                close()
            }
        }.build()
        
        return _No_food!!
    }

private var _No_food: ImageVector? = null

