package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Edit_arrow_up: ImageVector
    get() {
        if (_Edit_arrow_up != null) return _Edit_arrow_up!!
        
        _Edit_arrow_up = ImageVector.Builder(
            name = "edit_arrow_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(740f, 800f)
                verticalLineToRelative(-488f)
                lineToRelative(-44f, 44f)
                lineToRelative(-56f, -56f)
                lineToRelative(140f, -140f)
                lineToRelative(140f, 140f)
                lineToRelative(-57f, 56f)
                lineToRelative(-43f, -43f)
                verticalLineToRelative(487f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-620f, -80f)
                verticalLineToRelative(-163f)
                lineToRelative(295f, -294f)
                quadToRelative(24f, -24f, 57.5f, -23f)
                reflectiveQuadToRelative(56.5f, 25f)
                lineToRelative(48f, 50f)
                quadToRelative(23f, 23f, 22.5f, 56f)
                reflectiveQuadTo(576f, 427f)
                lineTo(283f, 720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(50f)
                lineToRelative(162f, -162f)
                lineToRelative(-25f, -25f)
                lineToRelative(-25f, -25f)
                lineToRelative(-162f, 162f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(269f, -219f)
                lineToRelative(-50f, -50f)
                lineToRelative(50f, 50f)
                close()
            }
        }.build()
        
        return _Edit_arrow_up!!
    }

private var _Edit_arrow_up: ImageVector? = null

