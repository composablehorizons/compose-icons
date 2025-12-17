package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Conversation: ImageVector
    get() {
        if (_Conversation != null) return _Conversation!!
        
        _Conversation = ImageVector.Builder(
            name = "conversation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(190f, 440f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(240f, 390f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(190f, 340f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(140f, 390f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(190f, 440f)
                close()
                moveToRelative(580f, 0f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(820f, 390f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(770f, 340f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(720f, 390f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(770f, 440f)
                close()
                moveToRelative(30f, 360f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineToRelative(80f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 640f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                quadToRelative(-20f, 0f, -32f, -15.5f)
                reflectiveQuadToRelative(-7f, -34.5f)
                lineToRelative(52f, -205f)
                quadToRelative(27f, -109f, 111.5f, -187f)
                reflectiveQuadTo(879f, 80f)
                quadToRelative(17f, 0f, 29f, 11.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                verticalLineToRelative(700f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(860f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(800f, 820f)
                verticalLineToRelative(-20f)
                close()
                moveToRelative(-640f, 0f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(100f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(40f, 820f)
                verticalLineToRelative(-700f)
                quadToRelative(0f, -17f, 12f, -28.5f)
                reflectiveQuadTo(81f, 80f)
                quadToRelative(110f, 0f, 194.5f, 78f)
                reflectiveQuadTo(387f, 345f)
                lineToRelative(52f, 205f)
                quadToRelative(5f, 19f, -7f, 34.5f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 560f)
                horizontalLineTo(80f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Conversation!!
    }

private var _Conversation: ImageVector? = null

