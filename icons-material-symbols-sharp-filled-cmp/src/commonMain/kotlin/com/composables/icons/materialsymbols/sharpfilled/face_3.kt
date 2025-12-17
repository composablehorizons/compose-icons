package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Face_3: ImageVector
    get() {
        if (_Face_3 != null) return _Face_3!!
        
        _Face_3 = ImageVector.Builder(
            name = "face_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(134f, 0f, 227f, -93.5f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(0f, -31f, -5f, -59.5f)
                reflectiveQuadTo(779f, 285f)
                quadToRelative(-27f, 17f, -57f, 26f)
                reflectiveQuadToRelative(-62f, 9f)
                quadToRelative(-54f, 0f, -101.5f, -24.5f)
                reflectiveQuadTo(480f, 226f)
                quadToRelative(-31f, 45f, -78.5f, 69.5f)
                reflectiveQuadTo(300f, 320f)
                quadToRelative(-32f, 0f, -62f, -9f)
                reflectiveQuadToRelative(-57f, -26f)
                quadToRelative(-11f, 27f, -16f, 55.5f)
                reflectiveQuadToRelative(-5f, 59.5f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveTo(360f, 490f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(410f, 440f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(360f, 390f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(310f, 440f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(360f, 490f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(650f, 440f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(600f, 390f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(550f, 440f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(600f, 490f)
                close()
                moveTo(0f, 880f)
                lineToRelative(44f, -482f)
                quadToRelative(8f, -84f, 45.5f, -157f)
                reflectiveQuadToRelative(96f, -126.5f)
                quadToRelative(58.5f, -53.5f, 134f, -84f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(85f, 0f, 160.5f, 30.5f)
                reflectiveQuadToRelative(134f, 84f)
                quadTo(833f, 168f, 870.5f, 241f)
                reflectiveQuadTo(916f, 398f)
                lineToRelative(44f, 482f)
                horizontalLineTo(0f)
                close()
            }
        }.build()
        
        return _Face_3!!
    }

private var _Face_3: ImageVector? = null

