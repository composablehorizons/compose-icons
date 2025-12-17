package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Globe_book: ImageVector
    get() {
        if (_Globe_book != null) return _Globe_book!!
        
        _Globe_book = ImageVector.Builder(
            name = "globe_book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(123f, 520f)
                quadToRelative(-1f, -10f, -1.5f, -20f)
                reflectiveQuadToRelative(-0.5f, -20f)
                quadToRelative(0f, -75f, 28f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(49f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 10f, -0.5f, 20f)
                reflectiveQuadToRelative(-1.5f, 20f)
                horizontalLineToRelative(-81f)
                quadToRelative(2f, -10f, 2.5f, -20f)
                reflectiveQuadToRelative(0.5f, -20f)
                quadToRelative(0f, -10f, -0.5f, -20f)
                reflectiveQuadToRelative(-2.5f, -20f)
                horizontalLineTo(639f)
                quadToRelative(1f, 10f, 1f, 20f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 10f, -1f, 20f)
                horizontalLineToRelative(-79f)
                verticalLineToRelative(-33f)
                quadToRelative(0f, -12f, -0.5f, -24f)
                reflectiveQuadToRelative(-1.5f, -23f)
                horizontalLineTo(403f)
                quadToRelative(-1f, 11f, -1.5f, 23f)
                reflectiveQuadToRelative(-0.5f, 24f)
                verticalLineToRelative(33f)
                horizontalLineToRelative(-79f)
                quadToRelative(-1f, -10f, -1f, -20f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -10f, 1f, -20f)
                horizontalLineTo(204f)
                quadToRelative(-2f, 10f, -2.5f, 20f)
                reflectiveQuadToRelative(-0.5f, 20f)
                quadToRelative(0f, 10f, 0.5f, 20f)
                reflectiveQuadToRelative(2.5f, 20f)
                horizontalLineToRelative(-81f)
                close()
                moveToRelative(105f, -160f)
                horizontalLineToRelative(103f)
                quadToRelative(8f, -43f, 20f, -77.5f)
                reflectiveQuadToRelative(26f, -62.5f)
                quadToRelative(-48f, 18f, -87f, 54.5f)
                reflectiveQuadTo(228f, 360f)
                close()
                moveToRelative(186f, 0f)
                horizontalLineToRelative(132f)
                quadToRelative(-10f, -43f, -25f, -84f)
                reflectiveQuadToRelative(-41f, -76f)
                quadToRelative(-26f, 35f, -41.5f, 76f)
                reflectiveQuadTo(414f, 360f)
                close()
                moveToRelative(216f, 0f)
                horizontalLineToRelative(103f)
                quadToRelative(-23f, -49f, -62.5f, -85.5f)
                reflectiveQuadTo(583f, 220f)
                quadToRelative(14f, 30f, 26.5f, 63.5f)
                reflectiveQuadTo(630f, 360f)
                close()
                moveTo(440f, 840f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                quadToRelative(48f, 0f, 89.5f, 21f)
                reflectiveQuadToRelative(70.5f, 59f)
                quadToRelative(29f, -38f, 70.5f, -59f)
                reflectiveQuadToRelative(89.5f, -21f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Globe_book!!
    }

private var _Globe_book: ImageVector? = null

