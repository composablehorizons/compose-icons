package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.No_food: ImageVector
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
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(825f, -170f)
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

