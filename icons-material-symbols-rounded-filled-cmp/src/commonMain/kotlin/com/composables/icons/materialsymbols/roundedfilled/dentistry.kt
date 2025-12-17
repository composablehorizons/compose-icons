package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Dentistry: ImageVector
    get() {
        if (_Dentistry != null) return _Dentistry!!
        
        _Dentistry = ImageVector.Builder(
            name = "dentistry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 85f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 11f, -1.5f, 29.5f)
                reflectiveQuadTo(834f, 317f)
                lineToRelative(-55f, 403f)
                quadToRelative(-5f, 38f, -34.5f, 62f)
                reflectiveQuadTo(677f, 806f)
                quadToRelative(-23f, 0f, -42.5f, -10f)
                reflectiveQuadTo(602f, 768f)
                lineTo(495f, 612f)
                quadToRelative(-2f, -4f, -6.5f, -5.5f)
                reflectiveQuadTo(479f, 605f)
                quadToRelative(-4f, 0f, -16f, 9f)
                lineTo(359f, 765f)
                quadToRelative(-14f, 20f, -34.5f, 30.5f)
                reflectiveQuadTo(281f, 806f)
                quadToRelative(-38f, 0f, -67f, -24.5f)
                reflectiveQuadTo(180f, 719f)
                lineToRelative(-54f, -402f)
                quadToRelative(-3f, -24f, -4.5f, -42.5f)
                reflectiveQuadTo(120f, 245f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(36f, 0f, 57.5f, 9.5f)
                reflectiveQuadTo(379f, 115f)
                quadToRelative(20f, 11f, 42.5f, 20.5f)
                reflectiveQuadTo(480f, 145f)
                quadToRelative(36f, 0f, 58.5f, -9.5f)
                reflectiveQuadTo(581f, 115f)
                quadToRelative(20f, -11f, 42f, -20.5f)
                reflectiveQuadToRelative(57f, -9.5f)
                close()
            }
        }.build()
        
        return _Dentistry!!
    }

private var _Dentistry: ImageVector? = null

