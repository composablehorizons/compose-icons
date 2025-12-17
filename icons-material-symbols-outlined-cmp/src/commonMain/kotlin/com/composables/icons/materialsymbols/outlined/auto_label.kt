package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Auto_label: ImageVector
    get() {
        if (_Auto_label != null) return _Auto_label!!
        
        _Auto_label = ImageVector.Builder(
            name = "auto_label",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 576f)
                lineTo(666f, 822f)
                quadToRelative(-11f, 16f, -28.5f, 25f)
                reflectiveQuadToRelative(-37.5f, 9f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 776f)
                verticalLineTo(376f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 296f)
                horizontalLineToRelative(400f)
                quadToRelative(20f, 0f, 37.5f, 9f)
                reflectiveQuadToRelative(28.5f, 25f)
                lineToRelative(174f, 246f)
                close()
                moveToRelative(-98f, 0f)
                lineTo(600f, 376f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(400f)
                lineToRelative(142f, -200f)
                close()
                moveToRelative(-542f, 0f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(221f, 160f)
                lineToRelative(50f, -110f)
                lineToRelative(110f, -50f)
                lineToRelative(-110f, -50f)
                lineToRelative(-50f, -110f)
                lineToRelative(-50f, 110f)
                lineToRelative(-110f, 50f)
                lineToRelative(110f, 50f)
                lineToRelative(50f, 110f)
                close()
            }
        }.build()
        
        return _Auto_label!!
    }

private var _Auto_label: ImageVector? = null

