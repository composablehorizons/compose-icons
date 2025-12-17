package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.`2k_plus`: ImageVector
    get() {
        if (_2k_plus != null) return _2k_plus!!
        
        _2k_plus = ImageVector.Builder(
            name = "2k_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 560f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(-220f, 40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-90f)
                lineToRelative(70f, 90f)
                horizontalLineToRelative(73f)
                lineToRelative(-93f, -120f)
                lineToRelative(93f, -120f)
                horizontalLineToRelative(-73f)
                lineToRelative(-70f, 90f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-200f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(300f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 460f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 360f)
                horizontalLineTo(240f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-60f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 500f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(-40f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _2k_plus!!
    }

private var _2k_plus: ImageVector? = null

