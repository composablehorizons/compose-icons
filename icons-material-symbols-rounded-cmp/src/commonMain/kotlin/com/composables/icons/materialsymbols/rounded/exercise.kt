package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Exercise: ImageVector
    get() {
        if (_Exercise != null) return _Exercise!!
        
        _Exercise = ImageVector.Builder(
            name = "exercise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(826f, 375f)
                lineToRelative(-56f, -56f)
                lineToRelative(30f, -31f)
                lineToRelative(-128f, -128f)
                lineToRelative(-31f, 30f)
                lineToRelative(-57f, -57f)
                lineToRelative(30f, -31f)
                quadToRelative(23f, -23f, 57f, -22.5f)
                reflectiveQuadToRelative(57f, 23.5f)
                lineToRelative(129f, 129f)
                quadToRelative(23f, 23f, 23f, 56.5f)
                reflectiveQuadTo(857f, 345f)
                lineToRelative(-31f, 30f)
                close()
                moveTo(346f, 856f)
                quadToRelative(-23f, 23f, -56.5f, 23f)
                reflectiveQuadTo(233f, 856f)
                lineTo(104f, 727f)
                quadToRelative(-23f, -23f, -23f, -56.5f)
                reflectiveQuadToRelative(23f, -56.5f)
                lineToRelative(30f, -30f)
                lineToRelative(57f, 57f)
                lineToRelative(-31f, 30f)
                lineToRelative(129f, 129f)
                lineToRelative(30f, -31f)
                lineToRelative(57f, 57f)
                lineToRelative(-30f, 30f)
                close()
                moveToRelative(397f, -336f)
                lineToRelative(57f, -57f)
                lineToRelative(-303f, -303f)
                lineToRelative(-57f, 57f)
                lineToRelative(303f, 303f)
                close()
                moveTo(463f, 800f)
                lineToRelative(57f, -58f)
                lineToRelative(-302f, -302f)
                lineToRelative(-58f, 57f)
                lineToRelative(303f, 303f)
                close()
                moveToRelative(-6f, -234f)
                lineToRelative(110f, -109f)
                lineToRelative(-64f, -64f)
                lineToRelative(-109f, 110f)
                lineToRelative(63f, 63f)
                close()
                moveToRelative(63f, 290f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                lineTo(104f, 554f)
                quadToRelative(-23f, -23f, -23f, -57f)
                reflectiveQuadToRelative(23f, -57f)
                lineToRelative(57f, -57f)
                quadToRelative(23f, -23f, 56.5f, -23f)
                reflectiveQuadToRelative(56.5f, 23f)
                lineToRelative(63f, 63f)
                lineToRelative(110f, -110f)
                lineToRelative(-63f, -62f)
                quadToRelative(-23f, -23f, -23f, -57f)
                reflectiveQuadToRelative(23f, -57f)
                lineToRelative(57f, -57f)
                quadToRelative(23f, -23f, 56.5f, -23f)
                reflectiveQuadToRelative(56.5f, 23f)
                lineToRelative(303f, 303f)
                quadToRelative(23f, 23f, 23f, 56.5f)
                reflectiveQuadTo(857f, 519f)
                lineToRelative(-57f, 57f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                lineToRelative(-62f, -63f)
                lineToRelative(-110f, 110f)
                lineToRelative(63f, 63f)
                quadToRelative(23f, 23f, 23f, 56.5f)
                reflectiveQuadTo(577f, 799f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Exercise!!
    }

private var _Exercise: ImageVector? = null

