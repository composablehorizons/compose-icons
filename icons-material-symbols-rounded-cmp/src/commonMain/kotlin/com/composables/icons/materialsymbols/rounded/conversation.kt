package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Conversation: ImageVector
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
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(140f, 390f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(190f, 340f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(240f, 390f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(190f, 440f)
                close()
                moveToRelative(580f, 0f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(720f, 390f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(770f, 340f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(820f, 390f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(770f, 440f)
                close()
                moveTo(40f, 520f)
                close()
                moveToRelative(880f, 0f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 720f)
                horizontalLineToRelative(120f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 560f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 520f)
                horizontalLineToRelative(68f)
                lineToRelative(-38f, -155f)
                quadToRelative(-20f, -82f, -83.5f, -136.5f)
                reflectiveQuadTo(78f, 163f)
                quadToRelative(-17f, -2f, -27.5f, -14f)
                reflectiveQuadTo(40f, 120f)
                quadToRelative(0f, -17f, 11f, -28.5f)
                reflectiveQuadToRelative(27f, -9.5f)
                quadToRelative(112f, 11f, 197f, 82.5f)
                reflectiveQuadTo(387f, 345f)
                lineToRelative(52f, 205f)
                quadToRelative(5f, 19f, -7f, 34.5f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(640f, 0f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 720f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                quadToRelative(-20f, 0f, -32f, -16f)
                reflectiveQuadToRelative(-6f, -36f)
                lineToRelative(51f, -203f)
                quadToRelative(29f, -108f, 113.5f, -179.5f)
                reflectiveQuadTo(882f, 82f)
                quadToRelative(16f, -2f, 27f, 9.5f)
                reflectiveQuadToRelative(11f, 28.5f)
                quadToRelative(0f, 17f, -10.5f, 29f)
                reflectiveQuadTo(882f, 163f)
                quadToRelative(-84f, 11f, -146.5f, 66f)
                reflectiveQuadTo(651f, 365f)
                lineToRelative(-39f, 155f)
                horizontalLineToRelative(68f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 560f)
                verticalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(800f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 760f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 840f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(-480f, -80f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Conversation!!
    }

private var _Conversation: ImageVector? = null

