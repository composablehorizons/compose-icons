package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Privacy: ImageVector
    get() {
        if (_Privacy != null) return _Privacy!!
        
        _Privacy = ImageVector.Builder(
            name = "privacy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(822f, 934f)
                lineTo(26f, 138f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(58f, -234f)
                lineTo(720f, 540f)
                verticalLineToRelative(67f)
                lineTo(480f, 367f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(-2f, 0f, -3f, 0.5f)
                reflectiveQuadToRelative(-3f, 0.5f)
                lineTo(273f, 160f)
                horizontalLineToRelative(447f)
                verticalLineToRelative(260f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                lineToRelative(560f, 560f)
                verticalLineToRelative(80f)
                horizontalLineTo(428f)
                verticalLineToRelative(-122f)
                quadToRelative(37f, -5f, 69f, -22.5f)
                reflectiveQuadToRelative(56f, -46.5f)
                lineToRelative(-41f, -41f)
                quadToRelative(-20f, 26f, -49.5f, 40.5f)
                reflectiveQuadTo(400f, 623f)
                quadToRelative(-60f, 0f, -101.5f, -41.5f)
                reflectiveQuadTo(257f, 480f)
                horizontalLineToRelative(-57f)
                quadToRelative(0f, 75f, 48.5f, 131f)
                reflectiveQuadTo(372f, 678f)
                verticalLineToRelative(122f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -368f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(10f, 0f, 19f, -3f)
                reflectiveQuadToRelative(18f, -8f)
                lineTo(320f, 432f)
                close()
            }
        }.build()
        
        return _Privacy!!
    }

private var _Privacy: ImageVector? = null

