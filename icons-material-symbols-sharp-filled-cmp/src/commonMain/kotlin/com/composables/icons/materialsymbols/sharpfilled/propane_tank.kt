package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Propane_tank: ImageVector
    get() {
        if (_Propane_tank != null) return _Propane_tank!!
        
        _Propane_tank = ImageVector.Builder(
            name = "propane_tank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 520f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -57f, 34f, -99f)
                reflectiveQuadToRelative(86f, -56f)
                verticalLineToRelative(-165f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(165f)
                quadToRelative(52f, 14f, 86f, 56f)
                reflectiveQuadToRelative(34f, 99f)
                verticalLineToRelative(120f)
                horizontalLineTo(160f)
                close()
                moveTo(320f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(320f)
                close()
                moveToRelative(40f, -640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Propane_tank!!
    }

private var _Propane_tank: ImageVector? = null

