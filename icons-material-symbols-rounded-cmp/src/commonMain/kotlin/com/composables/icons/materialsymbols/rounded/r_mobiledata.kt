package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.R_mobiledata: ImageVector
    get() {
        if (_R_mobiledata != null) return _R_mobiledata!!
        
        _R_mobiledata = ImageVector.Builder(
            name = "r_mobiledata",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 294f)
                verticalLineToRelative(66f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 160f)
                verticalLineToRelative(54f)
                quadToRelative(0f, 24f, -14f, 43.5f)
                reflectiveQuadTo(312f, 288f)
                lineToRelative(26f, 61f)
                quadToRelative(8f, 18f, -3f, 34.5f)
                reflectiveQuadTo(304f, 400f)
                quadToRelative(-11f, 0f, -20f, -6f)
                reflectiveQuadToRelative(-14f, -16f)
                lineToRelative(-36f, -84f)
                horizontalLineToRelative(-74f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-54f)
                horizontalLineTo(160f)
                verticalLineToRelative(54f)
                close()
            }
        }.build()
        
        return _R_mobiledata!!
    }

private var _R_mobiledata: ImageVector? = null

