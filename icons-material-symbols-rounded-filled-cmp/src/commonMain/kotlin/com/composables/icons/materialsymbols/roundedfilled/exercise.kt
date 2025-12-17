package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Exercise: ImageVector
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
                moveTo(839f, 361f)
                lineTo(597f, 119f)
                lineToRelative(17f, -17f)
                quadToRelative(23f, -23f, 57f, -22.5f)
                reflectiveQuadToRelative(57f, 23.5f)
                lineToRelative(129f, 129f)
                quadToRelative(23f, 23f, 23f, 56.5f)
                reflectiveQuadTo(857f, 345f)
                lineToRelative(-18f, 16f)
                close()
                moveTo(346f, 856f)
                quadToRelative(-23f, 23f, -56.5f, 23f)
                reflectiveQuadTo(233f, 856f)
                lineTo(104f, 727f)
                quadToRelative(-23f, -23f, -23f, -56.5f)
                reflectiveQuadToRelative(23f, -56.5f)
                lineToRelative(16f, -16f)
                lineToRelative(242f, 242f)
                lineToRelative(-16f, 16f)
                close()
                moveToRelative(145f, -28f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(132f, 525f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(57f, -58f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(63f, 63f)
                lineToRelative(166f, -166f)
                lineToRelative(-63f, -63f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(57f, -58f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(303f, 303f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(829f, 491f)
                lineToRelative(-58f, 57f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-63f, -63f)
                lineToRelative(-166f, 166f)
                lineToRelative(63f, 63f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(549f, 771f)
                lineToRelative(-58f, 57f)
                close()
            }
        }.build()
        
        return _Exercise!!
    }

private var _Exercise: ImageVector? = null

