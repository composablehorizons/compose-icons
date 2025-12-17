package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Exercise: ImageVector
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
                lineToRelative(86f, -88f)
                lineToRelative(244f, 244f)
                lineToRelative(-88f, 86f)
                close()
                moveTo(48f, 670f)
                lineToRelative(86f, -86f)
                lineToRelative(57f, 57f)
                lineToRelative(-31f, 30f)
                lineToRelative(129f, 129f)
                lineToRelative(30f, -31f)
                lineToRelative(57f, 57f)
                lineToRelative(-86f, 86f)
                lineTo(48f, 670f)
                close()
                moveToRelative(695f, -150f)
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
                moveToRelative(177f, 176f)
                lineTo(463f, 913f)
                lineTo(47f, 497f)
                lineToRelative(171f, -171f)
                lineToRelative(119f, 120f)
                lineToRelative(110f, -110f)
                lineToRelative(-120f, -119f)
                lineToRelative(170f, -170f)
                lineToRelative(416f, 416f)
                lineToRelative(-170f, 170f)
                lineToRelative(-119f, -120f)
                lineToRelative(-110f, 110f)
                lineToRelative(120f, 119f)
                close()
            }
        }.build()
        
        return _Exercise!!
    }

private var _Exercise: ImageVector? = null

