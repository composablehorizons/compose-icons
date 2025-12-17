package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Edit_off: ImageVector
    get() {
        if (_Edit_off != null) return _Edit_off!!
        
        _Edit_off = ImageVector.Builder(
            name = "edit_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(622f, 507f)
                lineToRelative(-56f, -56f)
                lineToRelative(82f, -82f)
                lineToRelative(-57f, -57f)
                lineToRelative(-82f, 82f)
                lineToRelative(-56f, -56f)
                lineToRelative(195f, -195f)
                quadToRelative(12f, -12f, 26.5f, -17.5f)
                reflectiveQuadTo(705f, 120f)
                quadToRelative(16f, 0f, 31f, 6f)
                reflectiveQuadToRelative(26f, 18f)
                lineToRelative(55f, 56f)
                quadToRelative(12f, 11f, 17.5f, 26f)
                reflectiveQuadToRelative(5.5f, 30f)
                quadToRelative(0f, 16f, -5.5f, 30.5f)
                reflectiveQuadTo(817f, 313f)
                lineTo(622f, 507f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(57f)
                lineToRelative(195f, -195f)
                lineToRelative(-28f, -29f)
                lineToRelative(-29f, -28f)
                lineToRelative(-195f, 195f)
                verticalLineToRelative(57f)
                close()
                moveTo(792f, 904f)
                lineTo(509f, 622f)
                lineTo(290f, 840f)
                horizontalLineTo(120f)
                verticalLineToRelative(-169f)
                lineToRelative(219f, -219f)
                lineTo(56f, 168f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-32f, -648f)
                lineToRelative(-56f, -56f)
                lineToRelative(56f, 56f)
                close()
                moveToRelative(-169f, 56f)
                lineToRelative(57f, 57f)
                lineToRelative(-57f, -57f)
                close()
                moveTo(424f, 536f)
                lineToRelative(-29f, -28f)
                lineToRelative(57f, 57f)
                lineToRelative(-28f, -29f)
                close()
            }
        }.build()
        
        return _Edit_off!!
    }

private var _Edit_off: ImageVector? = null

