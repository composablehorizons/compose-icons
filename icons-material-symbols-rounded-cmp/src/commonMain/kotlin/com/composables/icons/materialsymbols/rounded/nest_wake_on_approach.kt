package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nest_wake_on_approach: ImageVector
    get() {
        if (_Nest_wake_on_approach != null) return _Nest_wake_on_approach!!
        
        _Nest_wake_on_approach = ImageVector.Builder(
            name = "nest_wake_on_approach",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 480f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(760f, 420f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(820f, 120f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 180f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 480f)
                close()
                moveToRelative(-420f, 0f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17f, -62.5f)
                reflectiveQuadToRelative(47f, -43.5f)
                quadToRelative(60f, -30f, 124.5f, -46f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(67f, 0f, 131.5f, 16f)
                reflectiveQuadTo(656f, 582f)
                quadToRelative(30f, 15f, 47f, 43.5f)
                reflectiveQuadToRelative(17f, 62.5f)
                verticalLineToRelative(112f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -11f, -5f, -20f)
                reflectiveQuadToRelative(-15f, -14f)
                quadToRelative(-51f, -26f, -106.5f, -40f)
                reflectiveQuadTo(400f, 600f)
                quadToRelative(-58f, 0f, -113.5f, 14f)
                reflectiveQuadTo(180f, 654f)
                quadToRelative(-10f, 5f, -15f, 14f)
                reflectiveQuadToRelative(-5f, 20f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(240f, -320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(400f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(320f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 400f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 400f)
                close()
            }
        }.build()
        
        return _Nest_wake_on_approach!!
    }

private var _Nest_wake_on_approach: ImageVector? = null

