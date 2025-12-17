package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Drag_click: ImageVector
    get() {
        if (_Drag_click != null) return _Drag_click!!
        
        _Drag_click = ImageVector.Builder(
            name = "drag_click",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(-71f, 0f, -130.5f, -37.5f)
                reflectiveQuadTo(261f, 580f)
                quadToRelative(-6f, -14f, 0f, -28f)
                reflectiveQuadToRelative(21f, -20f)
                quadToRelative(15f, -7f, 31.5f, -0.5f)
                reflectiveQuadTo(338f, 555f)
                quadToRelative(21f, 39f, 59f, 62f)
                reflectiveQuadToRelative(83f, 23f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -45f, -23.5f, -82.5f)
                reflectiveQuadTo(554f, 339f)
                quadToRelative(-16f, -8f, -22f, -24.5f)
                reflectiveQuadToRelative(1f, -31.5f)
                quadToRelative(7f, -15f, 20.5f, -21f)
                reflectiveQuadToRelative(27.5f, 0f)
                quadToRelative(63f, 29f, 101f, 88.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(-158f, 0f, -274f, -107f)
                reflectiveQuadTo(79f, 510f)
                quadToRelative(-1f, -16f, 9.5f, -28f)
                reflectiveQuadToRelative(27.5f, -13f)
                quadToRelative(17f, -1f, 30.5f, 10.5f)
                reflectiveQuadTo(162f, 509f)
                quadToRelative(16f, 124f, 107.5f, 207.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -125f, -83f, -215.5f)
                reflectiveQuadTo(508f, 162f)
                quadToRelative(-18f, -2f, -29.5f, -15f)
                reflectiveQuadTo(468f, 117f)
                quadToRelative(1f, -17f, 13f, -28f)
                reflectiveQuadToRelative(28f, -10f)
                quadToRelative(78f, 5f, 145.5f, 39f)
                reflectiveQuadTo(772f, 206.5f)
                quadToRelative(50f, 54.5f, 79f, 125f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-98f, -420f)
                lineTo(250f, 329f)
                lineToRelative(-30f, 91f)
                quadToRelative(-5f, 14f, -19f, 13.5f)
                reflectiveQuadTo(182f, 419f)
                lineTo(91f, 116f)
                quadToRelative(-4f, -12f, 4.5f, -20.5f)
                reflectiveQuadTo(116f, 91f)
                lineToRelative(303f, 91f)
                quadToRelative(14f, 5f, 14.5f, 19f)
                reflectiveQuadTo(420f, 220f)
                lineToRelative(-91f, 30f)
                lineToRelative(132f, 132f)
                quadToRelative(17f, 17f, 17f, 39f)
                reflectiveQuadToRelative(-17f, 39f)
                quadToRelative(-17f, 17f, -39.5f, 17f)
                reflectiveQuadTo(382f, 460f)
                close()
            }
        }.build()
        
        return _Drag_click!!
    }

private var _Drag_click: ImageVector? = null

