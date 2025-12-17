package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tactic: ImageVector
    get() {
        if (_Tactic != null) return _Tactic!!
        
        _Tactic = ImageVector.Builder(
            name = "tactic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(656f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                lineToRelative(-63f, -63f)
                lineToRelative(56f, -57f)
                lineToRelative(64f, 64f)
                lineToRelative(63f, -64f)
                lineToRelative(57f, 57f)
                lineToRelative(-64f, 63f)
                lineToRelative(64f, 64f)
                lineToRelative(-57f, 56f)
                lineToRelative(-63f, -63f)
                lineToRelative(-64f, 63f)
                close()
                moveToRelative(-416f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 760f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(37f, 0f, 67.5f, 20.5f)
                reflectiveQuadTo(352f, 676f)
                quadToRelative(39f, -11f, 63.5f, -43f)
                reflectiveQuadToRelative(24.5f, -73f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(640f, 200f)
                horizontalLineToRelative(46f)
                lineToRelative(-63f, -63f)
                lineToRelative(57f, -57f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-57f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineToRelative(-46f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 73f, -47f, 128.5f)
                reflectiveQuadTo(354f, 757f)
                quadToRelative(-12f, 37f, -43.5f, 60f)
                reflectiveQuadTo(240f, 840f)
                close()
                moveToRelative(-64f, -480f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                lineToRelative(-63f, -63f)
                lineToRelative(56f, -57f)
                lineToRelative(64f, 64f)
                lineToRelative(63f, -64f)
                lineToRelative(57f, 57f)
                lineToRelative(-64f, 63f)
                lineToRelative(64f, 64f)
                lineToRelative(-57f, 56f)
                lineToRelative(-63f, -63f)
                lineToRelative(-64f, 63f)
                close()
            }
        }.build()
        
        return _Tactic!!
    }

private var _Tactic: ImageVector? = null

