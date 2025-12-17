package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Lasso_select: ImageVector
    get() {
        if (_Lasso_select != null) return _Lasso_select!!
        
        _Lasso_select = ImageVector.Builder(
            name = "lasso_select",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(161f, 444f)
                lineToRelative(-80f, -8f)
                quadToRelative(6f, -46f, 20.5f, -89.5f)
                reflectiveQuadTo(141f, 264f)
                lineToRelative(68f, 42f)
                quadToRelative(-20f, 31f, -31.5f, 66f)
                reflectiveQuadTo(161f, 444f)
                close()
                moveToRelative(36f, 316f)
                quadToRelative(-33f, -32f, -57f, -70.5f)
                reflectiveQuadTo(101f, 608f)
                lineToRelative(76f, -26f)
                quadToRelative(12f, 35f, 31f, 65.5f)
                reflectiveQuadToRelative(45f, 56.5f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(110f, -552f)
                lineToRelative(-42f, -68f)
                quadToRelative(39f, -25f, 82.5f, -39.5f)
                reflectiveQuadTo(437f, 80f)
                lineToRelative(8f, 80f)
                quadToRelative(-37f, 5f, -72f, 16.5f)
                reflectiveQuadTo(307f, 208f)
                close()
                moveTo(479f, 878f)
                quadToRelative(-35f, 0f, -69.5f, -5.5f)
                reflectiveQuadTo(343f, 854f)
                lineToRelative(26f, -76f)
                quadToRelative(27f, 9f, 54f, 14.5f)
                reflectiveQuadToRelative(56f, 5.5f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(226f, -626f)
                quadToRelative(-26f, -26f, -56.5f, -45f)
                reflectiveQuadTo(583f, 176f)
                lineToRelative(26f, -76f)
                quadToRelative(43f, 15f, 81.5f, 39f)
                reflectiveQuadToRelative(70.5f, 57f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(86f, 594f)
                lineTo(679f, 734f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(735f)
                lineToRelative(112f, 112f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(8f, -368f)
                quadToRelative(0f, -29f, -5.5f, -56f)
                reflectiveQuadTo(779f, 368f)
                lineToRelative(76f, -26f)
                quadToRelative(13f, 32f, 18.5f, 66.5f)
                reflectiveQuadTo(879f, 478f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Lasso_select!!
    }

private var _Lasso_select: ImageVector? = null

