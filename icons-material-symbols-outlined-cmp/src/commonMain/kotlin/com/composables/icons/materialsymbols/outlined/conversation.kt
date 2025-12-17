package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Conversation: ImageVector
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
                moveTo(160f, 880f)
                horizontalLineTo(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(108f)
                lineToRelative(-38f, -155f)
                quadToRelative(-23f, -92f, -98.5f, -148.5f)
                reflectiveQuadTo(40f, 160f)
                verticalLineToRelative(-80f)
                quadToRelative(123f, 0f, 220.5f, 73f)
                reflectiveQuadTo(387f, 345f)
                lineToRelative(52f, 205f)
                quadToRelative(5f, 19f, -7f, 34.5f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(720f, 0f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 720f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                quadToRelative(-20f, 0f, -32f, -16f)
                reflectiveQuadToRelative(-6f, -36f)
                lineToRelative(51f, -203f)
                quadToRelative(32f, -115f, 127f, -190f)
                reflectiveQuadToRelative(220f, -75f)
                verticalLineToRelative(80f)
                quadToRelative(-95f, 0f, -170.5f, 57f)
                reflectiveQuadTo(651f, 365f)
                lineToRelative(-39f, 155f)
                horizontalLineToRelative(108f)
                verticalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(800f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                close()
                moveTo(320f, 720f)
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

