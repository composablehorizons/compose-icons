package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Voting_chip: ImageVector
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(320f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(640f, 280f)
                horizontalLineTo(320f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(320f, 680f)
                close()
                moveToRelative(10f, -170f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(390f, 570f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(450f, 450f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(360f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(330f, 390f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 510f)
                horizontalLineToRelative(60f)
                close()
                moveToRelative(290f, -90f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(650f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(680f, 570f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 360f)
                horizontalLineToRelative(-50f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(560f, 390f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(590f, 420f)
                horizontalLineToRelative(30f)
                close()
                moveToRelative(-140f, 60f)
                close()
            }
        }.build()
        
        return _Voting_chip!!
    }

private var _Voting_chip: ImageVector? = null

