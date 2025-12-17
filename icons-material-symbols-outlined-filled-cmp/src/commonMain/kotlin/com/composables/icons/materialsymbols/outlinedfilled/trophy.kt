package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Trophy: ImageVector
    get() {
        if (_Trophy != null) return _Trophy!!
        
        _Trophy = ImageVector.Builder(
            name = "trophy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-124f)
                quadToRelative(-49f, -11f, -87.5f, -41.5f)
                reflectiveQuadTo(296f, 518f)
                quadToRelative(-75f, -9f, -125.5f, -65.5f)
                reflectiveQuadTo(120f, 320f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 280f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 76f, -50.5f, 132.5f)
                reflectiveQuadTo(664f, 518f)
                quadToRelative(-18f, 46f, -56.5f, 76.5f)
                reflectiveQuadTo(520f, 636f)
                verticalLineToRelative(124f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -408f)
                verticalLineToRelative(-152f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 38f, 22f, 68.5f)
                reflectiveQuadToRelative(58f, 43.5f)
                close()
                moveToRelative(400f, 0f)
                quadToRelative(36f, -13f, 58f, -43.5f)
                reflectiveQuadToRelative(22f, -68.5f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(152f)
                close()
            }
        }.build()
        
        return _Trophy!!
    }

private var _Trophy: ImageVector? = null

