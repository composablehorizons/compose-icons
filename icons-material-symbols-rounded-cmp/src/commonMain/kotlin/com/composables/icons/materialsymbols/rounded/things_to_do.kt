package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Things_to_do: ImageVector
    get() {
        if (_Things_to_do != null) return _Things_to_do!!
        
        _Things_to_do = ImageVector.Builder(
            name = "things_to_do",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 760f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 520f)
                horizontalLineToRelative(44f)
                quadToRelative(12f, -75f, 66.5f, -129.5f)
                reflectiveQuadTo(440f, 324f)
                verticalLineToRelative(-164f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 160f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 280f)
                horizontalLineTo(520f)
                verticalLineToRelative(44f)
                quadToRelative(75f, 12f, 129.5f, 66.5f)
                reflectiveQuadTo(716f, 520f)
                horizontalLineToRelative(44f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 600f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 760f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                horizontalLineTo(320f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
                moveTo(326f, 520f)
                horizontalLineToRelative(308f)
                quadToRelative(-14f, -53f, -57f, -86.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-54f, 0f, -97f, 33.5f)
                reflectiveQuadTo(326f, 520f)
                close()
                moveToRelative(154f, 0f)
                close()
            }
        }.build()
        
        return _Things_to_do!!
    }

private var _Things_to_do: ImageVector? = null

