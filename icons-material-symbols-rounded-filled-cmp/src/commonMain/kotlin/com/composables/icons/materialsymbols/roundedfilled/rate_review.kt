package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Rate_review: ImageVector
    get() {
        if (_Rate_review != null) return _Rate_review!!
        
        _Rate_review = ImageVector.Builder(
            name = "rate_review",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 560f)
                horizontalLineToRelative(66f)
                quadToRelative(8f, 0f, 15.5f, -3f)
                reflectiveQuadToRelative(13.5f, -9f)
                lineToRelative(187f, -188f)
                quadToRelative(9f, -9f, 13.5f, -20.5f)
                reflectiveQuadTo(580f, 317f)
                quadToRelative(0f, -11f, -4.5f, -21.5f)
                reflectiveQuadTo(563f, 276f)
                lineToRelative(-37f, -38f)
                quadToRelative(-9f, -9f, -20f, -13.5f)
                reflectiveQuadToRelative(-23f, -4.5f)
                quadToRelative(-11f, 0f, -22f, 4.5f)
                reflectiveQuadTo(441f, 238f)
                lineTo(252f, 425f)
                quadToRelative(-6f, 6f, -9f, 13.5f)
                reflectiveQuadToRelative(-3f, 15.5f)
                verticalLineToRelative(66f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 560f)
                close()
                moveToRelative(202f, -204f)
                lineToRelative(-38f, -37f)
                lineToRelative(39f, -39f)
                lineToRelative(37f, 38f)
                lineToRelative(-38f, 38f)
                close()
                moveToRelative(-34f, 204f)
                horizontalLineToRelative(232f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 480f)
                horizontalLineTo(528f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(240f, 720f)
                lineToRelative(-92f, 92f)
                quadToRelative(-19f, 19f, -43.5f, 8.5f)
                reflectiveQuadTo(80f, 783f)
                verticalLineToRelative(-623f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Rate_review!!
    }

private var _Rate_review: ImageVector? = null

