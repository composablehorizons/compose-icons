package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Exposure_neg_2: ImageVector
    get() {
        if (_Exposure_neg_2 != null) return _Exposure_neg_2!!
        
        _Exposure_neg_2 = ImageVector.Builder(
            name = "exposure_neg_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 760f)
                horizontalLineTo(513f)
                quadToRelative(-12f, 0f, -20.5f, -8.5f)
                reflectiveQuadTo(484f, 731f)
                verticalLineToRelative(-43f)
                quadToRelative(0f, -3f, 8f, -21f)
                lineToRelative(192f, -195f)
                quadToRelative(33f, -35f, 46.5f, -58.5f)
                reflectiveQuadTo(744f, 360f)
                quadToRelative(0f, -29f, -22.5f, -52.5f)
                reflectiveQuadTo(654f, 284f)
                quadToRelative(-26f, 0f, -44.5f, 10.5f)
                reflectiveQuadTo(578f, 322f)
                quadToRelative(-10f, 14f, -25.5f, 19f)
                reflectiveQuadToRelative(-30.5f, -1f)
                quadToRelative(-17f, -7f, -24.5f, -22.5f)
                reflectiveQuadToRelative(0.5f, -29.5f)
                quadToRelative(21f, -35f, 60.5f, -61.5f)
                reflectiveQuadTo(656f, 200f)
                quadToRelative(83f, 0f, 129.5f, 47.5f)
                reflectiveQuadTo(832f, 360f)
                quadToRelative(0f, 45f, -21f, 82f)
                reflectiveQuadToRelative(-65f, 82f)
                lineTo(600f, 676f)
                lineToRelative(2f, 4f)
                horizontalLineToRelative(198f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 760f)
                close()
                moveTo(360f, 560f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
            }
        }.build()
        
        return _Exposure_neg_2!!
    }

private var _Exposure_neg_2: ImageVector? = null

