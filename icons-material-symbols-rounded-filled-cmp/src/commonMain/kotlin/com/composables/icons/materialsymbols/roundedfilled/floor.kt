package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Floor: ImageVector
    get() {
        if (_Floor != null) return _Floor!!
        
        _Floor = ImageVector.Builder(
            name = "floor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 800f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(300f, 620f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 440f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 260f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 340f)
                horizontalLineTo(700f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(660f, 520f)
                horizontalLineTo(520f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 700f)
                horizontalLineTo(340f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(300f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 800f)
                horizontalLineToRelative(100f)
                close()
            }
        }.build()
        
        return _Floor!!
    }

private var _Floor: ImageVector? = null

