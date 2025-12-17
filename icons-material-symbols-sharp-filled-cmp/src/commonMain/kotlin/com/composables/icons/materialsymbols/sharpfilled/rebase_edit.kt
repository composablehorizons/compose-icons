package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Rebase_edit: ImageVector
    get() {
        if (_Rebase_edit != null) return _Rebase_edit!!
        
        _Rebase_edit = ImageVector.Builder(
            name = "rebase_edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                verticalLineToRelative(-164f)
                lineToRelative(351f, -349f)
                lineToRelative(162f, 163f)
                lineTo(564f, 880f)
                horizontalLineTo(400f)
                close()
                moveToRelative(349f, -298f)
                lineToRelative(51f, -52f)
                lineToRelative(-49f, -50f)
                lineToRelative(-52f, 52f)
                lineToRelative(50f, 50f)
                close()
                moveTo(430f, 370f)
                lineToRelative(-56f, -57f)
                lineToRelative(73f, -73f)
                horizontalLineTo(313f)
                quadToRelative(-9f, 26f, -28f, 45f)
                reflectiveQuadToRelative(-45f, 28f)
                verticalLineToRelative(334f)
                quadToRelative(35f, 13f, 57.5f, 43.5f)
                reflectiveQuadTo(320f, 760f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -39f, 22.5f, -69f)
                reflectiveQuadToRelative(57.5f, -43f)
                verticalLineToRelative(-335f)
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
                close()
                moveToRelative(330f, -290f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                close()
            }
        }.build()
        
        return _Rebase_edit!!
    }

private var _Rebase_edit: ImageVector? = null

