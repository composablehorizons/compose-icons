package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Warning: ImageVector
    get() {
        if (_Warning != null) return _Warning!!
        
        _Warning = ImageVector.Builder(
            name = "warning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                lineToRelative(440f, -760f)
                lineToRelative(440f, 760f)
                horizontalLineTo(40f)
                close()
                moveToRelative(138f, -80f)
                horizontalLineToRelative(604f)
                lineTo(480f, 240f)
                lineTo(178f, 760f)
                close()
                moveToRelative(302f, -40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(-40f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(40f, -100f)
                close()
            }
        }.build()
        
        return _Warning!!
    }

private var _Warning: ImageVector? = null

