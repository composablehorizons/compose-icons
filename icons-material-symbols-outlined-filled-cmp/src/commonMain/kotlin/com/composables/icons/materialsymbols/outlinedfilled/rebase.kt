package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Rebase: ImageVector
    get() {
        if (_Rebase != null) return _Rebase!!
        
        _Rebase = ImageVector.Builder(
            name = "rebase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(430f, 930f)
                lineToRelative(-56f, -57f)
                lineToRelative(73f, -73f)
                horizontalLineTo(313f)
                quadToRelative(-13f, 35f, -43.5f, 57.5f)
                reflectiveQuadTo(200f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -39f, 22.5f, -69.5f)
                reflectiveQuadTo(160f, 647f)
                verticalLineToRelative(-334f)
                quadToRelative(-35f, -13f, -57.5f, -43.5f)
                reflectiveQuadTo(80f, 200f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(39f, 0f, 69.5f, 22.5f)
                reflectiveQuadTo(313f, 160f)
                horizontalLineToRelative(134f)
                lineToRelative(-73f, -73f)
                lineToRelative(56f, -57f)
                lineToRelative(170f, 170f)
                lineToRelative(-170f, 170f)
                lineToRelative(-56f, -57f)
                lineToRelative(73f, -73f)
                horizontalLineTo(313f)
                quadToRelative(-9f, 26f, -28f, 45f)
                reflectiveQuadToRelative(-45f, 28f)
                verticalLineToRelative(334f)
                quadToRelative(26f, 9f, 45f, 28f)
                reflectiveQuadToRelative(28f, 45f)
                horizontalLineToRelative(134f)
                lineToRelative(-73f, -73f)
                lineToRelative(56f, -57f)
                lineToRelative(170f, 170f)
                lineTo(430f, 930f)
                close()
                moveToRelative(330f, -50f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -40f, 22.5f, -70.5f)
                reflectiveQuadTo(720f, 647f)
                verticalLineToRelative(-334f)
                quadToRelative(-35f, -12f, -57.5f, -42.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 40f, -22.5f, 70.5f)
                reflectiveQuadTo(800f, 313f)
                verticalLineToRelative(334f)
                quadToRelative(35f, 13f, 57.5f, 43.5f)
                reflectiveQuadTo(880f, 760f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Rebase!!
    }

private var _Rebase: ImageVector? = null

