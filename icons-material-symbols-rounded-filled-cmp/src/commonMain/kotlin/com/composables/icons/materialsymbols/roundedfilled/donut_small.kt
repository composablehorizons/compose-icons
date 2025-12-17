package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Donut_small: ImageVector
    get() {
        if (_Donut_small != null) return _Donut_small!!
        
        _Donut_small = ImageVector.Builder(
            name = "donut_small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(521f, 130f)
                quadToRelative(0f, -20f, 15f, -32f)
                reflectiveQuadToRelative(34f, -8f)
                quadToRelative(115f, 26f, 196.5f, 108.5f)
                reflectiveQuadTo(872f, 396f)
                quadToRelative(4f, 17f, -7.5f, 30.5f)
                reflectiveQuadTo(833f, 440f)
                horizontalLineTo(602f)
                quadToRelative(-4f, 0f, -7f, -2f)
                reflectiveQuadToRelative(-5f, -6f)
                quadToRelative(-9f, -21f, -25f, -37.5f)
                reflectiveQuadTo(529f, 369f)
                quadToRelative(-4f, -2f, -6f, -4.5f)
                reflectiveQuadToRelative(-2f, -6.5f)
                verticalLineToRelative(-228f)
                close()
                moveTo(389f, 869f)
                quadToRelative(-134f, -31f, -221f, -139f)
                reflectiveQuadTo(81f, 480f)
                quadToRelative(0f, -142f, 87f, -249.5f)
                reflectiveQuadTo(389f, 91f)
                quadToRelative(20f, -5f, 36f, 8.5f)
                reflectiveQuadToRelative(16f, 34.5f)
                verticalLineToRelative(226f)
                quadToRelative(0f, 1f, -6f, 8f)
                quadToRelative(-34f, 14f, -54f, 44.5f)
                reflectiveQuadTo(361f, 480f)
                quadToRelative(0f, 37f, 20f, 66.5f)
                reflectiveQuadToRelative(54f, 43.5f)
                quadToRelative(2f, 1f, 6f, 8f)
                verticalLineToRelative(228f)
                quadToRelative(0f, 21f, -16f, 34.5f)
                reflectiveQuadTo(389f, 869f)
                close()
                moveToRelative(176f, 2f)
                quadToRelative(-17f, 4f, -30.5f, -7.5f)
                reflectiveQuadTo(521f, 834f)
                verticalLineToRelative(-233f)
                quadToRelative(0f, -4f, 2f, -7f)
                reflectiveQuadToRelative(6f, -5f)
                quadToRelative(20f, -9f, 36f, -25f)
                reflectiveQuadToRelative(25f, -36f)
                quadToRelative(1f, -2f, 11f, -8f)
                horizontalLineToRelative(232f)
                quadToRelative(18f, 0f, 30f, 15f)
                reflectiveQuadToRelative(8f, 34f)
                quadToRelative(-25f, 115f, -108f, 196.5f)
                reflectiveQuadTo(565f, 871f)
                close()
            }
        }.build()
        
        return _Donut_small!!
    }

private var _Donut_small: ImageVector? = null

