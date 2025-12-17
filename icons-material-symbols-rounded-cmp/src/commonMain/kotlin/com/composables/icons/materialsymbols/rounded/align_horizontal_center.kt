package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Align_horizontal_center: ImageVector
    get() {
        if (_Align_horizontal_center != null) return _Align_horizontal_center!!
        
        _Align_horizontal_center = ImageVector.Builder(
            name = "align_horizontal_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                verticalLineToRelative(-160f)
                horizontalLineTo(300f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(240f, 620f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(300f, 560f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-160f)
                horizontalLineTo(180f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 340f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(180f, 280f)
                horizontalLineToRelative(260f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(260f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(840f, 340f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 400f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(140f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(720f, 620f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(660f, 680f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 840f)
                close()
            }
        }.build()
        
        return _Align_horizontal_center!!
    }

private var _Align_horizontal_center: ImageVector? = null

