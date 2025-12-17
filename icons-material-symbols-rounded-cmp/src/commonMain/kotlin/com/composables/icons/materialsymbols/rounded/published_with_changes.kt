package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Published_with_changes: ImageVector
    get() {
        if (_Published_with_changes != null) return _Published_with_changes!!
        
        _Published_with_changes = ImageVector.Builder(
            name = "published_with_changes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 231f)
                quadToRelative(-55f, 44f, -87.5f, 108.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 115f, 70f, 200.5f)
                reflectiveQuadTo(407f, 791f)
                quadToRelative(15f, 4f, 24f, 17.5f)
                reflectiveQuadToRelative(9f, 29.5f)
                quadToRelative(0f, 16f, -11f, 27f)
                reflectiveQuadToRelative(-25f, 8f)
                quadToRelative(-140f, -26f, -232f, -135.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -91f, 36.5f, -168f)
                reflectiveQuadTo(216f, 180f)
                horizontalLineToRelative(-56f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 140f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 100f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 140f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 340f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 300f)
                verticalLineToRelative(-69f)
                close()
                moveToRelative(143f, 320f)
                lineToRelative(199f, -199f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 12.5f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(678f, 409f)
                lineTo(451f, 636f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(282f, 522f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(282f, 466f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(85f, 85f)
                close()
                moveToRelative(321f, 229f)
                horizontalLineToRelative(56f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 820f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 860f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 820f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 620f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 660f)
                verticalLineToRelative(69f)
                quadToRelative(55f, -45f, 87.5f, -109f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -115f, -70f, -200.5f)
                reflectiveQuadTo(553f, 169f)
                quadToRelative(-15f, -4f, -24f, -17.5f)
                reflectiveQuadToRelative(-9f, -29.5f)
                quadToRelative(0f, -16f, 11f, -27f)
                reflectiveQuadToRelative(25f, -8f)
                quadToRelative(140f, 26f, 232f, 135.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 91f, -36.5f, 168f)
                reflectiveQuadTo(744f, 780f)
                close()
            }
        }.build()
        
        return _Published_with_changes!!
    }

private var _Published_with_changes: ImageVector? = null

