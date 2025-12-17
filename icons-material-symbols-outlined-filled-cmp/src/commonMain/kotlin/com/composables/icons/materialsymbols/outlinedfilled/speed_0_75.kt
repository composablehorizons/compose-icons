package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Speed_0_75: ImageVector
    get() {
        if (_Speed_0_75 != null) return _Speed_0_75!!
        
        _Speed_0_75 = ImageVector.Builder(
            name = "speed_0_75",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(560f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 520f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 680f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-200f, 0f)
                lineToRelative(80f, -320f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(170f)
                quadToRelative(29f, 0f, 49.5f, 21.5f)
                reflectiveQuadTo(520f, 352f)
                lineToRelative(-2f, 18f)
                lineToRelative(-78f, 310f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Speed_0_75!!
    }

private var _Speed_0_75: ImageVector? = null

