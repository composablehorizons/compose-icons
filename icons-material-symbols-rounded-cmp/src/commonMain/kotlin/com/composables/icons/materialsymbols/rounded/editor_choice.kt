package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Editor_choice: ImageVector
    get() {
        if (_Editor_choice != null) return _Editor_choice!!
        
        _Editor_choice = ImageVector.Builder(
            name = "editor_choice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(345f, 885f)
                quadToRelative(-7f, 2f, -13f, 3f)
                reflectiveQuadToRelative(-12f, 1f)
                quadToRelative(-32f, 0f, -56f, -22.5f)
                reflectiveQuadTo(240f, 809f)
                verticalLineToRelative(-218f)
                lineTo(136f, 422f)
                quadToRelative(-6f, -10f, -9f, -20.5f)
                reflectiveQuadToRelative(-3f, -21.5f)
                quadToRelative(0f, -11f, 3f, -21.5f)
                reflectiveQuadToRelative(9f, -20.5f)
                lineToRelative(136f, -220f)
                quadToRelative(11f, -18f, 29f, -28f)
                reflectiveQuadToRelative(39f, -10f)
                horizontalLineToRelative(280f)
                quadToRelative(21f, 0f, 39f, 10f)
                reflectiveQuadToRelative(29f, 28f)
                lineToRelative(136f, 220f)
                quadToRelative(6f, 10f, 9f, 20.5f)
                reflectiveQuadToRelative(3f, 21.5f)
                quadToRelative(0f, 11f, -3f, 21.5f)
                reflectiveQuadToRelative(-9f, 20.5f)
                lineTo(720f, 591f)
                verticalLineToRelative(218f)
                quadToRelative(0f, 35f, -24f, 57.5f)
                reflectiveQuadTo(640f, 889f)
                quadToRelative(-6f, 0f, -12f, -1f)
                reflectiveQuadToRelative(-13f, -3f)
                lineToRelative(-135f, -45f)
                close()
                moveToRelative(0f, -84f)
                lineToRelative(160f, 53f)
                verticalLineToRelative(-129f)
                horizontalLineTo(320f)
                verticalLineToRelative(129f)
                lineToRelative(160f, -53f)
                close()
                moveTo(340f, 600f)
                horizontalLineToRelative(280f)
                lineToRelative(136f, -220f)
                lineToRelative(-136f, -220f)
                horizontalLineTo(340f)
                lineTo(204f, 380f)
                lineToRelative(136f, 220f)
                close()
                moveToRelative(98f, -170f)
                lineToRelative(141f, -142f)
                quadToRelative(11f, -12f, 27.5f, -11.5f)
                reflectiveQuadTo(635f, 288f)
                quadToRelative(12f, 12f, 12.5f, 28.5f)
                reflectiveQuadTo(636f, 345f)
                lineTo(466f, 515f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-85f, -85f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(56f, 57f)
                close()
                moveToRelative(42f, 250f)
                horizontalLineTo(320f)
                horizontalLineToRelative(320f)
                horizontalLineToRelative(-160f)
                close()
            }
        }.build()
        
        return _Editor_choice!!
    }

private var _Editor_choice: ImageVector? = null

