package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Unpublished: ImageVector
    get() {
        if (_Unpublished != null) return _Unpublished!!
        
        _Unpublished = ImageVector.Builder(
            name = "unpublished",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 259f)
                lineToRelative(-91f, -91f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineToRelative(-90f, -89f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(198f, -526f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(622f, 354f)
                lineToRelative(-76f, 77f)
                lineToRelative(-238f, -238f)
                quadToRelative(-18f, -18f, -14.5f, -43.5f)
                reflectiveQuadTo(320f, 113f)
                quadToRelative(37f, -16f, 77f, -24.5f)
                reflectiveQuadToRelative(83f, -8.5f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 43f, -8.5f, 83f)
                reflectiveQuadTo(847f, 640f)
                quadToRelative(-10f, 23f, -35.5f, 27f)
                reflectiveQuadTo(767f, 652f)
                lineTo(602f, 486f)
                lineToRelative(76f, -76f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                close()
                moveTo(282f, 522f)
                lineToRelative(114f, 114f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(36f, -36f)
                lineToRelative(-56f, -56f)
                lineToRelative(-8f, 8f)
                lineToRelative(-86f, -86f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                close()
            }
        }.build()
        
        return _Unpublished!!
    }

private var _Unpublished: ImageVector? = null

