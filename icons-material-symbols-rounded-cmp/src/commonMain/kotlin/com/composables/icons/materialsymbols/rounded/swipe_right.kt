package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Swipe_right: ImageVector
    get() {
        if (_Swipe_right != null) return _Swipe_right!!
        
        _Swipe_right = ImageVector.Builder(
            name = "swipe_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                verticalLineToRelative(380f)
                quadToRelative(0f, 20f, -16f, 32f)
                reflectiveQuadToRelative(-35f, 7f)
                lineToRelative(-46f, -13f)
                lineToRelative(102f, 102f)
                quadToRelative(5f, 5f, 12.5f, 8.5f)
                reflectiveQuadTo(473f, 800f)
                horizontalLineToRelative(167f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(720f, 720f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(473f)
                close()
                moveToRelative(47f, -480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 440f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 560f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 400f)
                close()
                moveToRelative(120f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 480f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 560f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                close()
                moveToRelative(156f, -220f)
                quadToRelative(-66f, -58f, -147f, -89f)
                reflectiveQuadToRelative(-169f, -31f)
                quadToRelative(-106f, 0f, -190f, 39.5f)
                reflectiveQuadTo(161f, 248f)
                quadToRelative(-8f, 14f, -20.5f, 23f)
                reflectiveQuadToRelative(-28.5f, 9f)
                quadToRelative(-12f, 0f, -18.5f, -10.5f)
                reflectiveQuadTo(92f, 247f)
                quadToRelative(42f, -93f, 148f, -150f)
                reflectiveQuadToRelative(240f, -57f)
                quadToRelative(94f, 0f, 181f, 31f)
                reflectiveQuadToRelative(159f, 90f)
                verticalLineToRelative(-51f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(850f, 80f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(880f, 110f)
                verticalLineToRelative(130f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 280f)
                horizontalLineTo(710f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(680f, 250f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(710f, 220f)
                horizontalLineToRelative(86f)
                close()
                moveTo(571f, 680f)
                close()
            }
        }.build()
        
        return _Swipe_right!!
    }

private var _Swipe_right: ImageVector? = null

