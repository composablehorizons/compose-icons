package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Face_left: ImageVector
    get() {
        if (_Face_left != null) return _Face_left!!
        
        _Face_left = ImageVector.Builder(
            name = "face_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(300f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(340f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(380f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(340f, 480f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(500f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(540f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(580f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 480f)
                close()
                moveTo(297f, 663f)
                quadToRelative(-63f, -44f, -100f, -112.5f)
                reflectiveQuadTo(160f, 400f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 82f, -37f, 150.5f)
                reflectiveQuadTo(663f, 663f)
                lineToRelative(-58f, -58f)
                quadToRelative(53f, -32f, 85f, -87.5f)
                reflectiveQuadTo(720f, 395f)
                quadToRelative(-63f, -11f, -118.5f, -45f)
                reflectiveQuadTo(508f, 264f)
                quadToRelative(-52f, 53f, -121f, 77.5f)
                reflectiveQuadTo(244f, 358f)
                quadToRelative(-2f, 11f, -3f, 21f)
                reflectiveQuadToRelative(-1f, 21f)
                quadToRelative(0f, 66f, 31.5f, 119.5f)
                reflectiveQuadTo(355f, 605f)
                lineToRelative(-58f, 58f)
                close()
                moveTo(480f, 920f)
                lineTo(320f, 760f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-63f, 64f)
                horizontalLineToRelative(167f)
                verticalLineToRelative(80f)
                horizontalLineTo(473f)
                lineToRelative(63f, 64f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Face_left!!
    }

private var _Face_left: ImageVector? = null

