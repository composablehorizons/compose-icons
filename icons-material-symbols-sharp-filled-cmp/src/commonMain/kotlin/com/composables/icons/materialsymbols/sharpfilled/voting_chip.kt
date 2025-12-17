package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Voting_chip: ImageVector
    get() {
        if (_Voting_chip != null) return _Voting_chip!!
        
        _Voting_chip = ImageVector.Builder(
            name = "voting_chip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(320f, 200f)
                horizontalLineToRelative(320f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(640f, 760f)
                horizontalLineTo(320f)
                close()
                moveToRelative(10f, -160f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(90f)
                close()
                moveToRelative(290f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(180f)
                close()
            }
        }.build()
        
        return _Voting_chip!!
    }

private var _Voting_chip: ImageVector? = null

