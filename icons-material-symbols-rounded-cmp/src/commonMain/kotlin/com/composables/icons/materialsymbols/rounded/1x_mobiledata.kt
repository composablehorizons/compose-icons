package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.`1x_mobiledata`: ImageVector
    get() {
        if (_1x_mobiledata != null) return _1x_mobiledata!!
        
        _1x_mobiledata = ImageVector.Builder(
            name = "1x_mobiledata",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 360f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 280f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-280f)
                close()
                moveToRelative(346f, 186f)
                lineToRelative(-69f, 115f)
                quadToRelative(-5f, 9f, -13.5f, 14f)
                reflectiveQuadToRelative(-19.5f, 5f)
                quadToRelative(-23f, 0f, -34.5f, -20f)
                reflectiveQuadToRelative(0.5f, -40f)
                lineToRelative(90f, -152f)
                lineToRelative(-77f, -127f)
                quadToRelative(-12f, -20f, -0.5f, -40.5f)
                reflectiveQuadTo(497f, 280f)
                quadToRelative(11f, 0f, 20.5f, 5.5f)
                reflectiveQuadTo(532f, 300f)
                lineToRelative(54f, 90f)
                lineToRelative(56f, -91f)
                quadToRelative(5f, -9f, 14f, -14f)
                reflectiveQuadToRelative(20f, -5f)
                quadToRelative(23f, 0f, 34.5f, 20f)
                reflectiveQuadToRelative(-0.5f, 40f)
                lineToRelative(-76f, 128f)
                lineToRelative(90f, 151f)
                quadToRelative(12f, 20f, 0.5f, 40.5f)
                reflectiveQuadTo(689f, 680f)
                quadToRelative(-11f, 0f, -20.5f, -5.5f)
                reflectiveQuadTo(654f, 660f)
                lineToRelative(-68f, -114f)
                close()
            }
        }.build()
        
        return _1x_mobiledata!!
    }

private var _1x_mobiledata: ImageVector? = null

