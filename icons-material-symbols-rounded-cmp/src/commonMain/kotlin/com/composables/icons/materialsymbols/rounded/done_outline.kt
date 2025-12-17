package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Done_outline: ImageVector
    get() {
        if (_Done_outline != null) return _Done_outline!!
        
        _Done_outline = ImageVector.Builder(
            name = "done_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(381f, 720f)
                lineToRelative(424f, -424f)
                lineToRelative(-57f, -56f)
                lineToRelative(-368f, 367f)
                lineToRelative(-169f, -170f)
                lineToRelative(-57f, 57f)
                lineToRelative(227f, 226f)
                close()
                moveToRelative(-57f, 56f)
                lineTo(98f, 550f)
                quadToRelative(-12f, -12f, -17.5f, -26.5f)
                reflectiveQuadTo(75f, 494f)
                quadToRelative(0f, -15f, 5.5f, -30f)
                reflectiveQuadTo(98f, 437f)
                lineToRelative(56f, -56f)
                quadToRelative(12f, -12f, 26.5f, -18f)
                reflectiveQuadToRelative(30.5f, -6f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(113f, 113f)
                lineToRelative(310f, -311f)
                quadToRelative(11f, -12f, 26f, -17.5f)
                reflectiveQuadToRelative(30f, -5.5f)
                quadToRelative(15f, 0f, 30f, 5.5f)
                reflectiveQuadToRelative(27f, 16.5f)
                lineToRelative(57f, 56f)
                quadToRelative(12f, 12f, 18f, 26.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                quadToRelative(0f, 16f, -5.5f, 30.5f)
                reflectiveQuadTo(862f, 352f)
                lineTo(438f, 776f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                close()
            }
        }.build()
        
        return _Done_outline!!
    }

private var _Done_outline: ImageVector? = null

