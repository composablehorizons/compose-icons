package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Face_shake: ImageVector
    get() {
        if (_Face_shake != null) return _Face_shake!!
        
        _Face_shake = ImageVector.Builder(
            name = "face_shake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                quadToRelative(-94f, 0f, -181f, -31f)
                reflectiveQuadToRelative(-159f, -90f)
                verticalLineToRelative(81f)
                horizontalLineTo(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(60f)
                horizontalLineTo(164f)
                quadToRelative(66f, 58f, 147f, 89f)
                reflectiveQuadToRelative(169f, 31f)
                quadToRelative(88f, 0f, 169f, -31f)
                reflectiveQuadToRelative(147f, -89f)
                horizontalLineTo(680f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-81f)
                quadToRelative(-72f, 59f, -159f, 90f)
                reflectiveQuadTo(480f, 920f)
                close()
                moveToRelative(0f, -240f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadToRelative(-227f, 93f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -11f, -1f, -21f)
                reflectiveQuadToRelative(-3f, -21f)
                quadToRelative(-74f, 8f, -143f, -16.5f)
                reflectiveQuadTo(452f, 224f)
                quadToRelative(-38f, 52f, -93.5f, 86f)
                reflectiveQuadTo(240f, 355f)
                quadToRelative(-2f, 101f, 68f, 173f)
                reflectiveQuadToRelative(172f, 72f)
                close()
                moveTo(380f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(340f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(380f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(420f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(380f, 440f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(540f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(580f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(620f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(580f, 440f)
                close()
            }
        }.build()
        
        return _Face_shake!!
    }

private var _Face_shake: ImageVector? = null

