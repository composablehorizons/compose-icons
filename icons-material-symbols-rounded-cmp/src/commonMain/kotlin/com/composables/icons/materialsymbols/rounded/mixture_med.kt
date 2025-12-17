package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mixture_med: ImageVector
    get() {
        if (_Mixture_med != null) return _Mixture_med!!
        
        _Mixture_med = ImageVector.Builder(
            name = "mixture_med",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 680f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 600f)
                verticalLineToRelative(-300f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 260f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 220f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-20f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(180f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(220f, 80f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(380f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(340f, 160f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 260f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 300f)
                verticalLineToRelative(300f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 680f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 12f, -11f, 18f)
                reflectiveQuadToRelative(-21f, -2f)
                lineToRelative(-32f, -24f)
                quadToRelative(-8f, -6f, -12f, -14f)
                reflectiveQuadToRelative(-4f, -18f)
                verticalLineToRelative(-140f)
                close()
                moveTo(680f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-70f)
                quadToRelative(-12f, 0f, -21f, -9f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(0f, -12f, 9f, -21f)
                reflectiveQuadToRelative(21f, -9f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-70f)
                quadToRelative(-12f, 0f, -21f, -9f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(0f, -12f, 9f, -21f)
                reflectiveQuadToRelative(21f, -9f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-60f)
                horizontalLineTo(200f)
                verticalLineToRelative(300f)
                close()
                moveToRelative(480f, -280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(600f, 400f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 320f)
                close()
                moveToRelative(-80f, 320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(80f, 160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 720f)
                horizontalLineTo(600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(680f, 800f)
                close()
                moveToRelative(0f, -400f)
                close()
                moveToRelative(0f, 320f)
                close()
            }
        }.build()
        
        return _Mixture_med!!
    }

private var _Mixture_med: ImageVector? = null

