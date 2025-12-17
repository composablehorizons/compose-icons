package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Face_up: ImageVector
    get() {
        if (_Face_up != null) return _Face_up!!
        
        _Face_up = ImageVector.Builder(
            name = "face_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(340f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(380f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(420f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(380f, 480f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(540f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(580f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(620f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(580f, 480f)
                close()
                moveTo(355f, 605f)
                lineToRelative(-58f, 58f)
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
                close()
                moveToRelative(85f, 315f)
                verticalLineToRelative(-167f)
                lineToRelative(-64f, 63f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -63f)
                verticalLineToRelative(167f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Face_up!!
    }

private var _Face_up: ImageVector? = null

