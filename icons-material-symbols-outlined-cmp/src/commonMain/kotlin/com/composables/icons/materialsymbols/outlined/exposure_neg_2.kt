package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Exposure_neg_2: ImageVector
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
                moveTo(484f, 760f)
                verticalLineToRelative(-84f)
                lineToRelative(200f, -204f)
                quadToRelative(33f, -35f, 46.5f, -58.5f)
                reflectiveQuadTo(744f, 360f)
                quadToRelative(0f, -29f, -22.5f, -52.5f)
                reflectiveQuadTo(654f, 284f)
                quadToRelative(-36f, 0f, -59.5f, 20f)
                reflectiveQuadTo(562f, 356f)
                lineToRelative(-80f, -32f)
                quadToRelative(14f, -45f, 58f, -84.5f)
                reflectiveQuadTo(656f, 200f)
                quadToRelative(83f, 0f, 129.5f, 47.5f)
                reflectiveQuadTo(832f, 360f)
                quadToRelative(0f, 45f, -21f, 82f)
                reflectiveQuadToRelative(-65f, 82f)
                lineTo(600f, 676f)
                lineToRelative(2f, 4f)
                horizontalLineToRelative(238f)
                verticalLineToRelative(80f)
                horizontalLineTo(484f)
                close()
                moveToRelative(-84f, -200f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Exposure_neg_2!!
    }

private var _Exposure_neg_2: ImageVector? = null

