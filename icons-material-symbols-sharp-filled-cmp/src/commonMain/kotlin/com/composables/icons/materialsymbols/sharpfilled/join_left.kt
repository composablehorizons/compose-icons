package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Join_left: ImageVector
    get() {
        if (_Join_left != null) return _Join_left!!
        
        _Join_left = ImageVector.Builder(
            name = "join_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(27f, 0f, 52.5f, 5f)
                reflectiveQuadToRelative(49.5f, 14f)
                quadToRelative(-58f, 49f, -90f, 117f)
                reflectiveQuadToRelative(-32f, 144f)
                quadToRelative(0f, 76f, 32f, 144f)
                reflectiveQuadToRelative(90f, 117f)
                quadToRelative(-24f, 9f, -49.5f, 14f)
                reflectiveQuadToRelative(-52.5f, 5f)
                close()
                moveToRelative(320f, 0f)
                quadToRelative(-27f, 0f, -52.5f, -5f)
                reflectiveQuadTo(538f, 741f)
                quadToRelative(17f, -14f, 32f, -30.5f)
                reflectiveQuadToRelative(28f, -34.5f)
                quadToRelative(11f, 2f, 21f, 3f)
                reflectiveQuadToRelative(21f, 1f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(640f, 280f)
                quadToRelative(-11f, 0f, -21f, 1f)
                reflectiveQuadToRelative(-21f, 3f)
                quadToRelative(-13f, -18f, -28f, -34.5f)
                reflectiveQuadTo(538f, 219f)
                quadToRelative(24f, -9f, 49.5f, -14f)
                reflectiveQuadToRelative(52.5f, -5f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(640f, 760f)
                close()
                moveToRelative(-160f, -50f)
                quadToRelative(-57f, -39f, -88.5f, -100f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, -69f, 31.5f, -130f)
                reflectiveQuadTo(480f, 250f)
                quadToRelative(57f, 39f, 88.5f, 100f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, 69f, -31.5f, 130f)
                reflectiveQuadTo(480f, 710f)
                close()
            }
        }.build()
        
        return _Join_left!!
    }

private var _Join_left: ImageVector? = null

