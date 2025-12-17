package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Transportation: ImageVector
    get() {
        if (_Transportation != null) return _Transportation!!
        
        _Transportation = ImageVector.Builder(
            name = "transportation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 640f)
                quadToRelative(-72f, 0f, -127f, -45f)
                reflectiveQuadToRelative(-69f, -115f)
                horizontalLineTo(445f)
                lineToRelative(-48f, -80f)
                horizontalLineToRelative(167f)
                quadToRelative(5f, -22f, 13.5f, -42f)
                reflectiveQuadToRelative(22.5f, -38f)
                horizontalLineTo(348f)
                lineToRelative(-48f, -80f)
                horizontalLineToRelative(342f)
                lineToRelative(-44f, -120f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(214f)
                lineToRelative(73f, 200f)
                horizontalLineToRelative(33f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 440f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(760f, 640f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineToRelative(-3f)
                lineToRelative(39f, 107f)
                lineToRelative(-76f, 27f)
                lineToRelative(-38f, -105f)
                quadToRelative(-20f, 17f, -31f, 41f)
                reflectiveQuadToRelative(-11f, 50f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveTo(280f, 920f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                lineToRelative(120f, 200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(240f)
                horizontalLineTo(400f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(160f, 560f)
                horizontalLineToRelative(147f)
                lineToRelative(-72f, -120f)
                horizontalLineToRelative(-75f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(120f, 280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 760f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 800f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 840f)
                close()
            }
        }.build()
        
        return _Transportation!!
    }

private var _Transportation: ImageVector? = null

