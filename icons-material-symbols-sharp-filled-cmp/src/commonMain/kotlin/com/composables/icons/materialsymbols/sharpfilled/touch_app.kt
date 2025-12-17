package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Touch_app: ImageVector
    get() {
        if (_Touch_app != null) return _Touch_app!!
        
        _Touch_app = ImageVector.Builder(
            name = "touch_app",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 880f)
                horizontalLineTo(361f)
                lineTo(107f, 557f)
                lineToRelative(64f, -67f)
                lineToRelative(129f, 78f)
                verticalLineToRelative(-368f)
                horizontalLineToRelative(81f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(419f)
                verticalLineToRelative(440f)
                close()
                moveTo(167f, 340f)
                quadToRelative(-13f, -22f, -20f, -47.5f)
                reflectiveQuadToRelative(-7f, -52.5f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(340f, 40f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(540f, 240f)
                quadToRelative(0f, 27f, -7f, 52.5f)
                reflectiveQuadTo(513f, 340f)
                lineToRelative(-69f, -40f)
                quadToRelative(8f, -14f, 12f, -28.5f)
                reflectiveQuadToRelative(4f, -31.5f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 17f, 4f, 31.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                lineToRelative(-69f, 40f)
                close()
            }
        }.build()
        
        return _Touch_app!!
    }

private var _Touch_app: ImageVector? = null

