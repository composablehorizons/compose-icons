package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Invert_colors_off: ImageVector
    get() {
        if (_Invert_colors_off != null) return _Invert_colors_off!!
        
        _Invert_colors_off = ImageVector.Builder(
            name = "invert_colors_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(771f, 658f)
                lineTo(480f, 367f)
                verticalLineToRelative(-175f)
                lineToRelative(-89f, 87f)
                lineToRelative(-56f, -56f)
                lineToRelative(145f, -143f)
                lineToRelative(226f, 223f)
                quadToRelative(48f, 48f, 71f, 103.5f)
                reflectiveQuadTo(800f, 524f)
                quadToRelative(0f, 38f, -8f, 72.5f)
                reflectiveQuadTo(771f, 658f)
                close()
                moveToRelative(21f, 246f)
                lineTo(668f, 780f)
                quadToRelative(-42f, 31f, -91.5f, 45.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-133f, 0f, -226.5f, -91.5f)
                reflectiveQuadTo(160f, 524f)
                quadToRelative(0f, -51f, 16f, -98f)
                reflectiveQuadToRelative(48f, -90f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(480f, 760f)
                verticalLineToRelative(-167f)
                lineTo(280f, 393f)
                quadToRelative(-21f, 32f, -30.5f, 64.5f)
                reflectiveQuadTo(240f, 524f)
                quadToRelative(0f, 100f, 70f, 168f)
                reflectiveQuadToRelative(170f, 68f)
                close()
            }
        }.build()
        
        return _Invert_colors_off!!
    }

private var _Invert_colors_off: ImageVector? = null

