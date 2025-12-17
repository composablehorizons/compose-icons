package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Face_right: ImageVector
    get() {
        if (_Face_right != null) return _Face_right!!
        
        _Face_right = ImageVector.Builder(
            name = "face_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(580f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(620f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(660f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(620f, 480f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(380f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(420f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(420f, 480f)
                close()
                moveToRelative(-4f, -311f)
                quadToRelative(-54f, 15f, -95f, 51.5f)
                reflectiveQuadTo(258f, 308f)
                quadToRelative(53f, -16f, 94f, -52.5f)
                reflectiveQuadToRelative(64f, -86.5f)
                close()
                moveToRelative(57f, -9f)
                quadToRelative(33f, 57f, 90.5f, 89.5f)
                reflectiveQuadTo(687f, 280f)
                quadToRelative(-33f, -57f, -90.5f, -89.5f)
                reflectiveQuadTo(473f, 160f)
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
                quadToRelative(52f, -32f, 83.5f, -85.5f)
                reflectiveQuadTo(720f, 400f)
                quadToRelative(0f, -11f, -1f, -21f)
                reflectiveQuadToRelative(-3f, -21f)
                quadToRelative(-74f, 8f, -143f, -16.5f)
                reflectiveQuadTo(452f, 264f)
                quadToRelative(-38f, 52f, -93.5f, 86f)
                reflectiveQuadTo(240f, 395f)
                quadToRelative(-2f, 67f, 30f, 122.5f)
                reflectiveQuadToRelative(85f, 87.5f)
                lineToRelative(-58f, 58f)
                close()
                moveTo(480f, 920f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineTo(480f, 920f)
                close()
                moveToRelative(-64f, -751f)
                close()
                moveToRelative(57f, -9f)
                close()
            }
        }.build()
        
        return _Face_right!!
    }

private var _Face_right: ImageVector? = null

