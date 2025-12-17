package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Lunch_dining: ImageVector
    get() {
        if (_Lunch_dining != null) return _Lunch_dining!!
        
        _Lunch_dining = ImageVector.Builder(
            name = "lunch_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -180f)
                quadToRelative(-36f, 0f, -57f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                quadToRelative(-56f, 0f, -76f, -20f)
                reflectiveQuadToRelative(-56f, -20f)
                quadToRelative(-36f, 0f, -57f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                verticalLineToRelative(-80f)
                quadToRelative(36f, 0f, 57f, -20f)
                reflectiveQuadToRelative(77f, -20f)
                quadToRelative(56f, 0f, 76f, 20f)
                reflectiveQuadToRelative(56f, 20f)
                quadToRelative(36f, 0f, 57f, -20f)
                reflectiveQuadToRelative(77f, -20f)
                quadToRelative(56f, 0f, 77f, 20f)
                reflectiveQuadToRelative(57f, 20f)
                quadToRelative(36f, 0f, 56f, -20f)
                reflectiveQuadToRelative(76f, -20f)
                quadToRelative(56f, 0f, 79f, 20f)
                reflectiveQuadToRelative(55f, 20f)
                verticalLineToRelative(80f)
                quadToRelative(-56f, 0f, -75f, -20f)
                reflectiveQuadToRelative(-55f, -20f)
                quadToRelative(-36f, 0f, -58f, 20f)
                reflectiveQuadToRelative(-78f, 20f)
                quadToRelative(-56f, 0f, -77f, -20f)
                reflectiveQuadToRelative(-57f, -20f)
                close()
                moveTo(80f, 400f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -115f, 108.5f, -177.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(183f, 0f, 291.5f, 62.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(40f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -200f)
                quadToRelative(-124f, 0f, -207.5f, 31f)
                reflectiveQuadTo(166f, 320f)
                horizontalLineToRelative(628f)
                quadToRelative(-23f, -58f, -106.5f, -89f)
                reflectiveQuadTo(480f, 200f)
                close()
                moveToRelative(0f, 520f)
                close()
                moveToRelative(0f, -400f)
                close()
            }
        }.build()
        
        return _Lunch_dining!!
    }

private var _Lunch_dining: ImageVector? = null

