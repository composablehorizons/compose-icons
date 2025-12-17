package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sports_basketball: ImageVector
    get() {
        if (_Sports_basketball != null) return _Sports_basketball!!
        
        _Sports_basketball = ImageVector.Builder(
            name = "sports_basketball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(82f, 439f)
                quadToRelative(5f, -51f, 21f, -96.5f)
                reflectiveQuadToRelative(44f, -85.5f)
                quadToRelative(35f, 36f, 58.5f, 83.5f)
                reflectiveQuadTo(236f, 439f)
                horizontalLineTo(82f)
                close()
                moveToRelative(642f, 0f)
                quadToRelative(7f, -51f, 30f, -98f)
                reflectiveQuadToRelative(59f, -83f)
                quadToRelative(28f, 39f, 44f, 85f)
                reflectiveQuadToRelative(21f, 96f)
                horizontalLineTo(724f)
                close()
                moveTo(147f, 702f)
                quadToRelative(-28f, -39f, -44f, -84.5f)
                reflectiveQuadTo(82f, 521f)
                horizontalLineToRelative(154f)
                quadToRelative(-7f, 51f, -30.5f, 98f)
                reflectiveQuadTo(147f, 702f)
                close()
                moveToRelative(666f, 0f)
                quadToRelative(-36f, -36f, -59f, -83f)
                reflectiveQuadToRelative(-30f, -98f)
                horizontalLineToRelative(154f)
                quadToRelative(-5f, 50f, -21f, 96f)
                reflectiveQuadToRelative(-44f, 85f)
                close()
                moveTo(317f, 439f)
                quadToRelative(-8f, -72f, -39f, -133f)
                reflectiveQuadToRelative(-81f, -110f)
                quadToRelative(48f, -48f, 109.5f, -77f)
                reflectiveQuadTo(439f, 82f)
                verticalLineToRelative(357f)
                horizontalLineTo(317f)
                close()
                moveToRelative(204f, 0f)
                verticalLineToRelative(-357f)
                quadToRelative(71f, 8f, 132.5f, 37f)
                reflectiveQuadTo(763f, 196f)
                quadToRelative(-51f, 48f, -81.5f, 109.5f)
                reflectiveQuadTo(643f, 439f)
                horizontalLineTo(521f)
                close()
                moveTo(439f, 878f)
                quadToRelative(-72f, -8f, -133f, -37.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(51f, -48f, 81.5f, -109f)
                reflectiveQuadTo(317f, 521f)
                horizontalLineToRelative(122f)
                verticalLineToRelative(357f)
                close()
                moveToRelative(82f, 0f)
                verticalLineToRelative(-357f)
                horizontalLineToRelative(122f)
                quadToRelative(8f, 72f, 38.5f, 133.5f)
                reflectiveQuadTo(763f, 764f)
                quadToRelative(-48f, 48f, -109.5f, 77f)
                reflectiveQuadTo(521f, 878f)
                close()
            }
        }.build()
        
        return _Sports_basketball!!
    }

private var _Sports_basketball: ImageVector? = null

