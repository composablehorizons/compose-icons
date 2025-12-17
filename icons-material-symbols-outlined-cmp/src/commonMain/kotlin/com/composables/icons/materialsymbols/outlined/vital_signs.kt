package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Vital_signs: ImageVector
    get() {
        if (_Vital_signs != null) return _Vital_signs!!
        
        _Vital_signs = ImageVector.Builder(
            name = "vital_signs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                quadToRelative(-19f, 0f, -34f, -11f)
                reflectiveQuadToRelative(-22f, -28f)
                lineToRelative(-92f, -241f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(228f)
                lineToRelative(92f, 244f)
                lineToRelative(184f, -485f)
                quadToRelative(7f, -17f, 22f, -28f)
                reflectiveQuadToRelative(34f, -11f)
                quadToRelative(19f, 0f, 34f, 11f)
                reflectiveQuadToRelative(22f, 28f)
                lineToRelative(92f, 241f)
                horizontalLineToRelative(172f)
                verticalLineToRelative(80f)
                horizontalLineTo(692f)
                lineToRelative(-92f, -244f)
                lineToRelative(-184f, 485f)
                quadToRelative(-7f, 17f, -22f, 28f)
                reflectiveQuadToRelative(-34f, 11f)
                close()
            }
        }.build()
        
        return _Vital_signs!!
    }

private var _Vital_signs: ImageVector? = null

