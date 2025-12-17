package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Edit: ImageVector
    get() {
        if (_Edit != null) return _Edit!!
        
        _Edit = ImageVector.Builder(
            name = "edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                horizontalLineToRelative(57f)
                lineToRelative(391f, -391f)
                lineToRelative(-57f, -57f)
                lineToRelative(-391f, 391f)
                verticalLineToRelative(57f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-170f)
                lineToRelative(528f, -527f)
                quadToRelative(12f, -11f, 26.5f, -17f)
                reflectiveQuadToRelative(30.5f, -6f)
                quadToRelative(16f, 0f, 31f, 6f)
                reflectiveQuadToRelative(26f, 18f)
                lineToRelative(55f, 56f)
                quadToRelative(12f, 11f, 17.5f, 26f)
                reflectiveQuadToRelative(5.5f, 30f)
                quadToRelative(0f, 16f, -5.5f, 30.5f)
                reflectiveQuadTo(817f, 313f)
                lineTo(290f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(640f, -584f)
                lineToRelative(-56f, -56f)
                lineToRelative(56f, 56f)
                close()
                moveToRelative(-141f, 85f)
                lineToRelative(-28f, -29f)
                lineToRelative(57f, 57f)
                lineToRelative(-29f, -28f)
                close()
            }
        }.build()
        
        return _Edit!!
    }

private var _Edit: ImageVector? = null

