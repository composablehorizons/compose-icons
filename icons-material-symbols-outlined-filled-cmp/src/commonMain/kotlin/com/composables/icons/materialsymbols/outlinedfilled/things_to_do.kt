package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Things_to_do: ImageVector
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
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(84f)
                quadToRelative(12f, -75f, 66.5f, -129.5f)
                reflectiveQuadTo(440f, 324f)
                verticalLineToRelative(-204f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(160f)
                horizontalLineTo(520f)
                verticalLineToRelative(44f)
                quadToRelative(75f, 12f, 129.5f, 66.5f)
                reflectiveQuadTo(716f, 520f)
                horizontalLineToRelative(84f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -80f)
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
            }
        }.build()
        
        return _Things_to_do!!
    }

private var _Things_to_do: ImageVector? = null

