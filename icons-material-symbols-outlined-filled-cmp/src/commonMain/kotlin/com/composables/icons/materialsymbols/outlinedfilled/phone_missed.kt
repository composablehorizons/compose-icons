package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Phone_missed: ImageVector
    get() {
        if (_Phone_missed != null) return _Phone_missed!!
        
        _Phone_missed = ImageVector.Builder(
            name = "phone_missed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(136f, 816f)
                lineToRelative(-92f, -90f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(88f, -95f, 203f, -142.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(118f, 0f, 232.5f, 47.5f)
                reflectiveQuadTo(916f, 670f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-92f, 90f)
                quadToRelative(-11f, 11f, -25.5f, 12f)
                reflectiveQuadToRelative(-26.5f, -8f)
                lineToRelative(-116f, -88f)
                quadToRelative(-8f, -6f, -12f, -14f)
                reflectiveQuadToRelative(-4f, -18f)
                verticalLineToRelative(-114f)
                quadToRelative(-38f, -12f, -78f, -19f)
                reflectiveQuadToRelative(-82f, -7f)
                quadToRelative(-42f, 0f, -82f, 7f)
                reflectiveQuadToRelative(-78f, 19f)
                verticalLineToRelative(114f)
                quadToRelative(0f, 10f, -4f, 18f)
                reflectiveQuadToRelative(-12f, 14f)
                lineToRelative(-116f, 88f)
                quadToRelative(-12f, 9f, -26.5f, 8f)
                reflectiveQuadTo(136f, 816f)
                close()
                moveToRelative(342f, -362f)
                lineTo(280f, 256f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(336f)
                lineToRelative(141f, 141f)
                lineToRelative(226f, -226f)
                lineToRelative(57f, 57f)
                lineToRelative(-282f, 282f)
                close()
            }
        }.build()
        
        return _Phone_missed!!
    }

private var _Phone_missed: ImageVector? = null

