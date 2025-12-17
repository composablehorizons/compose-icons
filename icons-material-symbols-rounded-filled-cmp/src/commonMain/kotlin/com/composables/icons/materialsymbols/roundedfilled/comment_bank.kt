package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Comment_bank: ImageVector
    get() {
        if (_Comment_bank != null) return _Comment_bank!!
        
        _Comment_bank = ImageVector.Builder(
            name = "comment_bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(260f, -560f)
                verticalLineToRelative(245f)
                quadToRelative(0f, 12f, 10f, 17.5f)
                reflectiveQuadToRelative(20f, -0.5f)
                lineToRelative(55f, -33f)
                quadToRelative(8f, -5f, 15f, -5f)
                reflectiveQuadToRelative(15f, 5f)
                lineToRelative(55f, 33f)
                quadToRelative(10f, 6f, 20f, 0.5f)
                reflectiveQuadToRelative(10f, -17.5f)
                verticalLineToRelative(-245f)
                horizontalLineTo(500f)
                close()
            }
        }.build()
        
        return _Comment_bank!!
    }

private var _Comment_bank: ImageVector? = null

