package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Swipe_left: ImageVector
    get() {
        if (_Swipe_left != null) return _Swipe_left!!
        
        _Swipe_left = ImageVector.Builder(
            name = "swipe_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(164f, 220f)
                horizontalLineToRelative(86f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(280f, 250f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(250f, 280f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 240f)
                verticalLineToRelative(-130f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(110f, 80f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(140f, 110f)
                verticalLineToRelative(51f)
                quadToRelative(72f, -59f, 159f, -90f)
                reflectiveQuadToRelative(181f, -31f)
                quadToRelative(134f, 0f, 240f, 57f)
                reflectiveQuadToRelative(148f, 150f)
                quadToRelative(5f, 12f, -1f, 22.5f)
                reflectiveQuadTo(849f, 280f)
                quadToRelative(-15f, 0f, -27.5f, -8f)
                reflectiveQuadTo(801f, 251f)
                quadToRelative(-45f, -71f, -129f, -111f)
                reflectiveQuadToRelative(-192f, -40f)
                quadToRelative(-88f, 0f, -169f, 31f)
                reflectiveQuadToRelative(-147f, 89f)
                close()
                moveTo(473f, 880f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                lineTo(212f, 668f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(211f, 612f)
                lineToRelative(3f, -3f)
                quadToRelative(16f, -16f, 37.5f, -21.5f)
                reflectiveQuadToRelative(42.5f, 0.5f)
                lineToRelative(66f, 19f)
                verticalLineToRelative(-327f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 440f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 480f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(473f)
                close()
            }
        }.build()
        
        return _Swipe_left!!
    }

private var _Swipe_left: ImageVector? = null

