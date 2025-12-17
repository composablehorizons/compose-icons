package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Rate_review: ImageVector
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
                moveTo(240f, 560f)
                horizontalLineToRelative(123f)
                lineToRelative(199f, -200f)
                quadToRelative(9f, -9f, 13.5f, -20.5f)
                reflectiveQuadTo(580f, 317f)
                quadToRelative(0f, -11f, -4.5f, -21.5f)
                reflectiveQuadTo(563f, 276f)
                lineToRelative(-37f, -38f)
                quadToRelative(-9f, -9f, -20f, -13.5f)
                reflectiveQuadToRelative(-23f, -4.5f)
                quadToRelative(-11f, 0f, -22f, 4.5f)
                reflectiveQuadTo(441f, 238f)
                lineTo(240f, 437f)
                verticalLineToRelative(123f)
                close()
                moveToRelative(242f, -204f)
                lineToRelative(-38f, -37f)
                lineToRelative(39f, -39f)
                lineToRelative(37f, 38f)
                lineToRelative(-38f, 38f)
                close()
                moveToRelative(-34f, 204f)
                horizontalLineToRelative(272f)
                verticalLineToRelative(-80f)
                horizontalLineTo(528f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                close()
            }
        }.build()
        
        return _Rate_review!!
    }

private var _Rate_review: ImageVector? = null

