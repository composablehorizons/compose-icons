package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Blind: ImageVector
    get() {
        if (_Blind != null) return _Blind!!
        
        _Blind = ImageVector.Builder(
            name = "blind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 900f)
                lineToRelative(-64f, -48f)
                lineToRelative(104f, -139f)
                verticalLineToRelative(-213f)
                quadToRelative(0f, -31f, 5.5f, -68.5f)
                reflectiveQuadTo(300f, 364f)
                lineToRelative(-60f, 34f)
                verticalLineToRelative(142f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-188f)
                lineToRelative(216f, -123f)
                quadToRelative(8f, -5f, 17f, -7f)
                reflectiveQuadToRelative(19f, -2f)
                quadToRelative(24f, 0f, 44f, 12f)
                reflectiveQuadToRelative(30f, 33f)
                lineToRelative(31f, 67f)
                quadToRelative(20f, 44f, 61f, 66f)
                reflectiveQuadToRelative(102f, 22f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-39f)
                lineTo(860f, 882f)
                lineToRelative(-35f, 20f)
                lineToRelative(-237f, -413f)
                quadToRelative(-40f, -13f, -72.5f, -37.5f)
                reflectiveQuadTo(460f, 392f)
                quadToRelative(-10f, 29f, -15.5f, 66.5f)
                reflectiveQuadTo(441f, 528f)
                lineToRelative(79f, 112f)
                verticalLineToRelative(260f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                lineToRelative(-71f, -102f)
                lineToRelative(-9f, 142f)
                lineTo(240f, 900f)
                close()
                moveToRelative(220f, -700f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(380f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(460f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(540f, 120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(460f, 200f)
                close()
            }
        }.build()
        
        return _Blind!!
    }

private var _Blind: ImageVector? = null

