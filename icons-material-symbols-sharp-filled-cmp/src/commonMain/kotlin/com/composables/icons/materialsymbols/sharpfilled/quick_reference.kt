package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Quick_reference: ImageVector
    get() {
        if (_Quick_reference != null) return _Quick_reference!!
        
        _Quick_reference = ImageVector.Builder(
            name = "quick_reference",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 800f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(20f, -200f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(0f, 280f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(480f, 360f)
                horizontalLineToRelative(200f)
                lineTo(480f, 160f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, -200f)
                verticalLineToRelative(200f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(92f)
                quadToRelative(-20f, -6f, -40f, -9f)
                reflectiveQuadToRelative(-40f, -3f)
                quadToRelative(-57f, 0f, -107.5f, 21.5f)
                reflectiveQuadTo(484f, 480f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(147f)
                quadToRelative(-9f, 19f, -15f, 39f)
                reflectiveQuadToRelative(-9f, 41f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(123f)
                quadToRelative(7f, 45f, 28f, 86.5f)
                reflectiveQuadTo(485f, 880f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Quick_reference!!
    }

private var _Quick_reference: ImageVector? = null

